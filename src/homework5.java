import java.util.ArrayList;
import java.util.Arrays;

public class homework5 {
    public static void main(String[] args) {
int[]aarey={1,2,8,4};
        System.out.println(Arrays.toString(aarey));
        for (int i = 0; i < aarey.length; i++) {
            for (int j = 0; j < aarey.length; j++) {
                if (aarey[i]<aarey[j]){
                    int yedek=aarey[i];
                    aarey[i]=aarey[j];
                    aarey[j]=yedek;
                    System.out.println("sirla"+yedek);

                }

            }

        }


    }
}
