/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import java.util.Objects;

/**
 *
 * @author ibrahim
 */
public class Gerant_Entreprise {
    private int ID_Gerant_Entreprise;
    private String Nom_Gerant_Entreprise ;
    private String Prenom_Gerant_Entreprise;
    private String Email_gerant_Entreprise;
    private String Nom_Entreprise;
    private int Tele_Gerant_Entreprise;

    public Gerant_Entreprise() {
    }

    public Gerant_Entreprise(int ID_Gerant_Entreprise, String Nom_Gerant_Entreprise, String Prenom_Gerant_Entreprise, String Email_gerant_Entreprise, String Nom_Entreprise, int Tele_Gerant_Entreprise) {
        this.ID_Gerant_Entreprise = ID_Gerant_Entreprise;
        this.Nom_Gerant_Entreprise = Nom_Gerant_Entreprise;
        this.Prenom_Gerant_Entreprise = Prenom_Gerant_Entreprise;
        this.Email_gerant_Entreprise = Email_gerant_Entreprise;
        this.Nom_Entreprise = Nom_Entreprise;
        this.Tele_Gerant_Entreprise = Tele_Gerant_Entreprise;
    }

    public int getID_Gerant_Entreprise() {
        return ID_Gerant_Entreprise;
    }

    public void setID_Gerant_Entreprise(int ID_Gerant_Entreprise) {
        this.ID_Gerant_Entreprise = ID_Gerant_Entreprise;
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

    public String getEmail_gerant_Entreprise() {
        return Email_gerant_Entreprise;
    }

    public void setEmail_gerant_Entreprise(String Email_gerant_Entreprise) {
        this.Email_gerant_Entreprise = Email_gerant_Entreprise;
    }

    public String getNom_Entreprise() {
        return Nom_Entreprise;
    }

    public void setNom_Entreprise(String Nom_Entreprise) {
        this.Nom_Entreprise = Nom_Entreprise;
    }

    public int getTele_Gerant_Entreprise() {
        return Tele_Gerant_Entreprise;
    }

    public void setTele_Gerant_Entreprise(int Tele_Gerant_Entreprise) {
        this.Tele_Gerant_Entreprise = Tele_Gerant_Entreprise;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.ID_Gerant_Entreprise;
        hash = 37 * hash + Objects.hashCode(this.Nom_Gerant_Entreprise);
        hash = 37 * hash + Objects.hashCode(this.Prenom_Gerant_Entreprise);
        hash = 37 * hash + Objects.hashCode(this.Email_gerant_Entreprise);
        hash = 37 * hash + Objects.hashCode(this.Nom_Entreprise);
        hash = 37 * hash + this.Tele_Gerant_Entreprise;
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
        if (this.ID_Gerant_Entreprise != other.ID_Gerant_Entreprise) {
            return false;
        }
        if (!Objects.equals(this.Nom_Gerant_Entreprise, other.Nom_Gerant_Entreprise)) {
            return false;
        }
        if (!Objects.equals(this.Prenom_Gerant_Entreprise, other.Prenom_Gerant_Entreprise)) {
            return false;
        }
        if (!Objects.equals(this.Email_gerant_Entreprise, other.Email_gerant_Entreprise)) {
            return false;
        }
        if (!Objects.equals(this.Nom_Entreprise, other.Nom_Entreprise)) {
            return false;
        }
        if (this.Tele_Gerant_Entreprise != other.Tele_Gerant_Entreprise) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gerant_Entreprise{" + "ID_Gerant_Entreprise=" + ID_Gerant_Entreprise + ", Nom_Gerant_Entreprise=" + Nom_Gerant_Entreprise + ", Prenom_Gerant_Entreprise=" + Prenom_Gerant_Entreprise + ", Email_gerant_Entreprise=" + Email_gerant_Entreprise + ", Nom_Entreprise=" + Nom_Entreprise + ", Tele_Gerant_Entreprise=" + Tele_Gerant_Entreprise + '}';
    }
    
            
    
}
