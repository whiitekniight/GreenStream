package p025;

import java.io.Serializable;
import p164.AbstractC2927;

/* JADX INFO: renamed from: ʻᵢ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C1392 implements Serializable {

    /* JADX INFO: renamed from: ʽʽ */
    public final Object f4775;

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f4776;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Object f4777;

    public C1392(Object r1, Object r2, Object r3) {
        this.f4776 = r1;
        this.f4777 = r2;
        this.f4775 = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1392) == true) goto L8;
        return false;
    L8:
        C1392 r52 = (C1392) r5;
        if (AbstractC2927.m6273(this.f4776, r52.f4776) == true) goto L12;
        return false;
    L12:
        if (AbstractC2927.m6273(this.f4777, r52.f4777) == true) goto L15;
        return false;
    L15:
        if (AbstractC2927.m6273(this.f4775, r52.f4775) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.f4776;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = r12 * 31;
        Object r2 = this.f4777;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r14 = (r13 + r22) * 31;
        Object r23 = this.f4775;
        if (r23 == null) goto L15;
        r0 = r23.hashCode();
    L15:
        return r14 + r0;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "(" + this.f4776 + ", " + this.f4777 + ", " + this.f4775 + ')';
    }
}
