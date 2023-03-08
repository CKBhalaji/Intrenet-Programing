package main;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "quiz", urlPatterns = {"/quiz"})
public class quiz extends HttpServlet 
{ 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String s=request.getParameter("question1");
            String s1=request.getParameter("option1");
            String s2=request.getParameter("option2");
            String s3=request.getParameter("option3");
            String s4=request.getParameter("option4");
            String s5=request.getParameter("option5");
            String s6=request.getParameter("option6");
            String s7=request.getParameter("option7");
            String s8=request.getParameter("option8");
            String s9=request.getParameter("option9");
            String s10=request.getParameter("option10");
            String s11=request.getParameter("option11");
            String s12=request.getParameter("option12");
            String s13=request.getParameter("option13");
            String s14=request.getParameter("option14");
            String s15=request.getParameter("option15");
            String s16=request.getParameter("option16");
            String s17=request.getParameter("answer1");
            String s18=request.getParameter("answer2");
            String s19=request.getParameter("answer3");
            String s20=request.getParameter("answer4");
            String s21=request.getParameter("question2");
            String s22=request.getParameter("question3");
            String s23=request.getParameter("question4");
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet quiz</title>");     
            out.println("</scrpt>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='text-align:'center'>"+s+"</h1>");
            out.println("<input type='radio' name='a' id='option1'>"+s1+"<br>");
            out.println("<input type='radio' name='a' id='option2'>"+s2+"<br>");
            out.println("<input type='radio' name='a' id='option3'>"+s3+"<br>");
            out.println("<input type='radio' name='a' id='option4'>"+s4+"<br><hr>"); 
            out.println("<h3 style='text-align:center'>correct answer is: "+s17+"</h3>");
            out.println("<h1 style='text-align:'center'>"+s21+"</h1>");
            out.println("<input type='radio' name='b' id='option1'>"+s5+"<br>");
            out.println("<input type='radio' name='b' id='option2'>"+s6+"<br>");
            out.println("<input type='radio' name='b' id='option3'>"+s7+"<br>");
            out.println("<input type='radio' name='b' id='option4'>"+s8+"<br><hr>");
            out.println("<h3 style='text-align:center'>correct answer is: "+s18+"</h3>");
            out.println("<h1 style='text-align:'center'>"+s22+"</h1>");
            out.println("<input type='radio' name='c' id='option1'>"+s9+"<br>");
            out.println("<input type='radio' name='c' id='option2'>"+s10+"<br>");
            out.println("<input type='radio' name='c' id='option3'>"+s11+"<br>");
            out.println("<input type='radio' name='c' id='option4'>"+s12+"<br><hr>");  
            out.println("<h3 style='text-align:center'>correct answer is: "+s19+"</h3>");
            out.println("<h1 style='text-align:'center'>"+s23+"</h1>");
            out.println("<input type='radio' name='d' id='option1'>"+s13+"<br>");
            out.println("<input type='radio' name='d' id='option2'>"+s14+"<br>");
            out.println("<input type='radio' name='d' id='option3'>"+s15+"<br>");
            out.println("<input type='radio' name='d' id='option4'>"+s16+"<br><hr>");  
           out.println("<h3 style='text-align:center'>correct answer is: "+s20+"</h3>");
           
      
            
          
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
