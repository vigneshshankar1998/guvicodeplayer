#include <stdio.h>
 
int main()
{
   int n, rvse = 0;
 
   scanf("%d", &n);
 
   while (n != 0)
   {
      rvse = rvse * 10;
      rvse = rvse + n%10;
      n       = n/10;
   }
 
   printf("%d", rvse);
 
   return 0;
}

