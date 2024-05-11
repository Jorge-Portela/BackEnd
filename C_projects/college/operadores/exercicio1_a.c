/*
a) Dado um número inteiro obter o último algarismo desse número: Ex. se digitado “799” escrever
apenas o “9”.
*/

# include <stdio.h>
# include <math.h>
# include <stdlib.h>


 int main(){

    int x = 1563;
    int y,z;

    y = (floor((x*0.1))*10-x)*-1;

  /*  y *= 10;

    x -= y;

    */

    printf("\n Y = %i \n", y);


    return 0;

 }
