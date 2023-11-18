package POLYMORFISME;

public class Main {
    public static void main(String[] args) {
        Animal A = new Chat();
        Animal B = new Chien();
        Animal[] Tab = new Animal[2];
        Tab[0]=A;
        Tab[1]=B;
        for(Animal Tabl : Tab){
            Tabl.affiche();
        }

    }
    
}
