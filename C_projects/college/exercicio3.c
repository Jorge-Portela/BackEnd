# include <stdio.h>

    int numberInput;

 main(){

    printf("Enter de Number value: ");
    scanf("%d",&numberInput);

    if(numberInput % 2 == 0){

        printf(" \n Number is EVEN \n");
    }else {
        printf(" \n NUmber is ODD \n");
    }

    return 0;

}
