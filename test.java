package game;

import java.util.*;


public class test {
    public static void main(String[] args) {

        playerInfo a = new playerInfo("Wang","001", 3);
		playerInfo b = new playerInfo("Zhang","012", 1);
		playerInfo c = new playerInfo("Li","005", 4);

        //创建记录成绩的集合
        List<playerInfo> score_list = new ArrayList<playerInfo>();
        score_list.add(a);
        score_list.add(b);
        score_list.add(c);

        //设置评委个数为5
        computeScore cs = new computeScore(5);

        //开始打分
        System.out.println("请评委为选手打分：");
        System.out.println("=================================");

        List<scoreSort> final_score = new ArrayList<scoreSort>();   //创建用于排序的集合
        Iterator<playerInfo> it = score_list.iterator();   //遍历score_list集合
        while (it.hasNext()) {
            //完成成绩输入与计算
            playerInfo s = it.next();
            System.out.println("请输入选手"+ s.getPlayer_id() + "的成绩：");
            cs.inputScore();
            double average_value = cs.compute();     //先计算平均值
            System.out.println("该选手最终成绩为："+ average_value);

           //为完成排序设置排序集合，
            scoreSort tmp = new scoreSort(s.getPlayer_name(),s.getPlayer_id(),average_value);   //创建排序类
            final_score.add(tmp);    //将序号，成绩添加至用于进行排序的Map集合中
        }

        System.out.println(final_score);

        System.out.println("=================================");
        Iterator its = final_score.iterator();
        while(it.hasNext()){
            scoreSort pm = (scoreSort)its.next();
            System.out.println(pm);
        }

        Collections.sort(final_score,new scoreSortCompare());
        System.out.println("最终排名的为：");
        for (scoreSort pm:final_score){
            System.out.println(pm);
        }
    }
}
