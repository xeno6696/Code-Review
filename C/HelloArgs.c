#include<stdio.h>
#include<stdlib.h>
#include<string.h>

//prototypes for main function are discussed here:  https://en.cppreference.com/w/c/language/main_function

int main(int argc, char *argv[]){

    char * output = NULL;
    
    for(int i = 0; i < argc; i++){
        int argLength = strlen(argv[i]);                         //compute length of the argument
        output = realloc(output, argLength * sizeof(char) + 1);  //Allocate an array the size of the argument plus a null byte
        strncpy(output, argv[i], argLength);                     //copy the contents of input to output array
        output[argLength] = '\0';                                //null-terminate the string
        printf("%s\n", output);                                  //print the string
                                                    
    }
    printf("%s\n", "Freeing Memory!");
    free(output);                                                //always undo what was done (i.e. memory, closing files, etc.)  
    return EXIT_SUCCESS; //Or zero!
}