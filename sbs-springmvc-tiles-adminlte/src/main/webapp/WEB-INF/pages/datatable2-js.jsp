<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><script>
  $(function () {
    var dt = $('#example2').DataTable({
      'paging'      : true,
      'lengthChange': false,
      'searching'   : false,
      'ordering'    : true,
      'info'        : true,
      'autoWidth'   : false,
      "processing"	: true,
      "serverSide"	: true,
      "ajax"		: {
    	  "url"		: "<%=request.getContextPath()%>/dt_list2.let",
    	  "method"	: "POST",
    	  "headers" : {"Content-Type": "application/json"},
    	  "data"	: function(d){
    		  return JSON.stringify(d);
    	  }
      },
      "columns": [
    	  {"data":"engine"},
    	  {"data":"browser"},
    	  {"data":"platform"},
    	  {"data":"engineVersion"},
    	  {"data":"grade"},
    	  {
    		  render: function(data, type, row) {
    			  return "<button class=\"btn btn-primary db_edit_btn\">编辑</button>";
    		  }
    	  }
      ]
    });
    
    $("#example2").on("click",".db_edit_btn",function(){
    	debugger;
    	console.log(dt.row($(this)))
    	//alert("111");
    });
  })
</script>