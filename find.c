#include<stdio.h>
#include<conio.h>

int main(){
    int i,n,ele;
    printf("Enter array size");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the element");
    for(int i=0;i<=n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the element to be search:");
    scanf("%d",&ele);
    for(i=0;i<n;i++)
    {
        if(arr[i]==ele)
        {
            printf("%d found at position %d",ele,i+1);
            return 0;
        }
    }
    printf("Not found");
}