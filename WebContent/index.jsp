<%@ page import="net.halloleo.basicwebapp.MyDataStore"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Basic Web App to show how to generate a WAR file</title>
</head>

<body>
    <%	MyDataStore myStore = (MyDataStore)getServletContext().getAttribute("myStore");%>
    <h1>Basic Web App to show how to generate a WAR file</h1>
    Hello <%= dbQuery.getConnectInfo()%>
</body>
</html>

    
