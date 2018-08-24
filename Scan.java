import java.util.Scanner;
class Scan {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int i = obj.nextInt();
	
        String j = obj.nextLine();
        char k= obj.next().charAt(0);
        float l=obj.nextFloat();
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
    }
}