<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Add Product</h1>
            <p class="lead">Fill the below information to add a product</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/admin/product/addProduct" method="post" commandName="product" enctype="multipart/form-data">
            <div class="form-group">
                <label for="name">Name</label> <form:errors path="productName" cssStyle="color:#ff0000;"/>
                <form:input path="productName" id="name" class="form-control" />
            </div>
        <div class="form-group">
            <label for="category">Category</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="instrument"/>Instrument </label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="record"/>Record </label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="accessory"/>Accessory </label>
        </div>

        <div class="form-group">
            <label for="description">Description</label>
            <form:textarea path="productDescription" id="description" class="form-control" />
        </div>

        <div class="form-group">
            <label for="price">Price</label> <form:errors path="productPrice" cssStyle="color:#ff0000;"/>
            <form:input path="productPrice" id="price" class="form-control" />
        </div>

        <div class="form-group">
            <label for="condition">Category</label>
            <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="new"/>New </label>
            <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="used"/>Used </label>
        </div>

        <div class="form-group">
            <label for="status">Status</label>
            <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="active"/>Active </label>
            <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="inactive"/>Inactive </label>
        </div>

        <div class="form-group">
            <label for="unitStock">Unit in Stock</label> <form:errors path="unitStock" cssStyle="color:#ff0000;"/>
            <form:input path="unitStock" id="unitStock" class="form-control" />
        </div>

        <div class="form-group">
            <label for="manufacturer">Product Manufacturer</label>
            <form:input path="productManufacturer" id="manufacturer" class="form-control" />
        </div>

        <div class="form-group">
            <label class="control-label" for="productImage">Upload Picture</label>
            <form:input path="productImage" id="productImage" type="file" class="form:input-large"/>
        </div>
        <br/>
        <input type="submit" value="Submit" class="btn btn-default">
        <a href="<c:url value="/admin/productInventory"/> " class="btn btn-default">Cancel</a>
        </form:form>
<%@include file="/WEB-INF/views/template/footer.jsp" %>