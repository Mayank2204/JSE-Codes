/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author hp
 */
public class DrawFigure extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
  
        // TODO start asynchronous download of heavy resource
    public void paint(Graphics g){
        g.drawString("WEL_COME", 100, 10);
        g.drawRect(10,10,50,100);
        g.setColor(Color.red);
        g.fillRect(10,10,50,100);
        g.setColor(Color.black);
        g.drawLine(10,140,70,140 );
        
        g.drawOval(100,30 , 50, 50);
        g.setColor(Color.blue);
        g.fillOval(100, 30, 50, 50);
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
