<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<jsp:include page="../fragments/head.jsp"/>
<body>
<div class="center">
<h2>Changed data</h2>
</div>
<table id="reportTable" class="display compact" width="60%" cellspacing="0">
    <thead>
    <tr>
        <th>Document ID</th>
        <th>Customer ID</th>
        <th>Document Date</th>
        <th>Audit Flag</th>
        <th>Number of Months</th>
        <th>Valid from</th>
        <th>Valid to</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${editedreport}" var="editreport">
        <tr>
            <td>${editreport.docId}</td>
            <td>${editreport.customerId}</td>
            <fmt:parseDate value="${editreport.financialDate}" pattern="yyyy-MM-dd HH:mm:ss"
                           var="parsedDate"/>
            <fmt:formatDate value="${parsedDate}" pattern="dd.MM.yyyy" var="formatedFinancialDate"/>
            <td>${formatedFinancialDate}</td>
            <td>${editreport.auditFlag}</td>
            <td>${editreport.numberOfMonths}</td>
            <fmt:parseDate value="${editreport.validFrom}" pattern="yyyy-MM-dd HH:mm:ss"
                           var="parsedDate"/>
            <fmt:formatDate value="${parsedDate}" pattern="dd.MM.yyyy" var="formatedValidFromDate"/>
            <td>${formatedValidFromDate}</td>
            <fmt:parseDate value="${editreport.validTo}" pattern="yyyy-MM-dd HH:mm:ss"
                           var="parsedDate"/>
            <fmt:formatDate value="${parsedDate}" pattern="dd.MM.yyyy" var="formatedValidToDate"/>
            <td>${formatedValidToDate}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="center">
<a href="/reports" role="button" class="ui-button">Back to Default View</a>
</div>
</body>
</html>
