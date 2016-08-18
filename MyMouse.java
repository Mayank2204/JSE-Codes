/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author hp
 */
public class MyMouse extends Applet implements MouseListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        addMouseListener(this);
        // TODO start asynchronous download of heavy resources
    }
    // TODO overwrite start(), stop() and destroy() methods

    public void mouseEntered(MouseEvent e)
    {
        setBackground(Color.red);
        repaint();
    }
    public void mouseClicked(MouseEvent e){
        setBackground(Color.BLUE);
        repaint();
    }
    public void mouseExited(MouseEvent e){
        setBackground(Color.CYAN);
        repaint();
    }
    public void mousePressed(MouseEvent e){
        setBackground(Color.GREEN);
        repaint();
    }
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}