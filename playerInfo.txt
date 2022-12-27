package game;

public class playerInfo {
    private String player_name;
    private String player_id;
    private int order;

    public playerInfo() {

    }
    public playerInfo(String player_name, String player_id, int order) {
        this.player_name = player_name;
        this. player_id = player_id;
        this.order = order;
    }
    public String getPlayer_name() {
        return player_name;
    }
    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }
    public String getPlayer_id() {
        return player_id;
    }
    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }
    public int getOrder() {
        return order;
    }
    public void setOrder(int order) {
        this.order = order;
    }
}

//1.创建并完善一个选手PlayerInfo类，包含姓名、号码、比赛次序、分数。
//2.创建并完善一个评委类，包含姓名、选手比赛次序、打分。
//3.在测试类中，给定三个选手，五个评委分别为他们打分，选手的成绩需去掉最高分与最低分求平均值；最后，给出三个选手的排名。


