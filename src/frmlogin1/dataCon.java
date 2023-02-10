/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frmlogin1;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author Hp
 */
public class dataCon {
    private static Connection con;

    /**
     *
     * @throws Exception
     */
    public static void connectiondb()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        setCon((Connection)DriverManager.getConnection("jdbc:mysql://localhost/frmlogin","root",""));
    }

    /**
     * @return the con
     */
    public static Connection getCon() {
        return con;
    }

    /**
     * @param aCon the con to set
     */
    public static void setCon(Connection aCon) {
        con = aCon;
    }
}
