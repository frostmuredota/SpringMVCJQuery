$(document).ready(function() {

	failpasslength = "Please length between 4 to 30";
	failuserlength = "Please length between 4 to 30";
	failpassvalues = "Please use alphanumerics characters";
	failalphanumerics = "Please use alphanumerics values";
	failinput = "Please fill out in this field";

	var username = $('#username');
	var pass = $('#password');
	$('#l1').css("color", "red");
	$('#l2').css("color", "red");
	$('input:text').click(function() {
		//$('#l1').css("color", "red").fadeOut(500);
		$('#l1').css("color", "red").hide();
	});

	// Change the color to inputs type password
	$('input:password').click(function() {
		//$('#l2').css("color", "red").fadeOut(500);
		$('#l2').css("color", "red").hide();
	});

	$("#session").submit(function() {
		if ((username.val() == "") && (pass.val() == "")) {
			$("#l1").text(failinput);
			$("#l2").text(failinput);
			$('#l1').show();
			$('#l2').show();
			
			return false;
		} else {
			var regx = /^([a-zA-Z0-9])+/;
			if((username.val().length > 4) && (username.val().length < 30)){
				if(regx.test(username.val())){
					if((pass.val().length > 4) && (pass.val().length < 30)){
						return true;
					}else{
						$("#l2").text(failpasslength);
						$('#l2').show();
						//$('#l1').show();
						return false;
					}
				}else{
					
					$("#l1").text(failalphanumerics);
					$('#l1').show();
					$('#l2').show();
					return false;
				}
				
			}else{
				
				$("#l1").text(failuserlength);
				$('#l1').show();
				$('#l2').show();
				return false;
			}
			return false;
		}

	});

});

/*
 * $(":input").focus(function(){ if ($(this).hasClass("fail") ) {
 * $(this).val(""); $(this).removeClass("fail"); } }); /* JQUERY VALIDATE
 * $(function() { // Setup form validation on the #register-form element
 * $("#session").validate({ // Specify the validation rules rules: { username:
 * "required", password: { required: true, minlength: 6 } }, // Specify the
 * validation error messages messages: { username: "Please enter your username",
 * password: { required: "Please provide a password", minlength: "Your password
 * must be at least 6 characters long" } },
 * 
 * submitHandler: function(form) { form.submit(); } });
 * 
 * });
 */