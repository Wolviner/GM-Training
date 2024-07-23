package com.grayMatter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		//can have no duplicate keys but can have duplicate values
		
		//Maps cannot be iterated (none of them including hashmap)
		
		map.put(11,"Milton");
		map.put(9, "Thankan");
		map.put(23, "Bro");
		System.out.println(map);
		
		System.out.println(map.get(11));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
		map.put(null, "abd");
		map.put(null, "abc");//null can be used 
		System.out.println(map);
		System.out.println(map.get(null));
		map.put(4, "Chimni");
		
		Set<Entry<Integer,String>> entset=map.entrySet();
		Iterator<Entry<Integer,String>> itr=entset.iterator();
		
//		Using Iterator
		while(itr.hasNext())
			System.out.println(itr.next());
		
//		Traverse through map
		   for (Map.Entry<Integer,String> entry : map.entrySet())
		    {
		        System.out.println(entry.getKey() + " " + entry.getValue());
		    }
		
		   Employee e1=new Employee("Milton",999,999999999,"Angamaly");
			Employee e2=new Employee("Mi",666,9900010,"Chennai");
			Employee e3=new Employee("Milan",33,9900000,"DElhi");
			Employee e4=new Employee("Thorappan",222,9900000,"DElhi");
			Employee e5=new Employee("loom",33,0000,"DElhi");
			Employee e6=new Employee("doon",1111,1,"DElhi");
		   TreeMap<Integer,Employee> treemap=new TreeMap<Integer, Employee>();
		   treemap.put(1,e1);
		   treemap.put(2,e2);
		   treemap.put(3,e3);
		   treemap.put(4,e4);
		   treemap.put(5,e5);
		   treemap.put(6,e6);
		   
		   System.out.println(treemap);
		   
		   for(Entry<Integer,Employee> e:treemap.entrySet())
			   System.out.println(e);
		
		   TreeMap<Employee,Address> emp=new TreeMap<Employee,Address>();
		   
		   Address add=new Address("Assam","Guwahati");
		   emp.put(e1,add);
		   emp.put(e2, add);
		   
		   for(Entry<Employee,Address> f:emp.entrySet())
			   System.out.println(f);
		   
		   System.out.println("\n\n"+emp);

	}

}
