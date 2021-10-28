package lab6;

	import java.util.*;  
	import java.util.Map.*; 
	public class SortedAsList {
		Map<String, Integer> map = new HashMap<String, Integer>();  
		public static void main(String[] args)   
		{     
		SortedAsList sal = new SortedAsList();  
		sal.createMap();  
		System.out.println("Sorting the values in ascending order:");  
		sal.sortByValue(true);  
		System.out.println("Sorting the values in  descending order");  
		sal.sortByValue(false);  
		}  
		void createMap()   
		{  
		map.put("KTM", 6500000);  
		map.put("HayaBusa", 1640000);  
		map.put("R15", 4600000);  
		map.put("BMW", 1700478);  
		map.put("Audi", 7600000);  
		map.put("RoolsRoyce", 99800000);
		map.put("Lambhorgini",59600000);
		
		System.out.println("Before sorting: ");  
		printMap(map);  
		}  
		void sortByValue(boolean order)   
		{  
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());  
		Collections.sort(list, new Comparator<Entry<String, Integer>>()   
		{  
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)   
		{  
		if (order)   
		{  
		return o1.getValue().compareTo(o2.getValue());}   
		else   
		{  
		return o2.getValue().compareTo(o1.getValue());  
		}  
		}  
		});  
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();  
		for (Entry<String, Integer> entry : list)   
		{  
		sortedMap.put(entry.getKey(), entry.getValue());  
		}  
		printMap(sortedMap);  
		}  
		public void printMap(Map<String, Integer> map)   
		{  
		System.out.println("Company\t Price ");  
		for (Entry<String, Integer> entry : map.entrySet())   
		{  
		System.out.println(entry.getKey() +"\t"+entry.getValue());  
		}  
		System.out.println("\n");  
		}
	}

