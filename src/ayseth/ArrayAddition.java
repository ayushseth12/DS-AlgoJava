package ayseth;

//Problem Statement:Given two numbers in form of array add them

import java.util.ArrayList;

public class ArrayAddition {

	int[] sum(int arr[],int arr1[]){

	int length1=arr.length;
	int length2=arr1.length;
	int i,j;

	//	ArrayList<Integer> list=new ArrayList<>();

		if(length1>length2)
	{
		int result[] = new int[length1];
		for(int k=0;k<length1-1;k++)
			result[k]=0;
		int carry=0;
		int sum;
		for(i=length1-1,j=length2-1;i>=0 && j>=0;i--,j--)
		{
			if(carry==0) {
				sum = arr[i] + arr1[j];
				carry=0;
			}
			else {
				sum = arr[i] + arr1[j] + 1;
				carry=0;
			}
			if(sum/10==1) {
				carry = 1;
				sum=sum%10;
			}
			result[i]=sum;
		}
		while(i>=0) {
			if (carry == 1) {
				sum = arr[i] + 1;
				carry = 0;
			} else
				sum = arr[i];
			if(sum/10==1) {
				carry = 1;
				sum=sum%10;
			}
			result[i]=sum;
			i--;
		}
		if(carry==1)

	return result;
	}else{
			int carry=0;
			int sum;
			int result[] = new int[length2];
			for(int k=0;k<length2-1;k++)
				result[k]=0;
			for(i=length1-1,j=length2-1;i>=0 && j>=0;i--,j--)
			{
				if(carry==0) {
					sum = arr[i] + arr1[j];
					carry=0;
				}
				else {
					sum = arr[i] + arr1[j] + 1;
					carry=0;
				}
				if(sum/10==1) {
					carry = 1;
					sum=sum%10;
				}
				result[j]=sum;
			}
			while(j>=0) {
				if (carry == 1) {
					sum = arr1[j] + 1;
					carry = 0;
				} else
					sum = arr1[j];
				if(sum/10==1) {
					carry = 1;
					sum=sum%10;
				}
				result[j]=sum;
				j--;
			}
			return result;
	}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-genunerated method stub
	int arr[]={1,2,3,4,5,6,7};
	int arr1[]={8,7,6,5,4,3,3};
	ArrayList<Integer> result=new ArrayList<>();

	ArrayAddition add=new ArrayAddition();

	int[] result1=add.sum(arr,arr1);

	System.out.println("The result is");
	for(int i=0;i<result1.length;i++){
		System.out.print(result1[i]);
	}

	}

}
