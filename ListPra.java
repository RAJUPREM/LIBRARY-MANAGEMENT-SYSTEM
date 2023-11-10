import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ListPra {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
//		ArrayList<String> lst=new ArrayList<String>();
//		
//		ArrayList<Integer> lst1=new ArrayList<Integer>();
//				
//		ArrayList<Student> lstudent=new ArrayList<Student>();
		
		List<String> lst=new ArrayList<String>();
		
		
		
		
		List<Integer> lst1=new ArrayList<Integer>();
		
		List<Student> lstudent=new ArrayList<Student>();
		
		List<Student> llstudent=new LinkedList<Student>();
		
		LinkedHashSet<Student> lhasset=new LinkedHashSet<Student>();
		
		Student s=new Student(1,"Raju","Dhanbad");
		Student s2=new Student(2,"Afrin","Dhanbad");
		Student s3=new Student(3,"Sami","Dhanbad");
		
		lstudent.add(s);
		lstudent.add(s2);
		lstudent.add(s3);
		lstudent.add(s3);
		
		lhasset.add(s);
		lhasset.add(s2);
		lhasset.add(s);
		
		lstudent.contains(s);
		
		
		for(Student tempStudent:lstudent)
		{
			System.out.println(tempStudent);
		}
		System.out.println("--------------------------------------------------");
		for(Student t:lhasset)
		{
			System.out.println(t);
		}
		
		//it does not follow the sequence
		Map<String,Student> hm=new HashMap<String,Student>();
		
		//it follow the sequence
		Map<String,Student> lhm=new LinkedHashMap<String,Student>();
		
		//it is use to sort
		Map<String,Student> tm=new TreeMap<String,Student>();
		
		
		hm.put("Z", s);
		hm.put("A", s2);
		hm.put("P", s3);
		
		
		lhm.put("A", s2);
		lhm.put("Z", s);
		lhm.put("P", s3);
		
		
		tm.put("A", s2);
		tm.put("Z", s);
		tm.put("P", s3);
		
		System.out.println("--------------------------------------------------");
		
		for(Map.Entry<String,Student> ltemp:hm.entrySet())
		{
			System.out.println("Key :"+ltemp.getKey()+" Value : "+ltemp.getValue());
		}
		System.out.println("--------------------------------------------------");
		for(Map.Entry<String,Student> ltemp:lhm.entrySet())
		{
			System.out.println("Key :"+ltemp.getKey()+" Value : "+ltemp.getValue());
		}
		System.out.println("--------------------------------------------------");
		for(Map.Entry<String,Student> ltemp:tm.entrySet())
		{
			System.out.println("Key :"+ltemp.getKey()+" Value : "+ltemp.getValue());
		}
		
		

	}

}
