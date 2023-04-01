<%-- 
    Document   : movie_jsp
    Created on : 22 Mar, 2023, 10:41:36 AM
    Author     : bhalaji
--%>
<%@page import="java.sql.*"%>
<%@page import="javax.servlet.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Class.forName("org.apache.derby.jdbc.ClientDriver"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie</title>
    </head>
    <body>
        <table border="2" style="border-collapse: collapse ; text-align: center">
            <tr>
                <th>NUMBER OF MOVIES</th>
                <th>AVERAGE PRICE OF ALL MOVIES>
                <th>DIRECTOR WITH HIGHEST RATED MOVIES</th>
            </tr>
            <%
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/movie");
                Statement stmt1 = conn.createStatement();
                ResultSet rs1 = stmt1.executeQuery("SELECT COUNT(*) FROM movies");
                int totalMovies = 0;
                if (rs1.next()) {
                    totalMovies = rs1.getInt(1);
                }
                // Retrieve average price of all movies
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery("SELECT AVG(price) FROM movies");
                double avg_price = 0;
                while (rs2.next()) {
                    avg_price = rs2.getDouble(1);
                }
                // Retrieve director with the highest-rated movies
                Statement stmt3=conn.createStatement();
                ResultSet rs3=stmt3.executeQuery("select director,avg(rating) as average from movies group by director order by average desc");
                String director="";
                while(rs3.next())
                {
                    director = rs3.getString(1);
                }
                out.println("<tr>"+"<td>"+totalMovies+"</td>"+"<td>"+avg_price+"</td>"+"<td>"+director+"</td>"+"</tr>");
            %>
        </table>
    </body>
</html>
