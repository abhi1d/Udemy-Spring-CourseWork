<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Registration Form</title>
</head>
<body>

   <!-- model attribute should be match with the Model attribute of student class controller  -->
   <form:form action="processForm" modelAttribute="student">
      
      <!-- When the form submits then getter method automatically will be called  -->
      <!-- firstName becomes the getFirstName() method and so far -->
      First name : <form:input path="firstName" />
      
      <br> <br>
      Last name : <form:input path="lastName" />
      
      <br> <br>
      
      <form:select path = "country">
            <form:options  items="${student.countryOptions}"/>
      </form:select>
      
      <br>
      <br>
      
      Favorite Language :
      Java <form:radiobutton path = "favoritLanguage" value = "Java"/>
      C# <form:radiobutton path = "favoritLanguage" value = "C#"/>
      Ruby <form:radiobutton path = "favoritLanguage" value = "Ruby"/>
      PHP <form:radiobutton path = "favoritLanguage" value = "PHP"/>
      
      
      <br>
      <br>
      
      Select Favorite Operating System : 
      Linux <form:checkbox path = "operatingSystem" value = "Linux"/>
      Windows <form:checkbox path = "operatingSystem" value = "Windows"/>
      MacOs <form:checkbox path = "operatingSystem" value = "MacOs"/>
      
      <input type = "submit" value = "Submit"/>
   
   </form:form>
</body>
</html>