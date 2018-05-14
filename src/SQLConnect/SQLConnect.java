/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQLConnect;

import java.sql.*;

public class SQLConnect
{

    
    Connection conn = null;
    
    public static Connection ConnectorDb(){
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kusumasiri_art_printers","root","");
            return conn;
        }
        catch(Exception ex)
        {
            return null;
        }
    }
}
