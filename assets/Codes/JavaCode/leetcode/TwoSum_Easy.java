// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// Ex:- nums = [1,5,3,6,7]
//      target = 8

// OUTPUT:- [1,2]

// Explanations: bacause nums[1] + nums[2] == 8 we return 1,2 as their indices.

import java.util.Scanner;
// imported scanner class for taking input from user.

public class TwoSum_Easy {
    // classname TwoSum_Easy

    public static void main(String[] args) {
        // main fnc to run the code.

        System.out.print("\nEnter the Target: ");
        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        int target = sc.nextInt();

        int nums[] = {1,3,4,6,3,6,7,3,2,7,8,8,4,2,3,3,1};


        // Straight Combinations(single):-

        System.out.println("\nFinding values using Straight Combinations");

        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] + nums[i + 1] == target && nums[i] != nums[i + 1]){
                System.out.format("Found (%d , %d) at Index (%d , %d)\n" , nums[i] , nums[i + 1] , i , i + 1);
            }
        }

        // Multi Combinations:-

        System.out.println("\n\nFinding values using Multi Combinations\n");

        for(int i = 0 ; i < nums.length ; i++){
            
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target && nums[i] != nums[j]){
                    System.out.format("Found (%d , %d) at Index (%d , %d)\n" , nums[i] , nums[j] , i , j);
                }
            }
        }


        sc.close();
        // closing the obj of Scanner class so no further input could be taken; Not Necessary.
    }

    
}// class ends here.