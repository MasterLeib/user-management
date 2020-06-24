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
import phuongnt.users.UsersDAO;

/**
 *
 * @author USER
 */
public class LoginController extends HttpServlet {

    private static final String SUCCESS = "home.jsp";
    private static final String FAIL = "login.html";

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
        String url = FAIL;
        try {
            String username = request.getParameter("txtUsername");
            String password = request.getParameter("txtPassword");
            String userMsg = "User is invalid";

            boolean isUserTrue = false;
            boolean isPassTrue = false;

            if (username.equals("abcabc")) {
                isUserTrue = true;
                userMsg = "";
            }
            if (password.equals("123123")) {
                isPassTrue = true;
            }
            boolean isTrue = isUserTrue && isPassTrue;
            if (isTrue) {
                request.setAttribute("asd", username);
                url = SUCCESS;
            } else {
                request.setAttribute("username", username);
                request.setAttribute("password", password);
                request.setAttribute("userMsg", userMsg);

                request.setAttribute("isUserTrue", isUserTrue);
                request.setAttribute("isPassTrue", isPassTrue);

                url = "login.jsp";
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
