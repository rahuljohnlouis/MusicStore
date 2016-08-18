<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <section class="jumbotron">
            <div class="container">
                <h1 class="alert alert-danger">Checkout cancelled</h1>
                <p>Your checkout process is cancelled. You may continue shopping.</p>
            </div>
        </section>

        <section class="container" >
            <p>
                <a href="<c:url value="/product/productList"/>" class="btn btn-default">Products</a>
            </p>
        </section>
    </div>
</div>

<%@include file="/WEB-INF/views/template/footer.jsp"%>