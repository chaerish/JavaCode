import java.util.Objects;

public class AirPollutionReader1 implements Runnable,Observer{
    private int sleepDuration;
    private boolean stop = false;
    private int num;
    public int pollution;
    
    public AirPollutionReader1(int num, int duration) {
        this.sleepDuration = duration;
        this.num = num;
        pollution=0;
    }

    @Override
    public void run() {
        while (!stop) {        
            try {
                System.out.printf("readerNumber = %d, pollution = %d\n", num, pollution);
                //server로부터 데이터 얻어오는 작업
                Thread.sleep(sleepDuration); // sleepDuration밀리초 멈춤
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void stopThread() { stop = true; }

    @Override
    public void update(Object o) {
        this.pollution=(int) o;
    }
}