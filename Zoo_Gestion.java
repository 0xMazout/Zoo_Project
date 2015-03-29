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
public class Zoo_Gestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Espece Lion = new Espece("Lion", "ROOAAR");
        Espece Singe = new Espece("Singe", "KIKIKIKIKI");
        Espece Dauphin = new Espece("Dauphin", "FLIPPYYYFLIPPY");
        Espece Aligator = new Espece("Aligator", "CRRRR");
        
        
        String text = "Je suis un "+ Aligator.getNom()+" Mon cri est "+ Aligator.getCri(); 
        System.out.println(text);
        String text1 = "Je suis un "+ Lion.getNom()+" Mon cri est "+ Lion.getCri(); 
        System.out.println(text1);
        String text2 = "Je suis un "+ Dauphin.getNom()+" Mon cri est "+ Dauphin.getCri(); 
        System.out.println(text2);      
        String text3 = "Je suis un "+ Singe.getNom()+" Mon cri est "+ Singe.getCri(); 
        System.out.println(text3);
    }
    
}
