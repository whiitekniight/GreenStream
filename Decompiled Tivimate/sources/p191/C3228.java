package p191;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: ˋˋ.ﹳﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C3228 {

    /* JADX INFO: renamed from: ʽ */
    public final Set f11413;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f11414;

    /* JADX INFO: renamed from: ﹳٴ */
    public final SparseArray f11415;

    public C3228() {
        this.f11415 = new SparseArray();
        this.f11414 = 0;
        this.f11413 = Collections.newSetFromMap(new IdentityHashMap());
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m6859(int r2, int r3) {
        C3229 r22 = m6860(r2);
        r22.f11418 = r3;
        ArrayList r23 = r22.f11419;
    L4:
        if (r23.size() <= r3) goto L6;
        r23.remove(r23.size() - 1);
        goto L4
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3229 m6860(int r3) {
        SparseArray r0 = this.f11415;
        C3229 r1 = (C3229) r0.get(r3);
        if (r1 != null) goto L6;
        C3229 r12 = new C3229();
        r0.put(r3, r12);
        return r12;
    L6:
        return r1;
    }
}
