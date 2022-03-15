public class Main implements Runnable{
    public int i;
    public Main(int i){
        this.i=i;
    }

    public void run() {
        System.out.println(i);
    }



}
