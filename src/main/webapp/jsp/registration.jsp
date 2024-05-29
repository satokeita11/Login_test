<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h2>会員登録ページ</h2>
<form action="${pageContext.request.contextPath}/RegistrationServlet"
	method="post">

	<p>
		ログイン名<input type="text" name="user_login">
	</p>
	<p>
		パスワード<input type="password" name="password">
	</p>
	<p>
		<input type="submit" value="登録">
	</p>
</form>
<%@include file="../footer.html"%>