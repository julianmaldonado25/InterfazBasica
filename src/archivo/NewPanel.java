/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class NewPanel extends JPanel implements ActionListener {
    
    private final Timer timer;
    private int x,y;

   
    
    
    
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        System.out.println("Click");
        
        
        
        /*g.setColor(Color.BLUE);
        //Set color
        
        g.drawLine(0, 0,200, 80);
        g.drawLine(0, 80, 200, 80);
        g.drawLine(0, 0, 0,80);
        g.drawString("That sounds great.", 0, 50);
        g.drawOval(190, 60, 20, 30);
        
        
        //Graphics' methods
        g.drawString(" That is so cool.", 120, 350);
        g.setColor(Color.darkGray);
        g.setFont(null);
        g.fillOval(250, 60, 20, 30);
        g.drawRect(300, 20, 150, 120);
        g.fillRect(100, 10,20, 30);
        g.draw3DRect(150, 150, 20, 30, true);
        //Color's change
        g.setColor(Color.RED);
        g.fill3DRect(300, 150, 40,30, true);
    
        */
        //Ejercicio incompleto de dibujar una 'sala'
        g.drawRect(80,100 , 40, 60);
        g.drawString("Puntos: 100", 250, 30);
        g.drawOval(150, 180, 30, 30);
        g.drawRect(135, 210, 60,60);
        g.drawRect(140, 270,10 , 50);
        g.drawRect(170, 270, 10, 50);
        
        
        
        
        
        //Carrito :v
        g.drawRect(x+1, 300, 50, 10);
        
        int v []= {x+11,x+21,x+31,x+41};
        int w []= {300,290,290,300};
        g.drawPolygon(v, w, 4);
        g.drawOval(x+11, 310, 5, 5);
        g.drawOval(x+31, 310, 5, 5);
        
        g.setColor(Color.CYAN);
        g.fillRect(x+1, 300, 50, 10);
        
        g.setColor(Color.BLACK);
        g.fillOval(x+11, 310, 5, 5);
        g.fillOval(x+31, 310, 5, 5);
        
        g.setColor(Color.BLUE);
        g.fillPolygon(v, w, 4);
        g.setColor(Color.BLACK);
        g.drawRect(x, 289, 52, 32);
        
        /*
        //movim der
        g.drawRect(500+60, 300, 50, 10);
        g.drawString("Movimiento a la derecha", 560, 250);
        int v []= {510+60,520+60,530+60,540+60};
        int w []= {300,290,290,300};
        g.drawPolygon(v, w, 4);
        g.drawOval(510+60, 310, 5, 5);
        g.drawOval(530+60, 310, 5, 5);
        
        g.setColor(Color.CYAN);
        g.fillRect(500+60, 300, 50, 10);
        
        g.setColor(Color.BLACK);
        g.fillOval(510+60, 310, 5, 5);
        g.fillOval(530+60, 310, 5, 5);
        
        g.setColor(Color.BLUE);
        g.fillPolygon(v, w, 4);
        g.setColor(Color.BLACK);
        g.drawRect(559, 289, 52, 32);
        
        //movim izq
        g.drawRect(500, 300, 50, 10);
        g.drawString("Movimiento a la izquierda", 350, 350);
        int j []= {510-60,520-60,530-60,540-60};
        int k []= {300,290,290,300};
        g.drawPolygon(j, k, 4);
        g.drawOval(510-60, 310, 5, 5);
        g.drawOval(530-60, 310, 5, 5);
        
        g.setColor(Color.CYAN);
        g.fillRect(500-60, 300, 50, 10);
        
        g.setColor(Color.BLACK);
        g.fillOval(510-60, 310, 5, 5);
        g.fillOval(530-60, 310, 5, 5);
        
        g.setColor(Color.BLUE);
        g.fillPolygon(j, k, 4);
        g.setColor(Color.BLACK);
        g.drawRect(439, 289, 52, 32);
        */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x+=1;
        y+=1;
        
        
        repaint();
    }
    
    
    /*private void initPanel() {
        setBackground(Color.WHITE);
        
        timer = new Timer(25,this);
        timer.start();
    }*/

    public NewPanel() {
        this.timer = new Timer(25,this);
        
        this.x = 499;
        this.y=289;
        
        timer.start();
        repaint();
        
        
    }
    
    
    
    
}
