#include<stdio.h>
#include<string.h>

int StringLength(char str[])
    {
        int length=0;
        while(str[length] != '\0')
        {
            length++;
        }
        return length;
    }

void stringConcatenate(char dest[],char src[])
{
    int destLength=StringLength(dest);
    int i=0;
    while(src[i]!='\0')
    {
      dest[destLength + i]=src[i];
      i++;
    }
    dest[destLength + i]='\0';
    printf("%s\n",dest);
}
// Function to compare two string

int stringCompare(char str1[],char str2[])
{
    int i=0;
    while(str1[i]!='\0' && str2[i]!='\0'){
        if(str1[i]<str2[i]){
            return -1;
        }
        else if(str1[i]>str2[i])
        {
            return 1;
        }
        i++;
    }
    if(str1[i]=='\0' && str2[i]=='\0'){
        return 0;
    }
    else if(str1[i]=='\0'){
        return -1;
    }
    else{
        return 1;
    }
}

int main()
{
    char str1[30]="Programing";
    char str2[20]="Language";
    // print original string
    printf("String 1:%s\n",str1);
    printf("String 2:%s\n",str2);

    // find the string length
    printf("length of a string1: %d\n",StringLength(str1));
    printf("length of a string2: %d\n",StringLength(str2));

    // string concatenation
    stringConcatenate(str1,str2);
    
    int comparisionresult =stringCompare("Hello","Hell");
    // condition
    if(comparisionresult ==0)
    {
       printf("String1 and string2 are equal\n");
    }
    else if(comparisionresult<0){
        printf("String1 is lesser than string2\n");
    }
    else{
        printf("String2 is lesser than string1\n");
    }
    return 0;

}
