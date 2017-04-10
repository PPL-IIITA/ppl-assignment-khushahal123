package que7;
/**
 * This class represents array data structure to find the girlfriend of the given boy. 
 * @author KHUSHAHAL
 *
 */
 
public class array {
	public int i,j;
	/**
	 * 
	 * @param C is the array of object couple
	 * @param list is array of boys  whose girlfriend is to be find.
	 */
	 

	public void findgal(couple C[], String list[])
	{
			int n=C.length;
			int m=list.length;
			for (i=0 ; i< m ;i++)
			{	int k=0;
				for( j=0; j<n ;j++)
				{
					if(list[i].equals(C[j].bname))
					{		list[i]=C[j].gname;
							k=1;
					}
				}
				if(k==0)
				{
					list[i]="None";
				}
			}
			
	}
}

