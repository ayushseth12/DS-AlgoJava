package ayseth;

/**
 * Created by ayseth on 08/02/17.
 */
public class ConsecutiveElementsArray {

    boolean isConsecutiveElements(int[] arr){

        if(arr.length==0)
            return false;
        int n=arr.length;
        int max=getMax(arr);
        int min=getMin(arr);
        if(max-min+1==n)
            return true;
        else
            return false;
    }

    int getMax(int[] arr){

        int max=arr[0];
        for(int i=0;i<arr.length;i++)
            if(max<arr[i])
                max=arr[i];
        return max;

    }
    int getMin(int[] arr){

        int min=arr[0];
        for(int i=0;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];
        return min;
    }
    public static void main(String[] args){

        ConsecutiveElementsArray array=new ConsecutiveElementsArray();
        int[] arr={1,2,3,-4};
        System.out.println("Are the consecutive elements present in array=="+array.isConsecutiveElements(arr));



    }

}
