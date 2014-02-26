/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import UTIL.DATE;
import java.awt.Image;



/**
 *
 * @author ibrahim
 */
public class Candidat  extends Utilisateurs{
    
    private String Experience_Candidat;
    private String Description_Candidat;

    public Candidat() {
    }

    public Candidat( String Login_Utilisateurs, String Password_Utilisateurs, int ID_Utilisateur, int Cin_Utilisateur, String Nom_Utilisateur, String Prenom_Utilisateur, DATE Date_Naissance_Utilisateur, String Email_Utilisateur, String Adress_Utilisateur, int Tele_Utilisateur, Image Photo_Utilisateur,String Experience_Candidat, String Description_Candidat) {
        super(Login_Utilisateurs, Password_Utilisateurs, ID_Utilisateur, Cin_Utilisateur, Nom_Utilisateur, Prenom_Utilisateur, Date_Naissance_Utilisateur, Email_Utilisateur, Adress_Utilisateur, Tele_Utilisateur, Photo_Utilisateur);
        this.Experience_Candidat = Experience_Candidat;
        this.Description_Candidat = Description_Candidat;
    }

    

    public String getExperience_Candidat() {
        return Experience_Candidat;
    }

    public void setExperience_Candidat(String Experience_Candidat) {
        this.Experience_Candidat = Experience_Candidat;
    }

    public String getDescription_Candidat() {
        return Description_Candidat;
    }

    public void setDescription_Candidat(String Description_Candidat) {
        this.Description_Candidat = Description_Candidat;
    }

    
    

    
    
    
    
}
