package BaiTap2;

import java.util.ArrayList;
public class MainBaiTap2 {
    private static void in(ArrayList<HangHoa> ds){
        int s = 0;
        for (int i=0;i<ds.size();i++) {
            System.out.println("--Ten hang:"+ds.get(i).getTenHH()+", Gia:"+ds.get(i).getGia()+", Mo ta:"+ds.get(i).getMoTa());
            s = s + ds.get(i).getGia();
        }
        System.out.println("Tien hang: " + s);
    }
    public static void main(String[] args) {
        ThanhToanOnline thanhToanOnline =new ThanhToanOnline();
        ThanhToanCOD thanhToanCOD = new ThanhToanCOD();
        
        HangHoa hh1 = new HangHoa("IP X",15000000,"Chinh hang, 100%");
        HangHoa hh2 = new HangHoa("IP XS",11000000,"Xach tay, Like new 95%");
        HangHoa hh3 = new HangHoa("IP 8",600000,"Lock, 100%");
        
        ArrayList<HangHoa> ds1 = new ArrayList<>();
        ds1.add(hh1);
        ds1.add(hh2);
        ArrayList<HangHoa> ds2 = new ArrayList<>();
        ds2.add(hh3);
        
        GioHang gh = new GioHang();
        
        GioHang gh1 = gh;
        gh1.setHinhthucTT(thanhToanOnline);
        System.out.println("Danh sach hang hoa");
        gh1.setHh(ds1);
        in(ds1);
        System.out.println("So tien khach phai tra:" + gh1.thanhToan());
        
        GioHang gh2 = gh;
        gh2.setHinhthucTT(thanhToanCOD);
        System.out.println("Danh sach hang hoa");
        gh2.setHh(ds2);
        in(ds2);
        System.out.println("So tien khach phai tra:" + gh2.thanhToan());
    }
}
