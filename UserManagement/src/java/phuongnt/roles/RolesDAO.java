/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongnt.roles;

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
public class RolesDAO {
    public ArrayList<RolesDTO> getRoles() throws SQLException{
        ArrayList<RolesDTO> roles = new ArrayList<>();
        String sql = "Select id,name from Roles";
        Connection conn = MyConnection.getMyConnection();
        PreparedStatement selectStm = conn.prepareStatement(sql);
        ResultSet rs = selectStm.executeQuery();
        while(rs.next()){
            String id = rs.getString("id");
            String name = rs.getString("name");
            RolesDTO role = new RolesDTO(id, name);
            roles.add(role);
        }
        
        return roles;
    }
}
