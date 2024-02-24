#include <stdio.h>

void towers(int, char, char, char);

int main()
{
    int num;
    printf("Enter the number of disks : ");
    scanf("%d", &num);
    printf("The sequence of moves involved in the Tower of Hanoi are :\n");
    towers(num, 'S', 'A', 'D');
    return 0;
}

void towers(int num, char src, char aux, char dest)
{
    if (num == 1)
    {
        printf("\n Move disk 1 from peg %c to peg %c", src, dest);
        return;
    }
    towers(num - 1, src, dest, aux);
    printf("\n Move disk %d from peg %c to peg %c", num, src, dest);
    towers(num - 1, aux, src, dest);
}

