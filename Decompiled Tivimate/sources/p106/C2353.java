package p106;

import java.util.Arrays;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ˆʻ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C2353 extends AbstractC2346 {

    /* JADX INFO: renamed from: ʽ */
    public final byte[] f8440;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f8441;

    public C2353(String r2, byte[] r3) {
        super("PRIV");
        this.f8441 = r2;
        this.f8440 = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (C2353.class != r5.getClass()) goto L15;
        C2353 r52 = (C2353) r5;
        if (Objects.equals(this.f8441, r52.f8441) == false) goto L15;
        if (Arrays.equals(this.f8440, r52.f8440) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        String r0 = this.f8441;
        if (r0 == null) goto L5;
        int r02 = r0.hashCode();
    L6:
        int r1 = (527 + r02) * 31;
        return Arrays.hashCode(this.f8440) + r1;
    L5:
        r02 = 0;
        goto L6
    }

    @Override // p106.AbstractC2346
    public final String toString() {
        return this.f8423 + ": owner=" + this.f8441;
    }
}
