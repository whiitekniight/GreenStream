package p287;

import android.util.SparseArray;

/* JADX INFO: renamed from: ـﹶ.יـ */
/* JADX INFO: loaded from: classes.dex */
public final class C3997 {

    /* JADX INFO: renamed from: ⁱˊ */
    public C3984 f14785;

    /* JADX INFO: renamed from: ﹳٴ */
    public final SparseArray f14786;

    public C3997(int r2) {
        this.f14786 = new SparseArray(r2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m8192(C3984 r5, int r6, int r7) {
        int r0 = r5.m8156(r6);
        SparseArray r1 = this.f14786;
        if (r1 != null) goto L5;
        C3997 r02 = null;
    L7:
        if (r02 != null) goto L9;
        r02 = new C3997(1);
        r1.put(r5.m8156(r6), r02);
    L9:
        if (r7 <= r6) goto L12;
        r02.m8192(r5, r6 + 1, r7);
        return;
    L12:
        r02.f14785 = r5;
        return;
    L5:
        r02 = (C3997) r1.get(r0);
        goto L7
    }
}
