<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE"/>
		<title></title>
		<link rel="stylesheet" type="text/css" href="<%=basepath%>/static/css/all.css"/>
		<link rel="stylesheet" type="text/css" href="<%=basepath%>/static/css/pop.css"/>
		<link rel="stylesheet" type="text/css" href="<%=basepath%>/static/css/main.css"/>
		<script type="text/javascript" src="<%=basepath%>/static/js/common/jquery-1.8.3.js"></script>
	
	</head>
	<body style="background: #e1e9eb;">
		<form action="" id="mainForm" method="post">
			
			<div class="right">
				<div class="current">当前位置：<a href="#">内容管理</a> &gt; 商户管理</div>
				<div class="rightCont">
					<p class="g_title fix">商户列表</p>
					<table class="tab1">
						<tbody>
							<tr>
								<td align="right" width="80">标题：</td>
								<td>
									<input name="title" id="title" value="" class="allInput" type="text"/>
								</td>
	                            <td style="text-align: right;" width="150">
	                            	<input class="tabSub" value="查询" onclick="" type="button"/>&nbsp;&nbsp;&nbsp;&nbsp;
	                            	
	                            	<input class="tabSub" value="添加" onclick="location.href='businessAdd.html'" type="button"/>
	                            	
	                            </td>
	       					</tr>
						</tbody>
					</table>
					<div class="zixun fix">
						<table class="tab2" width="100%">
							<tbody>
								<tr>
								    <th>序号</th>
								    <th>店名</th>
								    <th>价格</th>
								    <th>城市</th>
								    <th>数量</th>
								    <th>操作</th>
								</tr>
								
							
									<c:forEach items="${busPageList.list}" var="bu">
							
								<tr>
									<td>${bu.id}</td>
									<td>${bu.title}</td>
									<td>${bu.price}</td>
									<td>${bu.city}</td>
									<td>${bu.number}</td>
									<td>
										
										<a  onclick="location.href='<%=basepath%>/adModify'">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
																			
										<a href="javascript:void(0);" onclick="">删除</a>
										
									</td>
								</tr>
						
							</c:forEach>
							
							</tbody>
						</table>
						
			
					</div>
				</div>
			</div>
		</form>
	</body>
</html>