package que7;
/**
 * This class represents hash table data structure to find the girlfriend of the given boy. 
 * @author KHUSHAHAL
 *
 */
public class hash {
	public int i,j;
	int [] hasht=new int[30];
	 
	/**
	 * 
	 * @param C is the array of object couple
	 * @param list is array of boys  whose girlfriend is to be find.
	 */
	 
	
	public void findgal(couple C[], String list[])
	{		for(i=0;i<30;i++)
				hasht[i]=0;
			
			int n=C.length,l,k;
			String s1,s2;
			for( i=0 ;i< n;i++)
			{		s1=C[i].bname;
					l=s1.length();
					l=3*l;
					if(hasht[l]!=0)
					{
						//	while(hasht[3*l]!=0)
								l++;
					}
					hasht[l]=i;
					
			}
			/**
			 * here hash function is the lenght of the name of boy..
			 */
			
			int m=list.length;
			for(i=0;i<m;i++)
			{
				s2=list[i];
				l=s2.length();
				l=3*l;
				if(hasht[l]==0)
				{	 //System.out.println("*****************");
						list[i]="None";
				}
				else
				{
					k=hasht[l];
					s1=C[k].bname;
					if(s2.equals(s1))
					{	// System.out.println("*****************");	
						list[i]=C[k].gname;
					}
					else
					{	// System.out.println("*****************");
						l++;
						k=hasht[l];
						list[i]=C[k].gname;
					}
				}
				
			}
			
	}
	

}
