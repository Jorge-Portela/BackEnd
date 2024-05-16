#include <stdio.h>
#include <limits.h>
#include <stdlib.h>

int main(void){
  float f = 1;

  printf("The size of i in bits: %zu / bytes %zu\n", sizeof f, sizeof f * 8);
  printf("The value of f: %f\n", f);

  return 0;
}
