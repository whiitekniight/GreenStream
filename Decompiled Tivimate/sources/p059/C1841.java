package p059;

import p005j$.util.Objects;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ʽˑ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C1841 {

    /* JADX INFO: renamed from: ʽ */
    public final double f6179;

    /* JADX INFO: renamed from: ˈ */
    public final String f6180;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f6181;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f6182;

    public C1841(int r3, String r4, String r5) {
        boolean r0 = true;
        if (r3 == 1) goto L5;
    L10:
        AbstractC4214.m8568(r0);
        this.f6182 = r4;
        this.f6181 = r3;
        this.f6180 = r5;
        this.f6179 = 0.0d;
        return;
    L5:
        if (r5.startsWith("0x") == true) goto L10;
        if (r5.startsWith("0X") == true) goto L10;
        r0 = false;
        goto L10
    }

    public C1841(String r1, double r2) {
        this.f6182 = r1;
        this.f6181 = 2;
        this.f6179 = r2;
        this.f6180 = null;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if ((r5 instanceof C1841) == false) goto L23;
        C1841 r52 = (C1841) r5;
        if (this.f6181 == r52.f6181) goto L10;
        return false;
    L10:
        if (Double.compare(this.f6179, r52.f6179) == 0) goto L12;
        return false;
    L12:
        if (Objects.equals(this.f6182, r52.f6182) == true) goto L14;
        return false;
    L14:
        if (Objects.equals(this.f6180, r52.f6180) == false) goto L22;
        return true;
    L22:
        return false;
    L23:
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f6182, Integer.valueOf(this.f6181), Double.valueOf(this.f6179), this.f6180});
    }
}
