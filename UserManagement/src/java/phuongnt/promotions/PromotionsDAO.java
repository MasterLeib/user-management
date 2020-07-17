/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongnt.promotions;

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
public class PromotionsDAO {
    public ArrayList<PromotionsDTO> getPromotions() throws SQLException{
        ArrayList<PromotionsDTO> promotions = new ArrayList<>();
        String selectQuery="Select user_id, rank from Promotion";
        Connection conn = MyConnection.getMyConnection();
        PreparedStatement selectStm = conn.prepareStatement(selectQuery);
        ResultSet rs = selectStm.executeQuery();
        while(rs.next()){
            String userId = rs.getString("user_id");
            String rank = rs.getString("rank");
            PromotionsDTO promotion = new PromotionsDTO(userId, rank);
            promotions.add(promotion);            
        }
        return promotions;
    }
}
