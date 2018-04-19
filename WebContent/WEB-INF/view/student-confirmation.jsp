
<!-- It is the jstl core tag which  will give us the for each tag for looping the item into the jsp -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation Form</title>
</head>
<body>

   The student is confirmed : ${student.firstName} ${student.lastName}
      
   <br>
   <br>
   
   Country : ${student.country}
   
   <br>
   <br>
   
   Favorite Language : ${student.favoritLanguage}
   
   <br>
   <br>
   
   Your favorite Operating system  : 
   <!-- bullet list -->
   <ul>
   <!-- jstl provide us this type of this looping -->
   <c:forEach var="temp" items="${student.operatingSystem}" >
        
        <li>${temp}</li>
        </c:forEach>
   </ul>
 
   
</body>
</html>