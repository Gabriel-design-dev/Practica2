
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GABRIEL
 */
@WebServlet(name = "Servlet3", urlPatterns = {"/Servlet3"})
public class Servlet3 extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Lee</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Tres</h1>");
            out.print("<form action='' method='post'>");
            out.println("Primer Numero:");
            out.println("<input type='text' name='numeroA' required>");
            out.println("<br><br>");
            out.println("Segundo Numero:");
            out.println("<input type='text' name='numeroB' required>");
            out.println("<br><br>");
            out.println("<select>");
            out.println("<option value='suma'>Suma</option>");
            out.println("<option value='resta'>Resta</option>");
            out.println("<option value='multi'>Multiplicación</option>");
            out.println("<option value='divi'>División</option>");
            out.println("</select>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("<br>");
            String numeroA=request.getParameter("numeroA");
            String numeroB=request.getParameter("numeroB");
            if (numeroA != null && numeroB != null) {
                out.println("Resultado: "+(Integer.parseInt(numeroA)+Integer.parseInt(numeroB)));
            }
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}