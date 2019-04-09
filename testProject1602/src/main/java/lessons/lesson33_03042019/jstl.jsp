<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:out value="Hello"/>

    <c:set var="login" value='admin'/>

<c:choose>
    <c:when test="${login eq'admin'}">
        Access granted
    </c:when>

    <c:otherwise>
        Access denied
    </c:otherwise>

</c:choose>

<c:forEach var="j" begin="1" end="3">
   Item <c:out value="${j}"/><p>
</c:forEach>