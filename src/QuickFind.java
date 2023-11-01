
public class QuickFind implements UnionFind
{
	private int[] id;
	
	public QuickFind(int num){
		
		id = new int[num];
		for(int i = 0; i < num; i++){
			
			id[i] = i;
			
		}
	}
	public void union(int p , int q){
		
		int oldIdOfp = id[p];
		for(int i = 0; i < id.length; i++){
			//System.out.println("HERE");
			//System.out.println(i);
			
			
			
			if(oldIdOfp==id[i]){
				//System.out.println(id[p]);
				//System.out.println(id[i]);
				id[i]=id[q];
				//System.out.println(id[p]);
				//System.out.println(id[i]);
			}
			
		}
		
		
		
	}
	
	public int find(int p ){
		
		
		
		
		return id[p];
		
	}
	
}
