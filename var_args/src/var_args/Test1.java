package var_args;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         sum();
         sum(10,20);
         sum(10,20,30,40);
	}
   public static void sum(int...x){
   int total=0;
   for(int x1:x)
   {
	   total=total+x1;
	   
   }System.out.println("sum:"+total);
}  
}
