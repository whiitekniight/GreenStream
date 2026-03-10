package p106;

import p005j$.util.Objects;

/* JADX INFO: renamed from: ˆʻ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C2350 extends AbstractC2346 {

    /* JADX INFO: renamed from: ʽ */
    public final String f8436;

    /* JADX INFO: renamed from: ˈ */
    public final String f8437;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f8438;

    public C2350(String r2, String r3, String r4) {
        super("COMM");
        this.f8438 = r2;
        this.f8436 = r3;
        this.f8437 = r4;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (C2350.class != r5.getClass()) goto L17;
        C2350 r52 = (C2350) r5;
        if (Objects.equals(this.f8436, r52.f8436) == false) goto L17;
        if (Objects.equals(this.f8438, r52.f8438) == false) goto L17;
        if (Objects.equals(this.f8437, r52.f8437) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        String r1 = this.f8438;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L6:
        int r2 = (527 + r12) * 31;
        String r13 = this.f8436;
        if (r13 == null) goto L9;
        int r14 = r13.hashCode();
    L10:
        int r22 = (r2 + r14) * 31;
        String r15 = this.f8437;
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
        return this.f8423 + ": language=" + this.f8438 + ", description=" + this.f8436 + ", text=" + this.f8437;
    }
}
