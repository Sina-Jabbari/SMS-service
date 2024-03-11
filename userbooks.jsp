<%-- 
    Document   : userbooks
    Created on : Jan 24, 2021, 1:00:48 AM
    Author     : student
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="lab3.Helper.BookBorrowed"%>
<!DOCTYPE html>


<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
    </head>
    <style>

body {
  background-color: #E6E6FA;

}
</style>
<% 
    ArrayList<BookBorrowed> books= (ArrayList)request.getAttribute("booksBorrowedInfo");
  
%>

<center><h2>Hello <%=session.getAttribute("uname")%></h2></center>
<br>
<center><h3> Suggested Users</h3></center>
<br>
<table border="2" align="center" cellpadding="5" cellspacing="5">

<tr>
   
<th> Username </th>
<th> Member Since </th>
<th> View Profile </th>
<th> Say Hi </th>

</tr>

    <% for(BookBorrowed book: books){
    %>
<tr>
<td> <%=book.getBookAuthor()%></td>
<td> <%=new SimpleDateFormat("yyyy-MM-dd").format(book.getDueDate())%></td>
<% if (book.isAvailable()){
%>
<form action="View" method="post">
<td> <input type="submit" value="View" ></td>
</form>
<form action="Message" method="post">
<td> <input type="submit" value="Message" ></td>
</form>
<%}

else {
%>

<td> "This profile is private"</td>
<form action="Message" method="post">
<td> <input type="submit" value="Message" ></td>
</form>
<% }}
%>
</tr>
</table>
</body>
</html>
