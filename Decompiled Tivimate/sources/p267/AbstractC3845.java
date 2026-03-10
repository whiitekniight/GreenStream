package p267;

import java.util.Arrays;

/* JADX INFO: renamed from: יـ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3845 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final int[] f14094 = null;

    static {
        long[] r0 = AbstractC3848.f14102;
        int r2 = AbstractC3848.m7927(0);
        if (r2 <= 0) goto L5;
        int r22 = Math.max(7, AbstractC3848.m7926(r2));
    L6:
        if (r22 == 0) goto L9;
        int r02 = ((r22 + 15) & (-8)) >> 3;
        long[] r3 = new long[r02];
        Arrays.fill(r3, 0, r02, -9187201950435737472L);
        r0 = r3;
    L9:
        int r32 = r22 >> 3;
        long r7 = 255 << ((r22 & 7) << 3);
        r0[r32] = (r0[r32] & (~r7)) | r7;
        int[] r03 = new int[r22];
        f14094 = new int[0];
        return;
    L5:
        r22 = 0;
        goto L6
    }
}
