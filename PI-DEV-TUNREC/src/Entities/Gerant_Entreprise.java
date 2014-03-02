/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import UTIL.DATE;
import java.sql.Blob;
import java.util.Objects;

/**
 *
 * @author ibrahim
 */
public class Gerant_Entreprise{
    private String Login_Gerant_Entreprise;
    private String Password_Gerant_Entreprise;
    private int Cin_Gerant_Entreprise ;
    private String Nom_Gerant_Entreprise;
    private String Prenom_Gerant_Entreprise ;
    private String Date_Naissance_Gerant_Entreprise;
    private String Email_Gerant_Entreprise;
    private String Adress_Gerant_Entreprise;
    private int Tele_Gerant_Entreprise;
    private Blob Photo_Gerant_Entreprise;
    private String Nom_Entreprise;

    public Gerant_Entreprise() {
    }

    public Gerant_Entreprise(String Login_Gerant_Entreprise, String Password_Gerant_Entreprise, int Cin_Gerant_Entreprise, String Nom_Gerant_Entreprise, String Prenom_Gerant_Entreprise, String Date_Naissance_Gerant_Entreprise, String Email_Gerant_Entreprise, String Adress_Gerant_Entreprise, int Tele_Gerant_Entreprise, Blob Photo_Gerant_Entreprise, String Nom_Entreprise) {
        this.Login_Gerant_Entreprise = Login_Gerant_Entreprise;
        this.Password_Gerant_Entreprise = Password_Gerant_Entreprise;
        this.Cin_Gerant_Entreprise = Cin_Gerant_Entreprise;
        this.Nom_Gerant_Entreprise = Nom_Gerant_Entreprise;
        this.Prenom_Gerant_Entreprise = Prenom_Gerant_Entreprise;
        this.Date_Naissance_Gerant_Entreprise = Date_Naissance_Gerant_Entreprise;
        this.Email_Gerant_Entreprise = Email_Gerant_Entreprise;
        this.Adress_Gerant_Entreprise = Adress_Gerant_Entreprise;
        this.Tele_Gerant_Entreprise = Tele_Gerant_Entreprise;
        this.Photo_Gerant_Entreprise = Photo_Gerant_Entreprise;
        this.Nom_Entreprise = Nom_Entreprise;
    }

    public String getLogin_Gerant_Entreprise() {
        return Login_Gerant_Entreprise;
    }

    public void setLogin_Gerant_Entreprise(String Login_Gerant_Entreprise) {
        this.Login_Gerant_Entreprise = Login_Gerant_Entreprise;
    }

    public String getPassword_Gerant_Entreprise() {
        return Password_Gerant_Entreprise;
    }

    public void setPassword_Gerant_Entreprise(String Password_Gerant_Entreprise) {
        this.Password_Gerant_Entreprise = Password_Gerant_Entreprise;
    }

    public int getCin_Gerant_Entreprise() {
        return Cin_Gerant_Entreprise;
    }

    public void setCin_Gerant_Entreprise(int Cin_Gerant_Entreprise) {
        this.Cin_Gerant_Entreprise = Cin_Gerant_Entreprise;
    }

    public String getNom_Gerant_Entreprise() {
        return Nom_Gerant_Entreprise;
    }

    public void setNom_Gerant_Entreprise(String Nom_Gerant_Entreprise) {
        this.Nom_Gerant_Entreprise = Nom_Gerant_Entreprise;
    }

    public String getPrenom_Gerant_Entreprise() {
        return Prenom_Gerant_Entreprise;
    }

    public void setPrenom_Gerant_Entreprise(String Prenom_Gerant_Entreprise) {
        this.Prenom_Gerant_Entreprise = Prenom_Gerant_Entreprise;
    }

    public String getDate_Naissance_Gerant_Entreprise() {
        return Date_Naissance_Gerant_Entreprise;
    }

    public void setDate_Naissance_Gerant_Entreprise(String Date_Naissance_Gerant_Entreprise) {
        this.Date_Naissance_Gerant_Entreprise = Date_Naissance_Gerant_Entreprise;
    }

    public String getEmail_Gerant_Entreprise() {
        return Email_Gerant_Entreprise;
    }

    public void setEmail_Gerant_Entreprise(String Email_Gerant_Entreprise) {
        this.Email_Gerant_Entreprise = Email_Gerant_Entreprise;
    }

    public String getAdress_Gerant_Entreprise() {
        return Adress_Gerant_Entreprise;
    }

    public void setAdress_Gerant_Entreprise(String Adress_Gerant_Entreprise) {
        this.Adress_Gerant_Entreprise = Adress_Gerant_Entreprise;
    }

    public int getTele_Gerant_Entreprise() {
        return Tele_Gerant_Entreprise;
    }

    public void setTele_Gerant_Entreprise(int Tele_Gerant_Entreprise) {
        this.Tele_Gerant_Entreprise = Tele_Gerant_Entreprise;
    }

    public Blob getPhoto_Gerant_Entreprise() {
        return Photo_Gerant_Entreprise;
    }

    public void setPhoto_Gerant_Entreprise(Blob Photo_Gerant_Entreprise) {
        this.Photo_Gerant_Entreprise = Photo_Gerant_Entreprise;
    }

    public String getNom_Entreprise() {
        return Nom_Entreprise;
    }

    public void setNom_Entreprise(String Nom_Entreprise) {
        this.Nom_Entreprise = Nom_Entreprise;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.Login_Gerant_Entreprise);
        hash = 71 * hash + Objects.hashCode(this.Password_Gerant_Entreprise);
        hash = 71 * hash + this.Cin_Gerant_Entreprise;
        hash = 71 * hash + Objects.hashCode(this.Nom_Gerant_Entreprise);
        hash = 71 * hash + Objects.hashCode(this.Prenom_Gerant_Entreprise);
        hash = 71 * hash + Objects.hashCode(this.Date_Naissance_Gerant_Entreprise);
        hash = 71 * hash + Objects.hashCode(this.Email_Gerant_Entreprise);
        hash = 71 * hash + Objects.hashCode(this.Adress_Gerant_Entreprise);
        hash = 71 * hash + this.Tele_Gerant_Entreprise;
        hash = 71 * hash + Objects.hashCode(this.Photo_Gerant_Entreprise);
        hash = 71 * hash + Objects.hashCode(this.Nom_Entreprise);
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
        final Gerant_Entreprise other = (Gerant_Entreprise) obj;
        if (!Objects.equals(this.Login_Gerant_Entreprise, other.Login_Gerant_Entreprise)) {
            return false;
        }
        if (!Objects.equals(this.Password_Gerant_Entreprise, other.Password_Gerant_Entreprise)) {
            return false;
        }
        if (this.Cin_Gerant_Entreprise != other.Cin_Gerant_Entreprise) {
            return false;
        }
        if (!Objects.equals(this.Nom_Gerant_Entreprise, other.Nom_Gerant_Entreprise)) {
            return false;
        }
        if (!Objects.equals(this.Prenom_Gerant_Entreprise, other.Prenom_Gerant_Entreprise)) {
            return false;
        }
        if (!Objects.equals(this.Date_Naissance_Gerant_Entreprise, other.Date_Naissance_Gerant_Entreprise)) {
            return false;
        }
        if (!Objects.equals(this.Email_Gerant_Entreprise, other.Email_Gerant_Entreprise)) {
            return false;
        }
        if (!Objects.equals(this.Adress_Gerant_Entreprise, other.Adress_Gerant_Entreprise)) {
            return false;
        }
        if (this.Tele_Gerant_Entreprise != other.Tele_Gerant_Entreprise) {
            return false;
        }
        if (!Objects.equals(this.Photo_Gerant_Entreprise, other.Photo_Gerant_Entreprise)) {
            return false;
        }
        if (!Objects.equals(this.Nom_Entreprise, other.Nom_Entreprise)) {
            return false;
        }
        return true;
    }
    

  

   
    
            
    
}
