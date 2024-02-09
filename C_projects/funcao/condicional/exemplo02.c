#include <stdio.h>
#include <ncurses.h>
#include <locale.h>

        float vlanche, vrefri, vfinal,vdesc;
        int qlanche, qrefri;
        char resp;

    int main(){
        setlocale(LC_ALL, "PORTUGUESE");

        initscr();
        cbreak();


        printw("\n\n Informe a quantidade do Lanche: ");
        refresh();
        scanw("%i", &qlanche);

        printw("\n\n Informe o Valor do Lanche: ");
        refresh();
        scanw("%f", &vlanche);

        printw("\n\nDeseja refrigerante (S | N): ");
        refresh();
        resp = getch();

        vfinal = 0;
        if(resp == 's' || resp == 'S'){
            printw("\n\nInforme o valor do Refrigerante: ");
            refresh();
            scanw("%f", &vrefri);
            printw("\nInforme a quantidade de Refrigerante: ");
            refresh();
            scanw("%d", &qrefri);
            vfinal = (float)(vlanche*qlanche + vrefri * qrefri);
        } else
            if (resp == 'n' || resp == 'N'){
                    vfinal = vlanche * (float)qlanche;
            }
        if(vfinal > 20.0){
            printw("[\n\n ***Você ganhou desconto de 10%% ***\n\n");
            vdesc = vfinal * 0.1;
            vfinal -= vdesc;
        }

        mvprintw(10, 0, "\n\n *** O Valor final é %.2f ***\n", vfinal);
        refresh();

        endwin();

    return 0;
}


