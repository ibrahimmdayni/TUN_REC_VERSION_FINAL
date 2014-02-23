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
public class Administrateur {
    private int ID_Administrateur ;
    private int CIN_Administrateur;
    private String Nom_Administarteur;
    private String Prenom_Administrateur ;

    public Administrateur() {
    }

    public Administrateur(int ID_Administrateur, int CIN_Administrateur, String Nom_Administarteur, String Prenom_Administrateur) {
        this.ID_Administrateur = ID_Administrateur;
        this.CIN_Administrateur = CIN_Administrateur;
        this.Nom_Administarteur = Nom_Administarteur;
        this.Prenom_Administrateur = Prenom_Administrateur;
    }

    public int getID_Administrateur() {
        return ID_Administrateur;
    }

    public void setID_Administrateur(int ID_Administrateur) {
        this.ID_Administrateur = ID_Administrateur;
    }

    public int getCIN_Administrateur() {
        return CIN_Administrateur;
    }

    public void setCIN_Administrateur(int CIN_Administrateur) {
        this.CIN_Administrateur = CIN_Administrateur;
    }

    public String getNom_Administarteur() {
        return Nom_Administarteur;
    }

    public void setNom_Administarteur(String Nom_Administarteur) {
        this.Nom_Administarteur = Nom_Administarteur;
    }

    public String getPrenom_Administrateur() {
        return Prenom_Administrateur;
    }

    public void setPrenom_Administrateur(String Prenom_Administrateur) {
        this.Prenom_Administrateur = Prenom_Administrateur;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.ID_Administrateur;
        hash = 89 * hash + this.CIN_Administrateur;
        hash = 89 * hash + Objects.hashCode(this.Nom_Administarteur);
        hash = 89 * hash + Objects.hashCode(this.Prenom_Administrateur);
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
        if (this.ID_Administrateur != other.ID_Administrateur) {
            return false;
        }
        if (this.CIN_Administrateur != other.CIN_Administrateur) {
            return false;
        }
        if (!Objects.equals(this.Nom_Administarteur, other.Nom_Administarteur)) {
            return false;
        }
        if (!Objects.equals(this.Prenom_Administrateur, other.Prenom_Administrateur)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administrateur{" + "ID_Administrateur=" + ID_Administrateur + ", CIN_Administrateur=" + CIN_Administrateur + ", Nom_Administarteur=" + Nom_Administarteur + ", Prenom_Administrateur=" + Prenom_Administrateur + '}';
    }
    
}
