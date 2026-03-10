package p083;

import java.util.Arrays;
import ʼ.ᵎﹶ;

/* JADX INFO: renamed from: ʾᐧ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2114 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final byte[] f7438;

    public C2114(int r3, byte[] r4) {
        byte[] r0 = new byte[r3];
        this.f7438 = r0;
        System.arraycopy(r4, 0, r0, 0, r3);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C2114 m5123(byte[] r2) {
        if (r2 == null) goto L9;
        int r0 = r2.length;
        if (r0 <= r2.length) goto L7;
        r0 = r2.length;
    L7:
        return new C2114(r0, r2);
    L9:
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2114) == true) goto L7;
        return false;
    L7:
        return Arrays.equals(((C2114) r2).f7438, this.f7438);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7438);
    }

    public final String toString() {
        return "Bytes(" + ᵎﹶ.ﹳᐧ(this.f7438) + ")";
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final byte[] m5124() {
        byte[] r0 = this.f7438;
        byte[] r1 = new byte[r0.length];
        System.arraycopy(r0, 0, r1, 0, r0.length);
        return r1;
    }
}
