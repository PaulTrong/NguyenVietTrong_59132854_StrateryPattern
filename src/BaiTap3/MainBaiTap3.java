package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author TRONG
 */
public class MainBaiTap3 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        SoSanhTheoDiem soSanhTheoDiem = new SoSanhTheoDiem();
        SoSanhTheoTen soSanhTheoTen = new SoSanhTheoTen();
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat date = new SimpleDateFormat(pattern);
          
        SinhVien sv1 = new SinhVien("Nguyễn Viết Trọng",date.parse("5-6-1999"),8);
        SinhVien sv2 = new SinhVien("Lê Quán Đức",date.parse("10-4-1998"),9);
        SinhVien sv3 = new SinhVien("Trần Thị Vân ",date.parse("29-7-1999"),7);
        SinhVien sv4 = new SinhVien("Hồ Thị Anh",date.parse("15-5-1990"),7);

        ArrayList<SinhVien> sinhvien = new ArrayList<>();
        sinhvien.add(sv1);
        sinhvien.add(sv2);
        sinhvien.add(sv3);
        sinhvien.add(sv4);

        QLSV qlsv = new QLSV();
        qlsv.setDs(sinhvien);
        qlsv.setiSoSanh(soSanhTheoTen);
        qlsv.sapXep();
        System.out.println("SẮP XẾP THEO TÊN");
        qlsv.inDanhSach();

        qlsv.setiSoSanh(soSanhTheoDiem);
        qlsv.sapXep();
        System.out.println("SẮP XẾP THEO ĐIỂM");
        qlsv.inDanhSach();
    }
    
}
