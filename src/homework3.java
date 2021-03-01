public class homework3 {
    public static void main(String[] args) {
        int []dizi={10,20,30,2,4};
        int toplam=0;
        for (int i = 0; i < dizi.length ; i++) {
            toplam=toplam+dizi[i];

        }
        int ort=toplam/ dizi.length;
        System.out.println("toplam"+toplam);
        System.out.println("ort"+ort);
    }
}
