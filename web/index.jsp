<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <link type="text/css" rel="stylesheet" href="/TallerStruts2/css/styles.css" media="all">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js"></script>
        <script src="/TallerStruts2/js/scripts.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="validar">
            <s:textfield name="us.nombre" label="Ingresar usuario"/>
            <s:password name="us.pass" label="Ingresar password"/>
            <s:submit label="Ingresar"/>
        </s:form>
    </body>
</html>
