package que7;

/**
 * This class represents sorted array(binary) data structure to find the girlfriend of the given boy. 
 * @author KHUSHAHAL
 *
 */
public class binary {
	public int i,j;
	/**
	 * 
	 * @param C is the array of object couple
	 * @param list is array of boys  whose girlfriend is to be find.
	 */
	public void findgal(couple C[],String list[])
	{   // System.out.println("*****************");
		int n = C.length; 
		couple temp=new couple();
          
         for( i=0; i < n; i++){  
                 for( j=1; j < (n-i); j++){  
                	 String s1,s2;
                	 s1=C[j-1].bname;
                	 s2=C[j].bname;
                          if(s1.length() > s2.length()){  
                                   
                                 temp = C[j-1];  
                                 C[j-1] = C[j];  
                                 C[j] = temp;  
                         }  
                          
                 }  
         }
			
	  // System.out.println("*****************");
	
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


