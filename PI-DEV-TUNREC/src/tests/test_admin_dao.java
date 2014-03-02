/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;

import Entities.Administrateur;
import Entities_DAO.Administrateur_DAO;
import java.io.FileNotFoundException;

/**
 *
 * @author ibrahim
 */
public class test_admin_dao {
  
    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
          Administrateur_DAO b = null ;
    Administrateur a= new Administrateur(b.Find_AdminByLogin_Password("brahim","brahim"));
   
    System.out.println(a.toString());
    }
}
