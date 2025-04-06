package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samglish
 */
public class config {
        /**
* URL de connection
*/
private static String url = "jdbc:mysql://localhost/db_ahn";
/**
* Nom du user
*/
private static String user = "root";
/**
* Mot de passe du user
*/
private static String passwd = "";
/**
* Objet Connection
*/
private static Connection connect;
/**
* Méthode qui va retourner notre instance
* et la créer si elle n'existe pas...
* @return
*/
public static Connection getInstance(){
if(connect == null){
try {
connect = DriverManager.getConnection(url, user, passwd);
System.out.println("connection reussie");
} catch (SQLException e) {
JOptionPane.showMessageDialog(null, e.getMessage(), "ERREUR DE CONNEXION ! ", JOptionPane.ERROR_MESSAGE);
}
}
return connect;
}
    
    
}
 