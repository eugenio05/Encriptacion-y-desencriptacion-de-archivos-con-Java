/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyectoseguridad;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author eugen
 */
public class Desencriptado {
   public String desencriptacion;
    public String decode(String secretKey, String textoencriptado) {
      
        try {
            byte[] message = Base64.decodeBase64(textoencriptado.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decifrado = Cipher.getInstance("DESede");
            decifrado.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decifrado.doFinal(message);
            desencriptacion = new String(plainText, "UTF-8");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return desencriptacion;
    }
}
