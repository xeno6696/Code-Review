#include <stdio.h>
#include <string.h>

int main(void){
	char input[] = "A New Hope";
	
	printf("%s\n",input);
	//Does gcc automatically supply a null-terminated byte in the char array?
	printf("Size of input = [%d]\n", sizeof input);
	printf("strlen of input = [%d]\n", strlen(input));	
	printf("size of char = [%d]\n", sizeof(char));


}
