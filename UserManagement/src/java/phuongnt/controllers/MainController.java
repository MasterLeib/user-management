/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongnt.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class MainController extends HttpServlet {

  private static final String LOGIN_PAGE = "login.html";
  private static final String LOGIN_CONTROLLER = "LoginController";
  private static final String LOGOUT_CONTROLLER = "LogoutController";
  private static final String VIEW_USERS_CONTROLLER = "ViewUsersController";
  private static final String VIEW_ROLES_CONTROLLER = "ViewRolesController";
  private static final String VIEW_PROMOTIONS_CONTROLLER = "ViewPromotionsController";
  private static final String INSERT_USER_CONTROLLER = "InsertUserController";
  private static final String DELETE_USER_CONTROLLER = "DeleteUserController";
  private static final String ADMIN_VIEW_USERS_CONTROLLER = "AdminViewUsersController";
  private static final String SHOW_USER_CONTROLLER = "ShowUserController";
  private static final String UPDATE_USER_CONTROLLER = "UpdateUserController";
  private static final String SEARCH_USERS_CONTROLLER = "SearchUsersController";
  

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    String action = request.getParameter("action");//LJIFG
    String url = "404.html";
    try {
      switch (action) {
        case "LoginPage":
          url = LOGIN_PAGE;
          break;
        case "LoginController":
          url = LOGIN_CONTROLLER;
          break;
        case "LogoutController":
          url = LOGOUT_CONTROLLER;
          break;
        case "ViewUsersController":
          url = VIEW_USERS_CONTROLLER;
          break;
        case "ViewRolesController":
          url = VIEW_ROLES_CONTROLLER;
          break;
        case "ViewPromotionsController":
          url = VIEW_PROMOTIONS_CONTROLLER;
          break;
        case "InsertUserController":
          url = INSERT_USER_CONTROLLER;
          break;
        case "DeleteUserController":
          url = DELETE_USER_CONTROLLER;
          break;
        case "AdminViewUsersController":
          url = ADMIN_VIEW_USERS_CONTROLLER;
          break;
        case "ShowUserController":
          url = SHOW_USER_CONTROLLER;
          break;
        case "UpdateUserController":
          url = UPDATE_USER_CONTROLLER;
          break;
        case "SearchUsersController":
          url = SEARCH_USERS_CONTROLLER;
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      request.getRequestDispatcher(url).forward(request, response);
    }
  }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
