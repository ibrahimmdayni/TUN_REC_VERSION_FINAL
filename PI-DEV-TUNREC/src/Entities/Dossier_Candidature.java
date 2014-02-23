/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import java.awt.Desktop;
import java.awt.PrintJob;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ibrahim
 */
public class Dossier_Candidature {
    private int ID_Dossier_Candidature;
    private File dossier_candidature ;

    public Dossier_Candidature() {
    }

    public Dossier_Candidature(int ID_Dossier_Candidature, File dossier_candidature) {
        this.ID_Dossier_Candidature = ID_Dossier_Candidature;
        this.dossier_candidature = dossier_candidature;
    }

    public void setDossier_candidature(String File_Path) {
        this.dossier_candidature = new File(File_Path);
    }

    public void setID_Dossier_Candidature(int ID_Dossier_Candidature) {
        this.ID_Dossier_Candidature = ID_Dossier_Candidature;
    }

    public int getID_Dossier_Candidature() {
        return ID_Dossier_Candidature;
    }
    

    public File getDossier_candidature() {
        return dossier_candidature;
    }
    
}
