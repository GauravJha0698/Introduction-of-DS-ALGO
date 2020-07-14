package Arrays;

import java.util.*;

public class Triplets_sum {
	
	
public boolean twoSum(int a[],int x,int i){
	int j=a.length-1;
	while(i<j){
		if(a[i]+a[j]<x){
			i++;
		}else if(a[i]+a[j]>x){
			j--;
		}else{
			return true;
		}
	}
	return false;
	
}
public boolean triplets(int a[],int n){
	Arrays.sort(a);
	for(int i=0;i<n-2;i++){
		if(twoSum(a,-a[i],i+1))return true;
	}
	return false;
	
}

}
