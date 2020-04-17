package BaiTap1;

/**
 *
 * @author TRONG
 */
public class MainBaiTap1 {
    public static void main(String[] args) {
        Context context = new Context();
        context.settinhToan(new Cong());
        System.out.println("75+12= " + context.tinh(75,12));
        
        context.settinhToan(new Tru());
        System.out.println("54-78= " + context.tinh(54,78));
    }
}
