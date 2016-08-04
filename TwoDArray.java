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
public class TwoDArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter row and column size");
        int r=s.nextInt();
        int c=s.nextInt();
        int[][]arr;
        arr = new int[r][c];
        for(int i=0;i<r;i++)
        {
        for(int j=0;j<c;j++)
        {
            System.out.println("enter no.");
            arr[i][j]=s.nextInt();
        }  
        }
        int sum=0;
        for (int i=0;i<r;i++)
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.println(arr[i][j]+"\t");
                sum=sum+arr[i][j];
                
            }
           System.out.println("sum of row"+sum);
          
        }
        System.out.println("sum is "+sum);
        System.out.println("avg is"+(float)sum/(r*c));
    }
}

