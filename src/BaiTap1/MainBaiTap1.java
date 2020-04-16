/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author TRONG
 */
public class MainBaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Context context = new Context();
        context.settinhToan(new Cong());
        System.out.println("75+12= " + context.tinh(75,12));
        
        context.settinhToan(new Tru());
        System.out.println("54-78= " + context.tinh(54,78));
    }
}
