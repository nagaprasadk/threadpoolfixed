import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execu {
    public static void main(String args[]){
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for(int j=1;j<11;j++){
        Runnable t1=new Main(j);
        executorService.execute(t1);
        }
        executorService.shutdown();
    }
}
