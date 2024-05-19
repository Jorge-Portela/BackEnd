#include <stdio.h>
#include <limits.h>
#include <stdlib.h>

int main(void){
  float f = 3e4; // 3 * 10 ^ 2

  printf("The size of f(float) in bytes: %zu / bits %zu\n", sizeof f, sizeof f * 8);
  printf("The value of f: %.2f\n", f);

  return 0;
}
