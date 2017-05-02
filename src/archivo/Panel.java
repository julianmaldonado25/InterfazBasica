/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Panel implements ActionListener{
    private Timer timer;
    private int x,y;
    
    public Panel(){
        initPanel();
        /*timer = new Timer(25,this);
        timer.start();
    */}
    @Override
    public void actionPerformed(ActionEvent e) {
        x+=1;
        y+=1;
        
        repaint();
    }

    private void initPanel() {
        //setBackground(Color.WHITE);
        
        
        timer = new Timer(25,this);
        timer.start();
    }

    private void repaint() {
       
    }
    
    
    
}
