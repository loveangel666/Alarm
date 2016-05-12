package edu.alarm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CheckAlarmTime {
    
    
    
    public static String getTime () throws Exception {
	SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");	
	Calendar calendar = new GregorianCalendar();

	int year       = calendar.get(Calendar.YEAR);
	int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
	int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
	int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
	int minute     = calendar.get(Calendar.MINUTE);
        String time;
            if (minute < 10){
            time = calendar.get(Calendar.HOUR_OF_DAY) + ":0" + calendar.get(Calendar.MINUTE);
        }
            else {time = calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE);
            }
		
	//System.out.println(sdf.format(calendar.getTime())); //Выводит дату в формате, указанном параметром SimpleDataFormat
        System.out.println("time \t: " + time);
        return(time);
        
        //System.out.println("");
    }    

    public static void check() {
        
    }
    
    
    

}
