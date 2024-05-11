
/*1) Elabore um algoritmo que calcule a área das seguintes figuras geométricas:

 • Quadrado, sendo Aq = L²;
 
  */

# include <stdio.h>

float squareArea, side;

int main (){

    printf(" Enter Square side value: ");
    scanf("%f",&side);

    squareArea = side * side;

    printf(" Square area is: %f ", squareArea);


    return 0;
}