/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

 class MyWindowsAdapter extends WindowAdapter
{
public void WindowsClosing(WindowEvent w)
{
    System.exit(0);
}
}
    

/**
 *
 * @author hp
 */
public class MyKeyboard extends Frame implements KeyListener
{
    String str="";
    public MyKeyboard(String str)
    {
        super(str);
        this.setSize(400, 400);
        //this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
    MyWindowsAdapter obj=new MyWindowsAdapter();
    this.addWindowListener(obj);
}
    public void paint(Graphics g){
        g.drawString("hello", 200, 200);
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    char ch=e.getKeyChar();
    str=str+ch;
    //repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int x=e.getKeyCode();
        if(x==KeyEvent.VK_BACK_SPACE)
        {
            System.out.println("mayank");
        }
        else{
            System.out.println("gurjar");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
class MyFirstKeyboard
{
    
    public static void main(String[] args) {
        MyKeyboard f=new MyKeyboard("hello");
    }
}

