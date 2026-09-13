public class Animal {
    //Attributs de la classe
    String nom;
    int age;    

    //Méthodes de la classe
    public void respire(){
        System.out.println("Je respire");      //implémentation (code entre {...}) 
    }

    public void mange(){
        System.out.println("Je mange");
    }

    public void dort(){
        //Gestion des exceptions
        try{        //On tente un code
            System.out.println("Je dors");
            throw new  Exception();    //Cette ligne génère une exception artificielle pour l'exemple
        } catch(Exception e){    //On récupère l'exeption si présente (ex. Division par 0)
            System.err.println("Erreur dans la méthode Dort.");    //Le scénario si une exception se passe
        }

    }
}
