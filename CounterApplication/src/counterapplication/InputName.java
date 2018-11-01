/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counterapplication;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author One Click
 */
public class InputName extends Frame implements KeyListener {
 TextArea ta;
 TextField tf;
     InputName()
     {
     
     setLayout(new FlowLayout());
     add(new Label("Enter Text "));
         tf = new TextField(15);
         add(tf);
         ta = new TextArea(5, 40);
         add(ta);
    
        tf.addKeyListener(this);
        
         setTitle("Text Input GUI");
         setSize(400, 200);
         setVisible(true);
         
        
         
         
     }
        public void keyTyped(KeyEvent evt) {
      ta.append(" " + evt.getKeyChar() ); 
}

public void keyPressed(KeyEvent evt) { }
   public void keyReleased(KeyEvent evt) { }
     
     
}
