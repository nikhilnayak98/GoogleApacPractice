import java.util.Scanner;

public class StoreCredit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int credit,l,i=0,t,j,list[]=new int[100],cases;
		cases=sc.nextInt();
		int k,b=0;;
		int store[]=new int[100],index=0;
		loop1:
			for(k=1;k<=cases;k++){
				credit=sc.nextInt();
				l=sc.nextInt();
				while(i<l)
				{
					list[i]=sc.nextInt();
					i++;
				}
				loop2:
					for(i=0;i<l;i++){
						t=credit-list[i];
						j=i+1;
						while(j<l){
							if(list[j]==t){
								store[b]=i+1;;
								store[b+1]=j+1;
								break loop2;
							}
							j++;
						}
					}
				b+=2;
			}
		i=1;
		b=0;
		while(i<=cases){
			System.out.println("Cases #" + i + ": " + store[b] + " "+ store[b+1]);
			b+=2;
			i++;
		}
	}
}
