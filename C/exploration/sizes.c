#include <stdio.h>
typedef struct Node{
	int value;
	Node * next;
	char label;
}; 

int main(void){
	char charEx = 'A';
	short shortEx = 0;
	int intEx = 0;
	long longEx = 0;
	long long longLongEx = 0; 
	float floatEx = 0; 
	double doubleEx = 0; 
	 
	printf("Size of char:      [%ld]\n", sizeof (char));
	printf("Size of short:     [%ld]\n", sizeof (short));
	printf("Size of int:       [%ld]\n", sizeof (int));
	printf("Size of long:      [%ld]\n", sizeof (long));
	printf("Size of long long: [%ld]\n", sizeof (long long));
	printf("Size of float:     [%ld]\n", sizeof (float));
	printf("Size of double:    [%ld]\n", sizeof (double));
	
	//we're not diving deep into pointers, but they can come up and its good to have a reference.
	//pointers are a reference to system memory, when you type &variable you're passing the memory 
	//address for the variable and is always a finite resource, though virtual memory systems 
	//obfuscate that on most operating systems.  
	printf("Size of char *:      [%ld]\n", sizeof (&charEx));
	printf("Size of short *:     [%ld]\n", sizeof (&shortEx));
	printf("Size of int *:       [%ld]\n", sizeof (&intEx));
	printf("Size of long *:      [%ld]\n", sizeof (&longEx));
	printf("Size of long long *: [%ld]\n", sizeof (&longLongEx));
	printf("Size of float *:     [%ld]\n", sizeof (&floatEx));
	printf("Size of double *:    [%ld]\n", sizeof (&doubleEx));

	//Exercise:  Predict the size of the node struct at the top of this file.  
	struct Node firstNode;

	return 0;
}
