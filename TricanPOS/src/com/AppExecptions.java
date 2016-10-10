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
public class AppExecptions extends Exception {

    public AppExecptions() {
    }

    AppExecptions(String msg) {
        super(msg);
    }

    public static void illegalStatusComboboxItem() throws AppExecptions {
        AppExecptions ap = new AppExecptions("This Combobox has included invalied item please check ");
        throw ap;
    }
    

}
