<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

こんにちは、${login.user_login}さん。

<form action="${pageContext.request.contextPath}/Logout.action"
	method="post">
	<input type="submit" value="ログアウト">
</form>
<%@include file="../footer.html"%>