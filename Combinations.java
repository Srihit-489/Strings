import java.util.*;
import java.lang.*;

class Combinations{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			String str = scanner.next();
			int n = scanner.nextInt();
			scanner.nextLine();
			HashSet<String> myhash = new HashSet<String>();
			boolean[] data = new boolean[str.length()+1];
			for(int i=0;i<n;i++){
				  myhash.add(scanner.nextLine());
			}
            data[0] = true;
			for(int i=1;i<=str.length();i++){
				  for(int j=0;j<i;j++){
						if(data[j] && myhash.contains(str.substring(j,i)))
							data[i] = true;
				  }
			}
			System.out.println(data[str.length()]);
		
	  }
}
