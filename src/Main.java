public class Main {

    public static void main(String[] args) {
        Kisi kisi1 = new Kisi("Ahmet", "Kısa", 5);
        Keman keman1 = new Keman();
        keman1.caliyor(kisi1);
        keman1.tecrube(kisi1);
        System.out.println("Virtüyöz mü? : " + keman1.virtuozMu(kisi1));
        System.out.println("=========================================");
//      =============================================================
        Kisi kisi2 = new Kisi("Yusuf", "Ulas", 20);
        Klarnet klarnet1 = new Klarnet();
        klarnet1.ufluyor(kisi2);
        klarnet1.tecrube(kisi2);
        System.out.println("Virtüyöz mü? : " + klarnet1.virtuozMu(kisi2));
        System.out.println("=========================================");
//      =============================================================
        Kisi kisi3 = new Kisi("Berke", "Kazancı", 10);
        Kanun kanun1 = new Kanun();
        kanun1.mizraplaCaliyor(kisi3);
        kanun1.tecrube(kisi3);
        System.out.println("Virtüyöz mü? : " + kanun1.virtuozMu(kisi3));
    }
}
