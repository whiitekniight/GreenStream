package p303;

import p005j$.util.Objects;

/* JADX INFO: renamed from: ٴᴵ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C4093 {

    /* JADX INFO: renamed from: ʽ */
    public final String f15058;

    /* JADX INFO: renamed from: ˈ */
    public final String f15059;

    /* JADX INFO: renamed from: ˑﹳ */
    public final String f15060;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f15061;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f15062;

    public C4093(String r1, String r2, String r3, String r4, String r5) {
        this.f15062 = r1;
        this.f15061 = r2;
        this.f15058 = r3;
        this.f15059 = r4;
        this.f15060 = r5;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C4093) == true) goto L8;
        return false;
    L8:
        C4093 r52 = (C4093) r5;
        if (Objects.equals(this.f15062, r52.f15062) == true) goto L11;
    L19:
        return false;
    L11:
        if (Objects.equals(this.f15061, r52.f15061) == false) goto L19;
        if (Objects.equals(this.f15058, r52.f15058) == false) goto L19;
        if (Objects.equals(this.f15059, r52.f15059) == false) goto L19;
        if (Objects.equals(this.f15060, r52.f15060) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        String r1 = this.f15062;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L6:
        int r2 = (527 + r12) * 31;
        String r13 = this.f15061;
        if (r13 == null) goto L9;
        int r14 = r13.hashCode();
    L10:
        int r22 = (r2 + r14) * 31;
        String r15 = this.f15058;
        if (r15 == null) goto L13;
        int r16 = r15.hashCode();
    L14:
        int r23 = (r22 + r16) * 31;
        String r17 = this.f15059;
        if (r17 == null) goto L17;
        int r18 = r17.hashCode();
    L18:
        int r24 = (r23 + r18) * 31;
        String r19 = this.f15060;
        if (r19 == null) goto L22;
        r0 = r19.hashCode();
    L22:
        return r24 + r0;
    L17:
        r18 = 0;
        goto L18
    L13:
        r16 = 0;
        goto L14
    L9:
        r14 = 0;
        goto L10
    L5:
        r12 = 0;
        goto L6
    }
}
