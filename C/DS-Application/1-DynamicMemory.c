#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_STRING_LENGTH 100
#define NUM_DAYS 7

// Structure to represent a day
struct Day
{
    char* name;
    int date;
    char* activity;
};

// Function to create a day with dynamic memory allocation
struct Day* create()
{
    struct Day* newDay = (struct Day*)malloc(sizeof(struct Day));
    if (newDay == NULL)
    {
        printf("Memory allocation failed");
        exit(0);
    }
    newDay->name = (char*)malloc(MAX_STRING_LENGTH);
    newDay->activity = (char*)malloc(MAX_STRING_LENGTH);
    if (newDay->name == NULL || newDay->activity == NULL)
    {
        printf("Memory allocation failed");
        exit(0);
    }
    return newDay;
}

// Function to read data for a day
void read(struct Day* day)
{
    printf("Enter the name of the day: ");
    scanf("%s", day->name);
    printf("Enter the date of the day: ");
    scanf("%d", &day->date);
    printf("Enter the activity for the day: ");
    scanf(" %s", day->activity);
}

// Function to display the calendar
void display(struct Day* calendar[])
{
    printf("Calendar:\n");
    for (int i = 0; i < NUM_DAYS; i++)
    {
        printf("Day %d:\n", i + 1);
        printf("Name: %s\n", calendar[i]->name);
        printf("Date: %d\n", calendar[i]->date);
        printf("Activity: %s\n", calendar[i]->activity);
        printf("\n---------------------------------------\n");
    }
}

int main()
{
    struct Day* calendar[NUM_DAYS];

    // Create a calendar for 7 days
    for (int i = 0; i < NUM_DAYS; i++)
    {
        calendar[i] = create();
    }

    // Read data for each day
    for (int i = 0; i < NUM_DAYS; i++)
    {
        printf("Enter details for Day %d:\n", i + 1);
        read(calendar[i]);
    }

    // Display the calendar
    display(calendar);

    // Free dynamically allocated memory
    for (int i = 0; i < NUM_DAYS; i++)
    {
        free(calendar[i]->name);
        free(calendar[i]->activity);
        free(calendar[i]);
    }

    return 0;
}

