<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="../header.html"%>

<form action="${pageContext.request.contextPath}/Login.action" method="post">
	<p>
		ログイン名<input type="text" name="user_login">
	</p>
	<p>
		パスワード<input type="password" name="password">
	</p>
	<p>
		<input type="submit" value="ログイン">
	</p>
</form>

<P>まだ会員登録が済んでいない方は<a href="${pageContext.request.contextPath}/RegistrationServlet">こちら</a>から会員登録を行ってください</P>
<%@ include file="../footer.html"%>
