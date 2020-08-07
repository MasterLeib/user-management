/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuongnt.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import phuongnt.roles.RolesDAO;
import phuongnt.roles.RolesDTO;
import phuongnt.users.UsersDAO;
import phuongnt.users.UsersDTO;
import phuongnt.utils.Utils;

/**
 *
 * @author USER
 */
public class SearchUsersController extends HttpServlet {

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
    String url = "show_users.jsp";
    UsersDAO dao = new UsersDAO();
    RolesDAO dao1 = new RolesDAO();
    try {
      String username = request.getParameter("txtUsername");
      String roleId = request.getParameter("roleId");
      String pageAsString = request.getParameter("page");
      int page = 1;
      if (pageAsString != null) {
        page = Integer.parseInt(pageAsString);
      }

      ArrayList<UsersDTO> users = dao.searchUsers(username, roleId, 5, page);
      int totalOfItems = dao.countUsers(username, roleId);
      int totalOfPages = Utils.convertToTotalPage(totalOfItems, 5);
      ArrayList<RolesDTO> roles = dao1.getRoles();

      request.setAttribute("page", page);
      request.setAttribute("roleId", roleId);
      request.setAttribute("txtUsername", username);
      request.setAttribute("users", users);
      request.setAttribute("roles", roles);
      request.setAttribute("totalOfPages", totalOfPages);
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
