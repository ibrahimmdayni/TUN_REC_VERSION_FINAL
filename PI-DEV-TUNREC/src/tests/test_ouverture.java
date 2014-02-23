/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;
import Entities.*;
import java.io.IOException;
import java.sql.Types;


/**
 *
 * @author ibrahim
 */
public class test_ouverture {
   
    
  
    public static void main(String[] args) throws IOException {
        
        Dossier_Candidature m = new Dossier_Candidature();
        m.setDossier_candidature("6405062013.pdf");
        m.setID_Dossier_Candidature(1);
       Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " +"D:\\6405062013.pdf" );
        
    }
    
}
