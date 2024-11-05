/*2) Elabore um algoritmo que dado um número qualquer, responda
se ele é positivo, negativo ou nulo (zero):
*/

# include <stdio.h>
    float numberInput;    


int main(){

    printf("Enter the Number: "); /*Prompt para inserir numero*/
    scanf("%f",&numberInput);      /* armazenamento do numero inserido*/

    if (numberInput > 0)

    {
        printf("Number is positive");

    } else if(numberInput < 0)

    {
        printf(" Number is negative");

    } else 

    {
        printf("NUmber is Null (equal to zero)");

    }
    
    return 0;    

}