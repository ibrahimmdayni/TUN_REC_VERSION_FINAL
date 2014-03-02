/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities_DAO;

import Entities.Gerant_Entreprise;
import UTIL.DataBaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ibrahim
 */
public class Gerant_Entreprise_DAO {

    public Gerant_Entreprise_DAO() {
    }
    
       public Gerant_Entreprise Find_Gerant_EntrepriseByLogin_Password(String Login , String Password){
            Gerant_Entreprise gerant = new Gerant_Entreprise(); 
           String requete = "SELECT * FROM `gerant_entreprise` WHERE `Login_Gerant_Entreprise`='"+Login+"' AND `Password_Gerant_Entreprise`='"+Password+"';";
            try {
            PreparedStatement ps = DataBaseConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                gerant.setDate_Naissance_Gerant_Entreprise(resultat.getString("Date_Naissance_Gerant_Entreprise"));
                gerant.setCin_Gerant_Entreprise(resultat.getInt("Cin_Gerant_Entreprise"));
                gerant.setNom_Gerant_Entreprise(resultat.getString("Nom_Gerant_Entreprise"));
                gerant.setPrenom_Gerant_Entreprise(resultat.getString("Prenom_Gerant_Entreprise"));
                gerant.setEmail_Gerant_Entreprise(resultat.getString("Email_gerant_Entreprise"));
                gerant.setTele_Gerant_Entreprise(resultat.getInt("Tele_Gerant_Entreprise"));
                gerant.setAdress_Gerant_Entreprise(resultat.getString("Adress_Gerant_Entreprise"));
                gerant.setPassword_Gerant_Entreprise(resultat.getString("Password_Gerant_Entreprise"));
                gerant.setLogin_Gerant_Entreprise(resultat.getString("Login_Gerant_Entreprise"));
                gerant.setPhoto_Gerant_Entreprise(resultat.getBlob("Photo_Gerant_Entreprise")); 
                gerant.setNom_Entreprise(resultat.getString("Nom_Entreprise"));                
            }
            return gerant;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du Administrateur "+ex.getMessage());
            return null;
        }
    }
    
}
