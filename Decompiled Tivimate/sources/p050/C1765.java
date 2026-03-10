package p050;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: renamed from: ʽʼ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C1765 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final byte f5901 = 0;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final byte f5902 = 0;

    static {
        f5902 = Byte.parseByte("01110000", 2);
        f5901 = Byte.parseByte("00001111", 2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String m4596() {
        UUID r0 = UUID.randomUUID();
        ByteBuffer r1 = ByteBuffer.wrap(new byte[17]);
        r1.putLong(r0.getMostSignificantBits());
        r1.putLong(r0.getLeastSignificantBits());
        byte[] r02 = r1.array();
        byte r2 = r02[0];
        r02[16] = r2;
        r02[0] = (byte) ((r2 & f5901) | f5902);
        return new String(Base64.encode(r02, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
