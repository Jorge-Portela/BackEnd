#include <stdio.h>
#include <limits.h>
#include <stdint.h>

int main(void){

  uint32_t i = UINT_MAX; 

  printf("The value of int in this system in bits: '%lu' / bytess: '%lu'", sizeof i, sizeof i * 8);

  return 0;
}
