#include <stdio.h>
#include <limits.h>

int main(void){
  int i = INT_MAX;  
 
  i++; // i = i + 1 ou i += 1

  printf("The size of i (char): %zu bytes / %zu bits\n", sizeof i, sizeof i * 8); 
  printf("Value of  i: %d\n",i);

  return 0;
}
