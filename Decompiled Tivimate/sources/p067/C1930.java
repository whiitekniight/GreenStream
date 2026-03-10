package p067;

import android.os.Build;
import android.util.SparseBooleanArray;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ʽⁱ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C1930 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final SparseBooleanArray f6581;

    public C1930(SparseBooleanArray r1) {
        this.f6581 = r1;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof C1930) == true) goto L8;
        return false;
    L8:
        C1930 r72 = (C1930) r7;
        SparseBooleanArray r1 = r72.f6581;
        int r3 = Build.VERSION.SDK_INT;
        SparseBooleanArray r5 = this.f6581;
        if (r3 >= 24) goto L22;
        if (r5.size() == r1.size()) goto L13;
        return false;
    L13:
        int r12 = 0;
    L15:
        if (r12 >= r5.size()) goto L20;
        if (m4950(r12) != r72.m4950(r12)) goto L18;
        r12 = r12 + 1;
        goto L15
    L18:
        return false;
    L20:
        return true;
    L22:
        return r5.equals(r1);
    }

    public final int hashCode() {
        int r0 = Build.VERSION.SDK_INT;
        SparseBooleanArray r2 = this.f6581;
        if (r0 >= 24) goto L10;
        int r02 = r2.size();
        int r1 = 0;
    L6:
        if (r1 >= r2.size()) goto L8;
        r02 = (r02 * 31) + m4950(r1);
        r1 = r1 + 1;
        goto L6
    L8:
        return r02;
    L10:
        return r2.hashCode();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m4950(int r3) {
        SparseBooleanArray r0 = this.f6581;
        AbstractC4214.m8571(r3, r0.size());
        return r0.keyAt(r3);
    }
}
