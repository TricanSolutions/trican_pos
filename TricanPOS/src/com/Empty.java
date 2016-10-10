package com;

import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Ravinda
 */
public class Empty {

    public static String Text = "Please Fill ";

    public static boolean TxtFieldEmpty(JTextField field, String Message) {
        if (field.getText().isEmpty()) {
            if (!(Message == null)) {
                Messages.warningjoption(Message);
            }
            field.grabFocus();
            return true;
        }
        return false;
    }

    public static boolean ComboBox(JComboBox cmb, String Message) {
        if (cmb.getSelectedIndex() == 0) {
            if (!(Message == null)) {
                Messages.warningjoption(Message);
            }
            cmb.grabFocus();
            return true;
        }
        return false;
    }

    public static boolean TextAreaEmpty(JTextArea tarea, String Message) {
        if (tarea.getText().isEmpty()) {
            if (!(Message == null)) {
                Messages.warningjoption(Message);
            }
            tarea.grabFocus();
            return true;
        }
        return false;
    }

    public static boolean DateFormatedFeild(JFormattedTextField ftxt) {

        try {
            SimpleDateFormat sm = new SimpleDateFormat(Format.yyyy_MM_dd);
            sm.parse(ftxt.getText());
            return true;
        } catch (Exception ex) {

            return false;
        }

    }

    public static boolean DateFormatedFeild(JFormattedTextField ftxt, String Message) {

        try {
            SimpleDateFormat sm = new SimpleDateFormat(Format.yyyy_MM_dd);
            sm.parse(ftxt.getText());
            return false;
        } catch (Exception ex) {
            Messages.warningjoption(Message);
            ftxt.grabFocus();
            return true;
        }

    }

    public static boolean ContactNumberFormatedFeild(JFormattedTextField ftxt, String Message) {

        try {
            String value = ftxt.getText().split("-")[0];
            if (value.contains("0")) {
//                System.out.println("Phone number");
                return false;
            } else {
//                System.out.println("Not a Phone number");
                if (!Message.isEmpty()) {
                    Messages.warningjoption(Message);
                    ftxt.grabFocus();
                }

                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean NICFormatedFeild(JFormattedTextField ftxt) {

        try {
            String value = ftxt.getText().substring(0, 1);
            int v = Integer.parseInt(value);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public static boolean NICFormatedFeild(JFormattedTextField ftxt, String Message) {

        try {
            String value = ftxt.getText().substring(0, 1);
            int v = Integer.parseInt(value);
            return false;
        } catch (Exception e) {
            if (!Message.isEmpty()) {
                Messages.warningjoption(Message);
                ftxt.grabFocus();
            }
            return true;
        }
    }

    public static boolean ContactNumberFormatedFeild(JFormattedTextField ftxt) {

        try {
            String value = ftxt.getText().split("-")[0];
            if (value.contains("0")) {
//                System.out.println("Phone number");
                return true;
            } else {
//                System.out.println("Not a Phone number");
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
