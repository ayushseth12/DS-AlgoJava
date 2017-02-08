package ayseth;

/**
 * Created by ayseth on 08/02/17.
 */
public class BinarySearch {

    boolean binarysearch(int arr[],int key){

        int mid=(arr.length/2);
        int high=arr.length;
        int low=0;
        while(high>low){
            mid=(high+low)/2;
            if(arr[mid]==key)
                return true;
            if(arr[mid]>key)
                high=mid;
            else
                low=mid+1;
        }
        return false;
    }
    public static void main(String[] args){

        BinarySearch search =new BinarySearch();
        int[] arr={10,20,30,40,50,60,70};
        System.out.println("The key is present or not=="+search.binarysearch(arr,70));


    }

}
