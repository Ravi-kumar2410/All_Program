package com.jsp.stringprogram;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Book {
   public static void main(String[]args) {
						String exp="a[b]";
						String s="ababbabb.aa.ba";
						Pattern p=Pattern.compile(exp);
						Matcher m=p.matcher(s);
						while(m.find())
						  System.out.println(m.group());

					}

	}


