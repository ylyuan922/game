package game;

public class scoreSort {

    private String player_name;
    private String player_id;
    private  Double final_score;

    public scoreSort(){

    }
    public scoreSort(String player_name,String player_id, Double final_score){
        this.player_name = player_name;
        this.player_id = player_id;
        this.final_score = final_score;
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

    public Double getFinal_score() {
        return final_score;
    }

    public void setFinal_score(Double final_score) {
        this.final_score = final_score;
    }

    @Override
    public String toString() {
        return "scoreSort{" +
                "player_name='" + player_name + '\'' +
                ", player_id='" + player_id + '\'' +
                ", final_score=" + (String.format("%.4f", final_score)) +
                '}';
    }
}
