/*
a) Dado um número de 3 algarismos, inverter a ordem de seus algarismos. Os três algarismos do
número dado devem ser diferentes de Zero
*/

# include <stdio.h>
# include <stdlib.h>
# include <math.h>


    main(){

    int number = 356;

    printf(" Input number = %i \n",number);


    int x = (number * 0.01);

    printf(" x = %i \n",x);

    int y =  (floor((number*0.1) - floor((number * 0.01))*10))*10;

    printf(" y = %i \n",y);

    int z = (number - floor((number*0.1))*10)*100;

    printf(" z = %i \n",z);

    number = z+y+x;

    printf(" converted number = %i \n",number);



    return 0;
    }
