#include<stdio.h>
#include<string.h>

void pattern_match();
char STR[100], PAT[100], REP[100], ans[100];
int i, j, c, m, k, flag = 0;

void main()
{
    printf("Enter the main string: ");
    scanf("%s", STR); // Read the main string with spaces
    printf("Enter the pattern to search: ");
    scanf(" %s", PAT); // Read the pattern
    printf("Enter the replacement string: ");
    scanf(" %s", REP); // Read the replacement string
    pattern_match();
}

void pattern_match()
{
    i = m = c = j = 0;
    while (STR[c] != '\0')
    {
        // Checking for Match
        if (STR[m] == PAT[i])
        {
            i++;
            m++;
            if (PAT[i] == '\0')
            {
                // Replace string in ans string
                flag = 1;
                for (k = 0; REP[k] != '\0'; k++, j++)
                    ans[j] = REP[k];
                i = 0;
                c = m;
            }
        }
        else // Mismatch
        {
            ans[j] = STR[c];
            j++;
            c++;
            m = c;
            i = 0;
        }
    }
    if (flag == 0)
    {
        printf("Pattern not found!!!");
    }
    else
    {
        ans[j] = '\0';
        printf("\nThe RESULTANT string is: %s\n", ans);
    }
}

