function initsession(){
	var a = document.getElementById("username").value.length;
	var b = document.getElementById("password").value.length;
	
	if(a == 0 && b ==0){
		alert("Please, complete all the fields");
		return false;
	}else{
		if(validateUser(document.getElementById("username").value,"Please complete the field username")){
			if(validatePassword(document.getElementById("password").value.length,6,8)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}


var validateUser = function(element,message){
	if(element.length!=""){
		return true;
	}else{
		alert(message);
		return false;
	}
};
function validatePassword(element, min, max){
	if(element >= min && element <= max){
		return true;
	}else{
		alert("Please enter between " +min+ " and " +max+ " characters");
		return false;
	}
}




/* JQUERY VALIDATE
$(function() {
	  
    // Setup form validation on the #register-form element
    $("#session").validate({
    
        // Specify the validation rules
        rules: {
            username: "required",
            password: {
                required: true,
                minlength: 6
             
            }
           
        },
        
        // Specify the validation error messages
        messages: {
            username: "Please enter your username",
            password: {
                required: "Please provide a password",
                minlength: "Your password must be at least 6 characters long"
               
            }
        },
        
        submitHandler: function(form) {
            form.submit();
        }
    });

  });
  	*/