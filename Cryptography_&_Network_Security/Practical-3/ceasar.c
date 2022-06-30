#include<stdio.h>
int main()
{
 	char message[100] , ch;
 	int i,key;
 	printf("Enter Plaintext:");
	gets(message);
	printf("Enter Key:");
	scanf("%d",&key);
 	for(i=0;message[i]!='\0';++i)
 	{
 		ch=message[i];
 		if(ch>='a' && ch <='z')
		{	
		 	ch= ch+key;
 			if(ch >'z')
 
			{
 				ch = ch 
				-'z' + 'a'
				-1;
			}
 			message[i] = ch;
		}
 		else if(ch>='A' && ch<= 'Z')
		{
			 ch =ch +key;
 			if(ch>'Z')
			{
 				ch = ch 
				-'Z'+ 'A' 
				-1;
 
			}
			 message[i] = ch;
 
		}
 	} 
 printf("Ciphertext: %s ", message);
 return 0;
}
