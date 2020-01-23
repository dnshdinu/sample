package programs;

public class Revstring {
	public static void main(String[] args) {
		
		String s="GREENS IS";
		String[] sp = s.split(" ");
   String t="";
      for (int i = 0; i < sp.length; i++) {
	
    	  String r=sp[i];
    	  for (int j =r.length()-1; j>=0; j--) {
    		  	char ch=r.charAt(j);
			t=t+ch;
		}
    	  t=t+ " ";
    	  System.out.println(t);
	}
	}

}
