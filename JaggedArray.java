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
public class JaggedArray {
    public static void main(String[] args) 
    {
        int[][]arr=new int[3][];
        System.out.println(arr.length);
        arr[0]=new int[5];
        System.out.println(arr[0].length);
        arr[1]=new int[2];
        System.out.println(arr[1].length);
        arr[2]=new int[3];
        System.out.println(arr[2].length);
        Scanner s=new Scanner(System.in);
        System.out.println("enter nos");
        for (int i = 0; i<arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
        {
         arr[i][j]=s.nextInt();
        }
        }
        for(int i=0;i<arr.length;i++)
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                System.out.println("\t"+arr[i][j]);
                
            }
            System.out.println("");
        }
    }
    
}
