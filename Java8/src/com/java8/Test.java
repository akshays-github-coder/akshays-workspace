package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		int[] numsArray = new int[] {2,7,11,15};
		Integer target = 9;
		twoSum(numsArray, target);
	}
}

		public static int[] twoSum(int[] nums, int target) {
			HashMap<Integer,int []> map=new HashMap<>();
			for (int i = 0; i < nums.length; i++) {
				if(map.get(target-nums[i])!=null){
					map.get(target-nums[i])[1]=i;
					return map.get(target-nums[i]);
				}else{
					int arr[]= new int[2];
					arr[0]=i;
					map.put(nums[i],arr);
				}
			}
			return nums;
			
		}

