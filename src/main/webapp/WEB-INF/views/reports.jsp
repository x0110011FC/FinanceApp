<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<jsp:include page="../fragments/head.jsp"/>
<body>
<div class="center">
<h2>Default data</h2>
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
    <c:forEach items="${reports}" var="report">
        <tr>
            <td>${report.docId}</td>
            <td>${report.customerId}</td>
            <fmt:parseDate value="${report.financialDate}" pattern="yyyy-MM-dd HH:mm:ss"
                           var="parsedDate"/>
            <fmt:formatDate value="${parsedDate}" pattern="dd.MM.yyyy" var="formatedFinancialDate"/>
            <td>${formatedFinancialDate}</td>
            <td>${report.auditFlag}</td>
            <td>${report.numberOfMonths}</td>
            <fmt:parseDate value="${report.validFrom}" pattern="yyyy-MM-dd HH:mm:ss"
                           var="parsedDate"/>
            <fmt:formatDate value="${parsedDate}" pattern="dd.MM.yyyy" var="formatedValidFromDate"/>
            <td>${formatedValidFromDate}</td>
            <fmt:parseDate value="${report.validTo}" pattern="yyyy-MM-dd HH:mm:ss"
                           var="parsedDate"/>
            <fmt:formatDate value="${parsedDate}" pattern="dd.MM.yyyy" var="formatedValidToDate"/>
            <td>${formatedValidToDate}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div class="center">
<a href="/reports/edited" role="button" class="ui-button">Edited report</a>
</div>
</body>
</html>
