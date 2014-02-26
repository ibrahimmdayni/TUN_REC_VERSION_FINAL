/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities_DAO;

import Entities.Administrateur;
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
       public boolean Find_Gerant_EntrepriseByLogin_Password(String Login , String Password){
            String requete = "select Login_Gerant_Entreprise,Password_Gerant_Entreprise from gerant_entreprise where Login_Gerant_Entreprise = ? and Password_Gerant_Entreprise = ?";
            try {
            PreparedStatement ps = DataBaseConnection.getInstance().prepareStatement(requete);
            ps.setString(1, Login);
            ps.setString(2, Password);
            ResultSet resultat = ps.executeQuery();
            if (resultat==null)
            {
             return false;
            }
            if(resultat!=null)
            {
                return true;
            }
            return false;

            } catch (SQLException ex)
            {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("vous n'éte pas inscrit "+ex.getMessage());
            return false;
            }
    }
    
}
