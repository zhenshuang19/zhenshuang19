package com.example.testchajian;

import com.example.testchajian.entity.Yuansai;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamTest {
    @Test
    public void test1(){
        Stream<Integer> integerStream = Stream.of(10, 12, 13, 15, 16);
        integerStream.forEach(integer -> System.out.println(integer));

        ArrayList<Integer> integers = Lists.newArrayList(1, 5, null, 6, 8, null);
        List<Integer> collect = integers.stream().filter(integer -> integer!=null).collect(Collectors.toList());
        System.out.println(collect);
    }
    @Test
    public void test2(){
        List<Yuansai> listPerson = new ArrayList<Yuansai>() {
            {
                //元素序列-----翻译过来就是集合中的所有元素对象
                add(new Yuansai(200, 24, 2022329, "males","maless","malesss","maleaa", 2000, 182,000, 18,2000, 18,2000));
                add(new Yuansai(201, 25, 2022329, "a","maless","malesss","maleaa", 2000, 182,000, 18,2000, 18,2000));
                add(new Yuansai(202, 26, 2022329, "c","maless","malesss","maleaa", 2000, 182,000, 18,2000, 18,2000));
                add(new Yuansai(203, 27, 2022329, "d","maless","malesss","maleaa", 2000, 182,000, 18,2000, 18,2000));
                add(new Yuansai(204, 28, 2022329, "f","maless","malesss","maleaa", 2000, 182,000, 18,2000, 18,2000));
                add(new Yuansai(205, 29, 2022329, "g","maless","malesss","maleaa", 2000, 182,000, 18,2000, 18,2000));
                add(new Yuansai(206, 30, 2022329, "hgj","maless","malesss","maleaa", 2000, 182,000, 18,2000, 18,2000));
                add(new Yuansai(207, 31, 2022329, "s","maless","malesss","maleaa", 2000, 182,000, 18,2000, 18,2000));
                add(new Yuansai(208, 32, 2022329, "sa","maless","malesss","maleaa", 2000, 182,000, 18,2000, 18,2000));
                add(new Yuansai(209, 33, 2022329, "asdf","maless","malesss","maleaa", 2000, 182,000, 18,2000, 18,2000));
            }
        };

        //获取集合中年龄大于三十的人的名字，返回集合
//        List<String> collect = listPerson
//                .stream()//创建Stream实例
//                .filter(e -> e.getPlayerId() > 30).map(e -> e.getWeizhi())//中间操作
//                .collect(Collectors.toList());//终端操作
//
//        System.out.println(collect);
        List<Object> collect1 = Stream.of(listPerson).filter(Objects::nonNull)//中间操作
                .collect(Collectors.toList());

        System.out.println(collect1);
    }
}
