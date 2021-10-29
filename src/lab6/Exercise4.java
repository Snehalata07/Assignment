package lab6;

	import java.util.*;
	import java.util.Map.*;
	public class Exercise4 {
		public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
	    {
	           HashMap<String,String> Medal = new HashMap<>();
	           Set<String> set = stu.keySet();
	           for(String s:set)
	           {
	                  Integer marks = stu.get(s);
	                  if(marks>=90)
	                  {
	                        Medal.put(s,"Gold Medal");
	                  }
	                  else if(marks >=80)
	                  {
	                        Medal.put(s,"Silver Medal");
	                  }
	                  else if(marks>=70)
	                  {
	                        Medal.put(s,"Bronze Medal");
	                  }
	           }
	           return Medal;
	    }
	    public static void main(String[] ar)
	    {
	           HashMap<String,Integer> student = new HashMap<>();
	           Exercise4 sc = new Exercise4 ();
	        
	           student.put("Student-1 achieved",94);
	           student.put("Student-2 achieved",75);
	           student.put("Student-3 achieved",86);
	           student.put("Stuent-4 achieved",97);
	           student.put("Student-5 achieved",88);
	           System.out.println(sc.getStudent(student));
	    }
	}

