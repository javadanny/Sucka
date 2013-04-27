<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
<div>
    <h1><a href="/">Partners</a> | <a href="/teams">Teams</a></h1>
    <c:if test="${not empty teams}">
        <table>
            <thead>
            <tr>
                <th>Team ID</th>
                <th>Team Name</th>
                <th>Callup Date</th>
                <th>Size</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="team" items="${teams}">
                <tr>
                    <td>${team.teamId}</td>
                    <td>${team.teamName}</td>
                    <td>${team.callupDate}</td>
                    <td>${team.size}</td>
            </c:forEach>
            </tbody>
        </table>

    </c:if>
    <h1>End of Teams Listing</h1>
</div>
</body>
</html>