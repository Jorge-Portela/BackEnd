# include <stdio.h>
# include <stdlib.h>


    main(){

    int x = 0;
    int y = 1;

    y = ++x;

    printf("x = %i \n", x);
    printf("y = %i \n", y);

    y = x++;

    printf("x = %i \n", x);
    printf("y = %i \n", y);

    return 0;


    }
