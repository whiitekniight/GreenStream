package p106;

import java.util.Arrays;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ˆʻ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2345 extends AbstractC2346 {

    /* JADX INFO: renamed from: ʽ */
    public final int f8417;

    /* JADX INFO: renamed from: ˈ */
    public final int f8418;

    /* JADX INFO: renamed from: ˑﹳ */
    public final long f8419;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final AbstractC2346[] f8420;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f8421;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final long f8422;

    public C2345(String r2, int r3, int r4, long r5, long r7, AbstractC2346[] r9) {
        super("CHAP");
        this.f8421 = r2;
        this.f8417 = r3;
        this.f8418 = r4;
        this.f8419 = r5;
        this.f8422 = r7;
        this.f8420 = r9;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L23:
        return false;
    L8:
        if (C2345.class != r7.getClass()) goto L23;
        C2345 r72 = (C2345) r7;
        if (this.f8417 != r72.f8417) goto L23;
        if (this.f8418 != r72.f8418) goto L23;
        if (this.f8419 != r72.f8419) goto L23;
        if (this.f8422 != r72.f8422) goto L23;
        if (Objects.equals(this.f8421, r72.f8421) == false) goto L23;
        if (Arrays.equals(this.f8420, r72.f8420) == false) goto L23;
        return true;
    }

    public final int hashCode() {
        int r0 = (((((((527 + this.f8417) * 31) + this.f8418) * 31) + ((int) this.f8419)) * 31) + ((int) this.f8422)) * 31;
        String r1 = this.f8421;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L7:
        return r0 + r12;
    L5:
        r12 = 0;
        goto L7
    }
}
