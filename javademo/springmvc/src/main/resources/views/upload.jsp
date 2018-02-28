<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>

<!doctype html>
<html>
<head>
	<meta charset="UTF-8"/>
	<title>文件上传</title>
</head>
<body>
<h1>文件上传</h1>

<form action="v1/api/uploadText" enctype="multipart/form-data" method="post">
	<input type="file" name="file"/><input type="submit" value="上传">
</form>
</body>
</html>