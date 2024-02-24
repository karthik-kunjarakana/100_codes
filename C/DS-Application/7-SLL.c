#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int count = 0;

struct stud
{
    long int ph;
    int sem;
    char name[15], usn[15], brnch[8];
    struct stud *next;
} *head = NULL, *tail = NULL, *temp = NULL, *temp1;

void create(long int n, int s, char na[20], char u[15], char b[5])
{
    if (head == NULL)
    {
        head = (struct stud *)malloc(1 * sizeof(struct stud));
        head->ph = n;
        head->sem = s;
        strcpy(head->name, na);
        strcpy(head->usn, u);
        strcpy(head->brnch, b);
        head->next = NULL;
        tail = head;
        count++;
    }
    else
    {
        temp = (struct stud *)malloc(1 * sizeof(struct stud));
        temp->ph = n;
        temp->sem = s;
        strcpy(temp->name, na);
        strcpy(temp->usn, u);
        strcpy(temp->brnch, b);
        temp->next = head;
        head = temp;
        count++;
    }
}

void display()
{
    temp1 = head;
    if (temp1 == NULL)
    {
        printf("\nlist is empty\n");
    }
    else
    {
        printf("student details are as follows:\n");
        while (temp1 != NULL)
        {
            printf("-----------------------\n");
            printf("NAME:%s\nUSN:%s\nBRANCH:%s\nSEM:%d\nPHONE NO.:%ld\n", temp1->name, temp1->usn, temp1->brnch, temp1->sem, temp1->ph);
            printf("-----------------------\n");
            temp1 = temp1->next;
        }
        printf("no. of nodes=%d\n", count);
    }
}

void insert_head(long int n, int s, char na[15], char u[15], char b[8])
{
    temp = (struct stud *)malloc(1 * sizeof(struct stud));
    temp->ph = n;
    temp->sem = s;
    strcpy(temp->name, na);
    strcpy(temp->usn, u);
    strcpy(temp->brnch, b);
    temp->next = head;
    head = temp;
    count++;
}

void delete_head()
{
    temp1 = head;
    if (temp1 == NULL)
    {
        printf("list is empty\n");
    }
    else
    {
        head = head->next;
        printf("deleted node is:\n");
        printf("-----------------------\n");
        printf("NAME:%s\nUSN:%s\nBRANCH:%s\nSEM:%d\nPHONE NO.:%ld\n", temp1->name, temp1->usn, temp1->brnch, temp1->sem, temp1->ph);
        printf("-----------------------\n");
        free(temp1);
        count--;
    }
}

void main()
{
    int choice;
    long int ph;
    int sem;
    char name[20], usn[15], brnch[8];
    printf("--------MENU----------\n");
    printf("1.create\n2.Insert from head\n3.Delete from head\n4.display\n5.exit\n");
    printf("----------------------\n");
    while (1)
    {
        printf("enter your choice\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("enter the name usn branch sem phno. of the student respectively\n");
            scanf("%s%s%s%d%ld", name, usn, brnch, &sem, &ph);
            create(ph, sem, name, usn, brnch);
            break;
        case 2:
            printf("enter the name usn branch sem phno. of the student respectively\n");
            scanf("%s%s%s%d%ld", name, usn, brnch, &sem, &ph);
            insert_head(ph, sem, name, usn, brnch);
            break;
        case 3:
            delete_head();
            break;
        case 4:
            display();
            break;
        case 5:
            exit(0);
        default:
            printf("invalid option\n");
        }
    }
}

