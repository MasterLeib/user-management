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
import java.util.ArrayList;
import phuongnt.db.MyConnection;
import phuongnt.roles.RolesDAO;
import phuongnt.roles.RolesDTO;

/**
 *
 * @author USER
 */
public class TestConnection {

    public static void main(String[] args) throws SQLException {
        RolesDAO dao = new RolesDAO();
        ArrayList<RolesDTO> x = dao.getRoles();
        System.out.println(x);
    }
}
