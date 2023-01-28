public class Klarnet extends Uflemeli {
    @Override
    public void ufluyor(Kisi kisi) {
        System.out.println(kisi.getIsim() + " " + kisi.getSoyisim() + " isimli kişi Klarnet Çalıyor.");
    }

    @Override
    public void tecrube(Kisi kisi) {
        System.out.println(kisi.getIsim() + " isimli kişinin Klarnette " + kisi.getTecrube() + " yıl tecrübesi var");
    }

    @Override
    public boolean virtuozMu(Kisi kisi) {
        if (kisi.getTecrube() >= 20)
            return true;
        else
            return false;
    }
}
