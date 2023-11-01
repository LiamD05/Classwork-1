
public class WeightedQuickUnion  implements UnionFind
{
	private int [] id;
	private int [] size;
	public WeightedQuickUnion (int num){
		
		id = new int[num];
		size = new int[num];
		
		for(int i = 0; i < num; i++){
			size[i] = 1;
			id[i] = i;
			
			
		}
	
	}

	@Override
	public void union(int p, int q)
	{
		// TODO Auto-generated method stub
		int rootP = find(p);
		int rootQ = find(q);
		if(size[rootP]>size[rootQ]){
			
			id[rootQ] = rootP;
			size[rootP] += size[rootQ];
				
			
		}
		else{
			
			id[rootP] = rootQ;
			size[rootQ] +=size[rootP];
			
		}
		
	}

	@Override
	
	
	public int find(int p)
	{
		// TODO Auto-generated method stub
		

		if (p == id[p])
		{

			return id[p];

		}

		return (find(id[p]));
		
		
	}
}
