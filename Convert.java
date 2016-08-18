/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author hp
 */
public class Convert {
    public static void main(String[] args) {        ////use of try and catch///&&&&&/////use of data input stream////
        try {
            int r = 0,ch;
            double d = 0;
            System.out.println("press 1 for rs to dollar");
            System.out.println("press 2 for dollar to rs");
            System.out.println("enter your choice");
            DataInputStream in=new DataInputStream(System.in);
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                
                
                case 1:
                    System.out.println("enter rupee");
                    //DataInputStream in=new DataInputStream(System.in);
                    try{
                        r=Integer.parseInt(in.readLine());
                    }
                    catch(IOException ex){
                        System.out.println("galat");
                    }
                    d=r/60.0;
                    System.out.println("dollar conversion is "+d);
                    break;
                    
                    
                case 2:
                    System.out.println("enter dollar");
                    {
                        try {
                            d=Integer.parseInt(in.readLine());
                        } catch (IOException ex) {
                            // Logger.getLogger(Convert.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println("galat");
                        }
                    }
                    r=(int) (d*60);
                    System.out.println("rupee conversion is "+r);
                    break;
                default:
                    System.out.println("choice is wrong");
                    break;
            }
        } catch (IOException ex) {
            //Logger.getLogger(Convert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("galat");
        }
           
        }
    }
    

        
        
                
  
    

