public class AnimalNotFoundException extends Exception{
    private int detail;
    public AnimalNotFoundException(int a){
        this.detail=a;
    }

    @Override
    public String toString() {
        return "AnimalNotFoundException{" +
                "detail=" + detail +
                '}';
    }
}
