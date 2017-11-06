#include <stdio.h>
#include <string.h>

int main ()
{
	
char array[] = "abcdefghijklmnopqrstuvwxyz" ;
char cisla[] = "0123456789" ;
char pole[] = "ABCDEFGHIJKLMNOPRSTUVWXYZ" ;

char textupper[11] ;
char text[11] ;
char textsmall[11] ;
char textchange[11] ;
char prem[7];


printf("text");
scanf("%s", text);


printf("%s", text);

int counter=0;



for(int i=0; i<strlen(text);i++)

 for(int j=0; j< 26;j++)  if(text[i]==array[j]) counter++;
 
 printf("\n lowercase %d ", counter);
 
 counter=0;
 
 for(int i=0; i<strlen(text);i++)

 for(int j=0; j<= 9;j++)  if(text[i]==cisla[j]) counter++;
 
 
 
  printf("\n cisla %d", counter); 
  
  int ccounter=0;
 
  for(int i=0; i<strlen(text);i++)

 for(int j=0; j< 26;j++)  if(text[i]==pole[j]) ccounter++;
 
 
   printf("\n uppercase in text %d", ccounter);
 
   ccounter=0;
 
 char z;
  for(int i=0; i<strlen(text);i++) {
 

 z=text[i];
if((z>= 'a') && (z<='z')) z=z-32;
 
 if ((z=='A') || (z=='E') ||   (z=='I') ||  (z=='O') ||  (z=='U'))    ccounter++;
 
  }
  printf("\n samohlasky %d", ccounter);
 
  printf("\n od konca");
 
   for(int i=strlen(text);i>=0;i--)
 
   printf(" %c", text[i]);
 
 
char znak;
    for(int i=0;i<=strlen(text);i++){

 znak=text[i];
 
 if((znak>= 'a') && (znak<='z')) znak=znak-32;
 textupper[i]=znak;
 
 	}
 	
 	  printf("\n zmenene");
 
  for(int i=0;i<=strlen(text);i++)
 
   printf(" %c", textupper[i]);
 
 
 
     for(int i=0;i<=strlen(text);i++){

 znak=text[i];
 
 if((znak>= 'A') && (znak<='Z')) znak=znak+32;
 textsmall[i]=znak;
 
 	}
 	
 	  printf("\n zmenene");
 
  for(int i=0;i<=strlen(text);i++)
 
   printf(" %c", textsmall[i]);
 
  	  printf("\n otaznik");
 
 
   for(int i=0;i<=strlen(text);i++)
 
  for(int j=0; j<= 9;j++) 
  
   if(text[i]==cisla[j]) text[i]='?';

    for(int i=0;i<=strlen(text);i++)
    printf(" %c", text[i]);
 
 
 char t;
 
 
    for(int i=0;i<=strlen(text);i++) {

 t=text[i];
 
 if ((t >='A') &&(t <= 'Z')){
 
 
t=t+1; 
 
 
  if (t > 'Z') t=t-26;
 
 	}
 	
 
  if ((t >= 'a') &&(t  <= 'z')){	
 
 
t=t+1; 
 
 
  if (t > 'z') t=t-26;

 
 
 	}
	 
	 putchar(t);
	 
	 	}
	 
	 	 printf(" \n  text");
	 	 
	 	 
    for(int i=0;i<=strlen(text);i++) {
	  t=text[i];
	 
	 if ((t >='A') &&(t <= 'Z')) text[i]=text[i]+32;
	  if ((t >='a') &&(t <= 'z')) text[i]=text[i]-32;
	  
	 for(int j=0; j<= 9;j++) 
  
   if(text[i]==cisla[j]) text[i]=' '+ ' ';
	 
	 }
	 
	     for(int i=0;i<=strlen(text);i++)
	 printf(" %c", text[i]);
	 
	 
	  	 printf(" \n ");
	  	 
	 int pom=strlen(text);	 
	 if(pom %2==0){
for(int i=0;i<=pom;i=i+2) {
char s=text[i];
char r=text[i+1];

	 text[i+1]=s;
	 text[i]=r;
	 
	 s=' ';
	 r=' ';



	 	     for(int i=0;i<=strlen(text);i++)
	 printf(" %c", text[i]);
	 
	 }
	 }
	 if(pom %2==1){
 

 
for(int i=0;i<=pom;i=i+2) {

if (i<pom-1){
char s=text[i];
char r=text[i+1];

	 text[i+1]=s;
	 text[i]=r;
	 
	 s=' ';
	 r=' ';


}

 

}
	 	     for(int i=0;i<=strlen(text);i++)
	 printf(" %c", text[i]);
	 
	 }
	 
	 
	 
	 prem[0]='b';
	 	 prem[1]='y';
	 	 	 prem[2]='c';
	 	 	 	 prem[3]='i';
	 	 	 	 	 prem[4]='k';
						 	 prem[5]='e';
	 	 	 	 	 	 prem[6]='l';
	 	 	 	 	 	 
	 	 	 	 	 	 prem[7]= '\0'; 
	 	 	 	 	 	 
	 
	 
	 	     for(int i=0;i<=7;i++)
		{
	
	 
	 if (prem[i] =='i') prem[i]='y';
	 
	 
	 
		 else if (prem[i]== 'y') prem[i]='i';
	}
	 	  
	 	  
	 	  for(int i=0;i<=7;i++)
	 printf(" %c", prem[i]);
	 
	
}
 
