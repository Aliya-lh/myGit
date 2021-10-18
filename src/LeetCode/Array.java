package LeetCode;

import java.util.Arrays;

public class Array {
//    public static int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (nums[mid] > target) {
//                right = mid - 1;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        //1.数组 二分查找
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};//二分查找前提是数组中元素是有序的
//        int target = 5;
//        System.out.println(search(nums, target));
//    }

//
//    public static int search(int[] arr, int toFind) {
//        int left = 0;
//        int right = arr.length - 1;
//        while (left <= right) {//防止交叉
//            int mid = (left + right) / 2;
//            if (toFind>arr[mid]) {//如果要找的这个数大于中间数，那么就从中间数的右侧开始查找
//                left = mid+1;
//            }else if(toFind<arr[mid]){//如果要找的这个数小于中间数，那么就从中间数的左侧开始查找
//                right = mid-1;
//            }else if(toFind == arr[mid]){
//               return mid;//找到了 返回中间值
//            }
//        }
//        return -1;//没找到 返回-1
//    }
//
//    public static void main(String[] args) {
//        //二分查找
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int toFind = 6;
//        int result = search(arr,toFind);
//        System.out.println("找到了！其下标是"+result);
//    }


//public int[] twoSum(int[] nums, int target) {
//    int[] arr = new int[2];
//    int len = nums.length;
//    for (int i = 0; i < len - 1; i++) {
//        for (int j = i + 1; j < len; j++) {
//            if (nums[i] + nums[j] == target) {
//                arr[0] = i;
//                arr[1] = j;
//            }
//        }
//    }
//    return arr;
//}


//给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
//
//    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//
//    你可以按任意顺序返回答案。

    //算法描述:排序后折半查找法
    // 先将元素nums拷贝一份为copiedNums，然后将原数组排序，
    // 接着遍历排序后的数组，以遍历到的数字之后的数列执行折半查找，查找目标为target - nums[i]。
    // 因为原数组排序后丢失原下标信息，因此执行折半查找得到n0和n1(n0 + n1 = target)后，
    // 再遍历两次copiedNums分别得到n0和n1在copiedNums中的下标(原下标)。
    // 排序和折半查找可以调用Arrays静态方法Arrays.sort()和Arrays.binarySearch()，也可以自己实现。
    // 代码示例中排序用Arrays.sort()，折半查找用自己实现的版本。


//    public int[] twoSumSortBinarySearch(int[] nums, int target) {
//        int[] res = new int[2];
//        int[] resVal = new int[2];
//        int[] copiedNums = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(nums);
//        int n1 = -1;
//        for (int i = 0; i < nums.length; i++) {
//            resVal[0] = nums[i];
//            resVal[1] = target - resVal[0];
//            // 也可以用Arrays自带的折半查找方法Arrays.binarySearch()，
//            // 但要注意判断返回值的地方要做相应修改。
//            // n1 = Arrays.binarySearch(nums, i + 1, nums.length -1 , resVal[1]);
//            n1 = binarySearchBasic(nums, i + 1, resVal[1]);
//            if(n1 != -1) {
//                break;
//            }
//        }
//        if(n1 == -1) {
//            return new int[] {};
//        }
//        for (int j = 0; j < copiedNums.length; j++) {
//            if(copiedNums[j] == resVal[0]) {
//                res[0] = j;
//                break;
//            }
//        }
//        for (int k = 0; k < copiedNums.length; k++) {
//            // 注意不能是同一个元素，需加上 k != res[0] 条件
//            if(copiedNums[k] == resVal[1] && k != res[0]) {
//                res[1] = k;
//                break;
//            }
//        }
//        return res;
//    }
//
//    private int binarySearchBasic(int[] arr, int low, int target) {
//        int high = arr.length - 1;
//        while(low <= high) {
//            int center = (low + high) / 2;
//            if(target == arr[center]) {
//                return center;
//            }
//            else if(target < arr[center]) {
//                high = center - 1;
//            }
//            else {
//                low = center + 1;
//            }
//        }
//        return -1;
//    }


//    给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
//    不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
//    public int removeDuplicates(int[] nums) {
//        //使用双指针
//        if(nums==null||nums.length==1){
//            return nums.length;
//        }
//        int i = 0;
//        int j = 1;
//        while(j<nums.length){
//            if(nums[i]==nums[j]){
//                j++;
//            }else{
//                i++;
//                nums[i]=nums[j];
//                j++;
//            }
//        }
//        return i+1;
//    }


//    //    给定一个整型数组, 实现冒泡排序(升序排序)
//    //方法1
//    public static void main(String[] args) {
//        int[] arr = {1,5,4,3,8,7,9,36};//定义一个数组
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));//将数组以字符串的方式打印出来
//
//}
//    public static void bubbleSort(int[] arr){
//        for(int i = 0;i<arr.length;i++){//通过这个循环来控制循环的趟数
//            for (int j = 1; j < arr.length-i; j++) {//通过这个循环来控制相邻元素的比较
//                if (arr[j-1] > arr[j]) {//注意！！谨防数组越界！！
//                    int tmp = arr[j - 1];//如果后一个元素小于前一个元素，就将交换两个元素的位置
//                    arr[j - 1] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//    }

//    public static void main(String[] args) {
//        //冒泡排序2
//        int[] arr = {1,5,4,3,8,7,9,36};//定义一个数组
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//


//    public static void main(String[] args) {
//        //给定一个整型数组, 判定数组是否有序（递增）
//        int[] arr = {9,5,2,7};
//        System.out.println(isSort(arr));
//    }
//    public static boolean isSort(int[] arr) {
//        for (int i = 1; i < arr.length - 1; i++) {
//            if (arr[i - 1] < arr[i]) {
//                return true;
//            }
//        }
//            return false;
//
//    }


//    public static void main(String[] args) {
//        //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
//        int[] arr = {1,2,3,4,5,6};
//        int[] newarr = copyOf(arr);
//        System.out.println(Arrays.toString(newarr));
//    }
//    public static int[] copyOf(int[] arr){
//        int[] arr2 = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr2[i] = arr[i];
//        }
//        return arr2;
//    }
//


//    public static void main(String[] args) {
//        //数组转字符串
//        //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
//        // 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
//        int[] arr = {1,2,3};
//        String a = toString(arr);
//        System.out.println(a);
//    }
//   public static String toString(int[] arr){
//        String a = "[";
//       for (int i = 0; i < arr.length; i++) {
//           a += arr[i];
//           if(i !=arr.length-1){
//               a +=",";
//           }
//       }
//       a +="]";
//       return a;
//   }

}
















