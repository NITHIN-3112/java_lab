import java.util.Scanner;
class Quicksort{
	String list[];
	public Quicksort(String[] list){
		this.list=list;
	}
	public void Quicksort(String list[],int lowerIndex,int highIndex){
		int i= lowerIndex;
		int j= highIndex;
		String pivot=this.list[lowerIndex+(highIndex-lowerIndex)/2];
		if(list == null || list.length==0){
			return;
		}
		while(i<=j){
			while(this.list[i].compareToIgnoreCase(pivot) < 0){
				i++;
			}
			while(this.list[j].compareToIgnoreCase(pivot) > 0){
				j--;
			}
			if(i<=j){
				swap(i,j);
				i++;
				j--;
			}
		}
		if(lowerIndex <j){
			Quicksort(list,lowerIndex,j);
		}
		if(i < highIndex){
			Quicksort(list,i,highIndex);
		}
	}
	void swap(int i,int j){
		String temp =this.list[i];
		this.list[i]=this.list[j];
		this.list[j]=temp;
	}
}
public class QuickSortLab{
	public static void main(String []args){
			
			Scanner in= new Scanner(System.in);
			System.out.println("HOW MANY NAMES ?");
			int n=in.nextInt();
			String[] list=new String [n];
			System.out.println("enter"+n+"names:");
			for(int i=0;i<n;i++){
				list[i]=in.next();
			}
			Quicksort sorter=new Quicksort(list);
			sorter.Quicksort(list,0,list.length-1);
			System.out.println(" list AFTER QUICKSORT:");
			for(String i: list){
				System.out.println(i);
				System.out.println(" ");
		}
	}
}