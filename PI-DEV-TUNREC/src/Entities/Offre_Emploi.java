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
public class Offre_Emploi {
    private int ID_Offre_Emploi ;
    private String Date_Publication_Offre_Emploi;
    private String Description_Offre_Emploi ;
    private String Date_Expiration_Offre ;
    private String Societe;
    private String Adresse_societe;
    private int Tele_Societe;
    private String Domain_Offre_Emploi ;
    private String Niveau_demander ;

    public Offre_Emploi() {
    }

    public Offre_Emploi(int ID_Offre_Emploi, String Date_Publication_Offre_Emploi, String Description_Offre_Emploi, String Date_Expiration_Offre, String Societe, String Adresse_societe, int Tele_Societe, String Domain_Offre_Emploi, String Niveau_demander) {
        this.ID_Offre_Emploi = ID_Offre_Emploi;
        this.Date_Publication_Offre_Emploi = Date_Publication_Offre_Emploi;
        this.Description_Offre_Emploi = Description_Offre_Emploi;
        this.Date_Expiration_Offre = Date_Expiration_Offre;
        this.Societe = Societe;
        this.Adresse_societe = Adresse_societe;
        this.Tele_Societe = Tele_Societe;
        this.Domain_Offre_Emploi = Domain_Offre_Emploi;
        this.Niveau_demander = Niveau_demander;
    }

    public int getID_Offre_Emploi() {
        return ID_Offre_Emploi;
    }

    public void setID_Offre_Emploi(int ID_Offre_Emploi) {
        this.ID_Offre_Emploi = ID_Offre_Emploi;
    }

    public String getDate_Publication_Offre_Emploi() {
        return Date_Publication_Offre_Emploi;
    }

    public void setDate_Publication_Offre_Emploi(String Date_Publication_Offre_Emploi) {
        this.Date_Publication_Offre_Emploi = Date_Publication_Offre_Emploi;
    }

    public String getDescription_Offre_Emploi() {
        return Description_Offre_Emploi;
    }

    public void setDescription_Offre_Emploi(String Description_Offre_Emploi) {
        this.Description_Offre_Emploi = Description_Offre_Emploi;
    }

    public String getDate_Expiration_Offre() {
        return Date_Expiration_Offre;
    }

    public void setDate_Expiration_Offre(String Date_Expiration_Offre) {
        this.Date_Expiration_Offre = Date_Expiration_Offre;
    }

    public String getSociete() {
        return Societe;
    }

    public void setSociete(String Societe) {
        this.Societe = Societe;
    }

    public String getAdresse_societe() {
        return Adresse_societe;
    }

    public void setAdresse_societe(String Adresse_societe) {
        this.Adresse_societe = Adresse_societe;
    }

    public int getTele_Societe() {
        return Tele_Societe;
    }

    public void setTele_Societe(int Tele_Societe) {
        this.Tele_Societe = Tele_Societe;
    }

    public String getDomain_Offre_Emploi() {
        return Domain_Offre_Emploi;
    }

    public void setDomain_Offre_Emploi(String Domain_Offre_Emploi) {
        this.Domain_Offre_Emploi = Domain_Offre_Emploi;
    }

    public String getNiveau_demander() {
        return Niveau_demander;
    }

    public void setNiveau_demander(String Niveau_demander) {
        this.Niveau_demander = Niveau_demander;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.ID_Offre_Emploi;
        hash = 89 * hash + Objects.hashCode(this.Date_Publication_Offre_Emploi);
        hash = 89 * hash + Objects.hashCode(this.Description_Offre_Emploi);
        hash = 89 * hash + Objects.hashCode(this.Date_Expiration_Offre);
        hash = 89 * hash + Objects.hashCode(this.Societe);
        hash = 89 * hash + Objects.hashCode(this.Adresse_societe);
        hash = 89 * hash + this.Tele_Societe;
        hash = 89 * hash + Objects.hashCode(this.Domain_Offre_Emploi);
        hash = 89 * hash + Objects.hashCode(this.Niveau_demander);
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
        final Offre_Emploi other = (Offre_Emploi) obj;
        if (this.ID_Offre_Emploi != other.ID_Offre_Emploi) {
            return false;
        }
        if (!Objects.equals(this.Date_Publication_Offre_Emploi, other.Date_Publication_Offre_Emploi)) {
            return false;
        }
        if (!Objects.equals(this.Description_Offre_Emploi, other.Description_Offre_Emploi)) {
            return false;
        }
        if (!Objects.equals(this.Date_Expiration_Offre, other.Date_Expiration_Offre)) {
            return false;
        }
        if (!Objects.equals(this.Societe, other.Societe)) {
            return false;
        }
        if (!Objects.equals(this.Adresse_societe, other.Adresse_societe)) {
            return false;
        }
        if (this.Tele_Societe != other.Tele_Societe) {
            return false;
        }
        if (!Objects.equals(this.Domain_Offre_Emploi, other.Domain_Offre_Emploi)) {
            return false;
        }
        if (!Objects.equals(this.Niveau_demander, other.Niveau_demander)) {
            return false;
        }
        return true;
    }      
}
