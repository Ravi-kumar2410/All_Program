package com.jsp.stringprogram;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Patternes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String exp="\\.";
				String s="ab.ab.babb.aa.ba";
				Pattern p=Pattern.compile(exp);
				Matcher m=p.matcher(s);
				while(m.find())
				  System.out.println(m.group());

			}

	}


