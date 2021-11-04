package day20211103;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
     */

    public static void main1(String[] args) {
        int[] nums = new int[]{1, 4, 5, 6, 7, 9, 76, 43, 22, 11};
        int target = 11;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    private static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        //遍历查找
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            //判断键值是否存在
            if (map.containsKey(target - a)) {
                temp[0] = map.get(target - a);
                temp[1] = i;
                return temp;
            } else {//如果找不到则存进去
                map.put(nums[i], i);
            }
        }
        return null;
    }


    //给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。

    public static void main2(String[] args) {
        String Str = "aabcdfffwwesdwhjkl";
        int count = lengthOfLongestSubstring(Str);
        System.out.println(count);
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        List<Character> list = new ArrayList<>();
        int maxCount = 0;
        int count;
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) {
                count = list.size();
                if (count > maxCount) {
                    maxCount = count;
                }
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) != arr[i]) {
                        list.remove(j);
                        j--;
                    } else {
                        list.remove(j);
                        break;
                    }
                }
                list.add(arr[i]);
            } else {
                list.add(arr[i]);
            }
        }
        if (list.size() > maxCount) {
            return list.size();
        } else {
            return maxCount;
        }
    }


    /**
     * 给定两个大小为 m 和 n 的有序数组nums1 和nums2。
     * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为O(log(m + n))。
     * 你可以假设nums1和nums2不会同时为空
     */

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{1, 2};
        double arr = findMedianSortedArrays(nums1, nums2);
        System.out.println(arr);
    }

    public static int PartSort(int arr[], int low, int high) {
        int data = arr[low];
        /**一次遍历的方法：插空法 定义一个data将arr[low]存起来，并把这个位置挖空*/
        while (low < high) {
            while (low < high && arr[high] >= data) {
                high--;
            }
            arr[low] = arr[high];
            /**从high，也就是后面往前遍历 找到比键值小的数据 插入到前面留下的空中 high位再次留下空来*/
            while (low < high && arr[low] <= data) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = data;
        /**循环退出后 low和high重合 将将键值赋给第low，并将low返回*/
        return low;
    }


    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            //防止发生栈溢出异常
            int index = PartSort(arr, low, high);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int[] arr = new int[a + b];
        double result = 0.0;
        if (a >= 2 && b >= 2) {
            if (nums1[0] <= nums1[1] && nums2[0] <= nums2[1]) {
                if (nums1[0] >= nums2[0]) {
                    for (int i = 0; i < b; i++) {
                        arr[i] = nums2[i];
                    }
                    for (int i = 0; i < a; i++) {
                        arr[i + b] = nums1[i];
                    }
                } else {
                    for (int i = 0; i < a; i++) {
                        arr[i] = nums1[i];
                    }
                    for (int i = 0; i < b; i++) {
                        arr[i + a] = nums2[i];
                    }
                }
            } else if (nums1[0] >= nums1[1] && nums2[0] >= nums2[1]) {
                if (nums1[a - 1] <= nums2[b - 1]) {
                    for (int i = 0; i < a; i++) {
                        arr[i] = nums1[a - i - 1];
                    }
                    for (int i = 0; i < b; i++) {
                        arr[i + a] = nums2[b - i - 1];
                    }
                } else {
                    for (int i = 0; i < b; i++) {
                        arr[i] = nums1[b - i - 1];
                    }
                    for (int i = 0; i < a; i++) {
                        arr[i + b] = nums2[a - i - 1];
                    }
                }
            } else if (nums1[0] <= nums1[1] && nums2[0] >= nums2[1]) {
                if (nums1[0] <= nums2[b - 1]) {
                    for (int i = 0; i < a; i++) {
                        arr[i] = nums1[i];
                    }
                    for (int i = 0; i < b; i++) {
                        arr[i + a] = nums2[b - i - 1];
                    }
                } else {
                    for (int i = 0; i < b; i++) {
                        arr[i] = nums2[i];
                    }
                    for (int i = 0; i < a; i++) {
                        arr[i + b] = nums1[a - 1 - i];
                    }
                }
            } else if (nums1[0] >= nums1[1] && nums2[0] <= nums2[1]) {
                if (nums1[a - 1] <= nums2[0]) {
                    for (int i = 0; i < a; i++) {
                        arr[i] = nums1[a - 1 - i];
                    }
                    for (int i = 0; i < b; i++) {
                        arr[i + a] = nums2[i];
                    }
                } else {
                    for (int i = 0; i < b; i++) {
                        arr[i] = nums2[i];
                    }
                    for (int i = 0; i < a; i++) {
                        arr[i + b] = nums1[a - 1 - i];
                    }
                }
            }
        } else {
            for (int i = 0; i < a; i++) {
                arr[i] = nums1[i];
            }
            for (int i = 0; i < b; i++) {
                arr[i + a] = nums2[i];
            }
        }
        int right = arr.length - 1;
        int left = 0;

        quickSort(arr, left, right);

        int tmp = arr.length;
        if (tmp % 2 == 0) {
            result = (arr[tmp / 2] + arr[tmp / 2 - 1]) / 2.0;
        } else {
            result = arr[tmp / 2];
        }
        return result;
    }
}



