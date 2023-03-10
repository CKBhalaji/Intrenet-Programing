/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/greetingservlet"})
public class greetingservlet extends HttpServlet {

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
        PrintWriter out=response.getWriter();
        Cookie c[]=request.getCookies();
        String lan=c[0].getValue();
        try
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet greetingservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            if (lan.equals("tamil")) {
                out.println("<div>");
                out.println("<Center>");
                out.println("<hr>");
                out.println("<h1>TAMIL</h1> <br>");
                out.println("<hr>");
                out.println("<img src='https://thumbs.dreamstime.com/z/vanakkam-welcome-tamil-decorative-font-d-render-meaning-white-background-217363681.jpg'><br>");
                out.println("</Center>");
                out.println("</div>");
            }
            if (lan.equals("malayalam")) {
                out.println("<div>");
                out.println("<Center>");
                out.println("<hr>");
                out.println("<h1>MALAYALAM</h1> <br>");
                out.println("<hr>");
                out.println("<img src='https://cdn.dribbble.com/users/9122804/screenshots/16425089/media/78997505a1cd1df35d776877c4005a38.jpg'><br>");
                out.println("</Center>");
                out.println("</div>");
            }
            if (lan.equals("english")) {
                out.println("<div>");
                out.println("<Center>");
                out.println("<hr>");
                out.println("<h1>ENGLISH</h1> <br>");
                out.println("<hr>");
                out.println("<img src='https://as1.ftcdn.net/v2/jpg/03/67/35/72/1000_F_367357209_BG07SVnnB4HSHSaMiHajfZhrZZAE859A.jpg'><br>");
                out.println("</Center>");
                out.println("</div>");
            }
            if (lan.equals("sanskrit")) {
                out.println("<div>");
                out.println("<Center>");
                out.println("<hr>");
                out.println("<h1>SANSKRIT</h1> <br>");
                out.println("<hr>");
                out.println("<img src='https://img.freepik.com/free-vector/namaste-hand-posture-background_23-2147707402.jpg?w=740&t=st=1678342637~exp=1678343237~hmac=e3a101d744ae94f07752c365961a5ee06dc994738ac9f6e595e6073b84f88c4e'><br>");
                out.println("</Center>");
                out.println("</div>");
            }
            out.println("</body>");
            out.println("</html>");
        }
        finally
        {
             out.close();   
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
