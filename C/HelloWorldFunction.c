#include <stdio.h>

void helloWorld(char *);

void helloWorld(char * strInput){
    printf("%s\n", strInput);
}

int main(void){
    helloWorld("Hello World!");
    return 0;
}


