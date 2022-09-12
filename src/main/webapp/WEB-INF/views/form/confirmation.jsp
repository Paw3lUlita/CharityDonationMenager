<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 12.09.2022
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="${pageContext.request.contextPath}/resources/css/style.css"/>" />
</head>
<body>

<header class="header--form-page">
    <nav class="container container--70">
        <ul class="nav--actions">
            <li class="logged-user">
                Witaj Agata
                <ul class="dropdown">
                    <li><a href="#">Profil</a></li>
                    <li><a href="#">Moje zbiórki</a></li>
                    <li><a href="#">Wyloguj</a></li>
                </ul>
            </li>
        </ul>

        <ul>
            <li><a href="index.html" class="btn btn--without-border active">Start</a></li>
            <li><a href="index.html#steps" class="btn btn--without-border">O co chodzi?</a></li>
            <li><a href="index.html#about-us" class="btn btn--without-border">O nas</a></li>
            <li><a href="index.html#help" class="btn btn--without-border">Fundacje i organizacje</a></li>
            <li><a href="index.html#contact" class="btn btn--without-border">Kontakt</a></li>
        </ul>
    </nav>




    <div class="slogan container container--90">

        <h2>


            Dziękujemy za przesłanie formularza Na maila prześlemy wszelkie
            informacje o odbiorze.
        </h2>

    </div>


</header>

<div class="slogan">
<h3>
Podsumowanie Twojej darowizny

<div class="form-section">
    <h4>Oddajesz:</h4>
    <ul>
        <li>
            <span class="icon icon-bag"></span>
            <span class="summary--text"
            >Ilość worków: ${donation.quantity}</span
            >
        </li>

        <li>
            <span class="icon icon-hand"></span>
            <span class="summary--text"
            >Nazwa fundacji: ${donation.institution.name}</span
            >
        </li>
    </ul>
</div>

<div class="form-section form-section--columns">
    <div class="form-section--column">
        <h4>Adres odbioru:</h4>
        <ul>
            <li>${donation.street}</li>
            <li>${donation.city}</li>
            <li>${donation.zipCode}</li>

        </ul>
    </div>

    <div class="form-section--column">
        <h4>Termin odbioru:</h4>
        <ul>
            <li>${donation.pickUpDate}</li>
            <li>${donation.pickUpTime}</li>
            <li>${donation.pickUpComment}</li>
        </ul>
    </div>


</div>

</h3>

</div>



<jsp:include page="footer.jsp"/>
<script src="<c:url value="${pageContext.request.contextPath}/resources/js/app.js"/>"></script>
</body>
</html>

