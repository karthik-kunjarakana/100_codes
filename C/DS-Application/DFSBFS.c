#include <stdio.h>
#include <stdlib.h>

int a[20][20], q[20], visited[20], reach[10], n, i, j, f = 0, r = -1, count = 0;

void BFS_Reachability(int v) {
    for (i = 1; i <= n; i++) {
        if (a[v][i] && !visited[i]) { // if there is an edge and it is not visited till now
            q[++r] = i; // add it to the queue at rear
        }
    }
    if (f <= r) { // f indicates front and r indicates rear of queue
        visited[q[f]] = 1; // call the node in the queue as visited
        BFS_Reachability(q[f++]); // recursively call BFS for all the nodes in the queue
    }
}

void DFS_Connectivity(int v) {
    int i;
    reach[v] = 1;
    for (i = 1; i <= n; i++) {
        if (a[v][i] && !reach[i]) { // if there is an edge and it is not visited/reached till now
            printf("\n %d->%d", v, i); // print the node
            count++;
            DFS_Connectivity(i); // call DFS recursively for the visited node
        }
    }
}

void main() {
    int v, choice;
    printf("\n Enter the number of vertices:");
    scanf("%d", &n);
    for (i = 1; i <= n; i++) {
        q[i] = 0;
        visited[i] = 0;
    }
    for (i = 1; i <= n - 1; i++)
        reach[i] = 0;
    printf("\n Enter graph data in matrix form:\n");
    for (i = 1; i <= n; i++)
        for (j = 1; j <= n; j++)
            scanf("%d", &a[i][j]);
    printf("1.BFS-Reachability check\n 2.DFS-Connectivity check\n 3.Exit\n");
    printf("Enter your choice/n");
    scanf("%d", &choice);
    switch (choice) {
    case 1:
        printf("\n Enter the starting vertex:");
        scanf("%d", &v);
        BFS_Reachability(v);
        printf("\n The nodes which are reachable from %d are:\n", v);
        for (i = 1; i <= n; i++)
            if (visited[i])
                printf("%d\t", i);
        break;
    case 2:
        DFS_Connectivity(1);
        if (count == n - 1)
            printf("\n Graph is connected");
        else
            printf("\n Graph is not connected");
        break;
    case 3:
        exit(0);
    }
}

