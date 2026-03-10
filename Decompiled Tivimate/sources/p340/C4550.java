package p340;

import p022.AbstractC1327;

/* JADX INFO: renamed from: ᴵᵔ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C4550 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f16427;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4558 f16428;

    public C4550(C4558 r1, int r2) {
        this.f16428 = r1;
        this.f16427 = r2;
    }

    public final String toString() {
        int r0 = this.f16427;
        if (r0 != 0) goto L6;
        String r02 = "start";
    L9:
        StringBuilder r03 = AbstractC1327.m3728(r02, " ");
        r03.append(this.f16428.f16473.toString());
        return r03.toString();
    L6:
        if (r0 != 1) goto L8;
        r02 = "delay ended";
        goto L9
    L8:
        r02 = "end";
        goto L9
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final long m8992() {
        C4558 r0 = this.f16428;
        int r1 = this.f16427;
        if (r1 != 0) goto L7;
        return r0.f16475;
    L7:
        if (r1 != 1) goto L14;
        long r12 = r0.f16475;
        if (r12 != (-1)) goto L11;
        return -1;
    L11:
        r0.f16473.getClass();
        return r12;
    L14:
        return r0.f16481;
    }
}
