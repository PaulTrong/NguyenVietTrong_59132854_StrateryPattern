package BaiTap2;
/**
 *
 * @author TRONG
 */
public class HangHoa {
    private String tenHH;
    private int gia;
    private String moTa;

    public String getTenHH() {
        return tenHH;
    }
    public int getGia() {
        return gia;
    }
    public String getMoTa() {
        return moTa;
    }

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
}
