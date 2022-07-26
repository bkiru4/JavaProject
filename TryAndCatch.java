package Finished;

public class TryAndCatch {
    public static void main(String[] args){
        int x=0;
        try{
            System.out.println("Trying");
            x = 10;
            System.out.printf("%f%n",x);
            System.out.println("Tried");
        }
        catch (Exception e){
            System.out.println("Exception caught"+ "  "+ x);

        }
    }
}
