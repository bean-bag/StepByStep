<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><script>
  $(function () {
    $('#example2').DataTable({
      'paging'      : true,
      'lengthChange': false,
      'searching'   : false,
      'ordering'    : true,
      'info'        : true,
      'autoWidth'   : false,
      "processing"	: true,
      "serverSide"	: true,
      "ajax"		: "<%=request.getContextPath()%>/dt_list.let",
      "columns": [
    	  {"data":"engine"},
    	  {"data":"browser"},
    	  {"data":"platform"},
    	  {"data":"engineVersion"},
    	  {"data":"grade"}
      ]
    })
  })
</script>