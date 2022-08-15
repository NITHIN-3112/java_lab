import java.util.Scanner;
import java.util.Hashtable;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
public class HashTable
{
	public static void main(String args[]){
		try{
			FileInputStream fs = new FileInputStream("ph.txt");
			Scanner sc = new Scanner(fs).useDelimiter("\\s+");
			Hashtable<String,String> ht = new Hashtable<String,String>();
			String[] arrayList;
			String a;
			System.out.println(" Welcome to ACE engineerung clg");
			System.out.println("HASH TABLE IS");
			System.out.println("----------------------------");
			System.out.println("KEY: VALUE");
			while (sc.hasNextLine()){
				a= sc.nextLine();
				arrayList = a.split("\\s+");
				ht.put(arrayList[0],arrayList[1]);
			System.out.println(arrayList[0] + ":" + arrayList[1]);
		}
		System.out.println("WELCOME");
		System.out.println("---------MENU---------");
		System.out.println("------1.Search by name-------");
		System.out.println("-------2.search by mobile------");
		System.out.println("------3.Exit------");
		String opt = "";
		String name,mobile;
		Scanner  s  = new Scanner (System.in);
		while(opt !="3"){
			System.out.println("Enter the Your Option 1,2,3");
			opt = s.next();
			switch(opt)
			{
				case "1":
				{
					System.out.println("enter name");
					name = s.next();
					if(ht.containsKey(name)){
						System.out.println("mobile is" + ht.get(name));
					}
					else{
					System.out.println("Not Found");}
				}
				break;
				case "2":{
				System.out.println("enter mobile");
				mobile = s.next();
				if(ht.containsValue(mobile)){
					for(Map.Entry e :ht.entrySet()){
						if(mobile.equals(e.getValue())){
						System.out.println("name is " + e.getKey());
						}
					}
				}
				else{
					System.out.println("Not Found");
				}
				}	break;
 				case "3":{
					opt = "3";
					System.out.println("Succeccfully menu exited");
				}break;
				default:{
					System.out.println("enter the option between 1 and 3");
				}
				
			}
		}
		
		System.out.println(ht);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		new HashTable();
	}
}