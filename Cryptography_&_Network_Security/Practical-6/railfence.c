#include <stdio.h>
#include <string.h>
void main()
{
    int i, j, k, l;
    char a[20], c[20], d[20];
    printf("\n\t RAIL FENCE TECHNIQUE");
    printf("\n\nEnter the input string : ");
    gets(a);
    l = strlen(a);

        for (i = 0, j = 0; i < l; i++)
    {
        if (i % 2 == 0)
            c[j++] = a[i];
    }
    for (i = 0; i < l; i++)
    {
        if (i % 2 == 1)
            c[j++] = a[i];
    }
    c[j] = '\0';
    printf("\nCipher text after applying rail fence :");
    printf("%s", c);
}
