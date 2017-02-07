package ayseth;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ayseth on 08/02/17.
 */
public class Kdistanceduplicate {


    public boolean isKdistanceDuplicate(int[] arr,int k){
        Map map= new HashMap<Integer,Integer>();
        if(arr.length==0)
            return false;
        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){
              int l= (int) map.get(arr[i]);
                if(Math.abs(l-i)<=k) {
                  return true;
              } else
                  map.put(arr[i],i);
            }else
             map.put(arr[i],i);
        }
        return false;

    }

    public static void main(String[] args){

        Kdistanceduplicate isduplicate=new Kdistanceduplicate();
        int[] arr={1,2,3,4,5,6,7,8,5,10};
        System.out.println("Are Duplicate present in the array at a k distance==="+isduplicate.isKdistanceDuplicate(arr,2));



    }



}
