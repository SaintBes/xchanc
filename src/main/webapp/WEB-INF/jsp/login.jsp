<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
    <link href="<c:url value='../css/bootstrap.css' />"  rel="stylesheet">
    <link href="<c:url value='../css/app.css' />" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
</head>

<body>
<div id="mainWrapper">
    <div class="login-container">
        <div class="login-card">
            <div class="login-form">
                <%--<c:url var="loginUrl" value="/login" />--%>
                <form action="/j_spring_security_check" method="post" class="form-horizontal">
                   <div class="input-group input-sm">
                        <label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
                        <input type="text" class="form-control" id="username" name="j_username" placeholder="Ім'я користувача" required>
                    </div>
                    <div class="input-group input-sm">
                        <label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label>
                        <input type="password" class="form-control" id="password" name="j_password" placeholder="Пароль" required>
                    </div>
                    <div class="form-actions">
                        <input type="submit"
                               class="btn btn-block btn-primary btn-default" value="Увійти">
                    </div>
                </form>
                <font color="red">
                    <span>${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</span>
                </font>
            </div>
        </div>
    </div>
</div>

</body>
</html>