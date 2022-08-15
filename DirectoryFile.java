import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

 public class DirectoryFile
{
	public static void main(String args[])throws IOException
	{
		String directoryName;
		File directory;
        System.out.println("enter the directory name:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		directoryName = br.readLine();
		directory = new File(directoryName);
		if(directory.isDirectory()==false){
			if(directory.exists()==false)
			{
			System.out.println("there is no such directory");}
		else{
					System.out.println("that file is not a directory");
			}
		}
			else
			{
				listContents(directory,"");
			}
	}
		
	 static void listContents(File dir,String indent){
		 String[] files;
		 System.out.println(indent + "Directory \"" + dir.getName());
		 indent += " ";
		 files = dir.list();
		 for(int i=0;i<files.length;i++)
		 {
			 File f= new File(dir,files[i]);
	       if(f.isDirectory()){
		listContents(f,indent);
		   }
		else
			System.out.println(indent + files[i]);
	
		 }
	 }

}
		 
	