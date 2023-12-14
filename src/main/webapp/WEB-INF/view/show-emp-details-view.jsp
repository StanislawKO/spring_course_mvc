<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, you are WELCOME!!!</h2>

<br><br>

<%--You name: ${param.employeeName}--%>

<%--You name: ${nameAttribute}--%>

You name: ${employee.name}
<br>
You surname: ${employee.surname}
<br>
You salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Language(s):
<ul>

    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>

</ul>

</body>

</html>