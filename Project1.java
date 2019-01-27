package project1;

import java.util.*;

public class Project1{
	 public static void main(String args[])
	 {
	  
	  
	 
	 
		  Scanner input=new Scanner(System.in);
	  
	  
	  String data[][]={ {"101","a","engineer","20000","3000","1200",},{"102","b","software engineer","25000","5000","2500"},
		  {"103","c","clerk","18500","2500","1000"},{"104","d","programmer","21000","3000","1200"},{"105","e","manager","40000","12000","3000"},
		  {"106","f","executive engg","25450","5000","2500"},{"107","g","head engg","21000","3000","1200"}
		    
	  };
	  
	  String data1[][]={ {"engineer","e","2200"},{"software engineer","se","2500"},{"clerk","cl","1800"},{"programmer","p","3200"},
		  {"manager","m","4000"},{"software engineer","s","2500"},{"executive engg","ee","2200"}
		
	  };
	  
	  String shopping[][] ={ {"jeans","2200"},{"shirt","1500"},{"watch","3000"},{"shoes","4000"},{"supplements","10000"}  };
	  String panel[][]={{"anshuman2107", "anshuman"}};
	  for(int i=0;i<3;i++)
	  {
		  
	  System.out.println("WELCOME TO SALARY SLIP PORTAL");
	  System.out.println("enter username");
	  String username=input.next();
	  System.out.println("enter password");
	  String password=input.next();
	  
	 
	  
	  
	  if(username.equals(panel[0][0])&&password.equals(panel[0][1]))
	  {
		  System.out.println("enter your employ number to search your slip");
		  int num=input.nextInt();
		  
		  switch(num)
		  {
		  case 101:
			  
			  int basic=Integer.parseInt(data[0][3]);
			  System.out.println(basic);
			  int hra= Integer.parseInt(data[0][4]);
			  System.out.println(hra);
			  int it=Integer.parseInt(data[0][5]);
			  System.out.println(it);
			  int da=Integer.parseInt(data1[0][2]);
			  System.out.println(da);
			  double gross=basic+hra+da-it;
			  double y=(20.0/100.0)*gross;
			  System.out.println("20 percent of your gross salary is"+y);
			  
			  if(y<basic)
			  {
				  int z;
				  do
				  {
					  System.out.println("you have enough money for shopping");
					  System.out.println("1. jeans");
					  System.out.println("2. shirt");
					  System.out.println("3. watch");
					  System.out.println("4. shoes");
					  System.out.println("5. supplements");
					  int q=Integer.parseInt(shopping[0][1]);
					  int w=Integer.parseInt(shopping[1][1]);
					  int e=Integer.parseInt(shopping[2][1]);
					  int r=Integer.parseInt(shopping[3][1]);
					  int t=Integer.parseInt(shopping[4][1]);
					  System.out.println("choose any item ");
					  z=input.nextInt();
					  
					  switch(z)
					  {
					  
					  case 1: 
						  if(y>q)
						  {
							  System.out.println("item purchased");
							  y-=q;
							  System.out.println(y);
						  }
						  else
						  {
							  System.out.println("insufficient amount!!");
						  }
						  break;
					  case 2:
					  if(y>w)
					  {
						  System.out.println("item purchased");
						  y-=w;
						  System.out.println(y);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
					  
					  case 3:
						  if(y>e)
						  {
							  System.out.println("item purchased");
							  y-=e;
							  System.out.println(y);
						  }
						  else
						  {
							  System.out.println(y);
						  }
						  break;
						  
					  case 4:
						  if(y>r)
						  {
							  System.out.println("item purchased");
							  y-=r;
							  System.out.println(y);
						  }
						  else
						  {
							  System.out.println("insufficeint amount!!");
						  }
						  break;
						  
					  case 5:
						  if(y>t)
						  {
							  System.out.println("item purchased");
							  y-=t;
							  System.out.println(y);
						  }
						  else
						  {
							  System.out.println("insufficient amount!!");
						  }
						  break;
					  case 6:
						  break;
					  }
				  }while(z!=6);
			  }
				  else
					  
				  {
					  System.out.println("sorry you have insufficient amount");
				  }
				  break;
					  
						
					  
		  case 102 :
			  int basic1=Integer.parseInt(data[1][3]);
			  System.out.println(basic1);
			  int hra1= Integer.parseInt(data[1][4]);
			  System.out.println(hra1);
			  int it1=Integer.parseInt(data[1][5]);
			  System.out.println(it1);
			  int da1=Integer.parseInt(data1[1][2]);
			  System.out.println(da1);
			  double gross1=basic1+hra1+da1-it1;
			  double y1=(20/100)*gross1;
			  System.out.println("20 percent of your gross salary is"+y1);
			  
			  if(y1>basic1)
			  {
				  int z;
				  do
				  {
					  System.out.println("you have enough money for shopping");
					  System.out.println("1. jeans");
					  System.out.println("2. shirt");
					  System.out.println("3. watch");
					  System.out.println("4. shoes");
					  System.out.println("5. supplements");
					  int q=Integer.parseInt(shopping[0][1]);
					  int w=Integer.parseInt(shopping[1][1]);
					  int e=Integer.parseInt(shopping[2][1]);
					  int r=Integer.parseInt(shopping[3][1]);
					  int t=Integer.parseInt(shopping[4][1]);
					  System.out.println("choose any item ");
					  z=input.nextInt();
					  
					  switch(z)
					  {
					  
					  case 1: 
						  if(y1>q)
						  {
							  System.out.println("item purchased");
							  y1-=q;
							  System.out.println(y1);
						  }
						  else
						  {
							  System.out.println("insufficient amount!!");
						  }
						  break;
					  case 2:
					  if(y1>w)
					  {
						  System.out.println("item purchased");
						  y1-=w;
						  System.out.println(y1);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
					  
					  case 3:
						  if(y1>e)
						  {
							  System.out.println("item purchased");
							  y1-=e;
							  System.out.println(y1);
						  }
						  else
						  {
							  System.out.println(y1);
						  }
						  break;
						  
					  case 4:
						  if(y1>r)
						  {
							  System.out.println("item purchased");
							  y1-=r;
							  System.out.println(y1);
						  }
						  else
						  {
							  System.out.println("insufficeint amount!!");
						  }
						  break;
						  
					  case 5:
						  if(y1>t)
						  {
							  System.out.println("item purchased");
							  y1-=t;
							  System.out.println(y1);
						  }
						  else
						  {
							  System.out.println("insufficient amount!!");
						  }
						  break;
					  case 6:
						  break;
					  }
				  }while(z!=6);
			  }
				  else
					  
				  {
					  System.out.println("sorry you have insufficient amount");
				  }
				  break;
					  
						
					  
			  
		  case 103: 
		  int basic2=Integer.parseInt(data[0][3]);
		  System.out.println(basic2);
		  int hra2= Integer.parseInt(data[0][4]);
		  System.out.println(hra2);
		  int it2=Integer.parseInt(data[0][5]);
		  System.out.println(it2);
		  int da2=Integer.parseInt(data1[0][2]);
		  System.out.println(da2);
		  double gross2=basic2+hra2+da2-it2;
		  double y2=(20/100)*gross2;
		  System.out.println("20 percent of your gross salary is"+y2);
		  
		  if(y2>basic2)
		  {
			  int z;
			  do
			  {
				  System.out.println("you have enough money for shopping");
				  System.out.println("1. jeans");
				  System.out.println("2. shirt");
				  System.out.println("3. watch");
				  System.out.println("4. shoes");
				  System.out.println("5. supplements");
				  int q=Integer.parseInt(shopping[0][1]);
				  int w=Integer.parseInt(shopping[1][1]);
				  int e=Integer.parseInt(shopping[2][1]);
				  int r=Integer.parseInt(shopping[3][1]);
				  int t=Integer.parseInt(shopping[4][1]);
				  System.out.println("choose any item ");
				  z=input.nextInt();
				  
				  switch(z)
				  {
				  
				  case 1: 
					  if(y2>q)
					  {
						  System.out.println("item purchased");
						  y2-=q;
						  System.out.println(y2);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 2:
				  if(y2>w)
				  {
					  System.out.println("item purchased");
					  y2-=w;
					  System.out.println(y2);
				  }
				  else
				  {
					  System.out.println("insufficient amount!!");
				  }
				  break;
				  
				  case 3:
					  if(y2>e)
					  {
						  System.out.println("item purchased");
						  y2-=e;
						  System.out.println(y2);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
					  
				  case 4:
					  if(y2>r)
					  {
						  System.out.println("item purchased");
						  y2-=r;
						  System.out.println(y2);
					  }
					  else
					  {
						  System.out.println("insufficeint amount!!");
					  }
					  break;
					  
				  case 5:
					  if(y2>t)
					  {
						  System.out.println("item purchased");
						  y2-=t;
						  System.out.println(y2);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 6:
					  break;
				  }
			  }while(z!=6);
		  }
			  else
				  
			  {
				  System.out.println("sorry you have insufficient amount");
			  }
			  break;
		  
			  
		  
			  
		  
			  
					  
				  
			  
		  case 104:
		  int basic3=Integer.parseInt(data[0][3]);
		  System.out.println(basic3);
		  int hra3= Integer.parseInt(data[0][4]);
		  System.out.println(hra3);
		  int it3=Integer.parseInt(data[0][5]);
		  System.out.println(it3);
		  int da3=Integer.parseInt(data1[0][2]);
		  System.out.println(da3);
		  double gross3=basic3+hra3+da3-it3;
		  double y3=(20/100)*gross3;
		  System.out.println("20 percent of your gross salary is"+y3);
		  
		  if(y3>basic3)
		  {
			  int z;
			  do
			  {
				  System.out.println("you have enough money for shopping");
				  System.out.println("1. jeans");
				  System.out.println("2. shirt");
				  System.out.println("3. watch");
				  System.out.println("4. shoes");
				  System.out.println("5. supplements");
				  int q=Integer.parseInt(shopping[0][1]);
				  int w=Integer.parseInt(shopping[1][1]);
				  int e=Integer.parseInt(shopping[2][1]);
				  int r=Integer.parseInt(shopping[3][1]);
				  int t=Integer.parseInt(shopping[4][1]);
				  System.out.println("choose any item ");
				  z=input.nextInt();
				  
				  switch(z)
				  {
				  
				  case 1: 
					  if(y3>q)
					  {
						  System.out.println("item purchased");
						  y3-=q;
						  System.out.println(y3);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 2:
				  if(y3>w)
				  {
					  System.out.println("item purchased");
					  y3-=w;
					  System.out.println(y3);
				  }
				  else
				  {
					  System.out.println("insufficient amount!!");
				  }
				  break;
				  
				  case 3:
					  if(y3>e)
					  {
						  System.out.println("item purchased");
						  y3-=e;
						  System.out.println(y3);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
					  
				  case 4:
					  if(y3>r)
					  {
						  System.out.println("item purchased");
						  y3-=r;
						  System.out.println(y3);
					  }
					  else
					  {
						  System.out.println("insufficeint amount!!");
					  }
					  break;
					  
				  case 5:
					  if(y3>t)
					  {
						  System.out.println("item purchased");
						  y3-=t;
						  System.out.println(y3);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 6:
					  break;
				  }
			  }while(z!=6);
		  }
			  else
				  
			  {
				  System.out.println("sorry you have insufficient amount");
			  }
			  break;
				  
					
				  
		  
		  case 105:
		  int basic4=Integer.parseInt(data[0][3]);
		  System.out.println(basic4);
		  int hra4= Integer.parseInt(data[0][4]);
		  System.out.println(hra4);
		  int it4=Integer.parseInt(data[0][5]);
		  System.out.println(it4);
		  int da4=Integer.parseInt(data1[0][2]);
		  System.out.println(da4);
		  double gross4=basic4+hra4+da4-it4;
		  double y4=(20/100)*gross4;
		  System.out.println("20 percent of your gross salary is"+y4);
		  
		  if(y4>basic4)
		  {
			  int z;
			  do
			  {
				  System.out.println("you have enough money for shopping");
				  System.out.println("1. jeans");
				  System.out.println("2. shirt");
				  System.out.println("3. watch");
				  System.out.println("4. shoes");
				  System.out.println("5. supplements");
				  int q=Integer.parseInt(shopping[0][1]);
				  int w=Integer.parseInt(shopping[1][1]);
				  int e=Integer.parseInt(shopping[2][1]);
				  int r=Integer.parseInt(shopping[3][1]);
				  int t=Integer.parseInt(shopping[4][1]);
				  System.out.println("choose any item ");
				  z=input.nextInt();
				  
				  switch(z)
				  {
				  
				  case 1: 
					  if(y4>q)
					  {
						  System.out.println("item purchased");
						  y4-=q;
						  System.out.println(y4);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 2:
				  if(y4>w)
				  {
					  System.out.println("item purchased");
					  y4-=w;
					  System.out.println(y4);
				  }
				  else
				  {
					  System.out.println("insufficient amount!!");
				  }
				  break;
				  
				  case 3:
					  if(y4>e)
					  {
						  System.out.println("item purchased");
						  y4-=e;
						  System.out.println(y4);
					  }
					  else
					  {
						  System.out.println("insufficient amount");
					  }
					  break;
					  
				  case 4:
					  if(y4>r)
					  {
						  System.out.println("item purchased");
						  y4-=r;
						  System.out.println(y4);
					  }
					  else
					  {
						  System.out.println("insufficeint amount!!");
					  }
					  break;
					  
				  case 5:
					  if(y4>t)
					  {
						  System.out.println("item purchased");
						  y4-=t;
						  System.out.println(y4);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 6:
					  break;
				  }
			  }while(z!=6);
		  }
			  else
				  
			  {
				  System.out.println("sorry you have insufficient amount");
			  }
			  break;
				  
					
				  
		  case 106:
		  
		  int basic5=Integer.parseInt(data[0][3]);
		  System.out.println(basic5);
		  int hra5= Integer.parseInt(data[0][4]);
		  System.out.println(hra5);
		  int it5=Integer.parseInt(data[0][5]);
		  System.out.println(it5);
		  int da5=Integer.parseInt(data1[0][2]);
		  System.out.println(da5);
		  double gross5=basic5+hra5+da5-it5;
		  double y5=(20/100)*gross5;
		  System.out.println("20 percent of your gross salary is"+y5);
		  
		  if(y5>basic5)
		  {
			  int z;
			  do
			  {
				  System.out.println("you have enough money for shopping");
				  System.out.println("1. jeans");
				  System.out.println("2. shirt");
				  System.out.println("3. watch");
				  System.out.println("4. shoes");
				  System.out.println("5. supplements");
				  int q=Integer.parseInt(shopping[0][1]);
				  int w=Integer.parseInt(shopping[1][1]);
				  int e=Integer.parseInt(shopping[2][1]);
				  int r=Integer.parseInt(shopping[3][1]);
				  int t=Integer.parseInt(shopping[4][1]);
				  System.out.println("choose any item ");
				  z=input.nextInt();
				  
				  switch(z)
				  {
				  
				  case 1: 
					  if(y5>q)
					  {
						  System.out.println("item purchased");
						  y5-=q;
						  System.out.println(y5);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 2:
				  if(y5>w)
				  {
					  System.out.println("item purchased");
					  y5-=w;
					  System.out.println(y5);
				  }
				  else
				  {
					  System.out.println("insufficient amount!!");
				  }
				  break;
				  
				  case 3:
					  if(y5>e)
					  {
						  System.out.println("item purchased");
						  y5-=e;
						  System.out.println(y5);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
					  
				  case 4:
					  if(y5>r)
					  {
						  System.out.println("item purchased");
						  y5-=r;
						  System.out.println(y5);
					  }
					  else
					  {
						  System.out.println("insufficeint amount!!");
					  }
					  break;
					  
				  case 5:
					  if(y5>t)
					  {
						  System.out.println("item purchased");
						  y5-=t;
						  System.out.println(y5);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 6:
					  break;
				  }
			  }while(z!=6);
		  }
			  else
				  
			  {
				  System.out.println("sorry you have insufficient amount");
			  }
			  break;
				  
					
				  
		  case 107:
		  int basic6=Integer.parseInt(data[0][3]);
		  System.out.println(basic6);
		  int hra6= Integer.parseInt(data[0][4]);
		  System.out.println(hra6);
		  int it6=Integer.parseInt(data[0][5]);
		  System.out.println(it6);
		  int da6=Integer.parseInt(data1[0][2]);
		  System.out.println(da6);
		  double gross6=basic6+hra6+da6-it6;
		  double y6=(20/100)*gross6;
		  System.out.println("20 percent of your gross salary is"+y6);
		  
		  if(y6>basic6)
		  {
			  int z;
			  do
			  {
				  System.out.println("you have enough money for shopping");
				  System.out.println("1. jeans");
				  System.out.println("2. shirt");
				  System.out.println("3. watch");
				  System.out.println("4. shoes");
				  System.out.println("5. supplements");
				  int q=Integer.parseInt(shopping[0][1]);
				  int w=Integer.parseInt(shopping[1][1]);
				  int e=Integer.parseInt(shopping[2][1]);
				  int r=Integer.parseInt(shopping[3][1]);
				  int t=Integer.parseInt(shopping[4][1]);
				  System.out.println("choose any item ");
				  z=input.nextInt();
				  
				  switch(z)
				  {
				  
				  case 1: 
					  if(y6>q)
					  {
						  System.out.println("item purchased");
						  y6-=q;
						  System.out.println(y6);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 2:
				  if(y6>w)
				  {
					  System.out.println("item purchased");
					  y6-=w;
					  System.out.println(y6);
				  }
				  else
				  {
					  System.out.println("insufficient amount!!");
				  }
				  break;
				  
				  case 3:
					  if(y6>e)
					  {
						  System.out.println("item purchased");
						  y6-=e;
						  System.out.println(y6);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
					  
				  case 4:
					  if(y6>r)
					  {
						  System.out.println("item purchased");
						  y6-=r;
						  System.out.println(y6);
					  }
					  else
					  {
						  System.out.println("insufficeint amount!!");
					  }
					  break;
					  
				  case 5:
					  if(y6>t)
					  {
						  System.out.println("item purchased");
						  y6-=t;
						  System.out.println(y6);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 6:
					  break;
				  }
			  }while(z!=6);
		  }
			  else
				  
			  {
				  System.out.println("sorry you have insufficient amount");
			  }
			  break;
				  
					
				  
		  case 108:
		  
		  int basic7=Integer.parseInt(data[0][3]);
		  System.out.println(basic7);
		  int hra7= Integer.parseInt(data[0][4]);
		  System.out.println(hra7);
		  int it7=Integer.parseInt(data[0][5]);
		  System.out.println(it7);
		  int da7=Integer.parseInt(data1[0][2]);
		  System.out.println(da7);
		  double gross7=basic7+hra7+da7-it7;
		  double y7=(20/100)*gross7;
		  System.out.println("20 percent of your gross salary is"+y7);
		  
		  if(y7>basic7)
		  {
			  int z;
			  do
			  {
				  System.out.println("you have enough money for shopping");
				  System.out.println("1. jeans");
				  System.out.println("2. shirt");
				  System.out.println("3. watch");
				  System.out.println("4. shoes");
				  System.out.println("5. supplements");
				  int q=Integer.parseInt(shopping[0][1]);
				  int w=Integer.parseInt(shopping[1][1]);
				  int e=Integer.parseInt(shopping[2][1]);
				  int r=Integer.parseInt(shopping[3][1]);
				  int t=Integer.parseInt(shopping[4][1]);
				  System.out.println("choose any item ");
				  z=input.nextInt();
				  
				  switch(z)
				  {
				  
				  case 1: 
					  if(y7>q)
					  {
						  System.out.println("item purchased");
						  y7-=q;
						  System.out.println(y7);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 2:
				  if(y7>w)
				  {
					  System.out.println("item purchased");
					  y7-=w;
					  System.out.println(y7);
				  }
				  else
				  {
					  System.out.println("insufficient amount!!");
				  }
				  break;
				  
				  case 3:
					  if(y7>e)
					  {
						  System.out.println("item purchased");
						  y7-=e;
						  System.out.println(y7);
					  }
					  else
					  {
						  System.out.println("insufficient amount");
					  }
					  break;
					  
				  case 4:
					  if(y7>r)
					  {
						  System.out.println("item purchased");
						  y7-=r;
						  System.out.println(y7);
					  }
					  else
					  {
						  System.out.println("insufficeint amount!!");
					  }
					  break;
					  
				  case 5:
					  if(y7>t)
					  {
						  System.out.println("item purchased");
						  y7-=t;
						  System.out.println(y7);
					  }
					  else
					  {
						  System.out.println("insufficient amount!!");
					  }
					  break;
				  case 6:
					  break;
				  }
			  }while(z!=6);
		  }
			  else
				  
			  {
				  System.out.println("sorry you have insufficient amount");
			  }
			  break;
				  
		  }
		  break;
	  }
	  
	 
			
		  else
		  {
			  System.out.println("invalid you have "+(2-i)+"two more chances");
			  
		  }
		  
		  
	  
		  
		  
			  
			  
		  }
		  
		  
	  }
		  
	  
	

	  
}


