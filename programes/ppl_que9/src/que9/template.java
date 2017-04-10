package que9;
/**
 * This class returns the top k value items
 * @author KHUSHAHAL
 *
 */
 

public class template {

	public int i,j;
	/**
	 * 
	 * @param B array of object boy
	 * @param c is the parameter on which top k boys to be returned
	 */
	public void sort1(boy B[],int c)
		{	 	int n = B.length; 
				boy temp=new boy();
        
        for( i=0; i < n; i++){  
                for( j=1; j < (n-i); j++){  
                        if(c==1)
                        {
                        		if(B[j-1].at < B[j].at){  
                                  
                        					temp = B[j-1];  
                        					B[j-1] = B[j];  
                        					B[j] = temp;  
                        			}  
                        }
                        else if(c==2)
                        {
                        	if(B[j-1].bd < B[j].bd){  
                                
            					temp = B[j-1];  
            					B[j-1] = B[j];  
            					B[j] = temp;  
                        		}  
                        }
                        else
                        {
                        	if(B[j-1].iq < B[j].iq){  
                                
            					temp = B[j-1];  
            					B[j-1] = B[j];  
            					B[j] = temp;  
                        		}  
                        }
                         
                }  
        	}  
		
		
	}
	/**
	 * 
	 * @param G is array of object girl
	 * sort2 returns the top k value girls on theire maintenance budget
	 */
	public void sort2(girl G[])
	{		int n = G.length; 
			girl temp=new girl();
			
        for( i=0; i < n; i++){  
                for( j=1; j < (n-i); j++){  
                        
                       if(G[j-1].mbd > G[j].mbd)
                      {  
                                  
                        	temp = G[j-1];  
                        	G[j-1] = G[j];  
                        	G[j] = temp;  
                       }  
                        
                }
        }
	}
	/**
	 * 
	 * @param Gifts is the array of the gifts
	 * sort3 returns the top k value gifts 
	 */
	public void sort3(int Gifts[][])
	{		int n=Gifts.length;
			int k,h,u;
			
	        for( i=0; i < n; i++){  
	                for( j=1; j < (n-i); j++){  
	                        
	                       if(Gifts[j-1][2] > Gifts[j][2])
	                      {  
	                                  
	                        	k= Gifts[j-1][0];
	                        	h=Gifts[j-1][1];
	                        	u=Gifts[j-1][2];
	                        	
	                        	Gifts[j-1][0]=Gifts[j][0];
	                        	Gifts[j-1][1]=Gifts[j][1];
	                        	Gifts[j-1][2]=Gifts[j][2];
	                        	
	                        	Gifts[j][0]=k;
	                        	Gifts[j][1]=h;
	                        	Gifts[j][2]=u;
	                        	   
	                       }  
	                        
	                }
	        }
		
	}
}
