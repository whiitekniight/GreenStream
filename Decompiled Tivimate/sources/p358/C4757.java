package p358;

import com.google.android.gms.internal.play_billing.י;
import java.io.Serializable;

/* JADX INFO: renamed from: ᵎᐧ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4757 implements Serializable {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ int f16792 = 0;

    /* JADX INFO: renamed from: ʾˋ */
    public final int[] f16793;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f16794;

    static {
        new C4757(new int[0]);
    }

    public C4757(int[] r2) {
        int r0 = r2.length;
        this.f16793 = r2;
        this.f16794 = r0;
    }

    public final boolean equals(Object r7) {
        if (r7 != this) goto L5;
        return true;
    L5:
        if ((r7 instanceof C4757) == false) goto L14;
        C4757 r72 = (C4757) r7;
        int r0 = r72.f16794;
        int r2 = this.f16794;
        if (r2 != r0) goto L14;
        int r3 = 0;
    L11:
        if (r3 >= r2) goto L20;
        י.ᵎﹶ(r3, r2);
        int r4 = this.f16793[r3];
        י.ᵎﹶ(r3, r0);
        if (r4 != r72.f16793[r3]) goto L14;
        r3 = r3 + 1;
        goto L11
    L20:
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        int r0 = 1;
        int r1 = 0;
    L4:
        if (r1 >= this.f16794) goto L6;
        r0 = (r0 * 31) + this.f16793[r1];
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    public final String toString() {
        int r0 = this.f16794;
        if (r0 != 0) goto L6;
        return "[]";
    L6:
        StringBuilder r1 = new StringBuilder(r0 * 5);
        r1.append('[');
        int[] r2 = this.f16793;
        r1.append(r2[0]);
        int r3 = 1;
    L7:
        if (r3 >= r0) goto L9;
        r1.append(", ");
        r1.append(r2[r3]);
        r3 = r3 + 1;
        goto L7
    L9:
        r1.append(']');
        return r1.toString();
    }
}
