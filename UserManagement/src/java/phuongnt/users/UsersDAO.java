/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongnt.users;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import phuongnt.db.MyConnection;

/**
 *
 * @author USER
 */
public class UsersDAO {

    public boolean checkLogin(String username, String password) throws SQLException {
        boolean isTrue = false;
        if (username != null && password != null) {
            String selectQuery = "Select id from Users where username = ? and password = ? ";

            Connection conn = MyConnection.getMyConnection();
            PreparedStatement selectStm = conn.prepareStatement(selectQuery);
            selectStm.setString(1, username); //gán dấu thứ nhất thành username mặc dù đếm từ số 0 :)
            selectStm.setString(2, password);
            ResultSet rs = selectStm.executeQuery();
            if (rs.next()) {
                isTrue = true;
            }

        }
        return isTrue;
    }

    public ArrayList<UsersDTO> getUsers() throws SQLException {

        ArrayList<UsersDTO> users = new ArrayList<>();
        String selectQuery = "Select id,password,username,email,phone,photo,role_id,status from Users";
        Connection conn = MyConnection.getMyConnection();
        PreparedStatement selectStm = conn.prepareStatement(selectQuery);
        ResultSet rs = selectStm.executeQuery();
        while (rs.next()) {
            String id = rs.getString("id");
            String password = rs.getString("password");
            String username = rs.getString("username");
            String email = rs.getString("email");
            String phone = rs.getString("phone");
            String photo = rs.getString("photo");
            String roleId = rs.getString("role_id");
            boolean status = rs.getBoolean("status");
            UsersDTO dto = new UsersDTO(id, password, username, email, phone, photo, roleId, status);
            users.add(dto);

        }

        return users;
    }
}
