/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author Acer
 */
public class HashUtil {
    public static byte[] hashMessage(String message) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        return digest.digest(message.getBytes());
    }

    public static void main(String[] args) {
        try {
            String message = "This is a secret message.";
            byte[] hash = hashMessage(message);
            System.out.println("Hashed message: " + bytesToHex(hash));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    // Hàm tiện ích để chuyển byte array thành chuỗi hex
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
