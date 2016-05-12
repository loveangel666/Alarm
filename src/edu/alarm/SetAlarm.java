package edu.alarm;

import javax.swing.JTextField;
    
public class SetAlarm {
    String[] t  = new String[5];
    String[] n  = new String[5];
    static String alarmNumber, name, time;
    //AlarmFrame aF = new AlarmFrame();
    
    
    SetAlarm (String name){
    }
     public void setText(String alarmNumber){
        this.alarmNumber = alarmNumber;
        System.out.println("Был выбран " + alarmNumber + "-й будильник.");
        
    }
   
/*
    public void setText(String time, String name){
        this.time = time;
        this.name = name;
        System.out.println("Время будильника установлено на" + time);
        System.out.println("В описании будильника написано: " + name);
   
    }
  */  
    void printVars() {
        System.out.println(time + name + " " + alarmNumber);
    }

    void setText(String time, String name, int index) throws Exception {
        t[index] = time;
        n[index] = name;
        System.out.println("Время будильника установлено на" + t[index]);
        System.out.println("В описании будильника написано: " + n[index]);
        //new AlertFrame(t[index]); - Пригодится для вызова окна конкретного будильника
        //CheckAlarmTime.getTime(); - Пригодится для вызова сравнения времени будильника с системным временем
        
    }
    
    new CheckAlarmTime (String t[index]);
}