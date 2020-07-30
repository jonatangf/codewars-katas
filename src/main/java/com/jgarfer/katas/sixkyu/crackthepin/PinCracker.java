package com.jgarfer.katas.sixkyu.crackthepin;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PinCracker {

    public String crack(String hash) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");

            String correctHash = hash.toUpperCase();

            for (int i = 0; i < 100000; i++) {
                StringBuilder pin = new StringBuilder(((Integer) i).toString());
                while (pin.length() < 5) pin.insert(0, "0");

                messageDigest.update(pin.toString().getBytes());
                byte[] digest = messageDigest.digest();
                String calculatedHash = DatatypeConverter.printHexBinary(digest).toUpperCase();

                if (calculatedHash.equals(correctHash)) {
                    return pin.toString();
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
