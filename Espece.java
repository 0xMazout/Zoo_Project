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
public class Espece {
    private String nom ;
    private String cri ;
          
    //Constructor of Espece
    public Espece(String sonNom, String sonCri){
        sonNom = nom;
        sonCri = cri;
    }
    
    //Return nom of Espece
    public String getNom(){
        return nom ;
    }
    //Return cri of Espece
    public String getCri(){
        return cri ;
    }

}
