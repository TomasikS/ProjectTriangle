#include <stdio.h>
#include <math.h>

int  maximum(int num1, int num2, int num3 ) ;
void  stred(int num1, int num2, int num3 ) ;




int main(){  
int a,b,c;
int max;

printf(" \n  zadaj dlzku strany trojuholnika " );
scanf("%d", &a);

printf(" \n  zadaj dlzku strany trojuholnika " );
scanf("%d", &b);


printf(" \n  zadaj dlzku strany trojuholnika " );
scanf("%d", &c);

if ((a+b>c) && (a+c > b ) && (b+c >a))
printf ("je to trojuholnik");

else printf("nie je to trojuholnik");

  

 stred(a,b,c);

 
 

}


void stred(int num1, int num2, int num3 ) {
 
 int prepona =maximum (num1,num2,num3);
 
 
 
  
 
  
 
     if (prepona==num1) {
 
 
 if ( (pow (num1,2) + pow (num2,2))==pow(prepona,2)) printf("je pravohuly");
  else printf("nie je pravouhly") ;
 
 
 } 
 
     if (prepona==num2) {
 
 
 if ( (pow (num1,2) + pow (num3,2))==pow(num2,2))  printf("je pravohuly");
  else printf("nie je pravouhly") ;
 
 
 } 
    if (prepona==num3) {
 
 
 if ( (pow (num1,2) + pow (num2,2))==pow(prepona,2))  printf("je pravohuly");
 else printf("nie je pravouhly") ;
 
 
 } 
 
 }
 
              



int maximum(int x, int y, int z) {
	int max = x;  

	if (y > max) {  
		max = y;
	} 

	if (z > max) {  
		max = z;
	} 

	return max;  
}



