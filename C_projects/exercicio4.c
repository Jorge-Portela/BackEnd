/*
4)Elabore um algoritmo que tenha como objetivo o cálculo do IMC (índice da Massa Corporal) de um ser
humano,sabendo que IMC = peso (em quilogramas) / altura²
(em metros).
*/

# include <stdio.h>
# include <math.h>

    float IMC, weight, height;

 main(){

    printf("\n Enter WEIGHT value: \n");
    scanf("%f", &weight);

    printf("\n ENter HEIGHT value: \n");
    scanf("%f", &height);

    IMC =  weight / pow(height,2);


    printf("\n IMC: %.2f \n", IMC);

    if(IMC < 17){
        printf("\n Very underweight \n");

    } else if( IMC <= 18.49){
            printf("\n Underweight \n");

        } else if( IMC <= 24.99){

                printf("\n Normal Weight \n");

        } else if( IMC <= 29.99){

                printf("\n Normal Weight \n");

        } else if(IMC <= 34.99){

                printf("\n Obesity 1 \n");

        } else if(IMC <= 39.99){
                printf("\n Obesity 2 (SEVERE) \n");

        } else {

            printf("\n Obesity 3 (MORBID) \n");

        }


 return 0;
 }
