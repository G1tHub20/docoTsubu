<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><%-- pageディレクティブ --%>
<%@page import="model.User" %>
<%  //スクリプトレット
//セッションスコープからユーザー情報を取得
User loginUser = (User) session.getAttribute("loginUser");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
<h1>どこつぶログイン</h1>
<% if(loginUser != null) { %>
	<p>ログインに成功しました</p>
	<p>ようこそ<%= loginUser.getName() %>さん</p><%-- スクリプト式 --%>
	<a href="/docoTsubu/Main">つぶやき投稿・閲覧へ</a>
<% } else { %>
	<p>ログインに失敗しました</p>
	<a href="/docoTsubu/Main">TOPへ</a>
<% }%>
</body>
</html>