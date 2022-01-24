<%-- 
    Document   : header
    Created on : 14-gen-2022, 9.56.39
    Author     : paoloaliprandi
--%>

<b>Benvenuto, <%= session.getAttribute("username") %></b><input type="button" style="float: right" value="Logout"  onclick="location.replace('LogoutServlet')">
<hr>