#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

typedef struct {
char meno [20]; 
int age;
float salary;
} person;


int main(){
srand(time(NULL));
person Employes[20];
  person emp;
  person emp2;
strcpy(emp.meno, "Viktor");
emp.age=28;
emp.salary=625.50;
strcpy(emp2.meno, "Milan");
emp2.age=24;
emp2.salary=720.50;

float prem=0;

printf("\n");

printf("\n %s %d %1.2f", emp.meno, emp.age, emp.salary);
printf("\n %s %d %1.2f", emp2.meno, emp2.age, emp2.salary);

printf("\n");

printf("Enter name");
scanf("%s", &Employes[0].meno);
printf("\n");

printf("Enter age");
scanf("%d", &Employes[0].age);
printf("Enter salary");
scanf("%f", &Employes[0].salary);

printf("\n");

for(int i=1;i<20;i++){

for(int j=1;j<6;j++){
Employes[i].meno[j]= rand()%26+ 'A';
Employes[i].meno[6]= '\n';

}
Employes[i].age=rand()%33+18;
Employes[i].salary=rand()%700+500;
}
for(int i=0;i<20;i++){
printf("\n %s %d %1.2f", Employes[i].meno, Employes[i].age, Employes[i].salary);
}

float r=0;
for(int i=0;i<20;i++){
  r=Employes[i].salary+r;

}

int pvek=0;
for(int i=0;i<20;i++){
  r=Employes[i].age+r;

}

prem=r/20;

pvek=pvek/20;

printf("\n priemerný plat %1.2f", prem);

for(int i=0;i<20;i++){
  if((Employes[i].age>20) &&(Employes[i].age<30))
  
 printf("\n %s %d %1.2f", Employes[i].meno, Employes[i].age, Employes[i].salary);

}


for(int i=0;i<20;i++){
  if(Employes[i].salary >1300) 
  
 printf("\n %s %d %1.2f", Employes[i].meno, Employes[i].age, Employes[i].salary);
	
}



///priemerny vek
//kto ma vek 20 - 30
//kto ma nad 1300 plat
}


