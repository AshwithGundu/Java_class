/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

import java.util.Scanner;

/**
 *
 * @author Ashwith Gundu
 */
public class GpaTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("enter the first name");
        String a=s.next();
        s.nextLine();
        System.out.println("enter the last name");
        String b=s.next();
        s.nextLine();
        System.out.println("enter the ID number");
        int c=s.nextInt();
        s.nextLine();
        System.out.println("enter the first course Grade");
        char d=s.next().charAt(0);
       
        s.nextLine();
        System.out.println("enter the second course Grade");
        char e=s.next().charAt(0);
        s.nextLine();
        System.out.println("enter the third course Grade");
        char f=s.next().charAt(0);
       Gpa g = new Gpa(a,b,c,d,e,f);
        
        double res = g.caluclation(d,e,f);
        System.out.println("GPA is "+res);
       
    }
    
}
