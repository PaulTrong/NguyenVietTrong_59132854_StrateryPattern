package BaiTap3;
/**
 *
 * @author TRONG
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien> {

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
    String htSV1 = o1.getHoTen().toLowerCase();
    String htSV2 = o2.getHoTen().toLowerCase();
    int length = htSV1.length() <= htSV2.length() ? htSV1.length() : htSV2.length();
    for (int i = 0; i < length; i++) {
      int a = htSV1.charAt(i);
      int b = htSV2.charAt(i);
      if (a > b) return 1;
      if (a < b) return -1;
    }
    return 0;
  }
}
