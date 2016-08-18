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
public class EmpInherit {        //superclass made for inhritence //
    private double sal;             //combination of "EmpInherit" and "Manager" class//
    private String name;
    public void set(String name,double sal){
        this.sal=sal;
        this.name=name;
    }
    public double getSal(){
        return sal;
    }
    public String getName(){
        return name;
    }
}
