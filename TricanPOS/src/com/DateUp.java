/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;

/**
 *
 * @author Lasitha Ranawaka
 */
public class DateUp {

    public static Date DateSet(Date d) {

        d.setDate(d.getDate() + 1);

        return d;
    }

    public static String getCurrentDate() {

        Date d = new Date();
        SimpleDateFormat sm = new SimpleDateFormat(Format.yyyy_MM_dd);
        return sm.format(d);

    }

    public static String getCurrentTime() {

        Date d = new Date();
        SimpleDateFormat sm = new SimpleDateFormat(Format.HH_mm_ss);
        return sm.format(d);

    }

   

    public static void main(String[] args) {
        
        System.out.println(DateSet(new Date()));
    }
}
