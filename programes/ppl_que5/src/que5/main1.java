package que5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 * The class main1 is implementing all the necessary methods to find the couple.
 * It also takes the input from file and generate an output file.
 */

public class main1 {

	/**
	 * 
	 * @throws Exception is the throwing the exceptions.
	 */


	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
			int i;
			//Scanner s = new Scanner(System.in);
			int [][] Gifts = new int[6][3];
			
			
			boy [] B=new boy[10];
			
			for( i=0;i<B.length;i++)
			{
				B[i]=new boy();
			}
			girl [] G=new girl[5];
			for( i=0;i<G.length;i++)
			{
				G[i]=new girl();
			}
			couple [] C=new couple[5];
			for( i=0;i<C.length;i++)
			{
				C[i]=new couple();
			}
			/**
			 *
			 *  B is the array of the  object boy .
			 *  G is the array of the object girl.
			 *  C is the array of object couple.
			 */
			
			 FileInputStream bfile = new FileInputStream("boy.txt");
	         DataInputStream bdata = new DataInputStream(bfile);
	          
	          FileInputStream gfile = new FileInputStream("girl.txt");
	          DataInputStream gdata = new DataInputStream(gfile);
	          
	          FileInputStream giftfile = new FileInputStream("gift.txt");
	          DataInputStream giftdata = new DataInputStream(giftfile);
			
	          FileOutputStream out = new FileOutputStream("output.txt");
	          DataOutputStream getout = new DataOutputStream(out);
	          /**
	            * boy.txt is the input file for boy.
	            * girl.txt is the  input file for girl.
	            * gift.txt is input file for gift.
	            * output.txt is an output file
	            */ 
			
	          for( i=0;i<B.length;i++)
	          {
	              for(int j=0;j<7;j++)
	              {
	                  String str= bdata.readUTF();
	                
	                  if(j==0)
	                     B[i].name=str;
	                  
	                 else if(j==1)
	                      B[i].at=Integer.parseInt(str);
	                  else if(j==2)
	                      B[i].bd=Integer.parseInt(str);
	                  else if(j==3)
	                      B[i].iq=Integer.parseInt(str);
	                  else if(j==4)
	                      B[i].minat=Integer.parseInt(str);
	                  else if(j==5)
	                      B[i].f=Integer.parseInt(str);
	                  else if(j==6)
	                      B[i].btype=Integer.parseInt(str);
	                  
	              }
	          }	
	         
	          
			 
	          for( i=0;i<G.length;i++)
	          {
	              for(int j=0;j<7;j++)
	              {
	                  String str = gdata.readUTF();
	                //  System.out.println(str);
	                  if(j==0)
	                     G[i].name=str;
	                  
	                 else if(j==1)
	                      G[i].at=Integer.parseInt(str);
	                  else if(j==2)
	                      G[i].mbd=Integer.parseInt(str);
	                  else if(j==3)
	                      G[i].iq=Integer.parseInt(str);
	                  else if(j==4)
	                      G[i].choice=Integer.parseInt(str);
	                  else if(j==5)
	                      G[i].f=Integer.parseInt(str);
	                  else if(j==6)
	                      G[i].gtype=Integer.parseInt(str);
	              }
	          }	
	          for( i=0;i<6;i++)
	          {
	              for(int j=0;j<3;j++)
	              {
	                  String str= giftdata.readUTF();
	                
	                  if(j==0)
	                     Gifts[i][j]=Integer.parseInt(str);
	                  
	                 else if(j==1)
	                	 Gifts[i][j]=Integer.parseInt(str);
	                  else if(j==2)
	                	  Gifts[i][j]=Integer.parseInt(str);
	                    
	              }
	          }	
	         
	          
	        
	          bfile.close();
	          gfile.close();
	          giftfile.close();
	          boy temp1=new boy();
	          int h=B.length;
	          for( i=0; i < h; i++){  
	                 for(int j=1; j < (h-i); j++){  
	                          if(B[j-1].at < B[j].at){  
	                                   
	                                 temp1 = B[j-1];  
	                                 B[j-1] = B[j];  
	                                 B[j] = temp1;  
	                         }  
	                          
	                 }  
	         }
	          
	          girl temp2=new girl();
	          int l=G.length;
	          for( i=0; i < l; i++){  
	                 for(int j=1; j < (l-i); j++){  
	                          if(G[j-1].mbd < G[j].mbd){  
	                                   
	                                 temp2 = G[j-1];  
	                                 G[j-1] = G[j];  
	                                 G[j] = temp2;  
	                         }  
	                          
	                 }  
	         }
	        

	          /**
	           * creating an object of the class date1
	           */
	          date1 D=new date1();
			   D.date(B,G,C);
			   for(i=0;i<C.length;i++)
				{
					C[i]. intialise();
				}
				for(i=0;i<C.length;i++)
				{
					C[i].allotgift(Gifts,B,G,6);
				}
				for(i=0;i<C.length;i++)
				{
					C[i].happiness(B,G);
				}
				for(i=0;i<C.length;i++)
				{
					C[i].compative(B,G);
				}
				 
				for(i=0;i<C.length;i++)
				{ 	
					String str1,str2;
					
					str1=C[i].bname;
					str2=C[i].gname;
					getout.writeUTF(str1);
					getout.writeUTF(" is in relationship with ");
					getout.writeUTF(str2);
					 
					}
					 
					 
				 /**
				  * sorting the array of couple according to their happiness.
				  */	 
					
				int n = C.length; 
				couple temp=new couple();
		          
		         for( i=0; i < n; i++){  
		                 for(int j=1; j < (n-i); j++){  
		                          if(C[j-1].happy < C[j].happy){  
		                                   
		                                 temp = C[j-1];  
		                                 C[j-1] = C[j];  
		                                 C[j] = temp;  
		                         }  
		                          
		                 }  
		         }  
				
				for(i=0;i<n;i++){
				//System.out.println((i+1) +" th happy couple is " + C[i].bname+ " and "+C[i].gname);
					 String str4=Integer.toString(i+1);
					 getout.writeUTF(str4);
					 getout.writeUTF(" th happy couple is ");
					 str4=C[i].bname;
					 getout.writeUTF(str4);
					 getout.writeUTF("and ");
					 str4=C[i].gname;
					 getout.writeUTF(str4);
					 
				}
				  
		     
	
	}
			
}
			
			
		
	






