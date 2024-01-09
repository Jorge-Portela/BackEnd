/*
1) Elabore um algoritmo que calcule a área da seguinte figura geométrica:

 • Triângulo, sendo At = (b*h)/2; 
*/


# include <stdio.h>

    float base, height,triangleArea;

int main (){

    printf(" Enter Base value: ");
    scanf("%f",&base);

    printf(" Enter Height value ");
    scanf("%f",&height);

    triangleArea = (base * height) / 2;

    printf("Triangle area is: %.2f ",triangleArea);

    return 0;

}