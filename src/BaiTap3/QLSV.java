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
    
    public void sapXep(){
        SinhVien tam ;
        for(int i=0;i<ds.size();i++){
            for(int j=i+1;j<=ds.size()-1;j++)
                if(iSoSanh.soSanh(ds.get(i),ds.get(j)) == 1){
                    tam=ds.get(i);
                    ds.set(i,ds.get(j));
                    ds.set(j,tam);
                }
        }
    }
    
    public  void inDanhSach(){
        for (int i=0; i<ds.size(); i++){
            SinhVien sv = ds.get(i);
            System.out.println(
                    "Họ tên: " + sv.getHoTen() +"\n" +"Ngày sinh: " + sv.getNgaySinh() +"\n" +"Điểm trung bình: " + sv.getDiemTB() +"\n"
            );
    }
    }
}
