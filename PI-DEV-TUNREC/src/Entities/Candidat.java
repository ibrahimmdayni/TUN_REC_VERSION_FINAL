/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import UTIL.DATE;
import java.util.Objects;

/**
 *
 * @author ibrahim
 */
public class Candidat {
    private int ID_Candidat ;
    private DATE Date_Naissance_Candidat;
    private String Nom_Candidat;
    private String Prenom_Candidat;
    private int CIN_candidat;
    private String Adress_Mail_Candidat;
    private int Tele_Candidat ;
    private String Experience_Candidat;
    private String Description_Candidat;

    public Candidat() {
    }

    public Candidat(int ID_Candidat, DATE Date_Naissance_Candidat, String Nom_Candidat, String Prenom_Candidat, int CIN_candidat, String Adress_Mail_Candidat, int Tele_Candidat, String Experience_Candidat, String Description_Candidat) {
        this.ID_Candidat = ID_Candidat;
        this.Date_Naissance_Candidat = Date_Naissance_Candidat;
        this.Nom_Candidat = Nom_Candidat;
        this.Prenom_Candidat = Prenom_Candidat;
        this.CIN_candidat = CIN_candidat;
        this.Adress_Mail_Candidat = Adress_Mail_Candidat;
        this.Tele_Candidat = Tele_Candidat;
        this.Experience_Candidat = Experience_Candidat;
        this.Description_Candidat = Description_Candidat;
    }

    public int getID_Candidat() {
        return ID_Candidat;
    }

    public void setID_Candidat(int ID_Candidat) {
        this.ID_Candidat = ID_Candidat;
    }

    public DATE getDate_Naissance_Candidat() {
        return Date_Naissance_Candidat;
    }

    public void setDate_Naissance_Candidat(DATE Date_Naissance_Candidat) {
        this.Date_Naissance_Candidat = Date_Naissance_Candidat;
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

    public int getCIN_candidat() {
        return CIN_candidat;
    }

    public void setCIN_candidat(int CIN_candidat) {
        this.CIN_candidat = CIN_candidat;
    }

    public String getAdress_Mail_Candidat() {
        return Adress_Mail_Candidat;
    }

    public void setAdress_Mail_Candidat(String Adress_Mail_Candidat) {
        this.Adress_Mail_Candidat = Adress_Mail_Candidat;
    }

    public int getTele_Candidat() {
        return Tele_Candidat;
    }

    public void setTele_Candidat(int Tele_Candidat) {
        this.Tele_Candidat = Tele_Candidat;
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
        int hash = 7;
        hash = 53 * hash + this.ID_Candidat;
        hash = 53 * hash + Objects.hashCode(this.Date_Naissance_Candidat);
        hash = 53 * hash + Objects.hashCode(this.Nom_Candidat);
        hash = 53 * hash + Objects.hashCode(this.Prenom_Candidat);
        hash = 53 * hash + this.CIN_candidat;
        hash = 53 * hash + Objects.hashCode(this.Adress_Mail_Candidat);
        hash = 53 * hash + this.Tele_Candidat;
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
        if (this.ID_Candidat != other.ID_Candidat) {
            return false;
        }
        if (!Objects.equals(this.Date_Naissance_Candidat, other.Date_Naissance_Candidat)) {
            return false;
        }
        if (!Objects.equals(this.Nom_Candidat, other.Nom_Candidat)) {
            return false;
        }
        if (!Objects.equals(this.Prenom_Candidat, other.Prenom_Candidat)) {
            return false;
        }
        if (this.CIN_candidat != other.CIN_candidat) {
            return false;
        }
        if (!Objects.equals(this.Adress_Mail_Candidat, other.Adress_Mail_Candidat)) {
            return false;
        }
        if (this.Tele_Candidat != other.Tele_Candidat) {
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

    @Override
    public String toString() {
        return "Candidat{" + "ID_Candidat=" + ID_Candidat + ", Date_Naissance_Candidat=" + Date_Naissance_Candidat + ", Nom_Candidat=" + Nom_Candidat + ", Prenom_Candidat=" + Prenom_Candidat + ", CIN_candidat=" + CIN_candidat + ", Adress_Mail_Candidat=" + Adress_Mail_Candidat + ", Tele_Candidat=" + Tele_Candidat + ", Experience_Candidat=" + Experience_Candidat + ", Description_Candidat=" + Description_Candidat + '}';
    }
    
    
    
}
