#include<stdio.h>
#include<string.h>
char STR[100], REP[100],PAT[100],ans[100];
int i,j,k,m,c,flag=0;
void pattern_match();
void main(){
printf("Enter the main string : \n");
scanf("%s",STR);
printf("Enter the pattern string : \n");
scanf("%s",PAT);
printf("Enter the Replacement string : \n");
scanf("%s",REP);
pattern_match();
}
void pattern_match(){
i=j=m=c=0;
while(STR[c]!='\0'){
	if(STR[m] == PAT[i]){
		i++;
		m++;
		if(PAT[i]=='\0'){
		flag=1;
		for(k=0;REP[k]!='\0';k++,j++)
			ans[j]=REP[k];
		i=0;
		c=m;
		}
	}
	else{
	ans[j]=STR[c];
	j++;
	c++;
	m=c;
	i=0;
}
}
if(flag==0)
printf("pattern not found!");
else{
ans[j]='\0';
printf("Resultant string is %s",ans);
}
}
	
