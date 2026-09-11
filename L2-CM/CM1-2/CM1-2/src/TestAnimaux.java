public class TestAnimaux {
    // Je suis un commentaire
    /*
    sslflsd
    sfkf
    ds

    aw

    qe
    f
    d
     */

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Chien monChien = new Chien();
        monChien.nom = "Scoubidou";

        Chat monChat = new Chat();
        monChat.nom = "Tom";

        monChien.respire();
        monChat.respire();

        monChien.mange();
        monChat.mange();

        monChien.dort();
        monChat.dort();

        monChien.aboie();
        monChat.miaule();
        //TODO hfeefw
    }

    public void affiche(){
        System.out.println("test");
        //monChien.aboie();
        //FIXME
    }

}
