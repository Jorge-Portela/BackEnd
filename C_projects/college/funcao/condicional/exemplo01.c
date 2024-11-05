#include <stdio.h>
#include <locale.h>
 main(){
    setlocale(LC_ALL, "PORTUGUESE");
    int idade;
    printf("Informe sua idade: ");
    scanf("%d", &idade);
    if (idade <= 15){
        printf("\n\nnão Vota");
    } else if(idade == 16 || idade == 17 || idade > 70){
            printf("\n\nVoto facultativo\n");
        } else{
                printf("\n\nVoto Obrigatório");
            }
    printf("\n\nO voto é um direito do cidadão! Escolha bem nas próximas eleições!!!\n\n\n");

    return 0;
}
