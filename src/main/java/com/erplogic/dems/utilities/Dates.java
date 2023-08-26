/**
 *
 */
package com.erplogic.dems.utilities;

import java.time.LocalDateTime;

/**
 * @author Admin
 *
 */
public final class Dates {

    private Dates() {

    }

    public static LocalDateTime getCurrentLocalDateAndTime() {

        return LocalDateTime.now();

    }
}
