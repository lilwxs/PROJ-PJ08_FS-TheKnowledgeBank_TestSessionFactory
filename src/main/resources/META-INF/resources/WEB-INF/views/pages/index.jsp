<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <jsp:include page="../includes/head.jsp"/>
    <title>${title}</title>
</head>
<body>
<div class="flex h-screen w-full flex-col">
    <div class="relative isolate flex h-screen w-full flex-col overflow-hidden">
        <div
                class="absolute inset-x-0 -top-40 -z-10 transform-gpu overflow-hidden blur-3xl sm:-top-80"
                aria-hidden="true"
        >
            <div class="relative left-[calc(50%-11rem)] aspect-[1155/678] w-[36.125rem] -translate-x-1/2 rotate-[30deg] bg-gradient-to-tr from-[#ff80b5] to-[#9089fc] opacity-10 sm:left-[calc(50%-30rem)] sm:w-[72.1875rem]"></div>
        </div>
        <jsp:include page="../includes/header.jsp"/>
        <div class="flex flex-1 overflow-hidden">
            <aside class="hidden flex-col justify-between overflow-y-auto px-4 py-2 lg:flex ring-1 ring-gray-200/80">
                <jsp:include page="../includes/sidebar.jsp"/>
                <jsp:include page="../includes/footer.jsp"/>
            </aside>
            <main class="flex flex-1 overflow-y-auto px-10 md:px-12">
                <div id="content" class="w-full">
                    <c:choose>
                        <c:when test="${not empty users}">
                            <c:forEach items="${users}" var="item">
                                <div class="flex items-center gap-x-4 ring-1 ring-gray-200/80 rounded-lg">
                                    <span>${item}</span>
                                    <span>${item.username}</span>
                                    <a href="/delete?id=${item.id}">Delete</a>
                                </div>
                            </c:forEach>
                        </c:when>
                        <c:otherwise>
                            <jsp:include page="../fragments/documentation/document.jsp"/>
                        </c:otherwise>
                    </c:choose>
                    <form action="/save" method="post">
                        <input type="text" name="firstName" placeholder="First name">
                        <input type="text" name="lastName" placeholder="Last name">
                        <input type="text" name="username" placeholder="Username">
                        <input type="text" name="email" placeholder="Email">
                        <input type="password" name="password" placeholder="Password">
                        <input type="text" name="role" placeholder="Role">
                        <button type="submit">Submit</button>
                    </form>
                </div>
            </main>
        </div>

        <div
                class="absolute inset-x-0 top-[calc(100%-13rem)] -z-10 transform-gpu overflow-hidden blur-3xl sm:top-[calc(100%-30rem)]"
                aria-hidden="true"
        >
            <div class="relative left-[calc(50%+3rem)] aspect-[1155/678] w-[36.125rem] -translate-x-1/2 bg-gradient-to-tr from-[#ff80b5] to-[#9089fc] opacity-10 sm:left-[calc(50%+36rem)] sm:w-[72.1875rem]"></div>
        </div>
    </div>
</div>
</body>
</html>