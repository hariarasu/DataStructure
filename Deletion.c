// Deletion
#include<stdio.h>

int main(){
int array[10]={1,2,3,4,5};

//size of the array
int size = 5;
int n; 
//Position to be works as static

int position;
printf("Enter the position :");
scanf("%d",&position);
printf("array before deletion: \n");
for(int i=0;i<size;++i)
{
   printf("%d ",array[i]);
}

if(position < 0 || position >=size )
{
    printf("Invalid position for deletion\n");
    // printf("%d",array[i]);
}
else
    {
        for(int i=position;i<size-1;++i)
        {
            array[i]=array[i+1];
        }
            size--;
    }

//shift the element to be remove

printf("\nUpdate array after the deletion: \n");
for(int i=0;i<size;++i){
printf("%d ",array[i]);

}
return 0;
}