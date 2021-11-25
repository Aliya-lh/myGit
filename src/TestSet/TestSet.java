package TestSet;

import java.util.*;

public class TestSet {
    public static void main1(String[] args) {
        //Collection接口
        Collection<Integer> collection = new ArrayList<>();

        //collection.add("lhhhhh");
        collection.add(123);
        collection.add(1);
        System.out.println(collection);
        collection.remove(123);
        System.out.println(collection);
        collection.isEmpty();
        System.out.println(collection);
        collection.size();
        System.out.println(collection);
        //问题：注意！！！数组不能整体进行强制类型转换
//        Integer[] array =(Integer[]) collection.toArray();
//        System.out.println(Arrays.toString(array));

        Object[] array2 = collection.toArray();
        System.out.println(Arrays.toString(array2));
    }



    //Map接口
    public static void main(String[] args) {
        //哈希表在存放元素的时候，是根据某种函数来存储的
        Map<Integer,String> map = new HashMap<>();
        map.put(2001,"lhhhh");
        map.put(1990,"bit");
        map.put(1988,"byte");
        System.out.println(map);
        String ret = map.get(1988);//根据key查找对应的value
        String ret2 = map.getOrDefault(1984,"找不到的默认值");
        System.out.println(ret);
        System.out.println(ret2);
        System.out.println(map.containsKey(1981));

        //Map中比较难的 Set<Map.Entry<K,V>>entrySet()方法 将所有键值对返回
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        for (Map.Entry<Integer,String> en : entrySet){//遍历这个集合
            System.out.println(en.getKey()+"-->"+en.getValue());

        }
    }



}
