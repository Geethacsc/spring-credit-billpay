<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Credit Bill Payment</h1>
<hr/>
<form:form action="billpay-success" modelAttribute="billPay">
<div align="center">
<table>
<tr>
<td>
<form:label path="creditCardNo">Card No	:</form:label></td>
<td><form:input path="creditCardNo" /></td>
<td><form:errors path="creditCardNo" cssClass="error"></form:errors></td></tr>
<tr>
<td><form:label path="amount">Amount	:</form:label></td>
<td><form:input path="amount"/></td>
<td><form:errors path="amount" cssClass="error"/></td></tr>
<tr>
<td><form:label path="currency">Currency	:</form:label></td>
<td><form:input path="currency"/></td>
<td><form:errors path="currency" cssClass="error"/></td></tr>
<tr>
<td><form:label path="date">Date	:</form:label></td>
<td><form:input path="date"/></td>
<td><form:errors path="date" cssClass="error"/></td>
</tr>
</table>
<br/><br/>
<form:button>PayBill</form:button>
</div>
</form:form>

</body>
</html>