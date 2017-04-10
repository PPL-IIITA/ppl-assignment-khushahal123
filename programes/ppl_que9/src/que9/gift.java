package que9;
/**
 *  
 * The class is doing the gifting between girl and boy who are committed to each other.
 * This class also calculate the total number of gifts alloted and maxcost of all gifts and also maxvalue.
 * @author KHUSHAHAL
 *
 */
public class gift {

	//public int [] gifts = new int[6];
	public int k;

	/**
	 * 
	 * @param Gifts is the array of the gifts.
	 * @param B is the array of the  object boy .
	 * @param G is the array of the object girl.
	 * @param C is the array of object couple.
	 * @param n is the number of the gift available.
	 * void allotgift method ,allot the gifts between girlfriend and boyfriend.
	 */
	
	void allotgift(int Gifts[][] ,boy B[],girl G[],couple C[],int n){
		for(k=0;k<C.length;k++)
		{
		if(B[C[k].bid].btype==1)
		{		int i=0,j=0;
			while(C[k].maxcost <= B[C[k].bid].bd && i < n )
			{		
				 if(Gifts[i][0]==1 || Gifts[i][0]==3)
				 {
					 C[k].gifts[j]=i;
					 j++;
					 C[k].maxcost=C[k].maxcost+Gifts[i][1];
					 C[k].maxvalue=C[k].maxvalue+Gifts[i][2];
				 }
				
				 i++;
			}
			
		}
		
		if(B[C[k].bid].btype==2)
		{		int i=0,j=0;
			while(C[k].maxcost <= G[C[k].gid].mbd && i < n )
			{		
				 if(Gifts[i][0]==1 || Gifts[i][0]==3 )
				 {
					 C[k].gifts[j]=i;
					 j++;
					 C[k].maxcost=C[k].maxcost+Gifts[i][1];
					 C[k].maxvalue=C[k].maxvalue+Gifts[i][2];
				 }
				 i++;
			}
		}
		if(B[C[k].bid].btype==3)
		{		int i=0;
			while(C[k].maxcost <= B[C[k].bid].bd && i < n )
			{		
				 
				 
					 C[k].gifts[i]=i;
					 
					 C[k].maxcost=C[k].maxcost+Gifts[i][1];
					 if(G[C[k].gid].gtype==1 && Gifts[i][0]==2)
					 {
						   int z=2*Gifts[i][2];
						   C[k].maxvalue=C[k].maxvalue+z;
					 }
					 else
					   C[k].maxvalue=C[k].maxvalue+Gifts[i][2];
					 i++;
				 
				 
			}
		}
			
	  }
	}
}
