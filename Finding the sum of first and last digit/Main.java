#include <stdio.h>
#include <math.h>
int main()
{
    int n, firstdigit, lastdigit, digits,sum;
    scanf("%d", &n);
    lastdigit = n % 10;     
    digits = (int)log10(n); 
    firstdigit = (int)(n / pow(10, digits)); 
  sum=firstdigit+lastdigit;
  printf("%d\n",sum);
    return 0;
}
