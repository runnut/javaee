var pageBox = {
	jump:function(href){
		
		if(href == undefined || !/\d+/.test(href)){
			return;
		}
		
		var url = window.location.href;
		var page_indexs = $(".page_index");
		
		var re = url.match(/([?&]current_page=)(\w*)/);
		if(re != null){
			href = url.replace(re[0], re[1] + href);
		}else{
			if(url.indexOf("?") >= 0){
				href = url + "&current_page=" + href;
			}else{
				href = url + "?current_page=" + href;
			}
		}
		
		window.location.href = href;
	}
}
$(document).ready(function(){
	
	var url = window.location.href;
	var page_indexs = $(".page_index");
	
	for(var i = 0; i < page_indexs.length; i++){
		var href = $(page_indexs[i]).attr("href");
		var re = url.match(/([?&]current_page=)(\w*)/);
		if(re != null){
			href = url.replace(re[0], re[1] + href);
		}else{
			if(url.indexOf("?") >= 0){
				href = url + "&current_page=" + href;
			}else{
				href = url + "?current_page=" + href;
			}
		}
		$(page_indexs[i]).attr("href", href);
	}
	
});
