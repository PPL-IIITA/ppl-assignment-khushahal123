package que6;
/**
 * The class couple couple store the girl and boy in the relation.
 * It also calculate the happiness and compativeness of the couple. 
 * @author KHUSHAHAL
 *
 */
 

public class couple{
	/**
	 * bname stores the name of boy
	 * gname store the name of girl
	 * bid i the id of boy who has committed
	 * gid is the id of the girl who has committed.
	 * gifts is the array storing the gifts of the couple.
	 * maxcost stores the the maximum cost of the total gifts
	 * maxvalue stores the maximum value of the total gifts
	 * happy store the happiness of the couple..
	 * comp stores the compativeness of the couple..
	 */
	public String bname;
	public String gname;
	public int bid;
	public int gid;
	public int [] gifts = new int[6];
	public int maxcost=0;
	int maxvalue=0;
	public int happy=0;
	public int comp=0;
	
	 
		/**
		 * void intialise method,initialize the gift array.
		 */
	
		void intialise(){
			for(int i=0;i<6;i++)
				
					gifts[i]=0;
				}
	
		/**
		 * 
		 * @param Gifts is the array of the gifts.
		 * @param B is the array of the  object boy .
		 * @param G is the array of the object girl.
		 * @param C is the array of object couple.
		 * @param n is the number of the gift available.
		 * void allotgift method ,allot the gifts between girlfriend and boyfriend.
		 */
		void allotgift(int Gifts[][] ,boy B[],girl G[],int n){
			if(B[bid].btype==1)
			{		int i=0,j=0;
				while(maxcost <= B[bid].bd && i < n )
				{		
					 if(Gifts[i][0]==1)
					 {
						 gifts[j]=i;
						 j++;
						 maxcost=maxcost+Gifts[i][1];
						 maxvalue=maxvalue+Gifts[i][2];
					 }
					
					 i++;
				}
				
			}
			
			if(B[bid].btype==2)
			{		int i=0,j=0;
				while(maxcost <= G[gid].mbd && i < n )
				{		
					 if(Gifts[i][0]==1)
					 {
						 gifts[j]=i;
						 j++;
						 maxcost=maxcost+Gifts[i][1];
						 maxvalue=maxvalue+Gifts[i][2];
					 }
					 i++;
				}
			}
			if(B[bid].btype==3)
			{		int i=0;
				while(maxcost <= B[bid].bd && i < n )
				{		
					 
					 
						 gifts[i]=i;
						 
						 maxcost=maxcost+Gifts[i][1];
						 if(G[gid].gtype==1 && Gifts[i][0]==2)
						 {
							   int z=2*Gifts[i][2];
							   maxvalue=maxvalue+z;
						 }
						 else
						   maxvalue=maxvalue+Gifts[i][2];
						 i++;
					 
					 
				}
			}
				
		}

		/**
		 * 
		 * @param B is the array of the object boy
		 * @param G is the array of object girl
		 * void happiness calculate the happiness of the couple
		 */
	 
		void happiness(boy B[],girl G[]){
			
			int bhappy=0,ghappy=0;
			
			if(G[gid].gtype==1)
			{
				ghappy=maxcost-G[gid].mbd+maxvalue;
			}
			if(G[gid].gtype==2)
			{
				ghappy=maxcost-G[gid].mbd+maxvalue;
			}
			if(G[gid].gtype==3)
			{
				ghappy=maxcost-G[gid].mbd;
			}
			if(B[bid].btype==1)
			{
				bhappy=B[bid].bd-maxcost;
				
			}
			if(B[bid].btype==2)
			{
				bhappy=G[gid].iq;
			}
			if(B[bid].btype==3)
			{
				bhappy=ghappy;
			}
			happy=bhappy+ghappy;
			
			
			
			
		}
		/**
		 * 
		 * @param B is the array of the object boy
		 * @param G is the array of object girl
		 * void compative method calculates the compativeness of the couple.
		 */
		
		void compative(boy B[],girl G[]){
			
			int a=0,b=0,c=0;
			a=B[bid].bd-G[gid].mbd;
			b=B[bid].at-G[gid].at;
			c=B[bid].iq-G[gid].iq;
			if(a < 0)
				a=a-2*a;
			if(b < 0)
				b=b-2*b;
			if(c < 0)
				c=c-2*c;
			comp=a+b+c;
			
		}
		
		
			
			
}
	
	
