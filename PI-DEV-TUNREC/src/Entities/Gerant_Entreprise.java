/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import UTIL.DATE;
import java.awt.Image;
import java.util.Objects;

/**
 *
 * @author ibrahim
 */
public class Gerant_Entreprise extends Utilisateurs{
    
    private String Nom_Entreprise;

    public Gerant_Entreprise() {
    }

    public Gerant_Entreprise( int ID_Utilisateur, int Cin_Utilisateur, String Nom_Utilisateur, String Prenom_Utilisateur, DATE Date_Naissance_Utilisateur, String Email_Utilisateur, String Adress_Utilisateur, int Tele_Utilisateur, Image Photo_Utilisateur,String Nom_Entreprise) {
        super(ID_Utilisateur, Cin_Utilisateur, Nom_Utilisateur, Prenom_Utilisateur, Date_Naissance_Utilisateur, Email_Utilisateur, Adress_Utilisateur, Tele_Utilisateur, Photo_Utilisateur);
        this.Nom_Entreprise = Nom_Entreprise;
    }

    public String getNom_Entreprise() {
        return Nom_Entreprise;
    }

    public void setNom_Entreprise(String Nom_Entreprise) {
        this.Nom_Entreprise = Nom_Entreprise;
    }
    

   
    
            
    
}
