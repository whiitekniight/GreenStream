package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: androidx.lifecycle.ˏᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C0180 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final LinkedHashMap f1069;

    public C0180() {
        this.f1069 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m706() {
        LinkedHashMap r0 = this.f1069;
        Iterator r1 = r0.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((AbstractC0195) r1.next()).m728();
        goto L4
    L6:
        r0.clear();
    }
}
