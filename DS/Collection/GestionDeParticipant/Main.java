package DS.Collection.GestionDeParticipant;

public class Main {
    public static void main(String[] args) {
        Participant p = new Participant("hamza");
        p.ajouterNote(19);
        p.ajouterNote(10);
        p.calculerMoyenne();
        System.out.println(p);
        Participant a = new Participant("ayoub");
        a.ajouterNote(15);
        a.ajouterNote(10);
        a.calculerMoyenne();
        //System.out.println(p.toString());
        GroupeParticipants gr = new GroupeParticipants();
        gr.ajouterParticipant(p);
        gr.ajouterParticipant(a);
        System.out.println(gr.getList());
        gr.chercher("ayoub");
        int result = a.compareTo(p);
        if(result == 1){
            System.out.println(a.getName()+" et superieure de "+p.getName());
        }
        else if(result ==-1){
            System.out.println(a.getName()+" et inferieure de "+p.getName());
        }
        else{
            System.out.println(a.getName()+" et comme de "+p.getName());
        }
        System.out.println("le meilleure particapant :");
        System.out.println(gr.mielleurParticipant());
        System.out.println("liste d'etudiant trie :");
        gr.lister();
        gr.trierPaticipants();
        System.out.println("triee::");
        gr.lister();
    }
}
