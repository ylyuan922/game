package game;

import java.util.Comparator;

public class scoreSortCompare implements Comparator<scoreSort> {
    @Override
    public int compare(scoreSort o1, scoreSort o2) {
        // 按照最终成绩降序
        double s1 =o1.getFinal_score();
        double s2 =o2.getFinal_score();
        return (int) (s2-s1);
    }

}
