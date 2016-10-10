/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Ravinda
 */
public class Format {


    public static final DecimalFormat decimal1 = new DecimalFormat("#.#");
    public static final DecimalFormat decimal2 = new DecimalFormat("#.##");
    public static final DecimalFormat decimal3 = new DecimalFormat("#.###");

    public static String yyyy_MM_dd = "yyyy-MM-dd";
    public static String hh_mm_ss_aa = "hh:mm:ss aa";
    public static String hh_mm_ss = "hh:mm:ss";
    public static String HH_mm_ss = "HH:mm:ss";
    public static String yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss ";
    public static String yyyy_MM_dd_hh_mm_ss_aa = "yyyy-MM-dd hh:mm:ss aa";

//    static {
//        nf2d.setGroupingUsed(false);
//        nf2d.setMaximumFractionDigits(2);
//        nf2d.setMinimumFractionDigits(2);
//        nf2d.setRoundingMode(RoundingMode.HALF_DOWN);
//    }
}
