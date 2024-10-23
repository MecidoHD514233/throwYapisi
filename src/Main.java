public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        int sonuc = 0;
        String metin = null;
        String metin2 = "inspimo";
        int[] dizi = new int[5];
        String yaziliSayi = "elli";

        try {
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Hata ! Sifira Bolunemez !" + e.getMessage());
            }
            try {
                System.out.println(metin.charAt(0));

            } catch (NullPointerException e) {
                System.out.println("Hata ! Null Pointer ! " + e.getMessage());
            }
            try {
                try{
                    System.out.println(metin2.charAt(10));
                }catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Hata ! String Index Hatasi ! " + e.getMessage());
                }

                try {
                    System.out.println(dizi[9]);

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Hata ! Array Index Hatasi ! " + e.getMessage());

                }
                System.out.println(dizi[9]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Hata ! Array Index Hatasi !" + e.getMessage());
            }
            try {
                try {
                    int sayi = Integer.parseInt(yaziliSayi);
                } catch (NumberFormatException e) {
                    System.out.println("Hata !Yanlıs Tip Donusumu ! " + e.getMessage());
                }
                int sayi=Integer.parseInt(yaziliSayi);
            } catch (IllegalArgumentException e) {
                System.out.println("Hata ! Illegal Argument ! " + e.getMessage());
            }

        } catch (Exception e) {

        }
    }

}
