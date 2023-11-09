#include<stdio.h> 

int sum(int, int);
//Cover the mixing of function calls with variable names
int sum(int x, int y){
    int sum = x + y;
    return sum;
}

int main(void){
    int x = 1;
    int y = 2; 
    int foo = sum(x , y);
    printf("%d\n", foo);


}

