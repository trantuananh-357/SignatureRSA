/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atbmtt;

import view.Home;

/**
 *
 * @author Acer
// */
public class ATBMTT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Home home = new Home();
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        
        
    }
    
}
//public class ATBMTT {
//    public static void main(String[] args) {
//        // Giả sử mảng của bạn là mảng byte
//        byte[] hash = {5, -2, 3, -8, 0, -1, 7};
//
//        // Gọi hàm để kiểm tra và sửa đổi mảng
//        modifyByteArray(hash);
//
//        // In mảng sau khi sửa đổi
//        for (byte b : hash) {
//            System.out.print(b + " ");
//        }
//    }
//
//    public static void modifyByteArray(byte[] array) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                array[i] += 3;
//            }
//        }
//    }
//}