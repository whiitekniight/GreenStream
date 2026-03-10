package p151;

import java.util.Arrays;
import p330.C4402;

/* JADX INFO: renamed from: ˉˋ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C2853 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final byte[] f10098;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4402 f10099;

    public C2853(C4402 r1, byte[] r2) {
        if (r1 == null) goto L10;
        if (r2 == null) goto L8;
        this.f10099 = r1;
        this.f10098 = r2;
        return;
    L8:
        throw new NullPointerException("bytes is null");
    L10:
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C2853) == true) goto L8;
        return false;
    L8:
        C2853 r42 = (C2853) r4;
        if (this.f10099.equals(r42.f10099) == true) goto L12;
        return false;
    L12:
        return Arrays.equals(this.f10098, r42.f10098);
    }

    public final int hashCode() {
        return ((this.f10099.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10098);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f10099 + ", bytes=[...]}";
    }
}
