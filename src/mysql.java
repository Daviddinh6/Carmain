/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 */
public class mysql {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://82.163.176.111:3306/learni12_carman?serverTimezone=UTC", "learni12_dd765045", "Tenapples");
            return conn; 
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
    }
}
