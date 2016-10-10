/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * 
 */
public class Messages {

    public static void normaljoption(String error1) {

        JOptionPane.showMessageDialog(null, error1);

    }

    public static void errorjoption(String error1) {
        String msg="<html><font color='red' >"+error1+"</font></html>";
        JOptionPane.showMessageDialog(null, msg, "Error", 0, null);

    }

    public static void warningjoption(String error1) {
        String msg="<html><font color='red' >"+error1+"</font></html>";
        JOptionPane.showMessageDialog(null, msg, "Error", 2, null);

    }

    public static void questionjoption(String error1) {
        String msg="<html><font color='red' >"+error1+"</font></html>";
        JOptionPane.showMessageDialog(null, msg, "Error", 3, null);

    }

    public void questionjoption(String string, JTextField txtdirector1) {
        questionjoption(string);
        txtdirector1.requestFocus();
    }
    
    public static void internalErrorMessage(){
        errorjoption("Internal Error Occur,Incorrect Transaction or Data missing,Try again later ! ");
    }
    
}
