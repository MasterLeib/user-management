/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongnt.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import phuongnt.db.MyConnection;

/**
 *
 * @author USER
 */
public class TestConnection {

    public static void main(String[] args) throws SQLException {
        String query = "Select id from Users";
        Connection conn = MyConnection.getMyConnection();
        PreparedStatement selectStm = conn.prepareStatement(query);
        ResultSet rs = selectStm.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("id"));
        }
    }
}
