/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author qa
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String firsName;
    
    
    
    
    
    public Student () {
        
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 0;
     }
    
   
    public Student (String firstName, String lastName, int yearOfBirth){
        
        this.firsName = firstName;
        this.lastName = lastName ;
        this.yearOfBirth = yearOfBirth;
    }
    
    
    public String getfirstName (){
        return this.firstName ;
       
    }

    public void setfirstName(String firstName) {       
        this.firsName = firstName;
    }
    
    public String getlastName (){
        return this.lastName ;
       
    }

    public void setlastName(String lasttName) {       
        this.lastName = lastName;
}
    public int getyearOfBirth (){
        return this.yearOfBirth ;
        
   }
   public void setyearOfBirth(int yearOfBirth) {       
        this.yearOfBirth = yearOfBirth;       
}

}


