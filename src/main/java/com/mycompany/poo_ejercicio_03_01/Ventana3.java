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
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
/**
 * 
 * @author Andy Abad
 */
public class Ventana3 extends JFrame
{
    JPanel jPanel;
    private ArrayList<JLabel> jLabelList;
    
    public Ventana3(String title)
    {
        super.setTitle(title);
        Point p=new Point(500,50);
        this.setLocation(p);
        Dimension d=new Dimension(350,100);
        this.setSize(d);
        this.iniciarComponentes();
        this.setContentPane(jPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void iniciarComponentes()
    {
        this.iniciarJLabelList();
        this.crearJPanel();
        
    }
    public void crearJPanel()
    {
        jPanel=new JPanel();
        this.jPanel.setBackground(Color.RED);
        this.jPanel.setOpaque(true);
        this.jPanel.setLayout(new GridLayout(3,2));
        for(int i=0; i<5; i++)
            this.jPanel.add(jLabelList.get(i));
    }
    public void iniciarJLabelList()
    {
        jLabelList=new ArrayList<>();
        for(int i=0; i<6; i++)
            this.jLabelList.add(new JLabel());
        
        this.jLabelList.get(0).setBackground(Color.RED);
        this.jLabelList.get(0).setForeground(Color.BLACK);
        this.jLabelList.get(0).setText("Boton 1");
        this.jLabelList.get(0).setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.jLabelList.get(0).setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelList.get(0).setOpaque(true);
        this.jLabelList.get(1).setBackground(Color.YELLOW);
        this.jLabelList.get(1).setForeground(Color.BLACK);
        this.jLabelList.get(1).setText("2");
        this.jLabelList.get(1).setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.jLabelList.get(1).setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelList.get(1).setOpaque(true);
        this.jLabelList.get(2).setBackground(Color.GREEN);
        this.jLabelList.get(2).setForeground(Color.BLACK);
        this.jLabelList.get(2).setText("Boton 3");
        this.jLabelList.get(2).setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.jLabelList.get(2).setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelList.get(2).setOpaque(true);
        this.jLabelList.get(3).setBackground(Color.WHITE);
        this.jLabelList.get(3).setForeground(Color.BLACK);
        this.jLabelList.get(3).setText("Long-Named Boton 4");
        this.jLabelList.get(3).setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.jLabelList.get(3).setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelList.get(3).setOpaque(true);
        this.jLabelList.get(4).setBackground(Color.BLUE);
        this.jLabelList.get(4).setForeground(Color.BLACK);
        this.jLabelList.get(4).setText("Boton 5");
        this.jLabelList.get(4).setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.jLabelList.get(4).setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelList.get(4).setOpaque(true);
     
    }
}
