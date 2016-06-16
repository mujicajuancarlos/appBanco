$(document).ready(function() {
		$('#submit').click(function(event) {
			var user = $('#nombre').val();
			var password = $('#apellido').val();
			$.ajax({
                type: "GET",  
                url: "Validation",
                data: "user="+ user +"& password="+ password, 
                success: function(){  
                	window.location.href = "main.jsp"; 
                },
                error: function(XMLHttpRequest, textStatus, errorThrown) { 
                	$( "#error" ).html( errorThrown ); 
                }       
            });
		});
	});