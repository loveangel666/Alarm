package edu.alarm;

import javax.swing.JTextField;

public class SetAlarm {
    
    static String alarmNumber, name, time;
    //AlarmFrame aF = new AlarmFrame();
    
    
    SetAlarm (String name){
    }
     public void setText(String alarmNumber){
        this.alarmNumber = alarmNumber;
        System.out.println("Был выбран " + alarmNumber + "-й будильник.");
        
    }
   

    public void setText(String time, String name){
        this.time = time;
        this.name = name;
        System.out.println("Время будильника установлено на" + time);
        System.out.println("В описании будильника написано: " + name);
   
    }
    
    void printVars() {
        System.out.println(time + name + " " + alarmNumber);
    }
    
    
}
