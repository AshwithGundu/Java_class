/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;

/**
 *
 * @author Ashwith Gundu
 */
public class Store {
        private String storeName;	
        private  int storeID;
        private  String phoneNumber;
	private String street;
	private String city;
	private String state;
	private int zipCode;
        
    /**
     *
     * @param storeName
     * @param storeID
     * @param phoneNumber
     * @param street
     * @param city
     * @param state
     * @param zipCode
     */
    public Store(String storeName, int storeID, String phoneNumber, 
                String street, String city, String state, int zipCode)
        {
            this.storeName=storeName;
            this.storeID=storeID;
            this.phoneNumber=phoneNumber;
            this.street=street;
            this.city=city;
            this.state=state;
            this.zipCode=zipCode;
           
        }

    /**
     *
     */
    public Store(){
             
         }

    /**
     *
     * @param storeName
     */
    public void setStoreName(String storeName)    
        {
            this.storeName=storeName;
        }
        
    /**
     *
     * @param storeID
     */
    public void setStoreID(int storeID)
        {
            this.storeID=storeID;
        }
        
    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
        {
            this.phoneNumber=phoneNumber;
        }
        
    /**
     *
     * @param street
     */
    public void setStreet(String street)
                 
         {
              this.street=street;
         }
         
    /**
     *
     * @param city
     */
    public void setCity(String city)
         {
             this.city=city;
         }
         
    /**
     *
     * @param state
     */
    public void setState(String state)
         {
             this.state=state;
         } 

    /**
     *
     * @param zipCode
     */
    public void setZipCode(int zipCode)
          {
              this.zipCode=zipCode;
          }

    /**
     *
     * @return
     */
    public String getStoreName()
          {
              return storeName;
          }

    /**
     *
     * @return
     */
    public int getStoreId()
          {
              return storeID;
          }

    /**
     *
     * @return
     */
    public String getPhoneNumber()
         {
             return phoneNumber;
         }  

    /**
     *
     * @return
     */
    public String getStreet()
         {
             return street;
         }

    /**
     *
     * @return
     */
    public String getCity()
         {
             return city;
         }

    /**
     *
     * @return
     */
    public String getState()
         {
             return state;
         }

    /**
     *
     * @return
     */
    public int getZipCode()
         {
             return zipCode;
         }
         
    /**
     *
     * @return
     */
    public String getFormattedAddress() 
         {
             return (getStreet()+"\n"+getCity()+","+getState()+"-"+getZipCode());
         }
         
    /**
     *
     * @return
     */
    public String getFormattedPhoneNumber() 
         {
             return ("("+getPhoneNumber().substring(0,3)+")"+  getPhoneNumber().substring(3,6)+"-"+getPhoneNumber().substring(6,10));
                   
                     
         }
         
    /**
     *
     * @param oldName
     * @param newName
     */
    public void  replaceStoreName(String oldName, String newName)
         {
             storeName=getStoreName().replaceAll(oldName, newName);
         }
         
    /**
     *
     * @return
     */
    public String getFirstWordOfStoreName()
         {
              return storeName.substring(0,storeName.indexOf(" "));
         }
         
    /**
     *
     * @return
     */
    public String getMiddleWordOfStoreName()
         {
             return storeName.substring(storeName.indexOf(" "),
                     storeName.lastIndexOf(" "));
                     
                     
         }
         
    /**
     *
     * @return
     */
    public String getLastWordOfStoreName()
         {
             return storeName.substring(storeName.lastIndexOf(" "),
                     storeName.length());
         }
         
        @Override
         public String toString() {
             return (getStoreName()+" ("+getStoreId()+")\n"+getFormattedAddress()+"\n"+getFormattedPhoneNumber());
         }


         
        
}
