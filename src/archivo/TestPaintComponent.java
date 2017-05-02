/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TestPaintComponent extends JFrame {

    public TestPaintComponent() {
        //Timer t= new Timer(25, (ActionListener) this);
        add(new NewPanel(/*t*/));
    }

    
    public static void main(String[] args) {
    TestPaintComponent frame = new TestPaintComponent();
    frame.setTitle("Test Paint");
    frame.setSize(800, 400);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    }
    
}
