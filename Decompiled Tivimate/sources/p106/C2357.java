package p106;

import p005j$.util.Objects;

/* JADX INFO: renamed from: ˆʻ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C2357 extends AbstractC2346 {

    /* JADX INFO: renamed from: ʽ */
    public final String f8450;

    /* JADX INFO: renamed from: ˈ */
    public final String f8451;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f8452;

    public C2357(String r2, String r3, String r4) {
        super("----");
        this.f8452 = r2;
        this.f8450 = r3;
        this.f8451 = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (C2357.class != r5.getClass()) goto L17;
        C2357 r52 = (C2357) r5;
        if (Objects.equals(this.f8450, r52.f8450) == false) goto L17;
        if (Objects.equals(this.f8452, r52.f8452) == false) goto L17;
        if (Objects.equals(this.f8451, r52.f8451) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        String r1 = this.f8452;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L6:
        int r2 = (527 + r12) * 31;
        String r13 = this.f8450;
        if (r13 == null) goto L9;
        int r14 = r13.hashCode();
    L10:
        int r22 = (r2 + r14) * 31;
        String r15 = this.f8451;
        if (r15 == null) goto L14;
        r0 = r15.hashCode();
    L14:
        return r22 + r0;
    L9:
        r14 = 0;
        goto L10
    L5:
        r12 = 0;
        goto L6
    }

    @Override // p106.AbstractC2346
    public final String toString() {
        return this.f8423 + ": domain=" + this.f8452 + ", description=" + this.f8450;
    }
}
