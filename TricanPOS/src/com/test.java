/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sudaraka Ranasinghe
 */
public class test {

    public static void main(String[] args) {

//       ArrayList<String> li=new ArrayList<String>();
//       
//       li.add("A");
//       li.add("B");
//       li.add("c");
//       li.add("A");
//       li.add("d");
      System.out.println(DateUp.getCurrentTime());
        // System.out.println(li);
    }

    public static String getDateSelectedFormat(String date) {
        
        String parsedDate = "";
        try {
            Date initDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            parsedDate = formatter.format(initDate);
            // System.out.println(parsedDate);
        } catch (Exception e) {
            return parsedDate;
        }
        return parsedDate;
    }

}
