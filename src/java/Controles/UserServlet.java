/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOResponsavel;
import Entidades.Responsavel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yasmin
 */
@WebServlet(name = "UserServlet", urlPatterns = {"/havai"})
public class UserServlet extends HttpServlet {

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

        DAOResponsavel daoResponsavel = new DAOResponsavel();
        Responsavel responsavel = new Responsavel();
        List<Responsavel> responsaveis = daoResponsavel.listInOrderId();
        String acao = daoResponsavel.getAcao();

        switch (acao) {

            case "logando":
                String recebeusuario = request.getParameter("usuario");
                String recebesenha = request.getParameter("senha");
                for (Responsavel r : responsaveis) {
                    if (r.getUsuario().equals(recebeusuario) && r.getSenha().equals(recebesenha)) {
                        daoResponsavel.setIdLogado(r.getIdResponsavel());
                        responsavel.setEmail(r.getEmail());
                        responsavel.setNome(r.getNome());
                        responsavel.setTelefone(r.getTelefone());
                        responsavel.setUsuario(r.getUsuario());
                        responsavel.setSenha(r.getSenha());

                        request.setAttribute("Responsavel", responsavel);
                        request.getRequestDispatcher("calendarioADM.jsp").forward(request, response);

                    }
                }

        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
