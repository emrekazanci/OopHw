public class Kanun extends Mizrapli {
    @Override
    public void mizraplaCaliyor(Kisi kisi) {
        System.out.println(kisi.getIsim() + " " + kisi.getSoyisim() + " isimli kişi mızraplarıyla Kanun çalıyor.");
    }

    @Override
    public void tecrube(Kisi kisi) {
        System.out.println(kisi.getIsim() + " isimli kişinin Kanunda " + kisi.getTecrube() + " yıl tecrübesi var");
    }

    @Override
    public boolean virtuozMu(Kisi kisi) {
        if (kisi.getTecrube() > 12)
            return true;
        else
            return false;
    }
}
