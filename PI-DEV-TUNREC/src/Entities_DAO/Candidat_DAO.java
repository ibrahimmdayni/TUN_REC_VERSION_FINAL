/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities_DAO;

import Entities.Administrateur;
import Entities.Candidat;
import UTIL.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ibrahim
 */
public class Candidat_DAO {

    public Candidat_DAO() {
    }
             public Candidat Find_CandidatByLogin_Password(String Login ,String Password) {
           Candidat candidat = new Candidat(); 
           String requete = "SELECT * FROM `candidat` WHERE `Login_Candidat`='"+Login+"' AND `Password_Candidat`='"+Password+"';";
            try {
            PreparedStatement ps = DataBaseConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                candidat.setDate_Naissance_Candidat(resultat.getString("Date_Naissance_Candidat"));
                candidat.setCin_Candidat(resultat.getInt("CIN_candidat"));
                candidat.setNom_Candidat(resultat.getString("Nom_Candidat"));
                candidat.setPrenom_Candidat(resultat.getString("Prenom_Candidat"));
                candidat.setEmail_Candidat(resultat.getString("Email_Candida"));
                candidat.setTele_Candidat(resultat.getInt("Tele_Candidat"));
                candidat.setAdress_Candidat(resultat.getString("Adress_Candidat"));
                candidat.setPassword_Candidat(resultat.getString("Password_Candidat"));
                candidat.setLogin_Candidat(resultat.getString("Login_Candidat"));
                candidat.setPhoto_Candidat(resultat.getBlob("Photo_Candidat")); 
                candidat.setExperience_Candidat(resultat.getString("Experience_Candidat"));
                candidat.setDescription_Candidat(resultat.getString("Description_Candidat"));
                
            }
            return candidat;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du Administrateur "+ex.getMessage());
            return null;
        }
    }
    
}
