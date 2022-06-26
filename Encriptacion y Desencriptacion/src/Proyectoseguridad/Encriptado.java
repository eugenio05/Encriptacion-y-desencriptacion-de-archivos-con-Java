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
public class Encriptado {
    
    public String resultado;
    public  String encode(String secretKey, String textoaencriptar) {
        resultado = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavepassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavepassword, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);

            byte[] plainTextBytes = textoaencriptar.getBytes("utf-8");
            byte[] buff = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buff);
            resultado = new String(base64Bytes);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
        return resultado;
    }   
}
    
     

