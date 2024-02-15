#include<stdio.h>
#include<stdlib.h>
findwt(int processes[],int n, int bt[],int wt[]){
	wt[0]=0;
	for(int i=1;i<n;i++)
		wt[i]=bt[i-1]+wt[i-1];
}
findtat(int processes[],int n, int bt[],int wt[],int tat[]){
	for(int i=0;i<n;i++)
		tat[i]=bt[i]+wt[i];
}
findavgTime(int processes[],int n,int bt[]){
int wt[n],tat[n],total_wt=0,total_tat=0;
findwt(processes,n,bt,wt);
findtat(processes,n,bt,wt,tat);
printf("Processes \tBurst Time \t Waiting Time\tTaT\n");
for(int i=0;i<n;i++){
total_wt=total_wt+wt[i];
total_tat=total_tat+tat[i];
printf("%d  \t",(i+1));
printf("%d  \t",bt[i]);
printf("%d  \t",wt[i]);
printf("%d\n",tat[i]);
}
float s=(float)total_wt/(float)n;
float t=(float)total_tat/(float)n;
printf("Avg WT = %f",s);
printf("\n");
printf("Avg TAT = %f",t);
}int main(){
	int processes[]={1,2,3};
	int n = sizeof processes/sizeof processes[0];
	int burst_time[]={10,5,8};
	findavgTime(processes,n,burst_time);
	return 0;

}
