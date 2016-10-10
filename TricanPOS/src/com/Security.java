/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sudaraka Ranasinghe
 */
public class Security {

    int expDATE = 20150612;// 2015-month-date

    public boolean CheckExpireDate() {

        boolean bol = true;

        String sim = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        int today = Integer.parseInt(sim.split("-")[0] + sim.split("-")[1] + sim.split("-")[2]);

        if (expDATE < today) {
            Messages.errorjoption("Your System Running Out of Date , You Can't work any longer ! Please Contact Trican Solutions ");
            bol = false;
        }

        return bol;
    }
}
