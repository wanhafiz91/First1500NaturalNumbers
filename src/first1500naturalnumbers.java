import java.util.ArrayList;

public class first1500naturalnumbers {  
	public static void main(String[] args) {         
		ArrayList<Integer> list = new ArrayList<>();      
		int b = 2;         
		for (int K = 2; K < 1502; ++K){          
			list.clear();          
			int a = b;             
			int N = a;             
			if(a%2!=0 && a%3!=0 && a%5!=0){              
				K = K -1;             
			}             
			if(a%2==0 || a%3==0 || a%5==0){              
				while(a%2 ==0){               
					if(a%2==0){                
						list.add(2);                
						a = (a/2);               
					}              
				}             
				while(a%3 == 0){               
					if(a%3==0){                
						list.add(3);                
						a = (a/3);               
					}              
				}             
				while(a%5 == 0){               
					if(a%5==0){                
						list.add(5);                
						a = a/5;               
				} 
			}              
			if(a!=1){               
				list.clear();               
				if(K>0){                     
					K = K -1;                     
				}              
			}                       
			if(a==1){               
				System.out.print(N+" : ");               
				for (int value : list) {                
					System.out.print(value+" ");               
				}               
				System.out.print("\n");              
			}             
		}             
		b = b + 1;        
		}  
	} 
} 