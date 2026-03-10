package p327;

import p164.AbstractC2927;

/* JADX INFO: renamed from: ᴵʼ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4379 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f16101;

    public C4379(String r1) {
        this.f16101 = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C4379) == false) goto L6;
        String r22 = ((C4379) r2).f16101;
        return AbstractC2927.m6273(this.f16101, r22);
    L6:
        return false;
    }

    public final int hashCode() {
        return this.f16101.hashCode();
    }

    public final String toString() {
        return this.f16101;
    }
}
