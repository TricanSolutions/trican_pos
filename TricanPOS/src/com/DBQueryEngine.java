/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Sudaraka Ranasinghe
 */
public class DBQueryEngine {

    public static String GetMaxID(String table) { // return next new id 
        String id = "1";

        try {
            ResultSet rs = model.DB.getData("select max(id) from " + table);

            if (rs.next()) {

                if (rs.getString(1) != null) {
                    int num = Integer.parseInt(rs.getString(1));
                    num++;
                    id = "" + num;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return id;
    }

    public static int GetMaxIDInt(String table) { // return next new id 
        String id = "1";

        try {
            ResultSet rs = model.DB.getData("select max(id) from " + table);

            if (rs.next()) {

                if (rs.getString(1) != null) {
                    int num = Integer.parseInt(rs.getString(1));
                    num++;
                    id = "" + num;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Integer.parseInt(id);
    }

    public static boolean isAlreadyExist(String field, String table, String value) {

        try {
            ResultSet rs = model.DB.getData("select " + field + " from " + table + " where " + field + "='" + value + "' and status='" + ConstantData.Status_ACTIVE + "'");

            if (rs.next()) {

                return false;

            }
        } catch (Exception e) {

            e.printStackTrace();
            return false;

        }

        return true;
    }

    public static boolean isAlreadyExist(String sql) {

        try {
            ResultSet rs = model.DB.getData(sql);

            if (rs.next()) {

                return false;

            }
        } catch (Exception e) {

            e.printStackTrace();
            return false;

        }

        return true;
    }

    public static void loadSelectedComboItems(JComboBox cmb, String sql) {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmb.getModel();
        dcbm.removeAllElements();

        try {
            dcbm.addElement("--Select--");
            ResultSet rs = model.DB.getData(sql);
            while (rs.next()) {

                dcbm.addElement(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getIDofSelectedValue(String table, String field, String value) { // 
        String id = "0";

        try {
            ResultSet rs = model.DB.getData("select id from " + table + " where " + field + "='" + value + "'  and status='" + ConstantData.Status_ACTIVE + "'");

            if (rs.next()) {

                id = rs.getString(1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return id;
    }

    public static String getIDofSelectedValuenoStatus(String table, String field, String value) { // 
        String id = "0";

        try {
            ResultSet rs = model.DB.getData("select id from " + table + " where " + field + "='" + value + "'  ");

            if (rs.next()) {

                id = rs.getString(1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return id;
    }

    public static String getIDofSelectedValue(String field, String table, String srchfield, String value) { // 
        String id = "0";

        try {
            ResultSet rs = model.DB.getData("select " + field + " from " + table + " where " + srchfield + "='" + value + "'  and status='" + ConstantData.Status_ACTIVE + "'");

            if (rs.next()) {

                id = rs.getString(1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return id;
    }
}
