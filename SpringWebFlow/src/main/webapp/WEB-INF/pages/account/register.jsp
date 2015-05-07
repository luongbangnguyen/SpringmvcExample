<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	th{text-align: left;}
	.error{color: red;}
</style>
</head>
<body>
	<sf:form method="post" modelAttribute="account"
		enctype="multipart/form-data">
		<fieldset>
			<table cellpadding="0">
				<tr>
					<th><sf:label path="userName">User Name: </sf:label></th>
					<td><sf:input path="userName" size="15" /><small
						id="username_msg">No spaces, please.</small><br /> <sf:errors cssClass="error"
							path="userName" /></td>
				</tr>
				<tr>
					<th><sf:label path="email">Email: </sf:label></th>
					<td><sf:input path="email" size="30" /><small>In case
							you forget something</small><br /> <sf:errors cssClass="error"  path="email" /></td>
				</tr>
				<tr>
					<th><sf:label path="password">Password: </sf:label></th>
					<td><sf:input path="password" size="30" /><small>6
							characters or more (be tricky!)</small><br /> <sf:errors cssClass="error"
							path="password" /></td>
				</tr>
				<tr>
					<th><label for="image">Profile image:</label></th>
					<td><input name="image" type="file" />
				</tr>
				<tr>
					<th></th>
					<td>
						<input name="commit" type="submit" value="I accept. Create my account."/>
					</td>
				</tr>
			</table>
		</fieldset>
	</sf:form>
</body>
</html>