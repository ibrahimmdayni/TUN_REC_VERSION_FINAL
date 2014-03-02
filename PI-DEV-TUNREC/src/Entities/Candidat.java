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
public class Candidat {
    private String Login_Candidat;
    private String Password_Candidat;
    private int Cin_Candidat ;
    private String Nom_Candidat;
    private String Prenom_Candidat ;
    private String Date_Naissance_Candidat;
    private String Email_Candidat;
    private String Adress_Candidat;
    private int Tele_Candidat;
    private Blob Photo_Candidat; 
    private String Experience_Candidat;
    private String Description_Candidat;

    public Candidat() {
    }

    public Candidat(String Login_Candidat, String Password_Candidat, int Cin_Candidat, String Nom_Candidat, String Prenom_Candidat, String Date_Naissance_Candidat, String Email_Candidat, String Adress_Candidat, int Tele_Candidat, Blob Photo_Candidat, String Experience_Candidat, String Description_Candidat) {
        this.Login_Candidat = Login_Candidat;
        this.Password_Candidat = Password_Candidat;
        this.Cin_Candidat = Cin_Candidat;
        this.Nom_Candidat = Nom_Candidat;
        this.Prenom_Candidat = Prenom_Candidat;
        this.Date_Naissance_Candidat = Date_Naissance_Candidat;
        this.Email_Candidat = Email_Candidat;
        this.Adress_Candidat = Adress_Candidat;
        this.Tele_Candidat = Tele_Candidat;
        this.Photo_Candidat = Photo_Candidat;
        this.Experience_Candidat = Experience_Candidat;
        this.Description_Candidat = Description_Candidat;
    }

    public String getLogin_Candidat() {
        return Login_Candidat;
    }

    public void setLogin_Candidat(String Login_Candidat) {
        this.Login_Candidat = Login_Candidat;
    }

    public String getPassword_Candidat() {
        return Password_Candidat;
    }

    public void setPassword_Candidat(String Password_Candidat) {
        this.Password_Candidat = Password_Candidat;
    }

    public int getCin_Candidat() {
        return Cin_Candidat;
    }

    public void setCin_Candidat(int Cin_Candidat) {
        this.Cin_Candidat = Cin_Candidat;
    }

    public String getNom_Candidat() {
        return Nom_Candidat;
    }

    public void setNom_Candidat(String Nom_Candidat) {
        this.Nom_Candidat = Nom_Candidat;
    }

    public String getPrenom_Candidat() {
        return Prenom_Candidat;
    }

    public void setPrenom_Candidat(String Prenom_Candidat) {
        this.Prenom_Candidat = Prenom_Candidat;
    }

    public String getDate_Naissance_Candidat() {
        return Date_Naissance_Candidat;
    }

    public void setDate_Naissance_Candidat(String Date_Naissance_Candidat) {
        this.Date_Naissance_Candidat = Date_Naissance_Candidat;
    }

    public String getEmail_Candidat() {
        return Email_Candidat;
    }

    public void setEmail_Candidat(String Email_Candidat) {
        this.Email_Candidat = Email_Candidat;
    }

    public String getAdress_Candidat() {
        return Adress_Candidat;
    }

    public void setAdress_Candidat(String Adress_Candidat) {
        this.Adress_Candidat = Adress_Candidat;
    }

    public int getTele_Candidat() {
        return Tele_Candidat;
    }

    public void setTele_Candidat(int Tele_Candidat) {
        this.Tele_Candidat = Tele_Candidat;
    }

    public Blob getPhoto_Candidat() {
        return Photo_Candidat;
    }

    public void setPhoto_Candidat(Blob Photo_Candidat) {
        this.Photo_Candidat = Photo_Candidat;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.Login_Candidat);
        hash = 53 * hash + Objects.hashCode(this.Password_Candidat);
        hash = 53 * hash + this.Cin_Candidat;
        hash = 53 * hash + Objects.hashCode(this.Nom_Candidat);
        hash = 53 * hash + Objects.hashCode(this.Prenom_Candidat);
        hash = 53 * hash + Objects.hashCode(this.Date_Naissance_Candidat);
        hash = 53 * hash + Objects.hashCode(this.Email_Candidat);
        hash = 53 * hash + Objects.hashCode(this.Adress_Candidat);
        hash = 53 * hash + this.Tele_Candidat;
        hash = 53 * hash + Objects.hashCode(this.Photo_Candidat);
        hash = 53 * hash + Objects.hashCode(this.Experience_Candidat);
        hash = 53 * hash + Objects.hashCode(this.Description_Candidat);
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
        final Candidat other = (Candidat) obj;
        if (!Objects.equals(this.Login_Candidat, other.Login_Candidat)) {
            return false;
        }
        if (!Objects.equals(this.Password_Candidat, other.Password_Candidat)) {
            return false;
        }
        if (this.Cin_Candidat != other.Cin_Candidat) {
            return false;
        }
        if (!Objects.equals(this.Nom_Candidat, other.Nom_Candidat)) {
            return false;
        }
        if (!Objects.equals(this.Prenom_Candidat, other.Prenom_Candidat)) {
            return false;
        }
        if (!Objects.equals(this.Date_Naissance_Candidat, other.Date_Naissance_Candidat)) {
            return false;
        }
        if (!Objects.equals(this.Email_Candidat, other.Email_Candidat)) {
            return false;
        }
        if (!Objects.equals(this.Adress_Candidat, other.Adress_Candidat)) {
            return false;
        }
        if (this.Tele_Candidat != other.Tele_Candidat) {
            return false;
        }
        if (!Objects.equals(this.Photo_Candidat, other.Photo_Candidat)) {
            return false;
        }
        if (!Objects.equals(this.Experience_Candidat, other.Experience_Candidat)) {
            return false;
        }
        if (!Objects.equals(this.Description_Candidat, other.Description_Candidat)) {
            return false;
        }
        return true;
    }
    

       
    
}
