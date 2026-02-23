import java.util.*;

public class trappedRainwater{ // O(n) complexsity 

    public static int trappedRain(int height[]){
        int n = height.length;
        
        // Calculate left max boundary -array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];  //starting index number will first same 
        for( int i=1; i<n ;i++){
            //leftMax[i-1] means that i is comparing with the left index element then we sey that i-1
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Calculate left max boundary -array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1]; //end index number will be same 
        for( int i=n-2; i>=0; i--){
            //rightMax[i+1] is means that i compareing with the right index element that called 
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
         //loop
        for( int i=0 ; i<n ; i++){
            //waterlevel = min(leftmax boundary , rightMax boundary);
            int waterLevel =Math.min(leftMax[i] , rightMax[i]);
            //trappedWater = waterlevel - height[i];
            trappedWater += waterLevel - height[i]; 
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRain(height));
    }
    
}
