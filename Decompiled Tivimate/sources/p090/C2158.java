package p090;

import p024.C1364;
import p380.AbstractC4984;

/* JADX INFO: renamed from: ʿʼ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2158 extends AbstractC4984 {

    /* JADX INFO: renamed from: ᴵˊ */
    public C1364 f7734;

    @Override // p380.AbstractC4984
    /* JADX INFO: renamed from: ʽ */
    public final int mo5275() {
        return this.f7734.f4679;
    }

    @Override // p380.AbstractC4984
    /* JADX INFO: renamed from: ᵎﹶ */
    public final int mo5276(byte[] r8) {
        C1364 r0 = this.f7734;
        byte[] r1 = r0.f4680;
        int r2 = r0.f4679;
        if (r2 < r8.length) goto L6;
        r2 = r8.length;
    L6:
        int r3 = r0.f4678;
        if ((r3 + r2) > r1.length) goto L9;
        System.arraycopy(r1, r3, r8, 0, r2);
    L10:
        r0.f4678 = (r0.f4678 + r2) % r1.length;
        r0.f4679 -= r2;
        return r2;
    L9:
        int r4 = r1.length - r3;
        System.arraycopy(r1, r3, r8, 0, r4);
        System.arraycopy(r1, 0, r8, r4, r2 - r4);
        goto L10
    }
}
