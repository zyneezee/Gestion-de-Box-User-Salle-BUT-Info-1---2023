import java.util.ArrayList;
import java.util.List;

public class Admin {
    private String nom;
    private int id;
    private List<Cours> cours;
    
    public admin(String nom, int id){
        this.id = id;
        this.nom = nom;
        this.cours = new ArrayList<>();

    }

    public String getNom(){
        return this.nom;
    }

    public int getId(){
        return this.id;
    }

    public void ajoute(Cours cours){
        this.cours.add(cours);
    }
    
}
