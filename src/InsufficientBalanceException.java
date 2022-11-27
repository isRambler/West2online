public class InsufficientBalanceException extends Exception{
    private double detail;
    public InsufficientBalanceException(double a){
        this.detail=a;
    }

    @Override
    public String toString() {
        return "InsufficientBalanceException{" +
                "detail=" + detail +
                '}';
    }
}
