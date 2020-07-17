/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongnt.promotions;

/**
 *
 * @author USER
 */
public class PromotionsDTO {
    String userId;
    String rank;

    public PromotionsDTO(String userId, String rank) {
        this.userId = userId;
        this.rank = rank;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "PromotionsDTO{" + "userId=" + userId + ", rank=" + rank + '}';
    }
    
}
