package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0014 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final byte[] f388 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Charset f389 = null;

    static {
        Charset.forName("US-ASCII");
        f389 = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] r1 = new byte[0];
        f388 = r1;
        ByteBuffer.wrap(r1);
        new C0059(r1, 0, 0, false).mo213(0);     // Catch: InvalidProtocolBufferException -> L5
        return;
    L5:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static int m217(long r2) {
        return (int) (r2 ^ (r2 >>> 32));
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m218(Object r0, String r1) {
        if (r0 == null) goto L5;
        return;
    L5:
        throw new NullPointerException(r1);
    }
}
