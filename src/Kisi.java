public class Kisi {

    private String isim;
    private String soyisim;
    private int tecrube;

    public Kisi(String isim, String soyisim,int tecrube) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.tecrube = tecrube;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getTecrube() {
        return tecrube;
    }

    public void setTecrube(int tecrube) {
        this.tecrube = tecrube;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", tecrube=" + tecrube +
                '}';
    }
}
