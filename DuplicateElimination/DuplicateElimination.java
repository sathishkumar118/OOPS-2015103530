import java.util.*;

class DuplicateElimination
{
	public static void main(String args[])
	{
		int c=0;
		int i;
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		while(c<7)
		{
			System.out.print("Enter elements of the array\n");
			i=in.nextInt();
			if(a.indexOf(i)==-1)
			{
				a.add(i);
				c++;
			}
			else
				System.out.println("entered element already exists\n");
		}
		for(int j:a)
		{
			System.out.println(j);
		}
	}
}
