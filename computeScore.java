package game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class computeScore {
    private int count;

    public computeScore() {

    }

    public computeScore(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    List<Double> slist = new ArrayList<>();
    public void inputScore() {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while(i< count) {
            double j = in.nextDouble();
            slist.add(j);
            i += 1;
        }
    }

    public double compute() {
        slist.remove(Collections.max(slist));
        slist.remove(Collections.min(slist));
        double sum = 0.0;
        for(int i=0;i<slist.size();i++){
            sum = sum +slist.get(i);
        }
        sum = sum / (slist.size());
        return sum;
    }
}
