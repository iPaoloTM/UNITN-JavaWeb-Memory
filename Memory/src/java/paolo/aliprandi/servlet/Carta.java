/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paolo.aliprandi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author paoloaliprandi
 */
public class Carta extends HttpServlet {
    
    Map<String, String> table=new HashMap();
    final int dim=4;
    @Override
    public void init(){
        int v=1;
        for ( int i=1;i<=dim;i++) {
            for ( int j=1;j<=dim;j++) {
                String key=""+(i*10+j);
                                String value="0";
                 if (i==1) {
                     if (j<=2) {
                        value="1"; 
                     } else {
                    value="2";                         
                     }
                } else if (i==2) {
                    if (j<=2) {
                        value="3"; 
                     } else 
                        value="4";
                } else if (i==3) {
                   if (j<=2) {
                        value="5"; 
                     } else
                    value="6";
                } else if (i==4) {
                    if (j<=2) {
                        value="7"; 
                     } else
                    value="8";
                }
                table.put(key, value);
                System.out.println(key+","+value);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String s=request.getParameter("id");
            PrintWriter out=response.getWriter();
            response.setContentType("text/plain;charset=UTF-8");
            String temp=table.get(s);
            out.print(temp);
            out.close();
            System.out.println("Rispondo con "+temp);
    }
}
