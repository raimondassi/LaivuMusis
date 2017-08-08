package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Raimondas on 2017.08.07.
 */
public class UIDesigner extends JFrame{
    public static void main(String[] args) {
        JFrame frame=new JFrame("Laivu Musio Applikacija");
        frame.setSize(1000,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel PirmasDemuoLabel =new JLabel();
        PirmasDemuoLabel.setText("Pirmas Mygtukas");
        panel.add(PirmasDemuoLabel);
        JTextField pirmasDemuo=new JTextField();
        pirmasDemuo.setPreferredSize(new Dimension(100,20));
        panel.add(pirmasDemuo);


        JLabel antrasDemuoLabel =new JLabel();
        antrasDemuoLabel.setText("Antras Mygtukas");
        panel.add(antrasDemuoLabel);
        JTextField antrasDemuo=new JTextField();
        antrasDemuo.setPreferredSize(new Dimension(100,20));
        panel.add(antrasDemuo);



        JButton button=new JButton();
        button.setText("Suma");
        button.setPreferredSize(new Dimension(100,20));
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Integer.parseInt(pirmasDemuo.getText())+Integer.parseInt(antrasDemuo.getText()));

            }
        });

frame.setVisible(true);
    }


}
