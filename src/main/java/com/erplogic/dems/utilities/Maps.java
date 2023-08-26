/**
 *
 */
package com.erplogic.dems.utilities;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;

/**
 * @author Admin
 *
 */
public final class Maps {
    private Maps() {
    }

    /**
     * returns map
     *
     * @param k key
     * @param v value
     * @return map
     */
    public static <K, V> Map<K, V> of(final K k, final V v) {
        final Map<K, V> m = new HashMap<>();
        m.put(k, v);
        return m;
    }

    /**
     * returns hash (string:object map)
     *
     * @param k key
     * @param v value
     * @return map
     */
    public static Map<String, Object> asHash(final String k, final Object v) {
        final Map<String, Object> m = new HashMap<>();
        m.put(k, v);
        return m;
    }

    /**
     * returns map
     *
     * @param k1 key
     * @param v2 value
     * @return map
     */
    public static <K, V> Map<K, V> of(final K k1, final V v1, final K k2, final V v2) {
        final Map<K, V> m = new HashMap<>();
        m.put(k1, v1);
        m.put(k2, v2);
        return m;
    }

    /**
     * returns hash (string:object map)
     *
     * @param k1 key
     * @param v1 value
     * @return map
     */
    public static Map<String, Object> asHash(final String k1, final Object v1, final String k2, final Object v2) {
        final Map<String, Object> m = new HashMap<>();
        m.put(k1, v1);
        m.put(k2, v2);
        return m;
    }

    /**
     * returns map
     *
     * @param k1 key
     * @param v2 value
     * @return map
     */
    public static <K, V> Map<K, V> of(final K k1, final V v1, final K k2, final V v2, final K k3, final V v3) {
        final Map<K, V> m = new HashMap<>();
        m.put(k1, v1);
        m.put(k2, v2);
        m.put(k3, v3);
        return m;
    }

    /**
     * returns hash (string:object map)
     *
     * @param k1 key
     * @param v1 value
     * @return map
     */
    public static Map<String, Object> asHash(final String k1, final Object v1, final String k2, final Object v2,
        final String k3, final Object v3) {
        final Map<String, Object> m = new HashMap<>();
        m.put(k1, v1);
        m.put(k2, v2);
        m.put(k3, v3);
        return m;
    }

    /**
     * check if map is empty
     *
     * @param m map
     * @return boolean
     */
    public static boolean isEmpty(final Map<?, ?> m) {
        return m == null || m.isEmpty();
    }

    /**
     * check if map is not empty
     *
     * @param m map
     * @return boolean
     */
    public static boolean isNotEmpty(final Map<?, ?> m) {
        return !isEmpty(m);
    }

    /**
     * get key
     *
     * @param m   map
     * @param key key
     * @return
     */
    public static <K, V> V get(final Map<K, V> m, final K key) {
        if (isEmpty(m)) {
            return null;
        }

        return m.get(key);
    }

    /**
     * prints the map to log
     *
     * @param m
     * @param log
     * @param <K>
     * @param <V>
     */
    public static <K, V> void print(final String title, final Map<K, V> m, final Logger log) {
        if (log == null || m == null) {
            return;
        }
        log.debug("Values for {}:", title);
        for (final Entry<K, V> key : m.entrySet()) {
            log.debug("=> {}={}", key.getKey(), key.getValue());
        }
    }
}
