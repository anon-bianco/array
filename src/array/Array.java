/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author hilbe
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int number[]=new int[5];
       int i=0;
       do
        {
        System.out.println("Please Enter the " + i + "value");
        number[i]=in.nextInt();
        //i=i+1;
        i++;
        }while(i<5);
       i=0;
      do 
        {
            System.out.println("The value in" + i + " st position is " + number[i]);
            i=i+1;
        }while(i<5);
    }
    
}
