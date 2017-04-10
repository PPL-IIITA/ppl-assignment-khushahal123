package que10;
/**
 * This class implements the random data structure
 * @author KHUSHAHAL
 *
 */
		
public class random {
		/**
		 * ranboy returns the random boy
		 *  @param B is the array of object boy
		 */
		public int j;
		public int ranboy(boy B[])
		{	int i;
			int n=B.length;
			for(i=n-1;i>=0;i--)
			{
				if(B[i].f==1)
					  break;
			}
			return i;
		}
		/**
		 * 
		 * @param G is the array of object girl
		 * @return rangirl returns the random girl
		 */
		public int rangirl(girl G[])
		{	int i;
			int n=G.length;
			for(i=n-1;i>=0;i--)
			{
				if(G[i].f==1)
					  break;
			}
			return i;
		}
		/**
		 * 
		 * @param Gifts is the array of gifts
		 * @return returns the random gift
		 */

		public int rangift(int Gifts[][])
		{
			 int n=Gifts.length;
			 return n-2;
			
		}

}

