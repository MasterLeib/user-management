/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongnt.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import phuongnt.db.MyConnection;

/**
 *
 * @author USER
 */
public class UsersDAO {

    public boolean checkLogin(String username, String password) throws ClassNotFoundException, SQLException {
        boolean isValid = false;
        if (username == null || password == null) {
        }
        String selectQuery = "Select username from Users Where username = ? and password = ?";
        try (Connection conn = MyConnection.getMyConnection();
                PreparedStatement preStm = conn.prepareStatement(selectQuery);) {

            preStm.setString(1, username);
            preStm.setString(2, password);
            try (ResultSet rs = preStm.executeQuery()) {
                while (rs.next()) {
                    isValid = true;
                }
            }

        }

        return isValid;
    }
}
