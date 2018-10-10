<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta name="layout" content="my_main"/>
        <title>All Tables</title>
    </head>
    <body>
        <h1>List of Students</h1>
     <table class="table-striped">
         <tr>
             <td>Code</td>
             <td>Name</td>
             <td>Last Name</td>
         </tr>
      <g:each in="${students}" var="student">
          <tr>
              <td>${student.code}</td>
              <td>${student.name}</td>
              <td>${student.lastName}</td>
          </tr>
      </g:each>
    </table>
    <h1>List of Books</h1>
    <table class="table-striped">
            <tr>
                <td>Reference</td>
                <td>Title</td>
            </tr>
           
           <g:each in="${books}" var="book">
               <tr>
                   <td>${book.reference}</td>
                   <td>${book.title}</td>
               </tr>
           </g:each>
        </table>
    </body>
</html>