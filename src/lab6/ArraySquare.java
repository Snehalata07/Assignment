package lab6;

	import java.util.*;
	public class ArraySquare {
		 public static HashMap getSquare(int[] array) {
			    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();		 
			    for (int n: array) {
			      map.put( n, n*n);
			    }
			    return map;
			  }		 
			  public static void main(String[] args) {
			    int array[] = new int[]{89,45,35,444,328,76,129,84,97};
			    HashMap<Integer, Integer> hmap = getSquare(array);		 
			    Iterator<Integer> itr = hmap.keySet().iterator();
			    while(itr.hasNext()){
			    Integer key = itr.next();
			      System.out.println("the square of the no :- "+key + " is :- " + hmap.get(key));
			    }
			  }
	}

