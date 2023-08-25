package com.erplogic.dems.response.structure;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.erplogic.dems.exceptions.GlobalException;
import com.erplogic.dems.utilities.Maps;

public class Errors {

    public static final String GLOBAL_KEY = "*";
    public static final String CAUSE_KEY = "*";
    public static final String SYSTEM_ERROR = "Failed to process the action; please contact system administrator";

    private LinkedHashMap<String, String> msgs;
    private LinkedHashMap<String, Errors> rowMsgs;

    /**
     * get msgs
     *
     * @return
     */
    public LinkedHashMap<String, String> getMsgs() {
        if (msgs == null) {
            return new LinkedHashMap<>();
        }
        return new LinkedHashMap<>(msgs);
    }

    /**
     * get row msgs
     *
     * @return
     */
    public LinkedHashMap<String, Errors> getRowMsgs() {

        if (rowMsgs == null) {
            return new LinkedHashMap<>();
        }
        return new LinkedHashMap<>(rowMsgs);
    }

    public void setMsgWithCause(final String key, final String msg, final String cause) {
        if (this.msgs == null) {
            this.msgs = new LinkedHashMap<>();
        }

        this.msgs.put(key, msg);
        if (cause != null) {
            this.msgs.put(CAUSE_KEY, cause);
        }
    }

    public void setMsg(final String key, final String msg) {
        setMsgWithCause(key, msg, null);
    }

    public void setMsg(final String msg) {
        setMsgWithCause(GLOBAL_KEY, msg, null);
    }

    public void setRowMsg(final String key, final Errors errors) {
        if (this.rowMsgs == null) {
            this.rowMsgs = new LinkedHashMap<>();
        }

        rowMsgs.put(key, errors);
    }

    public void setMsgWithCause(final String msg, final String cause) {
        setMsgWithCause(GLOBAL_KEY, msg, cause);
    }

    public String getMsg(final String key) {
        if (this.msgs == null) {
            return "";
        }
        return this.msgs.get(key);
    }

    public String getMsg() {
        if (this.msgs == null) {
            return null;
        }

        return msgs.get(GLOBAL_KEY);
    }

    public boolean is() {
        return Maps.isNotEmpty(msgs) || Maps.isNotEmpty(rowMsgs);
    }

    /**
     * checks if errs instance has any errors
     *
     * @param errs errors
     * @return true if has any errors, false if none
     */
    public static boolean is(final Errors errs) {
        if (errs == null) {
            return false;
        }
        return errs.is();
    }

    /**
     * get quick instance of errors
     *
     * @param msg msg
     * @return errors
     */
    public static Errors of(final String msg) {
        final Errors errs = new Errors();
        errs.setMsg(msg);
        return errs;
    }

    /**
     * get quick instance of errors
     *
     * @param e msg
     * @return errors
     */
    public static Errors of(final Exception e) {
        final Errors errs = new Errors();
        if (e == null) {
            return errs;
        }
        if (e instanceof GlobalException) {
            final GlobalException ae = (GlobalException) e;
            if (is(ae.getErrors())) {
                return ae.getErrors();
            }
        }
        errs.setMsgWithCause(SYSTEM_ERROR, e.getMessage());
        return errs;
    }

    /**
     * get quick instance of errors
     *
     * @param key key
     * @param msg msg
     * @return errors
     */
    public static Errors of(final String key, final String msg) {
        final Errors errs = new Errors();
        errs.setMsg(key, msg);
        return errs;
    }

    /**
     * get quick instance of errors
     *
     * @param key1 key
     * @param msg1 msg
     * @return errors
     */
    public static Errors of(final String key1, final String msg1, final String key2, final String msg2) {
        final Errors errs = new Errors();
        errs.setMsg(key1, msg1);
        errs.setMsg(key2, msg2);
        return errs;
    }

    /**
     * mutates the current instance
     *
     * @param errs
     * @return
     */
    public static Errors merge(final Errors... errs) {
        final Errors result = new Errors();

        if (errs == null) {
            return result;
        }

        for (final Errors e : errs) {
            if (e == null) {
                continue;
            }

            if (Maps.isNotEmpty(e.getMsgs())) {
                for (final String key : e.getMsgs().keySet()) {
                    result.setMsg(key, e.getMsgs().get(key));
                }
            }
            if (Maps.isNotEmpty(e.getRowMsgs())) {
                for (final String key : e.getRowMsgs().keySet()) {
                    result.setRowMsg(key, e.getRowMsgs().get(key));
                }
            }
        }

        return result;
    }

    public static String getMsgs(final Errors errs) {
        if (!is(errs)) {
            return "";
        }

        final StringBuilder msgs = new StringBuilder();
        for (final Entry<String, String> entry : errs.msgs.entrySet()) {
            msgs.append(String.format("%s=%s; ", entry.getKey(), entry.getValue()));
        }
        return msgs.toString();
    }
}
