/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongnt.test;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.SQLException;
import java.util.ArrayList;
import phuongnt.promotions.PromotionsDAO;
import phuongnt.promotions.PromotionsDTO;

/**
 *
 * @author USER
 */
public class TestPromotion {
    public static void main(String[] args) throws SQLException {
        PromotionsDAO dao = new PromotionsDAO();
        ArrayList<PromotionsDTO> promotion = dao.getPromotions();
        System.out.println(promotion);
    }
}
