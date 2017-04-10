package que10;
/**
 * The class date1 is dating the girl and boy  by using the random data structure
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
	{	  
		 int n=G.length;
		 int i;
		 random R=new random();
		 for(i=0;i<n;i++)
		 {		int s1,s2;
		 		s1=R.ranboy(B);
		 		s2=R.rangirl(G);
		 		C[i].gname=G[s2].name;
        	 	C[i].bname=B[s1].name;
        	 	C[i].gid=s2;
        	 	C[i].bid=s1;
        	 	G[s2].f=0;
        	 	B[s1].f=0;
			 
		 }
	 
	    	
	}

}

