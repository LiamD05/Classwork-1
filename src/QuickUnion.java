
public class QuickUnion implements UnionFind
{
	private int [] id;
	public QuickUnion (int num){
		
		id = new int[num];
		for(int i = 0; i < num; i++){
			
			id[i] = i;
			
		}
	
	}

	@Override
	public void union(int p, int q)
	{
		// TODO Auto-generated method stub
		id[find(p)] = find(q);
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
