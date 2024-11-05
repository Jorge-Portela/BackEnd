/*
c)Faça um algoritmo que:

i) Obtenha o valor para a variável HT (horas trabalhadas no mês);
ii)Obtenha o valor para a variável VH (valor hora trabalhada):
iii) Obtenha o valor para a variável PD(percentual de desconto);
iv) Calcule o salário bruto: SB = HT * VH;
v) Calcule o total de desconto: TD = (PD/100)*SB;
vi) Calcule o salário líquido: SL = SB – TD;
vii) Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto,
Salário Liquido.
*/

# include <stdio.h>
# include <stdlib.h>
# include <math.h>

    float hT,vH, pD,sB,tD,sL;

    main(){

        printf("\n Insirir quantidade de horas trabalhadas/mensal: \n");
        scanf("%f",&hT);

        printf("\n Insirir valor hora de trabalho: \n");
        scanf("%f",&vH);

        printf("\n Insirir valor percentual de desconto: \n");
        scanf("%f",&pD);

        sB = (hT * vH);

        tD = (pD/100)*sB;

        sL = sB - tD;

        printf("\n Qantidade de Horas Trabalhadas: %.2f \n",hT);
        printf("\n Valor Salario Bruto: R$ %.2f \n",sB);
        printf("\n Valor Desconto: R$ %.2f \n",tD);
        printf("\n Valor Salario Liquido: R$ %.2f \n",sL);








    return 0;

    }
