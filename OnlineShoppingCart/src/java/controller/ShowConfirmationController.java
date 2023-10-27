/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Products;
import model.Shoppingcart;

/**
 *
 * @author USER
 */
public class ShowConfirmationController extends HttpServlet {

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
        //put session to hash map
        HttpSession session = request.getSession();
        Enumeration<String> sessionAttrList = session.getAttributeNames();
        HashMap<String, Integer> hmSession = new HashMap<>();
        while (sessionAttrList.hasMoreElements()) {
            String singleAttr = sessionAttrList.nextElement();
            if (!singleAttr.contains("WELD_S_HASH")) {
                hmSession.put(singleAttr, (int) session.getAttribute(singleAttr));
            }
        }
        //session not same
        session.invalidate();
        //synchronized for multiple user and add to database
        synchronized (getServletContext()) {
            int lastestCartId = CallProductTable.findLastestCartID();
            getServletContext().setAttribute("lastestCartId", lastestCartId + 1);
            for (String movieName : hmSession.keySet()) {
                Products pd = CallProductTable.findProductByMovie(movieName);
                Shoppingcart shpCart = new Shoppingcart((int) getServletContext().getAttribute("lastestCartId"), pd.getId());
                shpCart.setQuantity(hmSession.get(movieName));
                CallProductTable.insertShoppingCart(shpCart);

            }
        }
        request.setAttribute("totalPrice", request.getParameter("totalPrice"));
        request.getRequestDispatcher("ShowConfirmation.jsp").forward(request, response);
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
