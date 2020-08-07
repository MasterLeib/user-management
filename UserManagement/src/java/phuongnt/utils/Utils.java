/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongnt.utils;

/**
 *
 * @author USER
 */
public class Utils {
  public static int convertToTotalPage(int totalOfItems ,int limit){
    int totalOfPages = 0;
    totalOfPages = totalOfItems/limit;
    if(totalOfItems%limit>0){     
      totalOfPages++;
    }  
    return totalOfPages;
  }
  
}
