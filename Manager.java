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
public class Manager extends EmpInherit {       //inheriting class EmpInherit//
    private double bonus;
    public void setBonus(double bonus){
        this.bonus=bonus;
    } 
    public double getIncome(){
        //double total=getSal()+bonus;
        return getSal()+bonus;
    }
}
class UseManager{
    public static void main(String[] args) {
        Manager m1=new Manager();
        m1.set("Mayank", 1200000);
        m1.setBonus(10000);
        System.out.println("manager name is "+m1.getName());
        System.out.println("manager income is "+m1.getIncome());
    }
}