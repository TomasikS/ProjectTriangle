#include<stdio.h>
#include<string.h>
char pole[20];

int main ()

{
printf("Zadaj slovo");
scanf("%s", &pole);
int N=strlen(pole);
int pom;
for(int i=0;i<=N-2;i++){
 
for(int j=i+1; j<=N-1;j++){


if(pole[i] > pole[j])
{
pom=pole[i];
pole[i]=pole[j];
pole[j]=pom;

}
}
}

printf("\n");

for(int i=0;i<N;i++) printf("%c",pole[i]);
printf("\n");


for(int i=0;i<=N-2;i++){
 
for(int j=i+1; j<=N-1;j++){


if(pole[i] < pole[j])
{
pom=pole[i];
pole[i]=pole[j];
pole[j]=pom;

}
}
}

for(int i=0;i<N;i++) printf("%c",pole[i]);


}


