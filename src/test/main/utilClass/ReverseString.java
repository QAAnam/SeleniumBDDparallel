package utilClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

	public static String reverseString(String s) {
		char[] schar = s.toCharArray();
		String s1 = "";
		for (Character c : schar) {
			s1 = String.valueOf(c) + s1;
		}
		return s1;
	}

	public static void main(String[] args) {
//		String x = reverseString(" chacha chaudhari");
//		System.out.println(x);
//		String z = typeCharNtimes(" 7a1B2C3DE4y78");
//		System.out.println(z);
//		int p = occurance("anamkumaranamanamkumar","a");
//		System.out.println(p);
//		String a = pelindrom("Anamanaa");
//		System.out.println(a);
//		a = pelindrom("Anamana");
//		System.out.println(a);
//		p = occurance("anamkumaranamanamkumar","am");
//		System.out.println(p);
//		occurance_of_caharaters("anamkumaranamanamkumar");
//		anagram("anam", "aman");
//		anagram("anam", "amar");
//		anagram("anam", "amam");
//		String q = longest_palindrom_present("anamamana");
//		System.out.println(q);
//		q = longest_palindrom_present("aaanamamana");
//		System.out.println(q);
//		String q = longest_palindrom_present("pppppppppppppppppppppppppaaaaanamanaaaaa");
//		System.out.println(q);
//		String_Contains_Only_Digits("1234567782465");
//		String_Contains_Only_Digits("123456a7782465");
//		String_Contains_Only_Digits("123456 7782465");
//		numberofstringinastring("1234abcd1234abcd");
//		numberofstringinastring("anamkumaranamanamkumar","am");
//		aabbbcc_a2b3c2("aabbbccabcaabbccaaabbbcccd");
		findMax();
		findMax1();
	}
	public static void findMax1(){
		{
			int[] li = {5, 6, 4, 7, 2, 9, 4, 1, 9, 6};
			System.out.println(Arrays.toString(li));

			for(int i =0; i<li.length;i++)
			{
				for(int j=i;j<li.length;j++)
				{
					if(li[j]>li[i])
					{
						int temp=li[i];
						li[i]=li[j];
						li[j]=temp;
						
					}
				}
				
			}
			System.out.println(Arrays.toString(li));
			
			
		}
	}
	public static void findMax(){
		{
			List< Integer> li = new ArrayList<Integer>();
			li.add(5);li.add(6);li.add(2);li.add(9);
			System.out.println(li);
			for(int i =0; i<li.size();i++)
			{
				for(int j=i;j<li.size();j++)
				{
					if(li.get(j)>li.get(i))
					{
						int temp=li.get(i);
						int temp1 = li.get(j);
						li.remove(i);
						li.add(i, temp1);
						li.remove(j);
						li.add(j, temp);
						
					}
				}
				System.out.println(li);
			}
			System.out.println(li);
			
			
		}
	}
	public static void aabbbcc_a2b3c2(String s)
	{
		char last_char = 0;
		int word_count = 1;
		String word = "";
		for(int i=0; i<s.length();i++)
		{
			if(i+1<s.length())
			{
				if(s.charAt(i)==s.charAt(i+1))
				{
					last_char=s.charAt(i);
					word_count++;
					
				}
				else
				{
					word=word+s.charAt(i)+word_count;
					word_count=1;
				}
			}
			else
			{
				if(s.charAt(i)==s.charAt(i-1))
				{
					last_char=s.charAt(i);
					word=word+s.charAt(i)+word_count;
					word_count=1;
				}
				else
				{
					word=word+s.charAt(i)+word_count;
					word_count=1;
				}
			}
		}
		System.out.println(word);
		
	}
	public static void numberofstringinastring(String s, String s1)
	{
		char[] schar = s.toCharArray();
		int word_count =0;
		for(int i=0;i<s.length();i++)
		{
			String word = "";
			for(int j=i;j<s.length();j++)
			{
				word=word+schar[j];
				if(word.equalsIgnoreCase(s1))
				{
					word_count++;
				}
			}
			
			
		}
		System.out.println(word_count);
	}
	public static void numberofstringinastring(String s)
	{
		char[] schar = s.toCharArray();
		int word_count =0;
		int num_count =0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(schar[i]))
			{
				num_count++;
			}
			else
			{
				word_count++;
			}
		}
		System.out.println("num_count = "+ num_count + " num_count = "+ num_count);
	}
	public static void String_Contains_Only_Digits(String s)
	{
		boolean is_digit = true;
		char[] schar = s.toCharArray();
		for(Character c: schar)
		{
			if(Character.isDigit(c))
			{
				
			}
			else
			{
				is_digit=false;
			}
		}
		if(is_digit)
		{
			System.out.println("is digits");
		}
		else
		{
			System.out.println("not a didgit");
		}
	}
	public static String longest_palindrom_present(String s)
	{
		String longest_palindrom="";
		
		char[] schar = s.toCharArray();
		String palindron="";
		int n = schar.length;
		for(int i=0; i<n; i++)
		{
			String sub="";
			for(int j=i; j<n; j++)
			{
				sub=sub+schar[j];
				
				String revsub = reverseString(sub);
				
				if (sub.equalsIgnoreCase(revsub) && sub.length()>longest_palindrom.length())
				{
					longest_palindrom=sub;
				}
			}
			
		}
		return longest_palindrom;
		
	}
	public static void anagram(String s, String as)
	{
		char[] schar = s.toCharArray();
		char[] aschar = as.toCharArray();
		boolean anagram = false;
		if(schar.length != aschar.length)
		{
			System.out.println(" Not a anagram");			
		}
		else 
		{
			for (Character c : schar)
			{
				int countc1=0;
				for(Character c1 : schar)
				{
					if(c==c1)
					{
						countc1++;
					}
				}
				int countc2=0;
				for(Character c2 : aschar)
				{
					if(c==c2)
					{
						countc2++;
					}
				}
				if(countc1==countc2)
				{
					anagram=true;
				}
				else
				{
					anagram=false;
					break;
				}
			}
			if(anagram)
			{
				System.out.println("This is anagram");
			}
			else {
				
				System.out.println("This is not an anagram");
				
			}
		}
	}
	public static void occurance_of_caharaters(String s)
	{
		char[] schar = s.toCharArray();
		List<Character> li = new ArrayList<Character>();
		li.add(schar[0]);
		boolean Add = true;
		for(Character ch : schar)
		{
			for(int i =0; i<li.size();i++)
			{
				if (ch == li.get(i))
				{
					Add= false;
				}
			}
			if(Add)
			{
				li.add(ch);
				
			}
			Add= true;
		}
		System.out.println(li);
		
		for (Character charc : li )
		{
			int count=0;
			for(Character charct: schar)
			{
				if(charc==charct)
				{
					count++;
				}
			}
			System.out.println(charc +" = "+ count);
		}
	}
	public static Integer Occerance(String S, Character c)
	{
		int count =0;
		char[] schar = S.toCharArray();
		for (Character ch: schar)
		{
			if (ch==c)
			{
				count++;
			}
		}
		return count;
	}
	public static String pelindrom(String s)
	{
		String c="false";
		if (s.equalsIgnoreCase(reverseString(s)))
		{
			c="true";
		}
		return c;
	}

	public static Integer occurance(String s, String sb) {
		int count = 0;
		char[] schar = s.toCharArray();
		char[] sbchar = sb.toCharArray();
		for (int i = 0; i < schar.length; i++) {
			String subString="";

			if(sbchar[0]==schar[i])
			{
				for (int j = 0; j < sbchar.length; j++) {
					if(i+j >= schar.length) break;
					else subString=subString+schar[i+j];
					
				}
				if (subString.equalsIgnoreCase(sb))
				{
					count++;
				}

			}

		}

		return count;

	}

	public static String typeCharNtimes(String s) {
		String s1 = "";
		String x = "";
		char[] schar = s.toCharArray();
		for (int i = 0; i < schar.length; i++) {

			if (Character.isDigit(schar[i])) {
				for (int j = 0; j < Character.getNumericValue(schar[i]); j++) {
					s1 = s1 + x;
				}
				x = "";
			} else {
				x = x + schar[i];
			}
		}
		return s1;
	}
}
