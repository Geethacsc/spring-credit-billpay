<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Credit Bill Payment Success</h1>
<hr/>

<div align="center">
<table>
<tr>
<td>Card No	:</td>
<td>${billPay.creditCardNo}</td>
</tr>
<tr>
<td>Amount	:</td>
<td>${billPay.amount}</td>
</tr>
<tr>
<td>Currency	:</td>
<td>${billPay.currency}</td>
</tr>
<tr>
<td>Date	:</td>
<td>${billPay.date}</td>
</tr>
</table>
</div>
</body>
</html>