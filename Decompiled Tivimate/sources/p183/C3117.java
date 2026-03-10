package p183;

import java.util.Arrays;

/* JADX INFO: renamed from: ˊﾞ.ˊʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C3117 {

    /* JADX INFO: renamed from: ʽ */
    public final int f10926;

    /* JADX INFO: renamed from: ˈ */
    public final int f10927;

    /* JADX INFO: renamed from: ⁱˊ */
    public final byte[] f10928;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f10929;

    public C3117(int r1, int r2, int r3, byte[] r4) {
        this.f10929 = r1;
        this.f10928 = r4;
        this.f10926 = r2;
        this.f10927 = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L19:
        return false;
    L8:
        if (C3117.class != r5.getClass()) goto L19;
        C3117 r52 = (C3117) r5;
        if (this.f10929 != r52.f10929) goto L19;
        if (this.f10926 != r52.f10926) goto L19;
        if (this.f10927 != r52.f10927) goto L19;
        if (Arrays.equals(this.f10928, r52.f10928) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        int r0 = this.f10929 * 31;
        return ((((Arrays.hashCode(this.f10928) + r0) * 31) + this.f10926) * 31) + this.f10927;
    }
}
