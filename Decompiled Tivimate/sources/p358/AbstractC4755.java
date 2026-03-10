package p358;

import java.util.Arrays;

/* JADX INFO: renamed from: ᵎᐧ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4755 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final byte[] f16788 = null;

    static {
        byte[] r0 = new byte[128];
        Arrays.fill(r0, (byte) -1);
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= 10) goto L7;
        r0[r2 + 48] = (byte) r2;
        r2 = r2 + 1;
    L7:
        if (r1 >= 26) goto L9;
        byte r3 = (byte) (r1 + 10);
        r0[r1 + 65] = r3;
        r0[r1 + 97] = r3;
        r1 = r1 + 1;
        goto L7
    L9:
        f16788 = r0;
    }
}
