<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>KH 커뮤니티</title>

<!-- fontawesome라이브러리추가 다양한 아이콘을 지원함.(EX) 검색용 돋보기 버튼) -->
<script src="https://kit.fontawesome.com/a2e8ca0ae3.js"
	crossorigin="anonymous"></script>

</head>
<body>

	<form action="/breaktime/detail" method="get">
		<input type="hidden" name="category" value="B02010100" id="관광호텔">
		<button type="submit">이동</button>
	</form>
	
	<form action="/breaktime/detail" method="get">
		<input type="hidden" name="category" value="B02010500" id="리조트">
		<button type="submit">이동</button>
	</form>
	
	<form action="/breaktime/detail" method="get">
		<input type="hidden" name="category" value="B02010700" id="모텔">
		<button type="submit">이동</button>
	</form>
	
	<form action="/breaktime/detail" method="get">
		<input type="hidden" name="category" value="B02010900" id="펜션">
		<button type="submit">이동</button>
	</form>

</body>
</html>