/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Sudaraka Ranasinghe
 */
public class AllCalculations {

    public static String DiscountforPrecentage(double cost, double value) {// price out
        try {

            return Format.decimal3.format(((100 - value) / 100) * cost);
        } catch (Exception e) {
            e.printStackTrace();
            return "-0.00";
        }

    }

    public static String DiscountforPrice(double cost, double value) { // precentage out
        try {
            return Format.decimal3.format(((cost - value) / cost) * 100);
        } catch (Exception e) {
            e.printStackTrace();
            return "-0.00";
        }
    }

    public static String DiscountforPricePrecentage(double cost, double price) {
        try {
            return Format.decimal3.format(100 - ((price / cost) * 100));
        } catch (Exception e) {
            e.printStackTrace();
            return "-0.00";
        }
    }

    public static String TotalofItem(double fprice, double qty) {
        try {
            return Format.decimal3.format(fprice * qty);
        } catch (Exception e) {
            e.printStackTrace();
            return "-0.00";
        }
    }

//    public static void main(String[] args) {
//
////        System.out.println(TotalofItem(258.25, 1.2));
//
//    }
}
