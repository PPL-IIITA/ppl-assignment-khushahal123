package que4;

/**
 * The class date1 is dating the girl and boy according to there choice and preferences
 * 
 * @author KHUSHAHAL
 *
 */

 

public class date1 {
	/**
	 * 
	 * @param B is the array of the object boy.
	 * @param G is the array of the object girl.
	 * @param C is the array of the object couple.
	 * void date method ,dates the girl and boy
	 */

	public  void  date(boy B[] ,girl G[] , couple C[])
	{	  int n=B.length;
		 int h=G.length;
		 int i,j;
		 for(i=0;i<h;i++)
		 {
		        if(G[i].choice==1 && G[i].f==1)	 
		        {	 	int max=0,maxin=0;
		        	 	for(j=0;j<n;j++)
		        	 	{
		        	 		if(B[j].bd > max && G[i].at > B[j].minat && B[j].f==1)
		        	 		{
		        	 			max=B[j].bd;
		        	 			maxin=j;
		        	 		}
		        	 		
		        	 	}
		        	 	C[i].gname=G[i].name;
		        	 	C[i].bname=B[maxin].name;
		        	 	C[i].gid=i;
		        	 	C[i].bid=maxin;
		        	 	G[i].f=0;
		        	 	B[maxin].f=0;
		        	
		        }
		        if(G[i].choice==2 && G[i].f==1)	 
		        {	 	int max=0,maxin=0;
		        	 	for(j=0;j<n;j++)
		        	 	{
		        	 		if(B[j].at > max && G[i].at > B[j].minat && B[j].f==1)
		        	 		{
		        	 			max=B[j].at;
		        	 			maxin=j;
		        	 		}
		        	 		
		        	 	}
		        	 	C[i].gname=G[i].name;
		        	 	C[i].bname=B[maxin].name;
		        	 	C[i].gid=i;
		        	 	C[i].bid=maxin;
		        	 	G[i].f=0;
		        	 	B[maxin].f=0;
		        	
		        }
		        if(G[i].choice==3 && G[i].f==1)	 
		        {	 	int max=0,maxin=0;
		        	 	for(j=0;j<n;j++)
		        	 	{
		        	 		if(B[j].iq > max && G[i].at > B[j].minat && B[j].f==1)
		        	 		{
		        	 			max=B[j].iq;
		        	 			maxin=j;
		        	 		}
		        	 		
		        	 	}
		        	 	C[i].gname=G[i].name;
		        	 	C[i].bname=B[maxin].name;
		        	 	C[i].gid=i;
		        	 	C[i].bid=maxin;
		        	 	G[i].f=0;
		        	 	B[maxin].f=0;
		        	
		        }
		 }
						
				 
				
	    	
	}

}

