/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import java.sql.Blob;
import java.util.Objects;

/**
 *
 * @author ibrahim
 */
public class Administrateur {
    
    private int Cin_Administrateur ;
    private String Nom_Administrateur;
    private String Prenom_Administrateur ;
    private String Date_Naissance_Administrateur;
    private String Email_Administrateur;
    private String Adress_Administrateur;
    private int Tele_Administrateur;
    private Blob Photo_Administrateur; 
    private String Login_Administrateur;
    private String Password_Administrateur;

    public Administrateur() {
    }
    public Administrateur(Administrateur a){
        this.Cin_Administrateur= a.Cin_Administrateur;
        this.Adress_Administrateur=a.Adress_Administrateur;
        this.Date_Naissance_Administrateur=a.Date_Naissance_Administrateur;
        this.Email_Administrateur=a.Email_Administrateur;
        this.Nom_Administrateur=a.Nom_Administrateur;
        this.Login_Administrateur=a.Login_Administrateur;
        this.Password_Administrateur=a.Password_Administrateur;
        this.Prenom_Administrateur=a.Prenom_Administrateur;
        this.Tele_Administrateur=a.Tele_Administrateur;
        this.Photo_Administrateur=a.Photo_Administrateur;
        
    }

    public Administrateur(String Login_Administrateur, String Password_Administrateur,int Cin_Administrateur, String Nom_Administrateur, String Prenom_Administrateur, String Date_Naissance_Administrateur, String Email_Administrateur, String Adress_Administrateur, int Tele_Administrateur, Blob Photo_Administrateur) {
        this.Cin_Administrateur = Cin_Administrateur;
        this.Nom_Administrateur = Nom_Administrateur;
        this.Prenom_Administrateur = Prenom_Administrateur;
        this.Date_Naissance_Administrateur = Date_Naissance_Administrateur;
        this.Email_Administrateur = Email_Administrateur;
        this.Adress_Administrateur = Adress_Administrateur;
        this.Tele_Administrateur = Tele_Administrateur;
        this.Photo_Administrateur = Photo_Administrateur;
        this.Login_Administrateur = Login_Administrateur;
        this.Password_Administrateur = Password_Administrateur;
    }

    public int getCin_Administrateur() {
        return Cin_Administrateur;
    }

    public void setCin_Administrateur(int Cin_Administrateur) {
        this.Cin_Administrateur = Cin_Administrateur;
    }

    public String getNom_Administrateur() {
        return Nom_Administrateur;
    }

    public void setNom_Administrateur(String Nom_Administrateur) {
        this.Nom_Administrateur = Nom_Administrateur;
    }

    public String getPrenom_Administrateur() {
        return Prenom_Administrateur;
    }

    public void setPrenom_Administrateur(String Prenom_Administrateur) {
        this.Prenom_Administrateur = Prenom_Administrateur;
    }

    public String getDate_Naissance_Administrateur() {
        return Date_Naissance_Administrateur;
    }

    public void setDate_Naissance_Administrateur(String Date_Naissance_Administrateur) {
        this.Date_Naissance_Administrateur = Date_Naissance_Administrateur;
    }

    public String getEmail_Administrateur() {
        return Email_Administrateur;
    }

    public void setEmail_Administrateur(String Email_Administrateur) {
        this.Email_Administrateur = Email_Administrateur;
    }

    public String getAdress_Administrateur() {
        return Adress_Administrateur;
    }

    public void setAdress_Administrateur(String Adress_Administrateur) {
        this.Adress_Administrateur = Adress_Administrateur;
    }

    public int getTele_Administrateur() {
        return Tele_Administrateur;
    }

    public void setTele_Administrateur(int Tele_Administrateur) {
        this.Tele_Administrateur = Tele_Administrateur;
    }

    public Blob getPhoto_Administrateur() {
        return Photo_Administrateur;
    }

    public void setPhoto_Administrateur(Blob Photo_Administrateur) {
        this.Photo_Administrateur = Photo_Administrateur;
    }

    public String getLogin_Administrateur() {
        return Login_Administrateur;
    }

    public void setLogin_Administrateur(String Login_Administrateur) {
        this.Login_Administrateur = Login_Administrateur;
    }

    public String getPassword_Administrateur() {
        return Password_Administrateur;
    }

    public void setPassword_Administrateur(String Password_Administrateur) {
        this.Password_Administrateur = Password_Administrateur;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.Cin_Administrateur;
        hash = 29 * hash + Objects.hashCode(this.Nom_Administrateur);
        hash = 29 * hash + Objects.hashCode(this.Prenom_Administrateur);
        hash = 29 * hash + Objects.hashCode(this.Date_Naissance_Administrateur);
        hash = 29 * hash + Objects.hashCode(this.Email_Administrateur);
        hash = 29 * hash + Objects.hashCode(this.Adress_Administrateur);
        hash = 29 * hash + this.Tele_Administrateur;
        hash = 29 * hash + Objects.hashCode(this.Photo_Administrateur);
        hash = 29 * hash + Objects.hashCode(this.Login_Administrateur);
        hash = 29 * hash + Objects.hashCode(this.Password_Administrateur);
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
        final Administrateur other = (Administrateur) obj;
        if (this.Cin_Administrateur != other.Cin_Administrateur) {
            return false;
        }
        if (!Objects.equals(this.Nom_Administrateur, other.Nom_Administrateur)) {
            return false;
        }
        if (!Objects.equals(this.Prenom_Administrateur, other.Prenom_Administrateur)) {
            return false;
        }
        if (!Objects.equals(this.Date_Naissance_Administrateur, other.Date_Naissance_Administrateur)) {
            return false;
        }
        if (!Objects.equals(this.Email_Administrateur, other.Email_Administrateur)) {
            return false;
        }
        if (!Objects.equals(this.Adress_Administrateur, other.Adress_Administrateur)) {
            return false;
        }
        if (this.Tele_Administrateur != other.Tele_Administrateur) {
            return false;
        }
        if (!Objects.equals(this.Photo_Administrateur, other.Photo_Administrateur)) {
            return false;
        }
        if (!Objects.equals(this.Login_Administrateur, other.Login_Administrateur)) {
            return false;
        }
        if (!Objects.equals(this.Password_Administrateur, other.Password_Administrateur)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
