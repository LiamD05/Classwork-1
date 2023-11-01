
public class Example
{
	public static void main(String[] arg){
		
	//	QuickUnion find = new QuickUnion(10);
	//	find.union(2, 4);
	//	find.union(1, 5);
		//find.union(7, 8);
	///	print(10,find);
	//	QuickFind find2 = new QuickFind(10);
	//	System.out.println("   ");
	//	find2.union(3, 9);
		//find2.union(4, 7);
		//find2.union(5, 6);
		//print(10,find2);

	 WeightedQuickUnion find = new WeightedQuickUnion(10);
	 
	 find.union(0,1);
	 print(10,find);
	 find.union(2, 3);
	 print(10,find);
	 //eq size
	 find.union(1, 3);
	 
	 print(10,find);
	 
	 System.out.println("");
	 
	 find.union(4,5);
	 print(10,find); 
	 find.union(5,6);
	 print(10,find);
	 //
	 find.union(7,6);
	 
	 print(10,find);
	 System.out.println("");
	 
	 
	 find.union(6,9);
	
	 
	 print(10,find);
	 
	 
	}
	
	public static void print(int i, UnionFind find){
		
		for(int j = 0 ; j < i; j++){
			
			System.out.print(j + " ");
			
			
			
		}
		System.out.println(" ");
		for(int j = 0 ; j < i; j++){
			
			System.out.print(find.find(j) + " ");
			
		}
		System.out.println(" ");
		System.out.println(" ");
		
	}
	
}
