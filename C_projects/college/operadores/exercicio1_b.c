/*
b) Dados o primeiro termo e a razão de uma progressão aritmética, determinar a soma dos seus
primeiros CINCO termos, sabendo que:
an = a1 + (n – 1) * r => formula do termo geral //
Sn = ((a1 + an)*n)/2 => Formula da soma geral dos termos
*/

# include <stdio.h>
# include <stdlib.h>
# include <math.h>



   int main(){

        int x = 2;
        int y = 5;
        int z = 8;

        int reason; /* reason of Artihmetic Progression*/

        int g; /* fifth term of Artihmetic Progression*/

        int sumPA; /*General Sum of Arithmetic Progression*/


        reason = (x-y)*-1; /* calculating the reason by subtracting the first term (x) from the second (y)*/

        g = x + (5-1)*reason;

        sumPA = ((2 + g) * 5)/2;

        printf("\n The reason of Arithmetic Progression is: %i \n",reason);

        printf("\n The fifth termo of Arithmetic Progression is: %i \n",g);

        printf("\n The Genreal Sum of Arithmetic Progression is: %i \n", sumPA);


    return 0;
    }




