/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiajava1_extra_1;

/**
 *
 * @author HP-G42
 */
public class Convertir {
    public String  ConvertDays(int minutes){
       int  days=0;
       int hours=0;
       do{
           if(minutes>=(24*60)){
           minutes=minutes-(24*60);
           days++; 
           }
       }while(minutes>(24*60));
       do{
           if(minutes>=60){
               minutes=minutes-60;
               hours++;
           }
       }while(minutes>=60);
       return days+" days, "+hours+" hours.";
    }
    
}
