package samples;

public class Fruit implements Comparable<Fruit> {
	private String name;
	private int size;
	Fruit(String name,int size)
	{
		this.name = name;
		this.size = size;
	}
	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		if (this.size < o.size)
		{
			size = -1;
		}
		else{
			size = 1;
		}
		return size;
			
	}
	
}
