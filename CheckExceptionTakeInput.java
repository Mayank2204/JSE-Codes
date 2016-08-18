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
import java.io.*;
import java.sql.SQLException;
public class CheckExceptionTakeInput {
    public void accept() throws IOException,SQLException{
        System.out.println("enter a char");
        char ch=(char)System.in.read();
        System.out.println("you entered = "+ch);
    }
}
class UseCheckExceptionTakeInput{
    public static void main(String[] args) throws IOException,Exception {
        CheckExceptionTakeInput t=new CheckExceptionTakeInput();
        t.accept();
    }
}