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
    protected String nom ;
    protected String cri ;
          
    //Constructor of Espece
    public Espece(String SonNom ,String SonCri){
        this.nom = SonNom;
        this.cri = SonCri;
    }
    
    //Return nom of Espece
    public String getNom(){
        return this.nom ;
    }
    //Return cri of Espece
    public String getCri(){
        return this.cri ;
    }

}
