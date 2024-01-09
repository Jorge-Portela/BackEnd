/*1) Elabore um algoritmo que calcule a área da seguinte figura geométrica:

 • Círculo, sendo que: Ac = πr²;
 
 */

# include <stdio.h>

 double PI = 3.14 ;
 double radius, circleArea;

int main(){

    printf(" Enter the radius value: ");
    scanf("%lf",&radius);

    circleArea = PI * (radius * radius);
 

    printf("Circle Area: %lf",  circleArea);

    return 0;


}