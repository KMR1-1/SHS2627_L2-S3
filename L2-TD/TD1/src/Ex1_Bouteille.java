public class Ex1_Bouteille {
    double capacite;
    double volume;
    boolean ouverte;

    public void ouvrir(){
        ouverte = true;
        System.out.println("La bouteille est ouverte.");
    }

    public void fermer(){
        ouverte = false;
        System.out.println("La bouteille est fermée.");
    }

    public void ajouterLiquide(double quantite){
        if (volume < quantite && volume +  quantite <= capacite){
            volume += quantite;
            System.out.println("La quantité " + quantite + " a été ajoutée à la bouteille.");
        } else {
            System.out.println("Impossible d'ajouter la quantité " + quantite + " à la bouteille.");
        }
    }

    public void enleverLiquide(double quantite){
        if (quantite > 0 && quantite <= capacite){
            volume -= quantite;
            System.out.println("La quantité " + quantite + " a été enlevée de la bouteille.");
        } else {
            System.out.println("Impossible d'enlever la quantité " + quantite + " de la bouteille.");
        }
    }

    public void vider(){
        volume = 0;
        System.out.println("La bouteille est vidée.");
    }

    public void remplir(){
        volume = capacite;
        System.out.println("La bouteille est remplie.");
    }

    public void niveauRestant(){
        System.out.println("Le niveau restant dans la bouteille est de " + (capacite - volume) + " unités.");
    }
}
