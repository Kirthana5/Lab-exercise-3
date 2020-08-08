/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex3;

/**
 *
 * @author ELCOT
 */
public class counterfunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                                               //STATIC        NON-STATIC
        
        //1st object                          //i=10+10=20;   j=10+10=20;
        variable obj1=new variable();
        System.out.println("\nObject 1:");
        obj1.increment();
        
        //12nd object                         //i=20+10=30;   j=10+10=20;
        variable obj2=new variable();
        System.out.println("\nObject 2:");
        obj2.increment();

        
        //3rd object                          //i=30+10=40;   j=10+10=20;
        variable obj3=new variable();
        System.out.println("\nObject 3:");
        obj3.increment();

    }
    
}
class variable
{
    static int i=10;
    int j=10;
    void increment()
    {
        System.out.println("Static variable i after incrementing... "+(i+10));
        System.out.println("Non-static variable j after incrementing... "+(j+10));
    }
}