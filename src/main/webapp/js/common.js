var HrManager ={
	sendAjaxPut:function(url,pdata,callback){
		 pdata._method='put';
		 $.ajax({
             url:url,
             data:pdata,
             dataType:'json',
             method:'POST',
             success:callback
         })
	},
	sendAjaxDelete:function(url,pdata,callback){
		 pdata._method='delete';
		 $.ajax({
            url:url,
            data:pdata,
            dataType:'json',
            method:'POST',
            success:callback
        })
	},
	sendAjaxPost:function(url,pdata,callback){
		 $.ajax({
            url:url,
            data:pdata,
            dataType:'json',
            method:'POST',
            success:callback
        })
	},
	sendAjaxGet:function(url,pdata,callback){
		 $.ajax({
            url:url,
            data:pdata,
            dataType:'json',
            method:'GET',
            success:callback
        })
	}
}

function sendJsonp(url,data,huidiao){
    $.ajax({
        url: url,
        data:data,
        type: "post",
        dataType: "json",
        jsonp:"callback",
        jsonpCallback:huidiao
    });
}
