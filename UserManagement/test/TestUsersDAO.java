
import java.sql.SQLException;
import java.util.ArrayList;
import phuongnt.roles.RolesDAO;
import phuongnt.roles.RolesDTO;
import phuongnt.users.UsersDAO;
import phuongnt.users.UsersDTO;
import phuongnt.utils.Utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class TestUsersDAO {

  public static void main(String[] args) throws SQLException {
       System.out.println(Utils.convertToTotalPage(6, 5));
       
  }
}
