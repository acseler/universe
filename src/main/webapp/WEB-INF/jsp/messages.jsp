<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>First JSP</title>
    <link rel="stylesheet" href="/pages/css/bootstrap.min.css">
    <link rel="stylesheet" href="/pages/css/style.css"/>
    <meta name="viewport" content="width=device-width,
									initial-scale=1.0,
									maximum-scale=1.0,
									user-scalable=no">
</head>

<body>

<div class="container">
    <jsp:include page="patterns/header.jsp"/>
    <div class="row">
        <jsp:include page="patterns/navigation.jsp"/>
        <div class="col-lg-8 col-md-8 margin-10">
            <div class="row">
                <div class="row border-of-entity">
                    <div class="h4 text-center">You have ${messageInfo.messCount} new messages</div>
                </div>

                <c:forEach items="${messages}" var="message">
                    <div class="row">
                        <div class="border-of-entity col-md-12">
                            <div class=" col-md-3 padding-0">
                                <%--<img src="${message.base64}" alt="" width="128" height="128"--%>
                                     <%--class="img-responsive img-rounded left"/>--%>
                            </div>
                            <div class="col-md-5">
                                <h3 class="text-left margin-0">${message.textMessage}</h3>
                            </div>
                            <div class="col-md-4">
                                <button type="button" class="col-md-12 btn btn-primary">
                                    Answer
                                </button>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
<script src="/pages/scripts/jquery-1.11.3.min.js"></script>
<script src="/pages/scripts/bootstrap.min.js"></script>
<script src="/pages/scripts/script.js"></script>
</body>
</html>
