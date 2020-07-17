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
    if (username == null || password == null) {
      return false;
    }
    String selectQuery = "Select id from Users where username = ? and password = ? ";

    try (Connection conn = MyConnection.getMyConnection();
            PreparedStatement selectStm = conn.prepareStatement(selectQuery);) {
      selectStm.setString(1, username); //gán dấu thứ nhất thành username mặc dù đếm từ số 0 :)
      selectStm.setString(2, password);
      try (ResultSet rs = selectStm.executeQuery();) {
        if (rs.next()) {
          return true;
        }
      }
    }
    return false;
  }

  public ArrayList<UsersDTO> getUsers(boolean isAdmin) throws SQLException {

    ArrayList<UsersDTO> users = new ArrayList<>();
    String selectQuery = "Select id,password,username,email,phone,photo,role_id,status from Users";
    if(!isAdmin){
        selectQuery = selectQuery + " where Status = 1 ";
    }
    try (Connection conn = MyConnection.getMyConnection();
            PreparedStatement selectStm = conn.prepareStatement(selectQuery);
            ResultSet rs = selectStm.executeQuery();) {
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
    }
    return users;
  }

  public boolean insertUsers(String id, String password, String username,
          String email, String phone, String photo, String roleId) throws SQLException {
    boolean isSuccess = false;
    String insertQuery
            = "Insert into Users (id, password, username, email, phone, photo, role_id, status)"
            + " values (?, ?, ?, ?, ?, ?, ?, 1)";

    try (Connection conn = MyConnection.getMyConnection();
            PreparedStatement selectStm = conn.prepareStatement(insertQuery);) {
      selectStm.setString(1, id);
      selectStm.setString(2, password);
      selectStm.setString(3, username);
      selectStm.setString(4, email);
      selectStm.setString(5, phone);
      selectStm.setString(6, photo);
      selectStm.setString(7, roleId);
      isSuccess = selectStm.executeUpdate() > 0;
    }
    return isSuccess;
  }
  public boolean deleteUser(String id) throws SQLException{
    boolean isSuccess = false;
    String selectQuery = "Update Users Set Status ='False' where id = ?";
    try(Connection conn = MyConnection.getMyConnection();
    PreparedStatement selectStm = conn.prepareStatement(selectQuery);){
      selectStm.setString(1, id);
      isSuccess = selectStm.executeUpdate()>0;
    }       
    return  isSuccess;
  }

}
