package com.epam.Java8_lambda_streams;

import java.util.*;
import java.util.stream.IntStream;

public class Ques3 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("abba");
        list.add("amanda");
        list.add("bob");
        list.add("coop");
        list.add("clolc");
        list=palin(list);
        for(String s:list)
            System.out.println(s);
	}
	static List<String> palin(List<String> list)
    {
		List<String> list2=new ArrayList<String>();
		for(String s:list)
		{
			String t = s.replaceAll("\\s+", "").toLowerCase();
			if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
				list2.add(s);
		}
        return list2;
    }
	
}