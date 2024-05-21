#include <stdio.h>
#include <limits.h>
#include <stdint.h>
#include <stdlib.h>

int main(void){
  float f  = 1;
  long double d = 1;

  printf("The size of f (float): %zu bytes / %zu bits\n", sizeof f, sizeof f * 8);
  printf("The size of d (double): %zu bytes / %zu bits\n", sizeof d, sizeof d*8);
  printf("The size of d (long double): %zu bytes / %zu bits\n", sizeof d, sizeof d*8);
  printf("Value of f: %.2f\n",f);
  printf("Value of d: %.2Lf\n",d);

  return 0;
}
