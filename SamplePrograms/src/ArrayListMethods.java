import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		List<Integer> li=new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		
		System.out.println(li);
		
		System.out.println(li.size());
		System.out.println(li.get(4));	
		System.out.println(li.indexOf(40));
		System.out.println(li.contains(30));
      
      List<Integer> arrayList=new ArrayList<Integer>();
      
      arrayList.addAll(li);
      System.out.println(arrayList);
      arrayList.add(70);
      arrayList.add(80);
      System.out.println(arrayList);
      
      arrayList.retainAll(li);
      System.out.println(arrayList);
      
      for (Integer integer : arrayList) {
    	  System.out.println(integer);
		
	}
      
      System.out.println(li.set(2, 90));
     
	}

}
