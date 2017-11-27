                                                function setCurrentDate ()
{
	var currentDate=document.getElementById('currentDate');
	var today=new Date();
	currentDate.innerHTML=today.getDate()+"-"+(parseInt(today.getMonth())+1)+"-"+today.getFullYear();

	var currentDate=document.getElementById('currentTime');
	var strHours=today.getHours();
	if (strHours<10)
		strHours="0"+strHours;
	var strMinutes=today.getMinutes();
	strMinutes=strMinutes<10?"0"+strMinutes:strMinutes;
	var strSeconds=today.getSeconds();
	strSeconds=strSeconds<10?"0"+strSeconds:strSeconds;

	currentTime.innerHTML=strHours+
	":"+strMinutes+
	":"+strSeconds;
}

function run ()
{
	setInterval(setCurrentDate, 1000)
}

function changedBirthDate ()
{
	var birthDate=document.getElementById('BIRTH');

	var objectDate=new Date(birthDate.value);

	var day=objectDate.getDate();
	var month=objectDate.getMonth()+1;
	var year=objectDate.getFullYear();

	var today=new Date();
	var currDay=today.getDate();
	var currMonth=today.getMonth()+1;
	var currYear=today.getFullYear();
    
    
     if (month==1) { 
                if (day <=20) document.getElementById('mes').innerHTML="vodnar";
else document.getElementById('mes').innerHTML="kozorozec"; 
} 
    
    
                               if (month==2) { 
                 if((day>20) && (day<=29 )) document.getElementById('mes').innerHTML="blizenci";
if (day<=20) document.getElementById('mes').innerHTML="ryby";
    
                      } 
                      
                      
                            if (month==3) { 
                      
                      if (day<=20) document.getElementById('mes').innerHTML="ryby";
if ((day>20) && (day<=31)) document.getElementById('mes').innerHTML="baran";
                           } 
    
                               if (month==4) {    
                          if (day<=20) document.getElementById('mes').innerHTML="baran";
if  ((day>20) &&  (day<=30)) document.getElementById('mes').innerHTML="byk";
    
                                } 
                                
                                
                          if (month==5) {         
                              if (day<=20)  document.getElementById('mes').innerHTML="byk";
if  ((day>20) &&  (day<=31)) document.getElementById('mes').innerHTML="blizenci";
                                
    
                          } 
                       if (month==6) {
                          
                          if (day<=20) document.getElementById('mes').innerHTML="blizenci";
if  ((day>20) &&  (day<=31)) document.getElementById('mes').innerHTML="rak";
                              } 
                              
                              
                               if (month==7) {
                              
              if (day<=20) document.getElementById('mes').innerHTML="rak";
if  ((day>23) &&  (day<=31)) document.getElementById('mes').innerHTML="lev";
                              
                              } 
                              
                              
                              
                  if (month==8) {
                  
                  if (day<=22) document.getElementById('mes').innerHTML="lev";
if  ((day>23) &&  (day<=30)) document.getElementById('mes').innerHTML="panna";

                             }  
                             
                             
                             
                       
                  if (month==9) {                  
                            if (day<=22) document.getElementById('mes').innerHTML="panna";
if  ((day>23) &&  (day<=31)) document.getElementById('mes').innerHTML="vahy";
                             
                           }    
                             
                             
                   if (month==10) {        
                             
                 if (day<=23) document.getElementById('mes').innerHTML="vahy";
if  ((day>23) &&  (day<=30)) document.getElementById('mes').innerHTML="skorpion";           
                                     
     }
     
     
            if (month==11) {   
    

if (day<=23) document.getElementById('mes').innerHTML="strelec";
if  (day>23 &&  day<=30) document.getElementById('mes').innerHTML="kozorozec";

                      }
 
    
                    if (month==12) { 
               if (a<=22)  document.getElementById('mes').innerHTML="kozorozec";
if  ((a>23) &&  (a<=31))  document.getElementById('mes').innerHTML="vodnar";                                                                                   
                     }
    

	if (today<objectDate)
	{
		document.getElementById('ERROR').innerHTML="Invalid birth date";
		document.getElementById("currentAge").innerHTML="";
		document.getElementById('happyBirthday').innerHTML="";
		return;
	}
	else 
		document.getElementById('ERROR').innerHTML="";

	var age;
	if (currMonth>month)
		age=currYear-year;

	if (currMonth<month)
		age=currYear-year-1;

	if (currMonth==month)
	{
		if (day>currDay)
			age=currYear-year-1;
		else age=currYear-year;
	}
              
              
         	document.getElementById("currentAge").innerHTML="You are "+age+" years old.";	     
              
              
      	                      
                                
         var weekday = new Array(7);
    weekday[0] = "Sunday";
    weekday[1] = "Monday";
    weekday[2] = "Tuesday";
    weekday[3] = "Wednesday";
    weekday[4] = "Thursday";
    weekday[5] = "Friday";
    weekday[6] = "Saturday";

    var n = weekday[objectDate.getDay()];
    document.getElementById("den").innerHTML = n;
             
            
            
             if (currMonth==month && currDay==day)        
                                   
 document.getElementById("happyBirthday").style.backgroundImage = "url('torta.jpg')";
  
          
            
             
   
           }