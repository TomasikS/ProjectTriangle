(function($) {

var persons = new  Array();

	$("#submit").click(function(event){
		var error = false;
		var fName = $("#fName").val();
		if(fName.trim().length<2){
			$("#errfname").html("Invalid first name");
			error = true;
		}
		else {
			$("#errfname").html("");
		}

		var lName = $("#lName").val();
		if(lName.trim().length<2){
			$("#errlname").html("Invalid last name");
			error = true;
		}
		else {
			$("#errlname").html("");
		}	
	});

	$("#fName").keyup(function(){
		var fName = $("#fName").val();
		if(fName.trim().length()>1){
			$("#errfname").html("");
		}
	});
	$("#lName").keyup(function(){
		var lName = $("#lName").val();
		if(lName.trim().length()>1){
			$("#errlname").html("");
		}
	});
	
	var width = $(".getSizeFromInput").css("width");
	$(".setSize").css({"width" : wdth});

 

 function ProcessInputData(){
                var person = new Object();
                person.fname = $("#fName").val();
                person.lname = $("#lName").val();
                person.date = $("#compareDate").val();
                person.gender = $("input[name='gender']:checked").val();
                console.log(person);
                persons.push(person);
                printTable();
            };
            ProcessInputData();

function printTable(){
                if(persons.length>0){
                    var divTable=$('.table');
                    divTable.empty();
                    var table=$("<table/>");
                    var line=$("<tr/>");
                    var col1=$("<th/>");
                    $(col1).append('First name');
                    var col2=$("<th/>");
                    $(col2).append('Last name');
                    var col3=$("<th/>");
                    if(CheckEdge)$(col3).append('Age');
					else $(col3).append('Date of birth');
					
                    var col4=$("<th/>");
                    $(col4).append('Gender');
                    var col5=$("<th/>");
                    $(col5).append('Delete');
                    line.append(col1);
                    line.append(col2);
                    line.append(col3);
                    line.append(col4);
                    line.append(col5);
                    table.append(line);
                    divTable.append(table);
                }


})


(function IsCheckAge(){
if ($"showage")	
	
})





(jQuery);



