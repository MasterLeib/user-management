/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import phuongnt.db.MyConnection;

/**
 *
 * @author USER
 */
public class TestMyConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       String sql ="Select * From Users";
       Connection conn = null;
       conn = MyConnection.getMyConnection();
       PreparedStatement preStm = conn.prepareStatement(sql);
       ResultSet rs = preStm.executeQuery();
       while(rs.next()){
           System.out.println(rs.getString("id"));
       }
                
    }
    
}
