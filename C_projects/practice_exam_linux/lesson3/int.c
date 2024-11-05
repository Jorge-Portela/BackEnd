#include <stdio.h>
#include <limits.h>
#include <stdint.h>

int main(void){

 register int i = 0; 

  printf("The size value of int in this system in bits: %zu / bytes: %zu\n", sizeof i, sizeof i * 8);

  printf("The value of i: %d\n",i);

  return 0;
}
