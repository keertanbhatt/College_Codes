#include<stdio.h>
int gcd(int a,int b)
{
    if (a == 0)
        return b;
    else
        return gcd(b%a,a);
}
void main()
{
    int num1,num2,ans;
    printf("Enter the two numbers:");
    scanf("%d%d",&num1,&num2);
    ans=gcd(num1,num2);
    printf("GCD(%d,%d) = %d",num1,num2,ans);
}
