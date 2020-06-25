package com.epam.Java8_lambda_streams;

import java.util.*;
import java.util.stream.Collectors;

public class Ques2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("anne");
        list.add("amplify");
        list.add("any");
        list.add("amp");
        list=search(list);
        for(String s:list)
            System.out.println(s);
    }
    static List<String> search(List<String> list)
    {
        return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }

}