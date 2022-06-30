#include <stdio.h>

void main()
{
    char c;
    int p10[10] = {3, 5, 2, 6, 1, 10, 4, 9, 8, 7}, p8[8] = {6, 3, 7, 4, 8, 5, 10, 2};
    int i = 0, key1[10], key2[10], key[10], ls1[5], ls2[5], temp, p1[10], j, temp1;
    printf("\nenter key value : ");
    for (i = 0; i < 10; i++)
        scanf("%d", &key[i]);
    printf("\nP10 value : ");
    for (i = 0; i < 10; i++)
        printf("%d ", p10[i]);
    printf("\nP8 value : ");
    for (i = 0; i < 8; i++)
        printf("%d ", p8[i]);
    for (i = 0; i < 10; i++)
    {
        temp = p10[i];
        for (j = 0; j < temp; j++)
            temp1 = key[j];
        p1[i] = temp1;
    }
    printf("\nafter applying Permutation p10 : ");
    for (i = 0; i < 10; i++)
        printf("%d ", p1[i]);
    for (i = 0; i < 10; i++)
    {
        temp1 = p1[i];
        if (i < 5)
            ls1[i] = temp1;
        else
            ls2[i - 5] = temp1;
    }
    printf("\nafter divided: \n");
    printf("First 5 bits: ");
    for (i = 0; i < 5; i++)
        printf("%d ", ls1[i]);
    printf("\nsecond 5 bits: ");
    for (i = 0; i < 5; i++)
        printf("%d ", ls2[i]);
    ls1[5] = ls1[0];
    for (i = 0; i < 5; i++)
        ls1[i] = ls1[i + 1];
    ls1[4] = ls1[5];
    printf("\nLeft Shifting By 1\n");
    printf("\nFirst 5 bits : ");
    for (i = 0; i < 5; i++)
        printf("%d ", ls1[i]);
    ls2[5] = ls2[0];
    for (i = 0; i < 5; i++)
        ls2[i] = ls2[i + 1];
    ls2[4] = ls2[5];
    printf("\nSecond 5 bits : ");
    for (i = 0; i < 5; i++)
        printf("%d ", ls2[i]);
    for (i = 0; i < 10; i++)
    {
        p1[i] = ls1[i];
        if (i > 5)
            p1[i] = ls2[i - 5];
    }
    for (i = 0; i < 10; i++)
    {
        temp = p8[i];
        for (j = 0; j < temp; j++)
            temp1 = p1[j];
        key1[i] = temp1;
    }
    printf("\nKey k1 is : ");
    for (i = 0; i < 8; i++)
        printf("%d ", key1[i]);
    ls1[5] = ls1[0];
    for (i = 0; i < 5; i++)
        ls1[i] = ls1[i + 1];
    ls1[4] = ls1[5];
    printf("\n\nLeft Shifting By 2\n");
    printf("\nFirst 5 bits : ");
    for (i = 0; i < 5; i++)
        printf("%d ", ls1[i]);
    ls2[5] = ls2[0];
    for (i = 0; i < 5; i++)
        ls2[i] = ls2[i + 1];
    ls2[4] = ls2[5];
    printf("\nSecond 5 bits : ");
    for (i = 0; i < 5; i++)
        printf("%d ", ls2[i]);
    for (i = 0; i < 10; i++)
    {
        p1[i] = ls1[i];
        if (i > 5)
            p1[i] = ls2[i - 5];
    }
    for (i = 0; i < 10; i++)
    {
        temp = p8[i];
        for (j = 0; j < temp; j++)
            temp111 = p1[j];
        key2[i] = temp1;
    }
    printf("\nKey k2 is : ");
    for (i = 0; i < 8; i++)
        printf("%d ", key2[i]);
}