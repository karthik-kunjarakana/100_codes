#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <math.h>

// Node structure for a term in the polynomial
struct node {
    int coef;
    int pow_x;
    int pow_y;
    int pow_z;
    struct node* next;
};

typedef struct node* POLYPTR;

// Function prototypes
POLYPTR InsertTerm(POLYPTR poly, int coef, int pow_x, int pow_y, int pow_z);
void Display(POLYPTR poly);
int Evaluate(POLYPTR poly, int x, int y, int z);
bool MatchTerm(POLYPTR p1, POLYPTR p2);
POLYPTR AddPoly(POLYPTR poly1, POLYPTR poly2, POLYPTR polySum);

int main() {
    // Initialize polynomial structures
    POLYPTR poly1 = (POLYPTR)malloc(sizeof(struct node));
    poly1->next = poly1;

    POLYPTR poly2 = (POLYPTR)malloc(sizeof(struct node));
    poly2->next = poly2;

    POLYPTR polySum = (POLYPTR)malloc(sizeof(struct node));
    polySum->next = polySum;

    // Represent and evaluate the polynomial 1: P(x, y, z) = 6x^2y^2z - 4yz^5 + 3x^3yz + 2xy^5z - 2xyz^3
    poly1 = InsertTerm(poly1, 6, 2, 2, 1);
    poly1 = InsertTerm(poly1, -4, 0, 1, 5);
    poly1 = InsertTerm(poly1, 3, 3, 1, 1);
    poly1 = InsertTerm(poly1, 2, 1, 5, 1);
    poly1 = InsertTerm(poly1, -2, 1, 1, 3);

    printf("POLY1(x, y, z) = ");
    Display(poly1);

    // Represent the polynomial 2: P(x, y, z) = xyz + 4x^3yz
    poly2 = InsertTerm(poly2, 1, 1, 1, 1); 
    poly2 = InsertTerm(poly2, 4, 3, 1, 1);

    printf("\nPOLY2(x, y, z) = ");
    Display(poly2);

    // Add POLY1(x, y, z) and POLY2(x, y, z) and store the result in POLYSUM(x, y, z)
    polySum = AddPoly(poly1, poly2, polySum);

    printf("\nPOLYSUM(x, y, z) = ");
    Display(polySum);

    // Evaluate POLYSUM(x, y, z) for specific values
    int x = 1, y = 1, z = 1;
    int iRes = Evaluate(polySum, x, y, z);
    printf("\nResult of POLYSUM= %d\n", iRes);

    return 0;
}

// Function definitions

POLYPTR InsertTerm(POLYPTR poly, int coef, int pow_x, int pow_y, int pow_z) {
    POLYPTR cur;
    POLYPTR newNode = (POLYPTR)malloc(sizeof(struct node));
    newNode->coef = coef;
    newNode->pow_x = pow_x;
    newNode->pow_y = pow_y;
    newNode->pow_z = pow_z;
    newNode->next = NULL;
    cur = poly;
    while (cur->next != poly) {
        cur = cur->next;
    }
    cur->next = newNode;
    newNode->next = poly;
    return poly;
}

void Display(POLYPTR poly) {
    if (poly->next == poly) {
        printf("Polynomial is empty.\n");
        return;
    }
    POLYPTR cur = poly->next;
    do {
        printf("%dx^%dy^%dz^%d ", cur->coef, cur->pow_x, cur->pow_y, cur->pow_z);
        cur = cur->next;
        if (cur != poly) {
            printf("+ ");
        }
    } while (cur != poly);
}

int Evaluate(POLYPTR poly, int x, int y, int z) {
    int result = 0;
    if (poly->next == poly) {
        return result;
    }
    POLYPTR cur = poly->next;
    do {
        int Val = cur->coef * pow(x, cur->pow_x) * pow(y, cur->pow_y) * pow(z, cur->pow_z);
        result += Val;
        cur = cur->next;
    } while (cur != poly);
    return result;
}

bool MatchTerm(POLYPTR p1, POLYPTR p2) {
    bool bMatches = true;
    if (p1->pow_x != p2->pow_x)
        bMatches = false;
    if (p1->pow_y != p2->pow_y)
        bMatches = false;
    if (p1->pow_z != p2->pow_z)
        bMatches = false;
    return bMatches;
}

POLYPTR AddPoly(POLYPTR poly1, POLYPTR poly2, POLYPTR polySum) {
    POLYPTR cur1 = poly1->next;
    POLYPTR cur2 = poly2->next;
    do {
        polySum = InsertTerm(polySum, cur1->coef, cur1->pow_x, cur1->pow_y, cur1->pow_z);
        cur1 = cur1->next;
    } while (cur1 != poly1);
    do {
        cur1 = polySum->next;
        bool MatchFound = false;
        do {
            if (MatchTerm(cur1, cur2)) {
                cur1->coef += cur2->coef;
                MatchFound = true;
                break;
            }
            cur1 = cur1->next;
        } while (cur1 != polySum);
        if (!MatchFound) {
            polySum = InsertTerm(polySum, cur2->coef, cur2->pow_x, cur2->pow_y, cur2->pow_z);
        }
        cur2 = cur2->next;
    } while (cur2 != poly2);
    return polySum;
}

