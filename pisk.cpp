#include<stdio.h>
#include<time.h>
#define N  3
#include <stdlib.h>

int main()
{
	srand(time(NULL));
int pole[N][N];
int p1=0;

int p2=0;

int p3=0;
int p4=0;
int p5=0;
int p6=0;
int p7=0;

int p8=0;

int p9=0;
int p10=0;
int p11=0;
int p12=0;
int p13=0;
int p14=0;

int p15=0;
int p16=0;

 int count=0; 
 
 int kcount=0;

for(int i=0;i<N;i++)
for(int j=0;j<N;j++)
pole[i][j]=rand()%2;
 


for(int i=0;i<N;i++){
for(int j=0;j<N;j++)
printf("%d", pole[i][j]);
printf("\n");
}
printf("\n");
for(int j=0;j<N;j++){

if(pole[0][j]==0) p1++;
if(p1==3)  count++;

 

}
 

for(int j=0;j<N;j++){
	
if(pole[1][j]==0) p2++;
if(p2==3)  count++;
}


for(int j=0;j<N;j++){
if(pole[2][j]==0) p3++;
if(p3==3)  count++;
}


for(int j=0;j<N;j++){
if(pole[0][j]==1) p4++;

if(p4==3)  kcount++;
}

for(int j=0;j<N;j++){
if(pole[1][j]==1) p5++;
if(p5==3)  kcount++;

}
for(int j=0;j<N;j++){
if(pole[2][j]==1) p6++;
if(p6==3)  kcount++;
}


for(int j=0;j<N;j++){
if(pole[j][0]==0) p7++;
if(p7==3)  count++;
}


for(int j=0;j<N;j++){
if(pole[j][1]==0) p8++;
if(p8==3)  count++;
}

for(int j=0;j<N;j++){
if(pole[j][2]==0) p9++;
if(p9==3)  count++;
}


for(int j=0;j<N;j++){
if(pole[j][0]==1) p10++;
if(p10==3)  kcount++;

}

for(int j=0;j<N;j++){
if(pole[j][1]==1) p11++;
if(p11==3)  kcount++;
}

for(int j=0;j<N;j++){
if(pole[j][2]==1) p12++;
if(p12==3)  kcount++;
}


 


if((pole[0][0]==1) && (pole[1][1]==1) &&  (pole[2][2]==1) )   kcount++;

 if((pole[0][0]==0) && (pole[1][1]==0) &&  (pole[2][2]==0) )   count++;
 
 if((pole[0][2]==1) && (pole[1][1]==1) &&  (pole[2][0]==1) )   kcount++;
 
if((pole[0][2]==0) && (pole[1][1]==0) &&  (pole[2][0]==0) )   count++;

 int pr1=p1+p3+p3+p7+p8+p9+p13;
 
 int pr2=p4+p5+p6+p10+p11+p12+p14;
printf("\n");

printf("nuly %d",count);
printf("\n");

printf("jednotky %d",kcount);



if (count >kcount) printf("vyhral hrac 0");
if (kcount >count) printf("vyhral hrac 1");

if (kcount==count) printf("remíza");








}

