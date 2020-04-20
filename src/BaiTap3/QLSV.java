package BaiTap3;

import java.util.ArrayList;

/**
 *
 * @author TRONG
 */
public class QLSV {
    ArrayList<SinhVien> ds;
    ISoSanh<SinhVien> iSoSanh;

    public void setDs(ArrayList<SinhVien> ds) {
        this.ds = ds;
    }

    public void setiSoSanh(ISoSanh<SinhVien> iSoSanh) {
        this.iSoSanh = iSoSanh;
    }
}
