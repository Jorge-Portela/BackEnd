#include <stdio.h>
#include <curses.h>

    int main(){
        char ch;
        printf("DIgite um caractere: ");
        ch = getch();
        printf("\nO caractere digite foi: %c\n",ch);

        return 0;


    }

