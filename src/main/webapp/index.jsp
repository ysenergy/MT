<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<style type="text/css">
body {
	text-align: center
}

.main {
	height: 100%;
	width: 1000px;
	margin-left: auto;
	margin-right: auto;
	margin-top: 30px;
	background-color: #DDDDFF;
}
</style>
</head>
<script type="text/javascript">
	var count = 1;
	function btnClick() {
		var html = "";
		if (count == 1) {
			html = '<p style="font-size:30px;">你果然点击了我!</p>';

		} else if (count == 2) {
			html = '<p style="font-size:30px;">你又点击了我!</p>';

		} else if (count == 3) {
			html = '<p style="font-size:30px;">刘苏敏你都第三次点击我了,别再点了啊!</p>';
		} else if (count == 4) {
			html = '<p style="font-size:30px;">真不乖，又点我了.好吧，再点一次我让你看个东西!</p>';
		} else if (count == 5) {
			$("#picId").show();
		} else {
			$("#picId").hide();
			$("#pId").html('');
			count = 0;

		}
		$("#pId").append(html);
		count++;
	}
</script>
<body>
	<div class="main">
		<button class="btn btn-default" onclick="btnClick();" style="width: 70%; height: 100px;">
			<font size="20px;">你快点击我咯</font>
		</button>
		<div id="pId" style="margin-top: 7%;"></div>
		<div id="picId" style="display: none;">
			<img alt="pic" src="images/1001.jpg">
		</div>
	</div>
</body>
</html>