package com.chuckle.security.configuration;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class HmacUtil {
    public  static final String  HMAC_ALGO =  "HmacSHA256";
    public  static final String  SECRET_KEY = "your-secret-key";

    public static String generateHmac(String data) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(SECRET_KEY.getBytes(), HMAC_ALGO);
            Mac mac = Mac.getInstance(HMAC_ALGO);
            mac.init(secretKeySpec);
            byte[] hmacBytes = mac.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(hmacBytes);
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate HMAC", e);
        }
    }

    public static boolean verifyHmac(String data, String providedHmac) {
        String calculatedHmac = generateHmac(data);
        return calculatedHmac.equals(providedHmac);
    }
}
