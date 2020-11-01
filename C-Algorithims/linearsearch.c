#include <stdio.h>
void main() {
        int i,j,len,ele;

        printf("\nEnter The lenght of Array: ");
        scanf("%d",&len);

        int arr[len];
        printf("\nEnter the array elements: ");

        for(i=0;i<len;i++) {
                printf("\nEnter the %d element: ",i+1);
                scanf("%d",&arr[i]);
        }

        //linear search begines from here
        j = 1;                                                           //j shows if the element was found or not
        printf("**************************");
        printf("\nEnter the Search element: ");
        scanf("%d",&ele);

        for (i=0;i<len;i++) {
                if (ele == arr[i]) {
                        printf("Element Found!\nThe element is at the %d location\n",i+1);
                        j = 0;
                }
        }
