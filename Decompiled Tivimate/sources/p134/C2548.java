package p134;

import java.util.Arrays;

/* JADX INFO: renamed from: ˈˋ.ˉٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2548 extends AbstractC2576 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final byte[] f9038;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f9039;

    public C2548(String r1, byte[] r2) {
        this.f9039 = r1;
        this.f9038 = r2;
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L6;
        return true;
    L6:
        if ((r6 instanceof AbstractC2576) == false) goto L16;
        AbstractC2576 r62 = (AbstractC2576) r6;
        C2548 r1 = (C2548) r62;
        String r3 = r1.f9039;
        if (this.f9039.equals(r3) == false) goto L16;
        if ((r62 instanceof C2548) == false) goto L12;
        byte[] r63 = ((C2548) r62).f9038;
    L14:
        if (Arrays.equals(this.f9038, r63) == false) goto L16;
        return true;
    L12:
        r63 = r1.f9038;
    L16:
        return false;
    }

    public final int hashCode() {
        return ((this.f9039.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9038);
    }

    public final String toString() {
        return "File{filename=" + this.f9039 + ", contents=" + Arrays.toString(this.f9038) + "}";
    }
}
