#include <stdio.h>
 
int main()
{
  int ch, n, f = 1;
 scanf("%d", &n);
 
  for (ch= 1; ch <= n; ch++)
    f = f * ch;
 
  printf(n,f);
  return 0;
}

