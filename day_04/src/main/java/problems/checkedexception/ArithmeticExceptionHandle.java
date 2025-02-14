package problems.checkedexception;

public class ArithmeticExceptionHandle {

    public static void main(String[] args) {
        int a=10;
        int b=0;
        ArithmeticExceptionHandle handle = new ArithmeticExceptionHandle();
        handle.divideByZero(a,b);
    }
    public void divideByZero(int n1, int n2){
        try{
            int ans=n1/n2;
            System.out.println("final ans will be : "+ans);
        }
        catch (ArithmeticException e){
            System.out.println("number can't be divide by zero : ");
        }

    }
}