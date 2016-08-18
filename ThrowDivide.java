/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class ThrowDivide {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("enter 2 nos.");
            int a=s.nextInt();
            int b=s.nextInt();
            if(a<=0){
                ArithmeticException ar=new ArithmeticException("numerator should be positive");
                throw(ar);
            }
            int c=(b/a);                                          // ArithmeticException
            System.out.println("divide = "+c);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{                                         //***************using finally block******************//
            System.out.println("thanks for using");
        }
    }
}