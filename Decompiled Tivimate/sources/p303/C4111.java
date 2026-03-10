package p303;

import p005j$.util.Objects;

/* JADX INFO: renamed from: ٴᴵ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C4111 {

    /* JADX INFO: renamed from: ʽ */
    public final String f15135;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f15136;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f15137;

    public C4111(String r1, String r2, String r3) {
        this.f15137 = r1;
        this.f15136 = r2;
        this.f15135 = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (C4111.class != r5.getClass()) goto L17;
        C4111 r52 = (C4111) r5;
        if (Objects.equals(this.f15137, r52.f15137) == false) goto L17;
        if (Objects.equals(this.f15136, r52.f15136) == false) goto L17;
        if (Objects.equals(this.f15135, r52.f15135) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        int r0 = this.f15137.hashCode() * 31;
        int r1 = 0;
        String r2 = this.f15136;
        if (r2 == null) goto L5;
        int r22 = r2.hashCode();
    L6:
        int r02 = (r0 + r22) * 31;
        String r23 = this.f15135;
        if (r23 == null) goto L10;
        r1 = r23.hashCode();
    L10:
        return r02 + r1;
    L5:
        r22 = 0;
        goto L6
    }
}
