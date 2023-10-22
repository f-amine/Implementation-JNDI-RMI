package entities;

import java.io.Serializable;
/**
 *
 * @author Lachgar
 */

public class Salle implements Serializable{


    private int id;
    private String nom;
    


    public Salle() {
    }

    public Salle(String nom) {
        this.nom = nom;
     
  
    }

   

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    
    public String getNom() {
        return nom;
    }

    
    public void setNom (String nom) {
        this.nom = nom;
    }

    /**
     * @return the numero
     */
    
    



}
