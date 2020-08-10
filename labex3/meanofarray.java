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
public class meanofarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        double a[]=new double[10];
        int n=val.nextInt();
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
           a[i]=val.nextDouble();
        }
        System.out.println("Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"  ");
        }
        arraymean.average(a,n);
       
    }
    
}
class arraymean
{    
    static void average(double b[],int n)
    {
        double sum=0;
        for(int i=n-1;i>=0;i--)
        {
          sum+=b[i];
        }
        double avg=sum/n;
        System.out.println("\nAverage of the array of given double values is: "+avg);
    }
}
