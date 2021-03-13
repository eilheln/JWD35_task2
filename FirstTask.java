public class FirstTask
{
 public static void main(String[] args)
  { 
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	int z = ((a-3)*b/2)+c;
	System.out.println ("((" + a + "-3)" + b + "/2)+" + c + "=" + z);
}
}