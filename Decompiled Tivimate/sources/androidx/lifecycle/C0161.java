package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C0161 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final Method f1036;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f1037;

    public C0161(int r1, Method r2) {
        this.f1037 = r1;
        this.f1036 = r2;
        r2.setAccessible(true);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0161) == true) goto L8;
        return false;
    L8:
        C0161 r52 = (C0161) r5;
        if (this.f1037 == r52.f1037) goto L11;
    L13:
        return false;
    L11:
        if (this.f1036.getName().equals(r52.f1036.getName()) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        int r0 = this.f1037 * 31;
        return this.f1036.getName().hashCode() + r0;
    }
}
