<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	    <title>大众点评后台管理</title>
	    <link rel="stylesheet" type="text/css" href="<%=basepath%>/static/css/login.css" />
	    <link rel="stylesheet" type="text/css" href="<%=basepath%>/static/css/jquery.validate.css" />
	    <script src="<%=basepath%>/static/js/common/jquery-1.8.3.js" type="text/javascript"></script>

	 
	</head>
	<body>
		<div class="main">
		    <div class="header hide"></div>
		    <div class="content">
		        <div class="title hide"></div>
		        <form id="mainForm" method="post" action="checkLogin">
		            <fieldset>
		                <div class="input">
		                    <input class="input_all name" name="name" id="name" placeholder="用户名" type="text" onFocus="this.className='input_all name_now';" onBlur="this.className='input_all name'"/>
		                </div>
		                <div class="input">
		                	<!-- <input type="hidden" name="password" id="password_md5"/> -->
		                    <input class="input_all password" id="password" name="password" type="password" placeholder="密码" onFocus="this.className='input_all password_now';" onBlur="this.className='input_all password'"/>
		                </div>
		                <div class="checkbox">
		                    <input type="checkbox" name="remember" id="remember" /><label for="remember"><span>记住密码</span></label>
		                </div>
		                <div class="enter">
		                    <input class="button hide" type="submit" id="submit_login" value="登录" />
		                </div>
		            </fieldset>
		        </form>
		    </div>
		</div>
	</body>
</html>