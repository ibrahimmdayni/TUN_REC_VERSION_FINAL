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
public class Utilisateurs {
    private int ID_Utilisateur ;
    private int Cin_Utilisateur ;
    private String Nom_Utilisateur;
    private String Prenom_Utilisateur ;
    private DATE Date_Naissance_Utilisateur;
    private String Email_Utilisateur;
    private String Adress_Utilisateur;
    private int Tele_Utilisateur;
    private Image Photo_Utilisateur; 
    private String Login_Utilisateurs;
    private String Password_Utilisateurs;

    public String getLogin_Utilisateurs() {
        return Login_Utilisateurs;
    }

    public void setLogin_Utilisateurs(String Login_Utilisateurs) {
        this.Login_Utilisateurs = Login_Utilisateurs;
    }

    public String getPassword_Utilisateurs() {
        return Password_Utilisateurs;
    }

    public void setPassword_Utilisateurs(String Password_Utilisateurs) {
        this.Password_Utilisateurs = Password_Utilisateurs;
    }

    public Utilisateurs() {
    }

    public Utilisateurs(String Login_Utilisateurs, String Password_Utilisateurs,int ID_Utilisateur, int Cin_Utilisateur, String Nom_Utilisateur, String Prenom_Utilisateur, DATE Date_Naissance_Utilisateur, String Email_Utilisateur, String Adress_Utilisateur, int Tele_Utilisateur, Image Photo_Utilisateur) {
        this.ID_Utilisateur = ID_Utilisateur;
        this.Cin_Utilisateur = Cin_Utilisateur;
        this.Nom_Utilisateur = Nom_Utilisateur;
        this.Prenom_Utilisateur = Prenom_Utilisateur;
        this.Date_Naissance_Utilisateur = Date_Naissance_Utilisateur;
        this.Email_Utilisateur = Email_Utilisateur;
        this.Adress_Utilisateur = Adress_Utilisateur;
        this.Tele_Utilisateur = Tele_Utilisateur;
        this.Photo_Utilisateur = Photo_Utilisateur;
        this.Login_Utilisateurs = Login_Utilisateurs;
        this.Password_Utilisateurs = Password_Utilisateurs;
    }

    

    public int getID_Utilisateur() {
        return ID_Utilisateur;
    }

    public void setID_Utilisateur(int ID_Utilisateur) {
        this.ID_Utilisateur = ID_Utilisateur;
    }

    public int getCin_Utilisateur() {
        return Cin_Utilisateur;
    }

    public void setCin_Utilisateur(int Cin_Utilisateur) {
        this.Cin_Utilisateur = Cin_Utilisateur;
    }

    public String getNom_Utilisateur() {
        return Nom_Utilisateur;
    }

    public void setNom_Utilisateur(String Nom_Utilisateur) {
        this.Nom_Utilisateur = Nom_Utilisateur;
    }

    public String getPrenom_Utilisateur() {
        return Prenom_Utilisateur;
    }

    public void setPrenom_Utilisateur(String Prenom_Utilisateur) {
        this.Prenom_Utilisateur = Prenom_Utilisateur;
    }

    public DATE getDate_Naissance_Utilisateur() {
        return Date_Naissance_Utilisateur;
    }

    public void setDate_Naissance_Utilisateur(DATE Date_Naissance_Utilisateur) {
        this.Date_Naissance_Utilisateur = Date_Naissance_Utilisateur;
    }

    public String getEmail_Utilisateur() {
        return Email_Utilisateur;
    }

    public void setEmail_Utilisateur(String Email_Utilisateur) {
        this.Email_Utilisateur = Email_Utilisateur;
    }

    public String getAdress_Utilisateur() {
        return Adress_Utilisateur;
    }

    public void setAdress_Utilisateur(String Adress_Utilisateur) {
        this.Adress_Utilisateur = Adress_Utilisateur;
    }

    public int getTele_Utilisateur() {
        return Tele_Utilisateur;
    }

    public void setTele_Utilisateur(int Tele_Utilisateur) {
        this.Tele_Utilisateur = Tele_Utilisateur;
    }

    public Image getPhoto_Utilisateur() {
        return Photo_Utilisateur;
    }

    public void setPhoto_Utilisateur(Image Photo_Utilisateur) {
        this.Photo_Utilisateur = Photo_Utilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.ID_Utilisateur;
        hash = 29 * hash + this.Cin_Utilisateur;
        hash = 29 * hash + Objects.hashCode(this.Nom_Utilisateur);
        hash = 29 * hash + Objects.hashCode(this.Prenom_Utilisateur);
        hash = 29 * hash + Objects.hashCode(this.Date_Naissance_Utilisateur);
        hash = 29 * hash + Objects.hashCode(this.Email_Utilisateur);
        hash = 29 * hash + Objects.hashCode(this.Adress_Utilisateur);
        hash = 29 * hash + this.Tele_Utilisateur;
        hash = 29 * hash + Objects.hashCode(this.Photo_Utilisateur);
        hash = 29 * hash + Objects.hashCode(this.Login_Utilisateurs);
        hash = 29 * hash + Objects.hashCode(this.Password_Utilisateurs);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilisateurs other = (Utilisateurs) obj;
        if (this.ID_Utilisateur != other.ID_Utilisateur) {
            return false;
        }
        if (this.Cin_Utilisateur != other.Cin_Utilisateur) {
            return false;
        }
        if (!Objects.equals(this.Nom_Utilisateur, other.Nom_Utilisateur)) {
            return false;
        }
        if (!Objects.equals(this.Prenom_Utilisateur, other.Prenom_Utilisateur)) {
            return false;
        }
        if (!Objects.equals(this.Date_Naissance_Utilisateur, other.Date_Naissance_Utilisateur)) {
            return false;
        }
        if (!Objects.equals(this.Email_Utilisateur, other.Email_Utilisateur)) {
            return false;
        }
        if (!Objects.equals(this.Adress_Utilisateur, other.Adress_Utilisateur)) {
            return false;
        }
        if (this.Tele_Utilisateur != other.Tele_Utilisateur) {
            return false;
        }
        if (!Objects.equals(this.Photo_Utilisateur, other.Photo_Utilisateur)) {
            return false;
        }
        if (!Objects.equals(this.Login_Utilisateurs, other.Login_Utilisateurs)) {
            return false;
        }
        if (!Objects.equals(this.Password_Utilisateurs, other.Password_Utilisateurs)) {
            return false;
        }
        return true;
    }

   

    
    
    
}
