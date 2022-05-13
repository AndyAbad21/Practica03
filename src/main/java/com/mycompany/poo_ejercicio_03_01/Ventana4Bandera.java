/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.poo_ejercicio_03_01;
import javax.swing.JFrame;
import java.awt.Point;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
/**
 * 
 * @author Andy Abad
 */
public class Ventana4Bandera extends JFrame
{
    JPanel jPanel;
    JPanel jPanelBandera;
    private ArrayList<JLabel> jLabelList;
    private ArrayList<JLabel> jLabelListBandera;
    
    public Ventana4Bandera(String title)
    {
        super.setTitle(title);
        Point p=new Point(50,50);
        this.setLocation(p);
        Dimension d=new Dimension(400,200);
        this.setSize(d);
        this.iniciarComponentes();
        this.setContentPane(jPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void iniciarComponentes()
    {
        this.iniciarJLabelList();
        this.iniciarJLabelListBandera();
        this.iniciarBandera();
        this.crearJPanel();
        
    }
    public void crearJPanel()
    {
        jPanel=new JPanel();
        this.jPanel.setBackground(Color.YELLOW);
        this.jPanel.setOpaque(true);
        this.jPanel.setLayout(new BorderLayout());
        this.jPanel.add(jLabelList.get(0),BorderLayout.NORTH);
        this.jPanel.add(jLabelList.get(2),BorderLayout.SOUTH);
        this.jPanel.add(jLabelList.get(3),BorderLayout.EAST);
        this.jPanel.add(jLabelList.get(1),BorderLayout.WEST);
        this.jPanel.add(jPanelBandera,BorderLayout.CENTER);
    }
    public void iniciarJLabelList()
    {
        jLabelList=new ArrayList<>();
        for(int i=0; i<4; i++)
            this.jLabelList.add(new JLabel());
        
        this.jLabelList.get(0).setBackground(Color.RED);
        this.jLabelList.get(0).setForeground(Color.BLACK);
        this.jLabelList.get(0).setText("Boton 1");
        this.jLabelList.get(0).setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.jLabelList.get(0).setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelList.get(0).setOpaque(true);
        this.jLabelList.get(1).setBackground(Color.GREEN);
        this.jLabelList.get(1).setForeground(Color.BLACK);
        this.jLabelList.get(1).setText("Boton 3");
        this.jLabelList.get(1).setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.jLabelList.get(1).setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelList.get(1).setOpaque(true);
        this.jLabelList.get(2).setBackground(Color.WHITE);
        this.jLabelList.get(2).setForeground(Color.BLACK);
        this.jLabelList.get(2).setText("Long-Named Button 4");
        this.jLabelList.get(2).setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.jLabelList.get(2).setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelList.get(2).setOpaque(true);
        this.jLabelList.get(3).setBackground(Color.BLUE);
        this.jLabelList.get(3).setForeground(Color.BLACK);
        this.jLabelList.get(3).setText("Boton 5");
        this.jLabelList.get(3).setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.jLabelList.get(3).setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelList.get(3).setOpaque(true);
    }
    public void iniciarBandera()
    {
        jPanelBandera=new JPanel(); 
        this.jPanelBandera.setLayout(new GridLayout(7,10));
        
        jLabelListBandera=new ArrayList<>();
        for(int i=0; i<70; i++){
            jLabelListBandera.add(new JLabel());
        }
        this.jLabelListBandera.get(0).setBackground(Color.RED);
        this.jLabelListBandera.get(1).setBackground(Color.RED);
        this.jLabelListBandera.get(2).setBackground(Color.RED);
        this.jLabelListBandera.get(3).setBackground(Color.WHITE);
        this.jLabelListBandera.get(4).setBackground(Color.BLUE);
        this.jLabelListBandera.get(5).setBackground(Color.WHITE);
        this.jLabelListBandera.get(6).setBackground(Color.RED);
        this.jLabelListBandera.get(7).setBackground(Color.RED);
        this.jLabelListBandera.get(8).setBackground(Color.RED);
        this.jLabelListBandera.get(9).setBackground(Color.RED);
        this.jLabelListBandera.get(10).setBackground(Color.RED);
        this.jLabelListBandera.get(11).setBackground(Color.RED);
        this.jLabelListBandera.get(12).setBackground(Color.RED);
        this.jLabelListBandera.get(13).setBackground(Color.WHITE);
        this.jLabelListBandera.get(14).setBackground(Color.BLUE);
        this.jLabelListBandera.get(15).setBackground(Color.WHITE);
        this.jLabelListBandera.get(16).setBackground(Color.RED);
        this.jLabelListBandera.get(17).setBackground(Color.RED);
        this.jLabelListBandera.get(18).setBackground(Color.RED);
        this.jLabelListBandera.get(19).setBackground(Color.RED);
        this.jLabelListBandera.get(20).setBackground(Color.WHITE);
        this.jLabelListBandera.get(21).setBackground(Color.WHITE);
        this.jLabelListBandera.get(22).setBackground(Color.WHITE);
        this.jLabelListBandera.get(23).setBackground(Color.WHITE);
        this.jLabelListBandera.get(24).setBackground(Color.BLUE);
        this.jLabelListBandera.get(25).setBackground(Color.WHITE);
        this.jLabelListBandera.get(26).setBackground(Color.WHITE);
        this.jLabelListBandera.get(27).setBackground(Color.WHITE);
        this.jLabelListBandera.get(28).setBackground(Color.WHITE);
        this.jLabelListBandera.get(29).setBackground(Color.WHITE);
        this.jLabelListBandera.get(30).setBackground(Color.BLUE);
        this.jLabelListBandera.get(31).setBackground(Color.BLUE);
        this.jLabelListBandera.get(32).setBackground(Color.BLUE);
        this.jLabelListBandera.get(33).setBackground(Color.BLUE);
        this.jLabelListBandera.get(34).setBackground(Color.BLUE);
        this.jLabelListBandera.get(35).setBackground(Color.BLUE);
        this.jLabelListBandera.get(36).setBackground(Color.BLUE);
        this.jLabelListBandera.get(37).setBackground(Color.BLUE);
        this.jLabelListBandera.get(38).setBackground(Color.BLUE);
        this.jLabelListBandera.get(39).setBackground(Color.BLUE);
        this.jLabelListBandera.get(40).setBackground(Color.WHITE);
        this.jLabelListBandera.get(41).setBackground(Color.WHITE);
        this.jLabelListBandera.get(42).setBackground(Color.WHITE);
        this.jLabelListBandera.get(43).setBackground(Color.WHITE);
        this.jLabelListBandera.get(44).setBackground(Color.BLUE);
        this.jLabelListBandera.get(45).setBackground(Color.WHITE);
        this.jLabelListBandera.get(46).setBackground(Color.WHITE);
        this.jLabelListBandera.get(47).setBackground(Color.WHITE);
        this.jLabelListBandera.get(48).setBackground(Color.WHITE);
        this.jLabelListBandera.get(49).setBackground(Color.WHITE);
        this.jLabelListBandera.get(50).setBackground(Color.RED);
        this.jLabelListBandera.get(51).setBackground(Color.RED);
        this.jLabelListBandera.get(52).setBackground(Color.RED);
        this.jLabelListBandera.get(53).setBackground(Color.WHITE);
        this.jLabelListBandera.get(54).setBackground(Color.BLUE);
        this.jLabelListBandera.get(55).setBackground(Color.WHITE);
        this.jLabelListBandera.get(56).setBackground(Color.RED);
        this.jLabelListBandera.get(57).setBackground(Color.RED);
        this.jLabelListBandera.get(58).setBackground(Color.RED);
        this.jLabelListBandera.get(59).setBackground(Color.RED);
        this.jLabelListBandera.get(60).setBackground(Color.RED);
        this.jLabelListBandera.get(61).setBackground(Color.RED);
        this.jLabelListBandera.get(62).setBackground(Color.RED);
        this.jLabelListBandera.get(63).setBackground(Color.WHITE);
        this.jLabelListBandera.get(64).setBackground(Color.BLUE);
        this.jLabelListBandera.get(65).setBackground(Color.WHITE);
        this.jLabelListBandera.get(66).setBackground(Color.RED);
        this.jLabelListBandera.get(67).setBackground(Color.RED);
        this.jLabelListBandera.get(68).setBackground(Color.RED);
        this.jLabelListBandera.get(69).setBackground(Color.RED);
        //this.jLabelListBandera.get(70).setBackground(Color.RED);
        
        
        
        
        
        
        
        
        for(int i=0; i<70; i++)
        {
            jPanelBandera.add(jLabelListBandera.get(i));
            this.jLabelListBandera.get(i).setOpaque(true);
        }
        
    }
    public void iniciarJLabelListBandera()
    {
        /*jLabelListBandera=new ArrayList<>();
        for(int i=0; i<81; i++){
            jLabelListBandera.add(new JLabel());
        }
        this.jLabelListBandera.get(0).setBackground(Color.RED);
        this.jLabelListBandera.get(0).setOpaque(true);
        this.jLabelListBandera.get(1).setBackground(Color.WHITE);
        this.jLabelListBandera.get(1).setOpaque(true);
        this.jLabelListBandera.get(2).setBackground(Color.BLUE);
        this.jLabelListBandera.get(2).setOpaque(true);*/
    }
}
