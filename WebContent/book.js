/**
 * 
 */
/*id= $("#aid").text();
        	name= $("#aname").text();
        	price= $("#aprice").text();*/
        	
function getDetails(){
	jQuery.ajax({
        url: "http://localhost:8080/book_service/rest/books/" + $("#id").val(),
        type: "GET",
        contentType: "application/json",  
        dataType:'json',
        success: function(data, textStatus, errorThrown) {
            //here is your json.
              // process it
        	  $("#title").text(data.title);
        	  $("#price").text(data.price);

        },
        error : function(jqXHR, textStatus, errorThrown) {
        		$("#title").text("Sorry! Book not found!");
        		$("#price").text("");
        },
        timeout: 120000,
    });
};

function addBooks(){
	jQuery.ajax({
        url: "http://localhost:8080/book_service/rest/books/addbook",
        type: "POST",
        
        data: { 
            'name': $("#aname").val(), 
            'price': $("#aprice").val() 
        },
        success: function(data, textStatus, errorThrown) {
            //here is your json.
              // process it
        	 $("#addB").text("Successfully added");
        	
        	 
        },
        error : function(jqXHR, textStatus, errorThrown) {
        	 $("#addB").text("error");
        },
        timeout: 120000,
    });
};

function deletBooks(){
	jQuery.ajax({
        url: "http://localhost:8080/book_service/rest/books/removebook/" + $("#delid").val(),
        type: "DELETE",
        success: function(data, textStatus, errorThrown) {
          	  $("#deleteB").text("Book removed");

        },
        error : function(jqXHR, textStatus, errorThrown) {
        	$("#deleteB").text("Error");
        },
        timeout: 120000,
    });
};