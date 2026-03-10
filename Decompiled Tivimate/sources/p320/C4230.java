package p320;

import java.util.Arrays;

/* JADX INFO: renamed from: ᐧٴ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C4230 extends AbstractC4250 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final byte[] f15543;

    /* JADX INFO: renamed from: ﹳٴ */
    public final byte[] f15544;

    public C4230(byte[] r1, byte[] r2) {
        this.f15544 = r1;
        this.f15543 = r2;
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L6;
        return true;
    L6:
        if ((r6 instanceof AbstractC4250) == false) goto L20;
        AbstractC4250 r62 = (AbstractC4250) r6;
        boolean r1 = r62 instanceof C4230;
        C4230 r3 = (C4230) r62;
        if (r1 == false) goto L10;
        byte[] r32 = r3.f15544;
    L12:
        if (Arrays.equals(this.f15544, r32) == false) goto L20;
        C4230 r63 = (C4230) r62;
        if (r1 == false) goto L16;
        byte[] r64 = r63.f15543;
    L18:
        if (Arrays.equals(this.f15543, r64) == false) goto L20;
        return true;
    L16:
        r64 = r63.f15543;
        goto L18
    L10:
        r32 = r3.f15544;
    L20:
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f15544) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15543);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f15544) + ", encryptedBlob=" + Arrays.toString(this.f15543) + "}";
    }
}
