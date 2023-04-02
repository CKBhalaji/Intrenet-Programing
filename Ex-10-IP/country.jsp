<%-- 
    Document   : country
    Created on : 27 Mar, 2023, 11:44:35 AM
    Author     : bhalaji
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="arryclass.classarray"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie</title>
        
    </head>
    <body>
        <%
            classarray con = new classarray("USA", "Washington D.C.", "USD", 328200000);
            classarray con1 = new classarray("Canada", "Ottawa", "CAD", 38000000);
            classarray con2 = new classarray("Mexico", "Mexico City", "MXN", 130000000);
            ArrayList<classarray> obj = new ArrayList<classarray>();
            obj.add(con);
            obj.add(con1);
            obj.add(con2);
String s="name-capital-currency-population";
pageContext.setAttribute("s", s);
pageContext.setAttribute("obj", obj);
        %>
        <table border="2px">
  <thead>
    <tr>
      <th>Name</th>
      <th>Capital</th>
      <th>Currency</th>
      <th>Population</th>
    </tr>
  </thead>
    <tbody>
    <c:forEach items="${pageScope.obj}" var="i">
            <tr>
                <td><c:out value="${i.getName()}"></c:out></td>
                <td><c:out value="${i.getCapital()}"></c:out></td>
                <td><c:out value="${i.getCurrency()}"></c:out></td>
                <td><c:out value="${i.getPopulation()}"></c:out></td>
            </tr>
        </c:forEach>  
  </tbody>
</table>
          

    </body> 
</html>

