#include<stdio.h>
#include<string.h>
#include <stdlib.h> 
#include <time.h>

typedef struct{
int a;

int b;

} obdlznik;




int main()

{ int c=0;
obdlznik pole [100];
	
		FILE * fw;
	FILE * fr;
	
		fr=fopen("cisla.txt",  "r");
			fw=fopen("vypocty.txt",  "w");
		
		
		 if(fr==NULL) {
 printf("erorr"); return 1;}
 
 
 	 if(fw==NULL) {
 printf("erorr"); return 1;}
 
 
 
  while(fscanf(fr," %d"  " %d",&pole[c].a, &pole[c].b) !=EOF)
 
 {c++;
 
 }	
 		printf("%d", c);
 		

 		for(int i=0; i <c;i++)
 		fscanf(fr," %d"  " %d",&pole[c].a, &pole[c].b) ;
 			fclose(fr);
 		
 		for(int i=0; i <c;i++)	
 		printf("%d %d", pole[i].a, pole[i].b);
 		
 		
 		int v1,v2;
 		for(int i=0; i <c;i++){
		
 	  v1=pole[i].a *  pole[i].b;
 		  v2= 2*pole[i].a+ 2* pole[i].b;
 	 
 	 
 	 
 			fprintf(fw, "%c" , 'a');
 			fprintf(fw, "%c" , '=');	
 		
 		fprintf(fw, "%d" , pole[i].a);
 					fprintf(fw, "%c" , ' ');
 		
 			fprintf(fw, "%c" , 'b');
 				fprintf(fw, "%c" , '=');
 		
 					
 		fprintf(fw, "%d" , pole[i].b);
 					fprintf(fw, "%c" , ' ');
 		
 				fprintf(fw, "%c" , 'O');
 					fprintf(fw, "%c" , '=');
 						
 		fprintf(fw, "%d" , v2);
 		fprintf(fw, "%c" , ' ');
 		
 			fprintf(fw, "%c" , 'S');
 				fprintf(fw, "%c" , '=');
 					
 		fprintf(fw, "%d" , v1);
 		fprintf(fw, "%c" , ' ');
 		
 		
 		fprintf(fw,"\n");
 		 }
 		
 			fclose(fw);
 		
 		
 		
 	}
