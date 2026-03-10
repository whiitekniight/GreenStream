package p025;

import java.io.Serializable;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ʻᵢ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1396 implements Serializable {

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f4778;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Object f4779;

    public C1396(Object r1, Object r2) {
        this.f4778 = r1;
        this.f4779 = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1396) == true) goto L8;
        return false;
    L8:
        C1396 r52 = (C1396) r5;
        if (AbstractC2927.m6273(this.f4778, r52.f4778) == true) goto L12;
        return false;
    L12:
        if (AbstractC2927.m6273(this.f4779, r52.f4779) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.f4778;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = r12 * 31;
        Object r2 = this.f4779;
        if (r2 == null) goto L11;
        r0 = r2.hashCode();
    L11:
        return r13 + r0;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "(" + this.f4778 + ", " + this.f4779 + ')';
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object m3897() {
        return this.f4779;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object m3898() {
        return this.f4778;
    }
}
