import java.util.List;

public class Salle {
    private int idSalle;
    private String nom;
    private int capacite;
    private int superficie;
    private List<Horaire> lesHoraires;

    public Salle(int idSalle, String nom, int capacite, int superficie){
        this.idSalle = idSalle;
        this.nom = nom;
        this.capacite = capacite;
        this.superficie = superficie;
    }

    public int getId(){
        return this.idSalle;
    }

    public String getNom(){
        return this.nom;
    }

    public int getCapacite(){
        return this.capacite;
    }

    public int getSuperficie(){
        return this.superficie;
    }


}