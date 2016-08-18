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
public class ToStringPerson {
    private int age;
    private String name;
    public ToStringPerson(int a,String s){
        age=a;
        name=s;
    }
    @Override
    public String toString(){
        return age+","+name;
    }
}
class UseToStringPerson{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter age and name ");
        int a=s.nextInt();
        String b=s.next();
        ToStringPerson p=new ToStringPerson(a,b);
        System.out.println(p);
    }
}
