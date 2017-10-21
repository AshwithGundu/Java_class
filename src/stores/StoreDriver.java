/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Ashwith Gundu
 */
public class StoreDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("**********************Testing the Store Class****"
                + "******************");
       
        
        Store store1;
        store1= new Store("Timmy Tommy Enterprises", 1000,  "31278"
                + "69900", "311 Jarvis Square","Chicago", "Illinois", 60018 ); 
         System.out.println("*********************************************"
                + "*********");
        System.out.println("Testing the Getter methods or Accessors of "
                + "Store Class");
        System.out.println("*********************************************"
                + "*********");
        System.out.println("Store Name: "+store1.getStoreName());
        System.out.println("Store ID: "+store1.getStoreId());
        System.out.println("Street of the Store: "+store1.getPhoneNumber());
        System.out.println("City of the Store : "+store1.getStreet());
        System.out.println("State of the Store: "+store1.getCity());
        System.out.println("Zip code of the Store: "+store1.getState());
        System.out.println("Phone number of the Store: "+store1.getZipCode());
     
        System.out.println("*****************************************\n" +
"Testing the toString method\n" +
"*****************************************");
        System.out.println(store1.toString());
        
        System.out.println("*****************************************\n" +
"Testing the user defined methods\n" +
"*****************************************\n");
        System.out.println("First word of store name: "+
                store1.getFirstWordOfStoreName());
        System.out.println("Middle word of the store name: "+
                store1.getMiddleWordOfStoreName() );
        System.out.println("Last word of the store name: "+
                store1.getLastWordOfStoreName()+"\n");
        
        System.out.println("Printing the store1 object after invoking the replace method\n");

        store1.replaceStoreName("Timmy Tommy Enterprises", "JC Penny Store");
               
               System.out.println(store1.toString());
               Store store2=new Store();
         System.out.println("*************************************************"
                 + "********************\n" +
"Testing the Getter methods or Accessors of Store Class with no-arg constructor\n" +
"*********************************************************************");   
         System.out.println("Store Name: "+store2.getStoreName());
        System.out.println("Store ID: "+store2.getStoreId());
        System.out.println("Street of the Store: "+store2.getPhoneNumber());
        System.out.println("City of the Store : "+store2.getStreet());
        System.out.println("State of the Store: "+store2.getCity());
        System.out.println("Zip code of the Store: "+store2.getState());
        System.out.println("Phone number of the Store: "+store2.getZipCode());
        
        System.out.println("**************************************************"
                + "*******************\n" +
"Testing the store class using toString after invoking the Setter methods or "
                + "Mutators\n" +
"*********************************************************************");
        store2.setStoreName("KC India Mart");
        store2.setStoreID(1001);
        
        store2.setPhoneNumber("9136818080");
        store2.setStreet("8542 w 133rd Street");
        store2.setCity("Overland Park");
        store2.setState("Kansas");
        store2.setZipCode(66213);
        
                
         System.out.println(store2.toString());   
        
        System.out.println("**************************************"
                + "******************\n" +
"Testing the scanner class to take input from the console\n" +
"********************************************************");   
   
    Scanner scannerobject = new Scanner(System.in);
        System.out.println("Enter the store details");
        System.out.println("Enter the store name:");
          String a= scannerobject.next();
          scannerobject.nextLine();
        System.out.println("Enter the store ID:");
       int b= scannerobject.nextInt();
          scannerobject.nextLine();
       
        System.out.println("Enter the store phone number:");
           String c= scannerobject.next();
              scannerobject.nextLine();
        System.out.println("Enter the street name of the store:");
                String d=scannerobject.next();
                 scannerobject.nextLine();
        System.out.println("Enter the city name, state name, zip code of "
                + "the store in one line without any commas:");
       String e= scannerobject.nextLine();
      
       String s1= e.substring(0,e.indexOf(" "));
       String s2= e.substring((e.indexOf(" ")+1),e.lastIndexOf(" "));
       String s3= e.substring(e.lastIndexOf(" ")).trim();
       
       int gg = Integer.parseInt(s3);
        
        System.out.println("****************************************"
                + "************\n" +
"Testing the toString method without invoking the method\n" +
"****************************************************");
        Store store3 = new Store(a,b,c,d,s1,s2,gg);
       
        System.out.println(store3);
              
        
    }
    
}
