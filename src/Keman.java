public class Keman extends Yayli {
    Kisi kisi;

    @Override
    public void caliyor(Kisi kisi) {
        System.out.println(kisi.getIsim() + " " + kisi.getSoyisim() + " isimli kişi Keman çalıyor.");
    }

    @Override
    public void tecrube(Kisi kisi) {
        System.out.println(kisi.getIsim() + " isimli kişinin Kemanda " + kisi.getTecrube() + " yıl tecrübesi var");
    }

    @Override
    public boolean virtuozMu(Kisi kisi) {
        if (kisi.getTecrube() > 15) {
            return true;
        } else {
            return false;
        }
    }
}
