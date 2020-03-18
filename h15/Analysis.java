package com.huawei.classroom.student.h15;
import java.io.*;
import java.util.*;


public class Analysis {
    public Analysis(){}

    public String readFromTxt(String filename) throws Exception {
        Reader reader = null;
        try {
            StringBuffer buf = new StringBuffer();
            char[] chars = new char[1024];
            reader = new FileReader(filename);
            int readed = reader.read(chars);
            while (readed != -1) {
                buf.append(chars, 0, readed);
                readed = reader.read(chars);
            }
            return buf.toString();
        } finally {
            close(reader);
        }
    }

    private void close(Closeable inout) {
        if (inout != null) {
            try {
                inout.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void getStringFrequent(String filename) throws Exception {
        HashMap<String,Integer> hashMap = new HashMap<>();
        String Gstsby = readFromTxt(filename);
        String [] word = Gstsby.split("\\s+");//用正则表达式以空格对字符串进行拆分

        for(String s:word){
            if(hashMap.containsKey(s)){
                int count = hashMap.get(s)+1;
                hashMap.put(s,count);
            }
            else{
                hashMap.put(s,1);
            }
        }//统计所出现单词的频率
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());//转换为List
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
