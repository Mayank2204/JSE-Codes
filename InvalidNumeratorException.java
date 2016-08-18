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
public class InvalidNumeratorException extends Exception {
    public InvalidNumeratorException(String msg)
    {
        super(msg);                   //*********if non paramatrised constructor of InvalidNumeratorException is called************//
    }
}
class UseInvalidNumeratorException{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("enter no.");
            int a=s.nextInt();
            int b=s.nextInt();
            if(a<=0){
                InvalidNumeratorException i=new InvalidNumeratorException("Numerator should be positive");                        
                throw i;                           
            }
            int c=a/b;
            System.out.println("Div = "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator Should be positive");
        }
        catch(InvalidNumeratorException e1){
            System.out.println(e1.getMessage());              
        }
    }
}