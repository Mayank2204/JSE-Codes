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
//import java.lang.Exception;
import java.util.InputMismatchException;
 import java.util.Scanner;
public class ExceptionDivide {
    public static void main(String[] args) {
        int a=0;int b=0;int c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter two no.");
        try{
            a=s.nextInt();
            b=s.nextInt();
            c=a/b;
            System.out.println("division = "+c);
        }
        catch(ArithmeticException e1){
            System.out.println("denominator should not be zero");
            System.out.println(e1.getMessage());
            System.out.println(e1);
            e1.printStackTrace();
        }
        catch(InputMismatchException e2){
            System.out.println("input int only");
            System.out.println(e2.getMessage());
            System.out.println(e2);
            e2.printStackTrace();
            System.exit(0);
        }
        int d=a+b;
        System.out.println("sum = "+d);
    }
}
