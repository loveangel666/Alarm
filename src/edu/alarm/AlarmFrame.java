package edu.alarm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
 
public class AlarmFrame /*implements ActionListener */{
    static String alarmNumber;
    static SetAlarm sAaN = new SetAlarm(alarmNumber);
    JPanel mainPanel;
    AlarmFrame() {
        final JFrame af = new JFrame();
        /*
        af.setSize(430, 260);
        af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        af.setLocationRelativeTo(null);
        af.setVisible(true);
        */
        
          af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
          Dimension buttonAlarmSize = new Dimension(100, 30);
          Dimension labelTimeSize = new Dimension(50, 30);
          Dimension labelNameSize = new Dimension(150, 30);
          Dimension alarmPanelSize = new Dimension(130, 210);
          Dimension timePanelSize = new Dimension(80, 210);
          Dimension namePanelSize = new Dimension(180, 210);
           
          Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
           
          mainPanel = new JPanel();
          mainPanel.setLayout(new FlowLayout());
           
          //Панель Будильники
          JPanel alarmPanel = new JPanel(new FlowLayout());
          alarmPanel.setBorder(BorderFactory.createTitledBorder("Будильники"));
           
          Font font = new Font("Verdana", Font.BOLD, 12);
           
          JButton b1 = new JButton("1st Alarm");
          //b1.setVerticalAlignment(JButton.BOTTOM);
          b1.setHorizontalAlignment(JButton.CENTER);
          b1.setPreferredSize(buttonAlarmSize);
         //b1.setBorder(solidBorder);
          b1.setFont(font);
          b1.setForeground(Color.RED);
          alarmPanel.add(b1);
           
          font = new Font(null, Font.ITALIC, 13);
           
          JButton b2 = new JButton("2nd Alarm");
          //b2.setVerticalAlignment(JButton.BOTTOM);
          b2.setHorizontalAlignment(JButton.CENTER);
          b2.setPreferredSize(buttonAlarmSize);
          //b2.setBorder(solidBorder);
          b2.setFont(font);
          b2.setForeground(Color.RED);
          alarmPanel.add(b2);
           
          JButton b3 = new JButton("3rd Alarm");
          //b3.setVerticalAlignment(JButton.BOTTOM);
          b3.setHorizontalAlignment(JButton.CENTER);
          b3.setPreferredSize(buttonAlarmSize);
          //b3.setBorder(solidBorder);
          b3.setForeground(Color.RED);
          alarmPanel.add(b3);
           
          font = new Font(null, Font.BOLD, 10);
           
          JButton b4 = new JButton("4th Alarm");
          //b4.setVerticalAlignment(JButton.BOTTOM);
          b4.setHorizontalAlignment(JButton.CENTER);
          b4.setPreferredSize(buttonAlarmSize);
          //b4.setBorder(solidBorder);
          b4.setFont(font);
          b4.setForeground(Color.RED);
          alarmPanel.add(b4);
           
          font = new Font("Century Gothic", Font.BOLD, 14);
           
          JButton b5 = new JButton("5th Alarm");
          //b5.setVerticalAlignment(JButton.BOTTOM);
          b5.setHorizontalAlignment(JButton.CENTER);
          b5.setPreferredSize(buttonAlarmSize);
          //b5.setBorder(solidBorder);
          b5.setFont(font);
          b5.setForeground(Color.RED);
          alarmPanel.add(b5);
           
          alarmPanel.setPreferredSize(alarmPanelSize);
          mainPanel.add(alarmPanel);
           
          //Панель Время
          JPanel timePanel = new JPanel();
          timePanel.setBorder(BorderFactory.createTitledBorder("Время"));
           
          //Icon icon = UIManager.getIcon("OptionPane.errorIcon");
          //<имя элемента>.setIcon(icon); 
          JLabel l1 = new JLabel("");
          l1.setVerticalTextPosition(JLabel.TOP);
          l1.setHorizontalTextPosition(JLabel.LEFT);
          l1.setPreferredSize(labelTimeSize);
          l1.setBorder(solidBorder);
          timePanel.add(l1);
           
          //icon = UIManager.getIcon("OptionPane.informationIcon");
          //l2.setIcon(icon);                     
          JLabel l2 = new JLabel("");
          l2.setVerticalTextPosition(JLabel.BOTTOM);
          l2.setHorizontalTextPosition(JLabel.LEFT);
          l2.setPreferredSize(labelTimeSize);
          l2.setBorder(solidBorder);
          timePanel.add(l2);
           
          //icon = UIManager.getIcon("OptionPane.questionIcon");
          //l3.setIcon(icon);                     
          JLabel l3 = new JLabel("");
          l3.setVerticalTextPosition(JLabel.TOP);
          l3.setHorizontalTextPosition(JLabel.RIGHT);
          l3.setPreferredSize(labelTimeSize);
          l3.setBorder(solidBorder);
          timePanel.add(l3);
           
          //icon = UIManager.getIcon("OptionPane.errorIcon");
          //l4.setIcon(icon);          
          JLabel l4 = new JLabel("");
          l4.setVerticalTextPosition(JLabel.BOTTOM);
          l4.setHorizontalTextPosition(JLabel.RIGHT);
          l4.setPreferredSize(labelTimeSize);
          l4.setBorder(solidBorder);
          timePanel.add(l4);
           
          //icon = UIManager.getIcon("OptionPane.informationIcon");
          //l5.setIcon(icon);                     
          JLabel l5 = new JLabel("");
          l5.setVerticalTextPosition(JLabel.TOP);
          l5.setHorizontalTextPosition(JLabel.CENTER);
          l5.setPreferredSize(labelTimeSize);
          l5.setBorder(solidBorder);
          timePanel.add(l5);                    
          
          timePanel.setPreferredSize(timePanelSize);
          mainPanel.add(timePanel);
          
           
          //Панель Описание
          JPanel namePanel = new JPanel();
          namePanel.setBorder(BorderFactory.createTitledBorder("Описание"));
           
          //Icon icon = UIManager.getIcon("OptionPane.errorIcon");
          //<имя элемента>.setIcon(icon); 
          JLabel l6 = new JLabel("");
          l6.setVerticalTextPosition(JLabel.TOP);
          l6.setHorizontalTextPosition(JLabel.LEFT);
          l6.setPreferredSize(labelNameSize);
          l6.setBorder(solidBorder);
          namePanel.add(l6);
           
          //icon = UIManager.getIcon("OptionPane.informationIcon");
          //l2.setIcon(icon);                     
          JLabel l7 = new JLabel("");
          l7.setVerticalTextPosition(JLabel.BOTTOM);
          l7.setHorizontalTextPosition(JLabel.LEFT);
          l7.setPreferredSize(labelNameSize);
          l7.setBorder(solidBorder);
          namePanel.add(l7);
           
          //icon = UIManager.getIcon("OptionPane.questionIcon");
          //l3.setIcon(icon);                     
          JLabel l8 = new JLabel("");
          l8.setVerticalTextPosition(JLabel.TOP);
          l8.setHorizontalTextPosition(JLabel.RIGHT);
          l8.setPreferredSize(labelNameSize);
          l8.setBorder(solidBorder);
          namePanel.add(l8);
           
          //icon = UIManager.getIcon("OptionPane.errorIcon");
          //l4.setIcon(icon);          
          JLabel l9 = new JLabel("");
          l9.setVerticalTextPosition(JLabel.BOTTOM);
          l9.setHorizontalTextPosition(JLabel.RIGHT);
          l9.setPreferredSize(labelNameSize);
          l9.setBorder(solidBorder);
          namePanel.add(l9);
           
          //icon = UIManager.getIcon("OptionPane.informationIcon");
          //l5.setIcon(icon);                     
          JLabel l10 = new JLabel("");
          l10.setVerticalTextPosition(JLabel.TOP);
          l10.setHorizontalTextPosition(JLabel.CENTER);
          l10.setPreferredSize(labelNameSize);
          l10.setBorder(solidBorder);
          namePanel.add(l10);                    
          
          namePanel.setPreferredSize(namePanelSize);
          mainPanel.add(namePanel);
          
          
          af.getContentPane().add(mainPanel);
          af.setPreferredSize(new Dimension(430, 260));
          af.pack();
          af.setLocationRelativeTo(null);
          af.setResizable(false);
          af.setVisible(true);
    
          
        //Навешиваем обработчики на кнопки будильников  
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evnt) {
                alarmNumber = "1";
                sAaN.setText(alarmNumber);
                new DialogFrame(mainPanel, 0); //Вызывает класс DialogFrame для построение диалогового окна, при этом передавая ему в качестве параметра окно af
                
            }
           
        });
        
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evnt) {
                alarmNumber = "2";
                sAaN.setText(alarmNumber);
                new DialogFrame(mainPanel, 1); //Вызывает класс DialogFrame для построение диалогового окна, при этом передавая ему в качестве параметра окно af
            }
           
        });
        
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evnt) {
                alarmNumber = "3";
                sAaN.setText(alarmNumber);
                new DialogFrame(mainPanel, 2); //Вызывает класс DialogFrame для построение диалогового окна, при этом передавая ему в качестве параметра окно af
            }
           
        });
        
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evnt) {
                alarmNumber = "4";
                sAaN.setText(alarmNumber);
                new DialogFrame(mainPanel, 3); //Вызывает класс DialogFrame для построение диалогового окна, при этом передавая ему в качестве параметра окно af
            }
           
        });
        
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evnt) {
                alarmNumber = "5";
                sAaN.setText(alarmNumber);
                new DialogFrame(mainPanel, 4); //Вызывает класс DialogFrame для построение диалогового окна, при этом передавая ему в качестве параметра окно af
            }
           
        });
                
        
    }
    /*
    public static void alarmFrame () {

        
    }
    */
    
    
    /*
    @Override
    public void actionPerformed(ActionEvent evnt) {
 
    }
    */
 
}