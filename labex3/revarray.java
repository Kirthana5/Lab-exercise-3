/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex3;

import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class revarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter the size of an array:");
        int n=val.nextInt();
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
           a[i]=val.nextInt();
        }
        System.out.println("Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(""+a[i]+" ");
        }
        array.reverse1(a,n);
        
            
    }
    
}
class array
{
     
     static void reverse1(int b[],int n)
    {
        System.out.println("\nReversed array:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(""+b[i]+" ");
        }
        
    }
}