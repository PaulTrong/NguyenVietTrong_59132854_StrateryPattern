package BaiTap2;

import java.util.ArrayList;
/**
 *
 * @author TRONG
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dSHH;

    public void setHinhthucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    public void setHh(ArrayList<HangHoa> dSHH) {
        this.dSHH = dSHH;
    }

    public double thanhToan(){
        int tong = 0;
        for(int i=0; i<dSHH.size(); i++){
            tong = tong + dSHH.get(i).getGia();
        }
        return hinhThucTT.thanhToan(tong);
    }
}
