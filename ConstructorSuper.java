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
public class ConstructorSuper {             //********constructor calling in inheritance*******/////
     private int a,b;                                    //*******using super*******////
     public ConstructorSuper(int a, int b){
         this.a =a;
         this.b=b;
     }
     public int getA(){
         return a;
     }
     public int getB(){
         return b;
     }
}




class AddConstructorSuper extends ConstructorSuper {
    private int c;
    public AddConstructorSuper(int a,int b) {
        super(a,b);
    }
    public void Add(){
        c=getA()+getB();
    }
    public void Show(){
        System.out.println("value of a is "+getA());
        System.out.println("value of b is "+getB());
        System.out.println("sum is "+c);
    }
}
    class UseAddConstructorSuper {
        public static void main(String[] args) {
            AddConstructorSuper a=new AddConstructorSuper(10,20);
            a.Add();
            a.Show();
        }
    }

