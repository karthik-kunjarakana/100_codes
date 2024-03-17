#include<stdio.h>
#include<stdlib.h>
int a[20][20],q[10],visited[20],reach[10],n,i,j,f=0,r=-1,count =0;
void BFS(int v){
for(i=1;i<=n;i++){
if(a[v][i]&&!visited[i]){
q[++r]=i;
}
}
if(f<=r){
visited[q[f]]=1;
BFS(q[f++]);
}
}
void DFS(int v){
int i;
reach[v]=1;
for(i=1;i<=n;i++){
if(a[v][i]&&!reach[i]){
printf("\n%d-->%d",v,i);
count++;
DFS(i);
}
}
}
void main(){
int v, choice;
printf("enter the number of vertices : ");
scanf("%d",&n);
for(i=1;i<=n;i++){
q[i]=0;
visited[i]=0;
}
for(i=1;i<=n;i++)
reach[i]=0;
printf("Enter the graph matrix : \n");
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
scanf("%d",&a[i][j]);
 printf("1.BFS-Reachability check\n 2.DFS-Connectivity check\n 3.Exit\n");
    printf("Enter your choice/n");
    scanf("%d", &choice);
    switch (choice) {
    case 1 : printf("\n Enter the starting vertex:");
    		scanf("%d",&v);
    		BFS(v);
    		printf("\n The nodes which are reachable from %d are \n",v);
		for(i=1;i<=n;i++)
			if(visited[i])
				printf("%d\t",i);
		break;
	case 2: DFS(1);
		if(count == n-1)
			printf("connected");
		else
			printf("not connected");
		break;
case 3: exit(0);
}
}	
	
