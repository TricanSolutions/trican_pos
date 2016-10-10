/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import viewer.Home;

/**
 *
 * @author Sudaraka Ranasinghe
 */
public class ConstantData {

    public static String Status_ACTIVE = "1";
    public static String Status_DEACTIVE = "2";
    public static String Status_DONE = "3";
    public static String Status_PENDING = "4";
    public static String Status_COMPLETE = "5";
    public static String Status_DELETE = "6";

    public static ImageIcon img = new ImageIcon("src/images/icon.png");

//    public static String dbConnectionURL = "jdbc:mysql://localhost:3306/trican_pos?useUnicode=true&characterEncoding=UTF-8";
    public static String dbConnectionURL = "jdbc:mysql://localhost:3306/neth_mobile?useUnicode=true&characterEncoding=UTF-8";
//    public static String dbConnectionURL = "jdbc:mysql://188.166.227.42:3306/neth_mobile?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true";

    public static String dbUsername = "root";
    public static String dbPassword = "123";
//     public static String dbPassword = "m9IQfJQtzn";

    public static String ReportPATH = "src/reports/";
    public static Home home = null;

    public static String logUserId = "1";
    public static String logUserName = "";
    public static String branchId = "1";
    public static String branchName = "Main Branch";

    public static String getStatusID(JComboBox cmb) throws Exception {
        String id = "";

        if (cmb.getSelectedItem().toString().equalsIgnoreCase("Active")) {
            id = Status_ACTIVE;
        } else if (cmb.getSelectedItem().toString().equalsIgnoreCase("Deactive")) {
            id = Status_DEACTIVE;
        } else if (cmb.getSelectedItem().toString().equalsIgnoreCase("Done")) {
            id = Status_DONE;
        } else if (cmb.getSelectedItem().toString().equalsIgnoreCase("Pending")) {
            id = Status_PENDING;
        } else {
            AppExecptions.illegalStatusComboboxItem();
        }

        return id;
    }

}
