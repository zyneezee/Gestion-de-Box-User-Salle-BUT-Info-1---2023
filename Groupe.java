import java.util.List;
import java.util.ArrayList;

public class Groupe {
    private String groupeTD;
    private String groupeTP;
    private List<Horaire> horaire;


    public Groupe(String groupeTD , String groupeTP){
        this.groupeTD=groupeTD;
        this.groupeTP=groupeTP;
        this.horaire = new ArrayList<>();
    }

    public String getGroupeTD(){
        return this.groupeTD;
    }
    public String getGroupeTP(){
        return this.groupeTP;
    }
    @Override
    public String toString(){
        return "";
    }
}
