package carcare;
import java.util.*;

import org.w3c.dom.css.Counter;
public class demo {
static int numberCAR=100;
static int  count=0;
	public static void main(String[] args) {
		
		    Insurance []Insur =new Insurance[numberCAR];

			@SuppressWarnings("resource")
	
			Scanner Input = new Scanner(System.in);
			int C;
			char Answer = 'A',W='Y';

			while (Answer == 'A' || Answer == 'a') {
				
				displayMenu();
				System.out.println("Enter Your Choice : ");
				C = Input.nextInt();
				
				switch (C) {
				case 1:
					//Car c1 = new Car();
					String N,tele,CM,CL,CP,CC,CS,CD,CID;
					boolean OWNERcar =true;
					int CY;
					
					System.out.println("IF you the owner of the car? \t Enter Y ");
					W=Input.next().charAt(0);
					
					if(W=='Y'||W=='y')
					{
						OWNERcar=true;
					
					System.out.println("Please Enter Your Name Sir/Madam : ");
					N=Input.next();
					//c1.setOwn_Name(N);
					
					System.out.println("Please Enter Your telephone Sir/Madam : ");
					tele=Input.next();
					//c1.setOwn_ID(tele);
					
					}
					else
					{
						N=null;
						tele=null;
						OWNERcar=false;
					}
					
					System.out.println("Please Enter Your Car_ID Sir/Madam : ");
					CID=Input.next();
					//c1.setCar_Id(CID);
					
					
					
					System.out.println("Please Enter Your Car_Make Sir/Madam : ");
					CM=Input.next();
					//c1.setMake(CM);
					
					
					System.out.println("Please Enter Your Car_Model Sir/Madam : ");
					CL=Input.next();
					//c1.setModel(CL);
					
					
					
					System.out.println("Please Enter Your Car_Year Sir/Madam : ");
					CY=Input.nextInt();
					//c1.setYear(CY);
					
					
					
					System.out.println("Please Enter Your Car_EnginePower Sir/Madam : ");
					CP=Input.next();
					//c1.setEngine_Power(CP);
					
					
					
					System.out.println("Please Enter Your Car_Color Sir/Madam : ");
					CC=Input.next();
					//c1.setColor(CC);
					
					
					
					System.out.println("Please Enter Your Car_Status Sir/Madam : ");
					CS=Input.next();
					//c1.setStatus(CS);
					
					
					
					System.out.println("Please Enter Your Car_Description Sir/Madam : ");
					CD=Input.next();
					//c1.setCar_Description(CD);
					
					
					for(int i=0;i<count;i++)
					{		
						if(Insur[i].getOwn_ID()!=tele && Insur[i].getOwn_Name() !=N )
						{
					        if(i==count-1){
							Insur[count] =new Car(N,tele,CID,CC,CS,CP,CY,CD,CM,CL);
					        
					        System.out.println("Thanks Sir/Madam For Entering The Information :)\n and here is Your Information : \n");
					        System.out.println(Insur[count].toString()+"\n");
					        
					        count++;
					        
					        }
					    }
						else{
							System.out.println("Sorry but your name and your number are registered in the data store...\n");
				            System.out.println(Insur[i].toString()+"\n");
						    }
						    
					}
					
					
					System.out.println("If There is a Mistake in This Information Please Redo The Whole Process\nThanks!");
					break;
					
				case 2:
					
					System.out.println("Please Enter Your Name and telephone Sir/Madam : ");
					
					for(int i=0;i<count;i++){
								
						if(Input.next()==Insur[i].getOwn_ID() && Input.next()==Insur[i].getOwn_Name()){
					
						    String ION,IID;	
					
				     	    System.out.println("Please Enter Your Name Sir/Madam : ");
					        ION=Input.next();
					//I1.setOwn_Name(ION);
					
					
					        System.out.println("Please Enter Your Insurance_ID Sir/Madam : ");
					        IID=Input.next();
					//I1.setOwn_ID(IID);
					
					        Insur[count]=new Insurance(ION,IID);
  
	 				        System.out.println("Thanks Sir/Madam For Entering The Information :)\nand here is Your Information : \n");
					        System.out.println(Insur[count].toString()+"\n");
					        count++;
					}
						else{
					        if(i==count-1)
							System.out.println("Sorry but your name and your number are not registered in the data store...\n");
						}
						}
					System.out.println("If There is a Mistake in This Information Please Redo The Whole Process\nThanks!");
					break;
				case 3:
					
                    System.out.println("Please Enter Your Name and telephone Sir/Madam : ");
					
					    for(int i=0;i<count;i++){
								
						    if(Input.next()==Insur[i].getOwn_ID() && Input.next()==Insur[i].getOwn_Name())
						    {
					           String T,WD;
					           int RCN,MA,SSN;
					           double RCB;
					           System.out.println("Please Enter Your repair Car Number Sir/Madam :");
					           RCN=Input.nextInt();
					           
					           System.out.println("Please Enter Your Car manual or automatic Sir/Madam :");
					           T=Input.next();
					           
					           System.out.println("Please Enter Your SSN_contract Sir/Madam :");   //????????????????
					           SSN=Input.nextInt();
					           
					           System.out.println("Please Enter Your repair Car bill Sir/Madam :");
					           RCB=Input.nextDouble();
					           
					           System.out.println("Please Enter Your Warranty description Sir/Madam :");
					           WD=Input.next();
					           
					           System.out.println("Please Enter Your Car mile age Sir/Madam :");
					           MA=Input.nextInt();
					           
					           Insur[count]=new Maintenance(RCN, T, SSN, RCB, WD, MA);
					           
		 				        System.out.println("Thanks Sir/Madam For Entering The Information :)\nand here is Your Information : \n");
						        System.out.println(Insur[count].toString()+"\n");
						        count++;
						    }
					     else{
						        if(i==count-1)
								System.out.println("Sorry but your name and your number are not registered in the data store...\n");
							} 
						  }
						break;

			 	case 4:
					
					
					break;
					}
				System.out.println("Please Enter A To Continue Otherwise To Exit : ");
				Answer=Input.next().charAt(0);
			
			}
	}
		
		
		

		public static void displayMenu() {
			System.out.println("*********************************\n"
					+ "*Choose From The Following :\t*"
					+ "\n*********************************\n"
					+ "1-For Adding a New Car Information .\n"
					+ "2-For Insuring Your Car .\n"
					+ "3-For Your Car Maintenance .\n"
					+ "4-For Periodic Checking of Your Car .\n"
					+ "5-For Displaying some forms .\n" + "");
		}


		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
