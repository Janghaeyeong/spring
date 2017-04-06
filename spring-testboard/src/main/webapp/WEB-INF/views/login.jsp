<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>login Form</title>
</head>
<body>
	<div class="container">
		<form action="login.ss" method="post" >
			<div class="form-group">
				<label>id</label>
				<input type="text" name="id" class="form-control">
			</div>
			<div class="form-group">
				<label>pwd</label>
				<input type="text" name="pwd" class="form-control">
			</div>
			<div class="text-right">
				<button type="submit" class="btn btn-primary btn-xs">로그인</button>
			</div>
		</form>
	</div>
</body>
</html>