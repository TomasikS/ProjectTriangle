#include<stdio.h>
#include<string.h>
#include<string.h>
#include<stdlib.h>
#include<ctype.h>
void koduprav(long ucet, long kod);
long kod;
long ucet;
int iban [24];

char pom[24];

int main()

{


printf("Zadaj cislo uctu");
scanf("%ld",& ucet);
 

printf("Zadaj kod banky");
scanf("%ld",& kod);
 
koduprav( ucet,  kod);


}

void koduprav(long ucet, long kod)

{
 long pkod[4];
long pucet[10];


int pp=10;
while(ucet>0){
   pucet[pp]=ucet%10;
   ucet=ucet/10;
   pp--;
}


printf("\n" );


for(int j=0;j<10;j++)

printf("%ld", pucet[j]);

printf("\n" );

long v=kod;
int p=3;
while(v>0){
   pkod[p]=v%10;
   v=v/10;
   p--;
}



pom[0]='S';
pom[1]='K';


for(int j=0;j<4;j++)

iban[j]=pkod[j];


for(int i=5;i<11;i++)
iban[i]=0;



 for(int i=11;i<21;i++)

iban[21]=2;
iban[22]=8;
iban[23]=2;
iban[24]=0;
iban[25]=0;
iban[26]=0;

for(int j=0;j<27;j++)

printf("%ld", iban[j]);
printf("\n" );


  
   int op, size=27; 
   long nn = 0;
   int e;

   for(e=0;e<size;e++){
      op=10;

       while(iban[e]>=op)
          op*=10;

       nn*=op;  
       nn+=iban[e];
       printf("n: %ld\n", nn);
 

}}

