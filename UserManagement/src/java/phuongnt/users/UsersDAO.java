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

  public boolean checkLogin(String id, String password) throws SQLException {
    if (id == null || password == null) {
      return false;
    }
    String selectQuery = "Select id from Users where id = ? and password = ? ";

    try (Connection conn = MyConnection.getMyConnection();
            PreparedStatement selectStm = conn.prepareStatement(selectQuery);) {
      selectStm.setString(1, id); //gán dấu thứ nhất thành username mặc dù đếm từ số 0 :)
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
    if (!isAdmin) {
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

  public boolean deleteUser(String id) throws SQLException {
    boolean isSuccess = false;
    String selectQuery = "Update Users Set Status ='False' where id = ?";
    try (Connection conn = MyConnection.getMyConnection();
            PreparedStatement selectStm = conn.prepareStatement(selectQuery);) {
      selectStm.setString(1, id);
      isSuccess = selectStm.executeUpdate() > 0;
    }
    return isSuccess;
  }

  public UsersDTO getUser(String id) throws SQLException {
    UsersDTO user = null;
    if (id == null) {
      return null;
    }

    String selectQuery = "Select id,password,username,email,phone,photo,role_id,status from Users where id = ?";
    try (Connection conn = MyConnection.getMyConnection();
            PreparedStatement selectStm = conn.prepareStatement(selectQuery);) {
      selectStm.setString(1, id);
      try (ResultSet rs = selectStm.executeQuery();) {
        while (rs.next()) {
          String password = rs.getString("password");
          String username = rs.getString("username");
          String email = rs.getString("email");
          String phone = rs.getString("phone");
          String photo = rs.getString("photo");
          String roleId = rs.getString("role_id");
          boolean status = rs.getBoolean("status");
          user = new UsersDTO(id, password, username, email, phone, photo, roleId, status);

        }
      }
      return user;
    }
  }

  public boolean updateUser(String password, String username, String email, String phone, String photo, String roleId, String id) throws SQLException {
    boolean isSuccess = false;
    UsersDTO user = new UsersDTO();
    String updateQuery = "Update Users Set password = ?,username = ?, email = ?, phone = ?, photo = ?, role_id = ?  where id = ? ";
    try (Connection conn = MyConnection.getMyConnection();
            PreparedStatement updateStm = conn.prepareStatement(updateQuery)) {
      updateStm.setString(1, password);
      updateStm.setString(2, username);
      updateStm.setString(3, email);
      updateStm.setString(4, phone);
      updateStm.setString(5, photo);
      updateStm.setString(6, roleId);
      updateStm.setString(7, id);
      isSuccess = updateStm.executeUpdate() > 0;
    }
    return isSuccess;
  }

  public boolean isValidUser(String id) throws SQLException {
    String selectQuery = "Select status from Users where id = ?";
    try (Connection conn = MyConnection.getMyConnection();
            PreparedStatement selectStm = conn.prepareStatement(selectQuery);) {
      selectStm.setString(1, id);
      try (ResultSet rs = selectStm.executeQuery();) {
        while (rs.next()) {
          return true;
        }
      }
    }
    return false;
  }
  public ArrayList<UsersDTO> searchUsers(String keyword) throws SQLException{
    ArrayList<UsersDTO> users = new ArrayList<>();
    if(keyword == null){
      return users;
    }
    String selectQuery = "Select id,password,username,email,phone,photo,role_id,status from Users where username like '%'+ ? + '%'";
    try(Connection conn = MyConnection.getMyConnection(); 
            PreparedStatement selectStm = conn.prepareStatement(selectQuery);){
      selectStm.setString(1, keyword);
      try(ResultSet rs = selectStm.executeQuery();){
        while(rs.next()){
          String id = rs.getString("id");
          String password = rs.getString("password");
          String username = rs.getString("username");
          String email = rs.getString("email");
          String phone = rs.getString("phone");
          String photo = rs.getString("photo");
          String roleId = rs.getString("role_id");
          UsersDTO user = new UsersDTO(id, password, username, email, phone, photo, roleId, true);
          users.add(user);
        }
      }
    }
    return users;
  }
}
