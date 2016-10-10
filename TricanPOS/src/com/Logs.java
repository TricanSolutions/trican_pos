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
public class Logs {
    
    public void createLog(String description,String userid){
    
        try {
            model.DB.putData("insert into logs (description,date,user_id) values ('"+description.trim()+"',Now(),'"+userid.trim()+"')");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
