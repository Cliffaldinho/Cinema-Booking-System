/**
 * 
 */

//validates form
function Validating() {
	
	//initializes variable to store userID entered
	var Name;
	//stores userID in variable Name
	Name=document.getElementById("username");
	
	//initializes variable to store security code entered
	var SecurityEntered;
	//stores security code in variable SecurityEntered
	SecurityEntered = document.getElementById("entersecurity");
	
	//initializes variable to store email entered
	var EmailEntered;
	//stores email in variable EmailEntered
	EmailEntered = document.getElementById("mail");
	
	//initializes variable to return boolean result. 
	//set to true initially. If form not validates then return false.
	var resultStatus;
	resultStatus=true;
	
	//initializes an error message
	var message;
	message="The following errors were detected:\n";
	
	//if the userID is null
	if(!Name) {
		
		//set resultStatus to false
		resultStatus=false;
		
		//send out error message
		message=message+"Could not find input with id 'username'.\n";
		alert(message);
	}
	
	//if the security code entered is null
	if(!SecurityEntered) {
		
		//set resultStatus to false
		resultStatus=false;
		
		//send out error message
		message=message+"Could not find input with id 'entersecurity'.\n";
		alert(message);
	}

	//if the email entered is null
	if(!EmailEntered) {
		
		//set resultStatus to false
		resultStatus=false;
		
		//send out error message
		message=message+"Could not find input with id 'mail'.\n";
		alert(message);
	}
	
	//if userID, security code, and email entered are all not null
	if(resultStatus) {
		
		//initialize a variable to store value of userID
		var nameValue=Name.value;
		
		//test value of userID to see if it only has alphabets
		//Both uppercase and lowercase allowed.
		var theName=/[a-z]/i.test(nameValue);
		
		//initializes a variable to store value of security code entered
		var securityValueEntered=SecurityEntered.value;
		
		//initializes a variable to store value of email entered
		var emailValue=EmailEntered.value;
		
		//if test result of only uppercase and lowercase for userId, fails
	if(theName==false) {
			
		//sends out message to use alphabets only
		alert("Please enter UserID using alphabets only.");
		
		//set resultStatus to false
		resultStatus=false;
		}

	
	//if security code entered is not same as the security code generated
		if(securityValueEntered!==characters) {
		
			//send out message that wrong security code entered
			alert("Wrong security code. Please try again.")
			
			//set resultStatus to false
			resultStatus=false;
		}
		
	}
	
	//return resultStatus
	//if false from any of the above tests, form not submitted
	//if all tests passed, resultStatus true, form submitted to formInfo.java's doGet method,
	//containing details from booking.html
	return resultStatus;
}