#include <stdio.h>

int main() {
    printf("Bem vindo \nao\nC!\n");
    int a, b;
    float media;

    scanf("%d %d", &a, &b);
    media = (float)(a + b) / 2;

    printf("A media de %d e %d eh igual a: %.2f", a, b, media);

    return 0;
}
