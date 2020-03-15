#include <stdio.h>
void main() {
        int i,j,len,min,temp, arr[10];

        for(i=0;i<10;i++) {
                printf("Enter %d more numbers ",i);
                scanf(" %d",&arr[i]);
        }
        len = sizeof(arr)/sizeof(arr[0]);

        for (i=0;i<len;i++) {
                for (j=i;j<len;j++) {
                        if(arr[j] < arr[i]) {
                                temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                        }
                }
        }
        for (i=0;i<len;i++) {
                printf(" %d",arr[i]);
        }

}
