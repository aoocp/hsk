package com.huawei.classroom.student.h16;
import java.util.*;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        HashMap<String,Integer> hashmap = new HashMap<>();
        String [] word = s.split("\\s+");
        for(String str:word){
            if(hashmap.containsKey(str)){
                int count = hashmap.get(str) + 1;
                hashmap.put(str,count);
            }
            else{
                hashmap.put(str,1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hashmap.entrySet());//转换为List
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });//重写compare方法，对value值进行降序排序
        //for-each循环
        for (Map.Entry<String, Integer> mapping : list){
            System.out.println(mapping.getKey()+": "+mapping.getValue());
        }
    }
}
