#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
#include <string.h>
#include <ctype.h>
typedef struct {
char a;
char b;
} Kod;

Kod pole[37];
Kod mpole[37];
int main()
{
	
FILE *fr;

FILE * fp;
FILE * fw;
fp=fopen("text.txt", "r") ;
fw= fopen("result.txt", "w");


fr=fopen("codetable.txt", "r") ;



if(fr==NULL) printf("error");

if(fw==NULL) printf("error");

if(fp==NULL) printf("error");


for(int i=0; i <37; i++)
{
fscanf(fr, "%s", &pole[i].a);printf("\n%c",pole[i].a );

fscanf(fr, "%s", &pole[i].b);printf(" %c",pole[i].b );
}
char znak;

 
 for(int i=0; i <37; i++)
 mpole[i].a=tolower(pole[i].a);
 
 for(int i=0; i <37; i++)
 mpole[i].b=tolower(pole[i].b);
  for(int i=0; i <37; i++)
 
 
 
 
 
while((znak=fgetc(fp))!=EOF){
for(int i=0; i <37; i++)
{

if (pole[i].b== znak) {
  fputc(pole[i].a, fw);}
 


 	
	if (mpole[i].b== znak) {
  fputc(mpole[i].a, fw);}
 
 
  
  
	
}
 if(znak=='\n') fputc('\n', fw); 
 if(znak==' ') fputc(' ', fw); 


}

fclose(fr);
fclose(fp);

fclose(fw);









}

