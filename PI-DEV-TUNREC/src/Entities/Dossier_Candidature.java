/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import UTIL.DATE;
import java.awt.Image;
import java.io.File;
import java.sql.Blob;
import java.util.Date;



/**
 *
 * @author ibrahim
 */
public class Dossier_Candidature extends Candidat{
    private int ID_Dossier_Candidature;
    private File CV_Dossier_Candidature ;
    private File Lettre_motivation_Dossier_Candidature;
    private Date Date_Envoi_Dossier_Candidature;
    private int Accuse_Reception_Dossier_Candidature;
    private int Reponse_Societe_Dossier_Candidature;
    

    public Dossier_Candidature() {
    }

   
    

    public int getID_Dossier_Candidature() {
        return ID_Dossier_Candidature;
    }

    public void setID_Dossier_Candidature(int ID_Dossier_Candidature) {
        this.ID_Dossier_Candidature = ID_Dossier_Candidature;
    }

    public File getCV_Dossier_Candidature() {
        return CV_Dossier_Candidature;
    }

    public void setCV_Dossier_Candidature(File CV_Dossier_Candidature) {
        this.CV_Dossier_Candidature = CV_Dossier_Candidature;
    }

    public File getLettre_motivation_Dossier_Candidature() {
        return Lettre_motivation_Dossier_Candidature;
    }

    public void setLettre_motivation_Dossier_Candidature(File Lettre_motivation_Dossier_Candidature) {
        this.Lettre_motivation_Dossier_Candidature = Lettre_motivation_Dossier_Candidature;
    }

    public Date getDate_Envoi_Dossier_Candidature() {
        return Date_Envoi_Dossier_Candidature;
    }

    public void setDate_Envoi_Dossier_Candidature(Date Date_Envoi_Dossier_Candidature) {
        this.Date_Envoi_Dossier_Candidature = Date_Envoi_Dossier_Candidature;
    }

    public int getAccuse_Reception_Dossier_Candidature() {
        return Accuse_Reception_Dossier_Candidature;
    }

    public void setAccuse_Reception_Dossier_Candidature(int Accuse_Reception_Dossier_Candidature) {
        this.Accuse_Reception_Dossier_Candidature = Accuse_Reception_Dossier_Candidature;
    }

    public int getReponse_Societe_Dossier_Candidature() {
        return Reponse_Societe_Dossier_Candidature;
    }

    public void setReponse_Societe_Dossier_Candidature(int Reponse_Societe_Dossier_Candidature) {
        this.Reponse_Societe_Dossier_Candidature = Reponse_Societe_Dossier_Candidature;
    }
    

  
    
}
