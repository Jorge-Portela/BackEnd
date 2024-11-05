#include <stdio.h>
#include <stdbool.h>

int main(void){
 
  bool b;

  b = true;
  b = false;

  printf("Size of b (bool) is: %lu\n", sizeof b);

  b = -10;
  printf("The value of b is: %i\n",b);

  return 0;
}
