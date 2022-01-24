package paolo.aliprandi.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import paolo.aliprandi.obj.Classifica;
import paolo.aliprandi.obj.Giocatore;


public class MostraClassificaServlet extends HttpServlet {
  

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String username=(String) request.getSession().getAttribute("username");
        String punti = request.getParameter("punti");
        
        ServletContext context = request.getServletContext();
        
        Classifica c = (Classifica) context.getAttribute("classifica");
        
        if (c==null) {
            c = new Classifica();
            context.setAttribute("classifica", c);
        }
        
        Giocatore g = new Giocatore(username, punti);
        c.add(g);
        
        Collections.sort(c);
        
        System.out.println("--------Servlet---------");
        System.out.println(c.getFormattedClassifica());
        
        RequestDispatcher rp=request.getRequestDispatcher("home.jsp");
        rp.forward(request, response);
    }
    // metodo doGet messo qui per supportare la versione più semplice.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }
}
