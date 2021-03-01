import java.util.ArrayList;

public class homework1 {
    public static void main(String[] args) {

        //ArrayList<Integer>yenilist=new ArrayList<>();
        int yenilist[]={10, 4, 1, 4, -10, -50, 32, 21};
        int max=0;
        int min=0;
        for (int i = 0;  i< yenilist.length ; i++) {
            if (yenilist[i]>max){
                max=yenilist[i];
            }
            if (yenilist[i]<min){
                min=yenilist[i];
            }

        }
        System.out.println("max"+max);
        System.out.println("min"+min);




    }
}
