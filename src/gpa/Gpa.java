/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

/**
 *
 * @author Ashwith Gundu
 */
public class Gpa {
    private String fN;
    private String lN;
    private int id;
    private char java,web,adv;

    /**
     *
     */
    public Gpa() {
       
    }

    /**
     *
     * @param fN
     * @param lN
     * @param id
     * @param java
     * @param web
     * @param adv
     */
    public Gpa(String fN, String lN, int id, char java, char web, char adv) {
        this.fN = fN;
        this.lN = lN;
        this.id = id;
        this.java = java;
        this.web = web;
        this.adv = adv;
    }

    /**
     *
     * @param point
     * @return
     */
    public double grade(char point)
    {       
        
        switch (point) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            case 'F':
                return 0.0;
            default:
                System.out.println("Not a Valid Grade");
                break;
        }
        return 0;
            
    }
       
    /**
     *
     * @param u
     * @param v
     * @param w
     * @return
     */
    public double caluclation(char u,char v,char w)
       {
           double x,y,z,t;
           x=grade(u);
               y=grade(v);
                   z=grade(w);
                   
                   t=((x+y+z)*3)/9;
                   return t;             
                   
       }
    
    
   
    
}
