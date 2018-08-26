<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
		<title></title>
		<link rel="stylesheet" type="text/css" href="<%=basepath%>/static/css/all.css">
		<link rel="stylesheet" type="text/css" href="<%=basepath%>/static/css/pop.css">
		<link rel="stylesheet" type="text/css" href="<%=basepath%>/static/css/main.css">
		<script type="text/javascript" src="<%=basepath%>/static/js/common/jquery-1.8.3.js"></script>
		
	</head>
	<body style="background: #e1e9eb;">
		<form action="" id="mainForm" method="post">
	
			<div class="right">
				<div class="current">当前位置：<a href="#">内容管理</a> &gt; 评论查询</div>
				<div class="rightCont">
					<p class="g_title fix">评论列表</p>
					<table class="tab1">
						<tbody>
							<tr>
								<td width="80" align="right">评论内容：</td>
								<td>
									<input name="title" id="title" value="" class="allInput" type="text">
								</td>
	                            <td style="text-align: right;" width="150">
	                            	<input class="tabSub" value="查询" onclick="" type="button">&nbsp;&nbsp;&nbsp;&nbsp;
	                            </td>
	       					</tr>
						</tbody>
					</table>
					<div class="zixun fix">
						<table class="tab2" width="100%">
							<tbody>
								<tr>
								    <th>序号</th>
								    <th>订单号</th>
								    <th>评论星级</th>
								    <th>手机号</th>
								</tr>
								
									<tr>
										<td>1</td>
										<td>123</td>
										<td>5</td>
										<td>13912345678</td>
									</tr>
							</tbody>
						</table>

						<div class="page fix">
							<a href="" class="first">首页</a>
							<a href="" class="pre">上一页</a>
							当前第<span>1/1</span>页
							<a href="" class="next">下一页</a>
							<a href="" class="last">末页</a>
							跳至 &nbsp;<input id="currentPageText" value="1" class="allInput w28" type="text">&nbsp;页 &nbsp;
							<a href="" class="go">GO</a>
						</div>
					</div>
				</div>
			</div>
		</form>
	
</body></html>