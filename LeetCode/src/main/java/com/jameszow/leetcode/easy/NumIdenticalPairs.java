/*
 * Copyright 2021 Apache All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package com.jameszow.leetcode.easy;

/**
 * 好数对的 数目
 * 好数对的意思是 一个数组里 相同的数字认为它们是一对好数对 比如
 * 输入 n = {1, 2, 3, 1, 1, 3}
 * 那么下标(0, 3), (0, 4), (0, 5), (2, 5) 是好数对
 * 返回 好数对 数目
 * 输出 n = 4
 */
public class NumIdenticalPairs {

   public static void main(String [] args){
       int [] n = {1, 2, 3, 1, 1, 3};
       System.out.println(numIdenticalPairs(n));
   }

   public static int numIdenticalPairs(int [] nums){
       int result = 0;
       for (int i = 0; i < nums.length; ++i){
           for (int j = i + 1; j < nums.length; ++j){
               if(nums[i] == nums[j]){
                   ++ result;
               }
           }
       }
       return result;
   }

}
