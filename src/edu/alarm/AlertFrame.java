package edu.alarm;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

import javax.swing.*;
import javax.swing.text.*;


public class AlertFrame extends JDialog{
    String name;
    String time;
    SetAlarm sA = new SetAlarm(name);
    JPanel mainPanel;
    
    AlertFrame (String name) {
    this.mainPanel = mainPanel;
    //super(af, Dialog.DEFAULT_MODALITY_TYPE);//Объекту af из родительского класса придает свойство блокироваться при открытии диалогового окна
    setModal(true);
    //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setTitle("Будильник");
    setLayout(new FlowLayout());
    setResizable(false); //Не забыть раскоментить
    setLocationRelativeTo(null);
    //final AlarmFrame aF = new AlarmFrame();
    
    add(new JLabel(name), BorderLayout.CENTER);
    
    
                
                // При активизации кнопки ОК диалогове окно закрывается.
                    JButton ok = new JButton("ok");
                    ok.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            
                            setVisible(false);
                            
                            
                        }
                    });
               
                
                    
    // Кнопка ОК помещается в нижнюю часть окна.
    JPanel panel = new JPanel();
    panel.add(ok);
    add(panel, BorderLayout.CENTER);
    
    
    
    setSize(260, 120);
    setVisible(true);
    }
    
}
