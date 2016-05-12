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


public class DialogFrame extends JDialog{
    String name;
    String time;
    JTextField tfName = new JTextField(14);
    JFormattedTextField jftf;
    SetAlarm sA = new SetAlarm(name);
    JPanel mainPanel;
    
    DialogFrame (final JPanel mainPanel, final int index) {
    this.mainPanel = mainPanel;
    //super(af, Dialog.DEFAULT_MODALITY_TYPE);//Объекту af из родительского класса придает свойство блокироваться при открытии диалогового окна
    setModal(true);
    //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setTitle("Введите будильник");
    setLayout(new FlowLayout());
    setResizable(false); //Не забыть раскоментить
    setLocationRelativeTo(null);
    //final AlarmFrame aF = new AlarmFrame();
    
    add(new JLabel("   Время                   Описание                    "), BorderLayout.CENTER);
    
    MaskFormatter mf = null;
              try {
                  mf = new MaskFormatter(" ##:## ");
              } catch (ParseException ex) {
                  Logger.getLogger(AlarmFrame.class.getName()).log(Level.SEVERE, null, ex);
              }
                mf.setPlaceholderCharacter('0');
                // Поле для воода Времени
                final JFormattedTextField jftf = new JFormattedTextField(mf);
                getContentPane().add(jftf);
                
                // Поле для ввода Описания
                //JTextField tfName = new JTextField(14);
                add(tfName);
                
                // При активизации кнопки ОК диалогове окно закрывается.
                    JButton ok = new JButton("ok");
                    ok.addActionListener(new ActionListener() {
 
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            //name = tfName.getText();
                            //setVisible(false);
                            //System.out.println(name);
                            
                            
                           
                            //mainPanel.timePanel.l1.setText(name);
                            JPanel timePanel = (JPanel) mainPanel.getComponent(1); //некой временной вспомогательной переменной присваивается панель с метками установленного времени, т.е. timePanel из AlarmFrame.java. (JPanel) именно в скобках, говорит о том, что значение возвращенное getComponent() будет приведено к типу JPanel. А getComponent() вовзращет элемент номер, которого введен в качетсве параметра.
                            JLabel labelTime = (JLabel) timePanel.getComponent(index);//то же самое, возвращается элемент с соответствующим индексом из колонки с метками времени
                            labelTime.setText( jftf.getText());//И вот на этом определенном компоненте пишется текст из переменной jftf
                            
                            JPanel namePanel = (JPanel) mainPanel.getComponent(2);
                            JLabel labelName = (JLabel) namePanel.getComponent(index);
                            labelName.setText( tfName.getText());
                            
                            try {
                                sA.setText(jftf.getText(), tfName.getText(), index);
                            } catch (Exception ex) {
                                Logger.getLogger(DialogFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            //sA.printVars();;
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