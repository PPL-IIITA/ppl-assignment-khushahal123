package que7;
/**
 * The class main1 is implementing all the necessary methods to find the couple.
 * It also takes the input from file and generate an output file.
 */
 
import java.io.*;


public class main1 {


	/**
	 * 
	 * @throws Exception is the throwing the exceptions.
	 */

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			int i;
			//Scanner s = new Scanner(System.in);
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
			String [] list=new String[8];
			String [] list1=new String[8];
			
			
			 FileInputStream bfile = new FileInputStream("boy.txt");
	         DataInputStream bdata = new DataInputStream(bfile);
	          
	          FileInputStream gfile = new FileInputStream("girl.txt");
	          DataInputStream gdata = new DataInputStream(gfile);
	          
	          FileInputStream blfile = new FileInputStream("boylist.txt");
	          DataInputStream bldata = new DataInputStream(blfile);
			
	          FileOutputStream out = new FileOutputStream("output.txt");
	          DataOutputStream getout = new DataOutputStream(out);
	          /**
	            * boy.txt is the input file for boy.
	            * girl.txt is the  input file for girl.
	            * gift.txt is input file for gift.
	            * boylist.txt is input file for boys to find their girlfriend.
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
	         for( i=0 ;i<8 ;i++)
	         {		 String str = bldata.readUTF();
	         		list[i]=str;
	         		list1[i]=str;
	         }
	          	
	          bfile.close();
	          gfile.close();
			  blfile.close();
			  /**
	           * creating an object of the class date1
	           */
	          	date1 D=new date1();	
	          
				D.date(B,G,C);
			 /**
			  * here h is 1 for array implementation,
			  * h is 2 for sorted array(binary) implementation
			  * and h is 3 for hash table implementation
			  * user can change it according to their choice.
			  */
				int h=1;
				if(h==1)
				{
					array A=new array();
					A.findgal(C, list);
				}
				else if(h==2)
				{
					binary A=new binary();
					A.findgal(C, list);
				}
				else
				{
					hash A=new hash();
					A.findgal(C, list);
				}
			
				D.date(B,G,C);
					for(i=0;i<list.length;i++)
					{
						String str1,str2;
						
						str1=list1[i];
						str2=list[i];
						getout.writeUTF(str1);
						getout.writeUTF(" has girlfriend  ");
						getout.writeUTF(str2);
					}
					getout.close();
					
	}
			
			 
}
			
			
		
	




