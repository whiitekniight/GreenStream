package p416;

import com.google.crypto.tink.internal.TinkBugException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import p083.C2114;

/* JADX INFO: renamed from: ﹳʽ.ᵔי */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5287 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ int f19006 = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: ʽ */
    public static final C2114 m10316(String r4) {
        byte[] r0 = new byte[r4.length()];
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L13;
        char r2 = r4.charAt(r1);
        if (r2 < '!') goto L11;
        if (r2 > '~') goto L11;
        r0[r1] = (byte) r2;
        r1 = r1 + 1;
    L11:
        throw new TinkBugException("Not a printable ASCII character: " + r2);
    L13:
        return C2114.m5123(r0);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static boolean m10317(byte[] r4, byte[] r5) {
        if (r5.length >= r4.length) goto L5;
        return false;
    L5:
        int r0 = 0;
    L7:
        if (r0 >= r4.length) goto L12;
        if (r5[r0] != r4[r0]) goto L10;
        r0 = r0 + 1;
        goto L7
    L10:
        return false;
    L12:
        return true;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2114 m10318(String r4) {
        byte[] r0 = new byte[r4.length()];
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L13;
        char r2 = r4.charAt(r1);
        if (r2 < '!') goto L11;
        if (r2 > '~') goto L11;
        r0[r1] = (byte) r2;
        r1 = r1 + 1;
    L11:
        throw new GeneralSecurityException("Not a printable ASCII character: " + r2);
    L13:
        return C2114.m5123(r0);
    }
}
