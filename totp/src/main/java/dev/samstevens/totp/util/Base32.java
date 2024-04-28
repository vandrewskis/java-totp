package dev.samstevens.totp.util;

import org.apache.commons.codec.CodecPolicy;

public class Base32 {
    private static final org.apache.commons.codec.binary.Base32 encoder = new org.apache.commons.codec.binary.Base32(0, null, false, (byte) '=', CodecPolicy.STRICT);

    public static byte[] decode(String s) {
        return encoder.decode(s);
    }

    public static String encode(byte[] b){
        return encoder.encodeAsString(b);
    }

}
