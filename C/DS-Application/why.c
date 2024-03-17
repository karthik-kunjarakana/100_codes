#include<stdio.h>
#include<stdlib.h>
int key[20],n,m;
int *ht,indx;
int count;
void insert(int key){
indx =key%m;
while(ht[indx]!=-1){
indx=(indx+1)%m;
}ht[indx]=key;
count++;
}
void display(){
int i;
printf("\n Hash table .....\n");
for(i=0;i<m;i++)
printf("\nT[%d]-->%d\n",i,ht[i]);
}
void main(){
int i;
printf("\nEnter the number of employee records (N) : ");
    scanf("%d", &n);
printf("\nEnter Memory (M) : ");
    scanf("%d", &m);
    ht=(int *)malloc(m*sizeof(int));
    for(i=0;i<m;i++)
    	ht[i]=-1;
printf("\nEnter 4 digit Key (key) : ");
    for(i=0;i<n;i++)
    	scanf("%d",&key[i]);
    for(i=0;i<n;i++){
    	if(count ==m){
    	   printf("\nHash table is full.");
    	   break;
    	  }
    	  insert(key[i]);
    	 }
    	 display();
    }

