#include<stdio.h>
int main()
{
    int arr[10]={1,2,3,4,5};
    // size of array
    int size=5;
    // element in array
    int element=10;
    // position to be define
    int position;
    printf("Enter the position number\n");
    scanf("%d",&position);
    printf("Before the inserton\n");
    for(int i=0;i<size;++i)
    {
        printf("%d ",arr[i]);
    }
    if(position < 0 || position >size)
    {
        printf("Invalid position\n");
    }
    // shift elemnt to make space between
    for(int i=size-1;i>=position;--i)
    {
      arr[i+1]=arr [i];
    //   insert the new element
      arr[position]=element;
    //   update the size of the array
      size++;
    //   peint the updated array
    printf("\nAfter the inserton\n");
    for (int i = 0; i < size; ++i) {
        printf("%d ", arr[i]);
    }
    }
    return 0;
}