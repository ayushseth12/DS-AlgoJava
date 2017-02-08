package ayseth;

/**
 * Created by ayseth on 08/02/17.
 */
public class AirthmeticMissingNumber {

    int missingnumber(int arr[]){

    if(arr.length<=3)
        return 0;

        int diff=Math.min(arr[1]-arr[0],arr[2]-arr[1]);

        int low=0;
        int high=arr.length;

        while(low<high){
            int mid=(low+high)/2 ;
            if((arr[mid]-arr[low])!=((mid-low)*diff))
                high=mid;
            else
                low=mid+1;
        }
        return arr[high]-diff;

    }


    public static void main (String[] args){

        AirthmeticMissingNumber search=new AirthmeticMissingNumber();
        int[] arr={1,3,5,7,9,13,15};
        System.out.println("The missing number is"+search.missingnumber(arr));

    }

}
