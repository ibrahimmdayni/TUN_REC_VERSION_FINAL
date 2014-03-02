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
public class Administrateur_DAO {
    
        public Administrateur Find_AdminByLogin_Password(String Login ,String Password) {
           Administrateur administrateur = new Administrateur(); 
           String requete = "SELECT * FROM administrateur WHERE Login_Administrateur='"+Login+"' AND Password_Administrateur='"+Password+"';";
            try {
            PreparedStatement ps = DataBaseConnection.getInstance().prepareStatement(requete);
//            ps.setString(1,Login );
//            ps.setString(2,Password );
            
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                administrateur.setLogin_Administrateur(resultat.getString("Login_Administrateur"));
                administrateur.setCin_Administrateur(resultat.getInt("Cin_Administrateur"));
                administrateur.setNom_Administrateur(resultat.getString("Nom_Administrateur"));
                administrateur.setPrenom_Administrateur(resultat.getString("Prenom_Administrateur"));
                administrateur.setEmail_Administrateur(resultat.getString("Email_Administrateur"));
                administrateur.setTele_Administrateur(resultat.getInt("Tele_Administrateur"));
                administrateur.setAdress_Administrateur(resultat.getString("Adress_Administrateur"));
                administrateur.setPassword_Administrateur(resultat.getString("Password_Administrateur"));
                administrateur.setDate_Naissance_Administrateur(resultat.getString("Date_Naissance_Administrateur"));
                administrateur.setPhoto_Administrateur(resultat.getBlob("Photo_Administrateur"));            
                
            }
            return administrateur;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du Administrateur "+ex.getMessage());
            return null;
        }
    }

    public Administrateur_DAO() {
    }
    
    
    
    

    /**
     *
     * @param admin un administrateur a inseret 
     */
   /* public void InsertAdministrateur(Administrateur admin){

        String requete = "insert into administrateur (Cin_Administrateur,Nom_Administrateur,Prenom_Administrateur,Date_Naissance_Administrateur,Email_Administrateur,Adress_Administrateur,Tele_Administrateur,Photo_Administrateur,Login_Administrateur,Password_Administrateur) values(?,?,?,?,?,?,?,?,?,?)";
//admin.getPhoto_Utilisateur()+","+admin.getLogin_Utilisateurs()+","+admin.getPassword_Utilisateurs()+");";
        try {
            PreparedStatement ps = DataBaseConnection.getInstance().prepareStatement(requete);
            ps.setString(1,Integer.toString(admin.getCin_Utilisateur()));
            ps.setString(2,admin.getNom_Utilisateur());
            ps.setString(3,admin.getPrenom_Utilisateur());
            ps.setString(4,admin.getDate_Naissance_Utilisateur());
            ps.setString(5,admin.getEmail_Utilisateur());
            ps.setString(6,admin.getAdress_Utilisateur());
            ps.setString(7,Integer.toString(admin.getTele_Utilisateur()));
            
            
            
            
            
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }*/ 
    
}
