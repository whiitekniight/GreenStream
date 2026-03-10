package com.hierynomus.asn1;

/* JADX INFO: loaded from: classes.dex */
public class ASN1ParseException extends RuntimeException {
    public ASN1ParseException(Exception r1, String r2, Object... r3) {
        super(String.format(r2, r3), r1);
    }

    public ASN1ParseException(String r1, Object... r2) {
        super(String.format(r1, r2));
    }
}
