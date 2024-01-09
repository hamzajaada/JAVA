package DS.Exception.Preparation;

public class testException {
    public static float inverse(int n){
        float x =0;
        x = 1/n;
        return x;
    }
    public static void main(String[] args) {
        int []tab = {1,2,3};
        try {
            for(int i=0; i<tab.length;i++){
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("fin");
    }
}
