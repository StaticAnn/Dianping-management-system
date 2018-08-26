




/**
 * 方法描述:单击菜单（页面上部菜单），初始化子菜单（即页面左部菜单）
 */
function clickMenu(element,id) {
	// 将同级节点的[选中样式]清空
	$("#menuDiv").children().attr("class","");

	// 将当前单击的节点置为[选中样式]
	$(element).attr("class","on");
	if(id=="subMenuDiv1"){
		
		$('#subMenuDiv2').attr("style","display:none");
		$('#subMenuDiv3').attr("style","display:none");
		// 加载子菜单内容
		$('#subMenuDiv1').attr("style","display:block");
	}
	if(id=="subMenuDiv2"){
		
		$('#subMenuDiv1').attr("style","display:none");
		$('#subMenuDiv3').attr("style","display:none");
		// 加载子菜单内容
		$('#subMenuDiv2').attr("style","display:block");
	}
	if(id=="subMenuDiv3"){
	
		$('#subMenuDiv2').attr("style","display:none");
		$('#subMenuDiv1').attr("style","display:none");
		// 加载子菜单内容
		$('#subMenuDiv3').attr("style","display:block");
	}

}

/**
 * 方法描述:单击子菜单（页面左部菜单），初始化主页面
 */
function clickSubMenu(element) {
	// 将其他有[选中样式]的节点的样式清空
	$("#subMenuDiv1").find(".on").attr("class","");
	$("#subMenuDiv2").find(".on").attr("class","");
	$("#subMenuDiv3").find(".on").attr("class","");
	// 将当前单击的节点置为[选中样式]
	$(element).children().attr("class","on");
	// 按指定地址加载主页面(iframe)
	$("#mainPage").attr("src",$("input[name='basepath']").val()+"/getAdList");
}

function clickSubMenu1(element) {
	// 将其他有[选中样式]的节点的样式清空
	$("#subMenuDiv2").find(".on").attr("class","");
	$("#subMenuDiv").find(".on").attr("class","");
	$("#subMenuDiv3").find(".on").attr("class","");
	// 将当前单击的节点置为[选中样式]
	$(element).children().attr("class","on");
	// 按指定地址加载主页面(iframe)
	$("#mainPage").attr("src",$("input[name='basepath']").val()+"/getBusList");
}

function clickSubMenu2(element) {
	// 将其他有[选中样式]的节点的样式清空
	$("#subMenuDiv2").find(".on").attr("class","");
	$("#subMenuDiv").find(".on").attr("class","");
	$("#subMenuDiv3").find(".on").attr("class","");
	// 将当前单击的节点置为[选中样式]
	$(element).children().attr("class","on");
	// 按指定地址加载主页面(iframe)
	$("#mainPage").attr("src",$("input[name='basepath']").val()+"/showComment");
}

function clickSubMenu3(element) {
	// 将其他有[选中样式]的节点的样式清空
	$("#subMenuDiv2").find(".on").attr("class","");
	$("#subMenuDiv").find(".on").attr("class","");
	$("#subMenuDiv2").find(".on").attr("class","");
	// 将当前单击的节点置为[选中样式]
	$(element).children().attr("class","on");
	// 按指定地址加载主页面(iframe)
	$("#mainPage").attr("src","<%=basepath%>/WEB-INF/jsp/content/orderList.html");
}


/**
* 打开密码修改弹出层
*/
function openAddDiv(){
	$("#mengban").css("visibility","visible");
	$(".wishlistBox").show();
	$(".wishlistBox").find(".persongRightTit").html("&nbsp;&nbsp;修改密码");
	$("#submitVal").show();
}

/**
* 关闭密码修改弹出层
*/
function closeDiv(){
	$("#mengban").css("visibility","hidden");
	$("#oldPassword").val("");
	$("#newPassword").val("");
	$("#newPasswordAgain").val("");
	$(".wishlistBox").hide();
}