package que5;
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
	 * IN this method first one girl choose then one boy choose the one girl alternatively.
	 */
	public  void  date(boy B[] ,girl G[] , couple C[])
	{	  int n=B.length;
		 int h=G.length;
		 int i,j;
		 for(i=0;i<h;i++)
		 {	if(i%2==0)
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
		 else
		 	{	for(int s=i;s<n;s++)
		 		{	int z=0;
			 		for(j=0;j<h;j++)
			 		{
			 			if((G[j].mbd < B[i].bd) && (G[j].f==1) && (B[s].f==1))
			 			{	C[i].gname=G[j].name;
	        	 			C[i].bname=B[s].name;
	        	 			C[i].gid=j;
	        	 			C[i].bid=s;
	        	 			G[i].f=0;
	        	 			B[i].f=0;
	        	 			z=1;
	        	 			break;
		 				
			 			}
			 		}
			 		if(z==1)
			 			break;
		 		}
			 
		 	}
		 }
						
				 
				
	    	
	}

}
