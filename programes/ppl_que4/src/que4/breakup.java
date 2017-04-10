package que4;
/**
 * THe class breakup does the breakup of couple
 * @author KHUSHAHAL
 *
 */
public class breakup {
	/**
	 * 
	 * @param B is the array of the  object boy .
      * @param G is the array of the object girl.
      * @param C is the array of object couple.
      * void broke method does the breakup of the least happy couple.  and also allot the new boyfriend to girl
      * that girl
	 */
	public void broke(boy B[] ,girl G[] , couple C[])
	{	  for(int k=4;k<C.length;k++)
		{
				int a=C[k].gid;
				 
				 if(G[a].choice==1)	 
			        {	 	int max=0,maxin=0;
			        	 	for(int j=0;j<B.length;j++)
			        	 	{
			        	 		if((B[j].bd > max) && (G[a].at > B[j].minat) && (B[j].f==1))
			        	 		{
			        	 			max=B[j].bd;
			        	 			maxin=j;
			        	 		}
			        	 		
			        	 	}
			        	 	C[k].gname=G[a].name;
			        	 	C[k].bname=B[maxin].name;
			        	 	C[k].gid=k;
			        	 	C[k].bid=maxin;
			        	 	G[k].f=0;
			        	 	B[maxin].f=0;
			        	
			        }
			        if(G[a].choice==2)	 
			        {	 	int max=0,maxin=0;
			        	 	for(int j=0;j<B.length;j++)
			        	 	{
			        	 		if((B[j].at > max) && (G[a].at > B[j].minat) && (B[j].f==1) && (j!=0))
			        	 		{
			        	 			max=B[j].at;
			        	 			maxin=j;
			        	 		}
			        	 		
			        	 	}
			        	 	C[k].gname=G[a].name;
			        	 	C[k].bname=B[maxin].name;
			        	 	C[k].gid=k;
			        	 	C[k].bid=maxin;
			        	 	G[k].f=0;
			        	 	B[maxin].f=0;
			        	
			        }
			        if(G[a].choice==3)	 
			        {	 	int max=0,maxin=0;
			        	 	for(int j=0;j<B.length;j++)
			        	 	{
			        	 		{if((B[j].iq > max) && (G[a].at > B[j].minat) && ( B[j].f==1))
			        	 			max=B[j].iq;
			        	 			maxin=j;
			        	 		}
			        	 		
			        	 	}
			        	 	C[k].gname=G[a].name;
			        	 	C[k].bname=B[maxin].name;
			        	 	C[k].gid=k;
			        	 	C[k].bid=maxin;
			        	 	G[k].f=0;
			        	 	B[maxin].f=0;
			        	
			        }
			         
			        
				
		
		}
		
	}

}
