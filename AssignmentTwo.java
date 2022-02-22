
import java.util.*;
public class AssignmentTwo 
{
	

	public static void main(String[] args)
	{	
		try (Scanner scan = new Scanner(System.in)) 
		{
			System.out.println("Problem01: Enter the number of strings"); 
			int len = Integer.parseInt(scan.nextLine()); 
			String[] arr = new String[len];
			System.out.println("Please enter " + len + " Strings"); 
			for(int i = 0 ; i < arr.length ; i++)
			{
				arr[i] = scan.nextLine(); 
			}
			Problem01(arr); 
			
			
			//----------------------------------------
			
			System.out.println("Problem02: Enter the number of strings"); 
			int len2 = Integer.parseInt(scan.nextLine()); 
			String[] arr2 = new String[len2];
			System.out.println("Please enter " + len2 + " Strings"); 
			for(int i = 0 ; i < arr2.length ; i++) 
			{ 
				arr2[i] = scan.nextLine(); 
			}
			System.out.println(Problem02(arr2));
			
			//----------------------------------------
			
			
			System.out.println("Problem03: Enter the number of integers");
			int len3 = Integer.parseInt(scan.nextLine());
			Integer[] arr3 = new Integer[len3];
			System.out.println("Please enter " + len3 + " numbers"); 
			for(int i = 0 ; i < arr3.length ; i++) 
			{
				arr3[i] = Integer.parseInt(scan.nextLine());
			}
			System.out.println(Problem03(arr3));

			//----------------------------------------
			
			System.out.println("Problem04:Enter the number of strings");
			int len4 = Integer.parseInt(scan.nextLine()); 
			ArrayList<String> arr4 = new ArrayList<>(); 
			System.out.println("Please enter " + len4 + " Strings");
			for(int i = 0 ; i < len4 ; i++) 
			{
				arr4.add(scan.nextLine()); 
			}
			System.out.println(Problem04(arr4));
			
			//----------------------------------------
			  
			System.out.println("Problem05: Enter the number of strings"); 
			int len5 = Integer.parseInt(scan.nextLine());
			ArrayList<String> arr5 = new ArrayList<>(); 
			System.out.println("Please enter " + len5 + " Strings");
			for(int i = 0 ; i < len5 ; i++) 
			{
				arr5.add(scan.nextLine()); 
			}
			System.out.println(Problem05(arr5));
			
			//----------------------------------------
			
			System.out.println("Problem06: Enter the number of strings");
			int len6 = Integer.parseInt(scan.nextLine()); 
			ArrayList<String> arr6 = new ArrayList<>();
			System.out.println("Please enter " + len6 + " Strings");
			for(int i = 0 ; i < len6 ; i++) 
			{
				arr6.add(scan.nextLine());
			}
			System.out.println(Problem06(arr6));
		}
		catch (NumberFormatException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//-------------------------
	//Methods here 
	//-------------------------
	
	public static void Problem01(String[] S1) 
	{
		Map<String,Integer> maphash = new HashMap<>();
		for(String element : S1)
		{
			if(!maphash.containsKey(element) && !element.isEmpty())
			{
				maphash.put(element, 1);
			}
			else
			{
				maphash.computeIfPresent(element, (k, v) -> v + 1);
			}
		}
		
		System.out.println(maphash);
	}
	
	public static Map<String,String> Problem02(String[] S2)
	{
		Map<String,String> maphash2 = new HashMap<>();
		
		for(String element : S2) 
		{
			String val = "";
			for(int i=0;i<S2.length;i++)
			{
				if(element.charAt(0) == S2[i].charAt(0)) 
				{
					val = val + S2[i];
				}
			}
			if(!maphash2.containsKey(element.charAt(0) + ""))
				maphash2.put(element.charAt(0) + "", val);
		}
		
		return maphash2;
	}
	
	public static Set<Integer> Problem03(Integer[] I3) 
	{
		Set<Integer> S3 = new LinkedHashSet<>();
		for(int i=0 ; i < I3.length ; i++) {
			if(!S3.contains(I3[i])) {
				S3.add(I3[i]);
			}
			else {
				S3.add( I3[i] + 1 );
			}
		}
		
		
		return S3;
	}

	public static ArrayList<String> Problem04(ArrayList<String> al4)
	{
		ArrayList<String> al = new ArrayList<>();
		for(String element : al4) 
		{
			al.add(removeDuplicates(element));
		}
		
		return al;
	}
	
	static String removeDuplicates(String s)   
    {      
        LinkedHashSet<Character> set = new LinkedHashSet<>();   
        for(int i=0;i<s.length();i++)   
            set.add(s.charAt(i));   
        
        StringBuilder sbr = new StringBuilder();
        for (Character character : set) {
            sbr.append(character);
        }
        
        return sbr.toString();
           
    } 

	public static Map<String,String> Problem05(ArrayList<String> al5)
	{
		Map<String, String> maphash1  = new HashMap<>();
		
		for(String element : al5)
		{
	        int len5 = element.length();
	        String first = "" + element.charAt(0);
	        String last = "" + element.charAt(len5 - 1); 
	        maphash1.put(first, last);
		}
		return maphash1;
	}
	
	public static Map<String,Boolean> Problem06(ArrayList<String> m6)
	{
		Map<String,Boolean> maphash6 = new HashMap<>();
		Map<String,Integer> Map2 = new HashMap<>();
		
		for(String element : m6) 
		{
			if(!Map2.containsKey(element)) 
			{
				Map2.put(element, 1);
			}
			else
			{
				int value = Map2.get(element);
				Map2.put(element, value + 1);
			}
		}
		
		for (Map.Entry<String,Integer> element : Map2.entrySet()) 
		{
			if(element.getValue() >= 2) 
			{
				maphash6.put(element.getKey(), true);
			}
			else
			{
				maphash6.put(element.getKey(), false);
			}
		}
		return maphash6;
	}
		
	
	
	
	
	
	

}
