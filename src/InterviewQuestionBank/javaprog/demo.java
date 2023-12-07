package InterviewQuestionBank.javaprog;//import org.testng.annotations.Test;

public class demo {

//	@Test
	public void stringdefine()
	{
		//How String objects  are stored in heap memory
		String a = "hello";
		String b = "hello";
		//In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
		
		a.concat("abc");
		System.out.println(a);
//		As multiple reference variables are referring to same  object, if one reference variable changes
//		the value of object, all other will be effected , so that is why they are immutable
		
		//Difference between equalsto and == ==
		String s1 ="Good";
		String s2= "Good";
		String s3=new String("Good");
		System.out.println(s1==s3);//compares reference
		System.out.println(s1.equals(s3));//compares content
		//ava StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same as String class 
		//except it is mutable i.e. it can be changed.

		//Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. 
		//So it is safe and will result in an order.
		StringBuffer sb=new StringBuffer("bad");
		
		sb.append("boy");
		System.out.println(sb);
		sb.insert(2, "Hi");
		System.out.println(sb);
		sb.replace(3, 5, "war");
		System.out.println(sb);
		sb.deleteCharAt(1);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		
		
		
		
		
	}
	
	
	
	
}
