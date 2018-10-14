public class Chaining {
    Chaining method(){
        System.out.println("This is Method");
        return this;
    }
    Chaining method2(){
        System.out.println("This is Method 2");
        return this;
    }
    public static void main(String[] args){
        new Chaining().method().method2();
    }
}
