public class Kucing extends Hewan {
    @Override
    public String getMakanan() {
        if (getUmur() < 5) {
            return "Wiskas";
        } else {
            return "Segalanya";
        }
    }
}