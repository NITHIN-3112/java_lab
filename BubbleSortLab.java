import java.util.Scanner;
class Bubblesort{
	int array[];
	int num;
	public Bubblesort(int[] array,int num){
		this.array=array; // initializing a variable
		this.num=num;       // initializing a variable
	}
	public void sort(){
		for(int i=0,temp;i<(num-1);i++)
			for(int j=0;j<(num-i-1);j++){
				if(array[j] < array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
	    }
    }
	public class BubbleSortLab{
		public static void main(String []args){
			int num,i,j,temp;
			Scanner input= new Scanner(System.in);
			System.out.println("ENTER THE NUMBER OF INTEGERS");
			num=input.nextInt();
			int array[]=new int[num];
			System.out.println("enter"+num+"integers:");
			for(i=0;i<num;i++)
				array[i] =input.nextInt();
			Bubblesort sorter=new Bubblesort(array,num);
			sorter.sort();
			System.out.println("sorted list of integers:");
			for(i=0;i<num;i++)
				System.out.println(array[i]);
		}
	}