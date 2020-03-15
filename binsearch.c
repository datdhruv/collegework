#include <stdio.h>
void main() {
	int i,j,mid,low,high,size_arr,len,sc;
	int my_arr[]={0,1,2,3,4,5,6,7,8,9};
	
	len = 10;
	low = 0;
	high = len;

	printf("Enter search element\n");
	scanf("%d",&sc);
	
	while (low < high){	
	mid = (low + high)/2;

	if (mid == sc || high == low){
	printf ("%dth element",mid+1);
	low = high;	
	}
	
	if (sc < my_arr[mid]) {
			high = mid - 1;
			printf("%d %d %d\n",low,high,mid); 
	}

	if (sc > my_arr[mid]) {
		low = mid + 1;
		printf("%d %d %d\n",low,high,mid);
	}
	}
}

