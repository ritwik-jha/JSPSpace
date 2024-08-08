<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Space Consumption</title>
</head>
<body>
    <h1>Space Consumption Matrix</h1>
    <table>
    <tr>
        <th>Server hostname</th>
        <th>Space consumed</th>
        <th>Total Space</th>
    </tr>
    <c:forEach items="${finalServerList}" var="serverDetails">
        <tr>
            <td>${serverDetails.getHostName()}</td>
            <td>${serverDetails.getAvailableSpace()}</td>
            <td>${serverDetails.getTotalSpace()}</td>
        </tr>
    </c:forEach>

</body>
</html>