
///author Tomasik calculate IBAN, tested for one example - correct, problem
//printing long, it correct calculates controls numbers in IBAN
///input:1231231230 7500

#include<stdio.h>
#include<string.h>
#include<string.h>
#include<stdlib.h>
#include<ctype.h>
void koduprav(long ucet, long kod);
long kod;
long ucet;
int iban [30];

long pom[30];

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


int pp=9;
while(ucet>0){
   pucet[pp]=ucet%10;
   ucet=ucet/10;
   pp--;
}


//printf("\n pucet" );


//for(int j=0;j<11;j++)

//printf("%ld", pucet[j]);

printf("\n" );


int p=3;
while(kod>0){
   pkod[p]=kod%10;
   kod=kod/10;
   p--;
}



 




iban[0]=pkod[0];
iban[1]=pkod[1];
iban[2]=pkod[2];
iban[3]=pkod[3];

for(int i=4;i<10;i++)
iban[i]=0;

//for(int i=5;i<11;i++)
//printf("%d", iban[i]);
iban[10]=pucet[0];
iban[11]=pucet[1];
iban[12]=pucet[2];
iban[13]=pucet[3];
iban[14]=pucet[4];
iban[15]=pucet[5];
iban[16]=pucet[6];
iban[17]=pucet[7];
iban[18]=pucet[8];
iban[19]=pucet[9];
 

iban[20]=2;
iban[21]=8;
iban[22]=2;
iban[23]=0;
iban[24]=0;
iban[25]=0;

//for(int j=0;j<26;j++)

//printf("%ld", iban[j]);
//printf("\n" );

long nn;

//for (int i = 0; i < 26; i++)
//printf(" %ld", iban[i]);

  
for (int i = 0; i < 26; i++)
    nn = 10 * nn + iban[i];

  
// printf("\n nn %ld",nn);
//long val=(nn/97);
 
 long pr=(nn%97);
// printf("\n%ld",pr);
 

//int intpart = (int)val;
// long decpart = nn - intpart;
//decpart=decpart*97;
//int pr=(int) decpart;
 //pr=97-pr;
 
 int prr=97-pr;
 int c1=(prr/10)%10;
 int c2=(prr)%10;

 
 
//printf("\n%d",prr);
//printf("\n%d",c2);
//printf("\n%d",c1);

pom[2]=c1;
pom[3]=c2;

 




printf("\n");

pom[0]=83;
pom[1]=75;

//for(int j=0;j<22;j++)
//printf("%ld", iban[j]);

for(int j=0;j<22;j++)
pom[j+4]=iban[j];

 

  


for(int j=0;j<2;j++)

printf("%c", pom[j]);

 

for(int j=2;j<26-2;j++)
printf("%ld", pom[j]);



}

