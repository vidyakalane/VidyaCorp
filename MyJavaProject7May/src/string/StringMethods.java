package string;

public class StringMethods {
public static void main(String[] args) {
	String a="Vidya";
	char value=a.charAt(2);
	int value1=a.indexOf('V');
	System.out.println("chatAt---- = "+value);
	System.out.println("indexOf---- = "+value1);
	
	
	String b="Sandip";
	String Val=b.concat(a);
	System.out.println("Concat---- = "+Val);
	
	boolean val1=a.equals(b);
	System.out.println("equals---- = "+val1);
	
	String c="Sandip";
	String d="sandip";
	boolean e=c.equalsIgnoreCase(d);
	System.out.println("equalsIgnoreCase---- = "+e);
	
	String F="SandyRudra";
	String val2=F.substring(5);
	String val3=F.substring(5,7);
	System.out.println("Substring---- = "+val2);
	System.out.println("Substring(int beginIndex, int endIndex)---- = "+val3);
	
	int val4=F.length();
	System.out.println("length---- = "+val4);
	
	String val5=F.replace('y','V');
	System.out.println("replace(char old, char new)---- = "+val5);
	
	String G="KRISHA";
	String Val6=G.toLowerCase();
	System.out.println("LowerCase---- = "+Val6);
	
	
	String Val7=F.toUpperCase();
	System.out.println("UpperCase---- = "+Val7);
	
	String H=" Krish  ";
	String Val8=H.trim();
	System.out.println("trim---- = "+Val8);
	
	String I="Vvvvv";
	int value2=I.lastIndexOf('v');
	System.out.println("lastIndexOf---- = "+value2);
	
	
	String J="VvvvvFWCrrrtyusututueyutyutyuertwqsafghkvbm";
	boolean value3=J.contains("tutu");
	System.out.println("contains---- = "+value3);
	
	String K="KRISHA";
	String M="SandipKRISHA";
	System.out.println("CharArray---- = "+K);
	char[] L=K.toCharArray();
	for(int i = 0; i<L.length;i++)
	System.out.println("CharArray---- = "+L[i]);
	System.out.println("CharArray---- = "+M[i]);
	
	
	
	
	
	
	
	
}
}
