<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <jsp:include page="../../../includes/head.jsp"/>
    <title>${title}</title>
</head>
<body>
<p>FORM</p>
<jsp:include page="../../../fragments/documentation/document_form.jsp" />
<form action="#" method="post">
    <input type="text" name="firstName" required />
    <input type="text" name="email" required />
    <input type="submit" value="Submit" />
</form>
</body>
</html>