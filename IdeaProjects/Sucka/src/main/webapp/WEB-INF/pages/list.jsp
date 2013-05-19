<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <spring:theme code="stylesheet" var="app_css" />
    <spring:url value="/${app_css}" var="app_css_url" />
    <link rel="stylesheet" type="text/css" media="screen" href="/standard.css" />
</head>


<body>

<div>
    <h1><a href="/">Partners</a> | <a href="?teams">Teams</a> | <a href="?newPartner">Partners</a></h1>
    <c:if test="${not empty partners}">
        <table>
            <thead>
            <tr>
                <th>Onepass</th>
                <th>Partner</th>
                <th>Team ID</th>
                <th>Rank</th>
                <th>College ID</th>
                <th>Rank</th>
                <th>Title</th>
                <th>Start Date</th>
                <th>Hire Source</th>
                <th>Major ID</th>
                <th>Peoplesoft ID</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="partner" items="${partners}">
                <tr>
                    <td>${partner.onepassId}</td>
                    <td>${partner.lastName}, ${partner.firstName}</td>
                    <td>${partner.sadcTeamId}</td>
                    <td>${partner.collegeId}</td>
                    <td>${partner.teamRank}</td>
                    <td>${partner.sadcRank}</td>
                    <td>${partner.titleId}</td>
                    <td>${partner.startDt}</td>
                    <td>${partner.sourceId}</td>
                    <td>${partner.majorId}</td>
                    <td>${partner.psId}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </c:if>
    <h1>End of Contact Listing</h1>
</div>
</body>
</html>