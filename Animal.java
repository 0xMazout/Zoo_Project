/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo_project;

/**
 *
 * @author LFA
 */
public class Animal {
  
    protected String prenom ;
    protected int age ;
    protected boolean status;
    protected Espece especeAssocie;
    
    Animal (Espece SonEspece, int age , String prenom){

        this.age = age;
        this.prenom = prenom;
        this.status = true ;
        this.especeAssocie = SonEspece ;
    }
    
    public int getAge(){
        return this.age ; 
    }
    
    public String getPrenom(){
        return this.prenom ;
    }
    
    public boolean getStatus(){
        if(status == true){
            System.out.println("L'animal "+this.prenom+" est vivant" );
        }
        else{
            System.out.println("L'animal "+this.prenom+" est mort .. RIP :) " );
        }
        return this.status;
    }
    public Espece getEspece(){
        return this.especeAssocie;
    }
    
}
