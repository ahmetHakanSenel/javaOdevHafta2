public class Main {
    public static void main(String[] args) {
        sayiBulmaca();

    }
        public static void sayiBulmaca(){

            int[] sayilar = new int[] {1,2,5,7,9,4,0};
            int aranacak = 9;
            boolean varMi = false;

            for(int sayi : sayilar){
                if (sayi == aranacak){
                    varMi = true;
                    break;
                }

            }

            if (varMi){
                mesajVer("Sayi mevcuttur: "+aranacak);
            }
            else{
                mesajVer("Sayi mevcut degildir: "+aranacak);
            }

        }

        public static void mesajVer(String mesaj){
            System.out.println(mesaj);
        }

}