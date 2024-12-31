#include <stdio.h>
int visited[100], graph[100][100], size;
void explore(int node)
{
    printf("%d\t", node);
    visited[node] = 1;

    for (int i = 0; i < size; i++)
    {
        if (!visited[i] && graph[node][i]==1)//if any unvisited
            explore(i);
    }
}

int main()
{
    printf("Enter the number of nodes: ");
    scanf("%d", &size);

    printf("Enter the adjacency matrix:\n");
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
            scanf("%d", &graph[i][j]);
    }
    for (int i = 0; i < size; i++)
        visited[i] = 0;
    printf("==================================\n");

    explore(0); // Start from node 0
    return 0;
}
