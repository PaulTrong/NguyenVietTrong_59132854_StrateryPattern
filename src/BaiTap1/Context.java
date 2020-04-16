package BaiTap1;

/**
 *
 * @author TRONG
 */
public class Context {
    
    private ITinh tinhToan;

    public void settinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    public float tinh(float a, float b)
    {
        return tinhToan.tinh(a, b);
    }
}
