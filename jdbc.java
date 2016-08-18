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
import java.sql.*;
import java.math.*;
public class jdbc {
    
    public static void main(String[] args) {
        Connection myConn;
        ResultSet myRs;
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("driver loaded");
        myConn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE ","system","mayank");
            System.out.println("connection successful");
        Statement myStmt=myConn.createStatement();
        myRs=myStmt.executeQuery("select*from student");
        while(myRs.next()){
            System.out.println(myRs.getString("sname")+","+myRs.getString("sid")+","+myRs.getString("branch"));
        }
        }
    catch(Exception e){
        e.printStackTrace();
    }
        
    }
}
