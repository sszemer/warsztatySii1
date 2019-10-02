package racing;

public class Counter {

    public Counter() {
        count = 0;
    }

    private int count;

    public void increment(){
        synchronized(this){
            count++;
        }
    }

    public int getCount(){

        return count;
    }

}
