#include <stdio.h>
#include <limits.h>
#include <stdint.h>
#include <stdlib.h>

int main(void){
  float f  = 1;

  printf("The size of f (float) is: %zu bytes / %zu bits\n", sizeof f, sizeof f * 8);
  printf("Value of f: %.2f\n",f);

  return 0;
}
