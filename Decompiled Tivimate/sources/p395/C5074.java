package p395;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005j$.util.DesugarCollections;

/* JADX INFO: renamed from: ⁱʼ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C5074 implements InterfaceC5078 {

    /* JADX INFO: renamed from: ʽ */
    public volatile Map f18041;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Map f18042;

    public C5074(Map r1) {
        this.f18042 = DesugarCollections.unmodifiableMap(r1);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C5074) == true) goto L5;
        return false;
    L5:
        return this.f18042.equals(((C5074) r2).f18042);
    }

    public final int hashCode() {
        return this.f18042.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f18042 + '}';
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final HashMap m9850() {
        HashMap r0 = new HashMap();
        Iterator r1 = this.f18042.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L16;
        Map.Entry r2 = (Map.Entry) r1.next();
        List r3 = (List) r2.getValue();
        StringBuilder r4 = new StringBuilder();
        int r5 = r3.size();
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L13;
        String r7 = ((C5066) r3.get(r6)).f18019;
        if (TextUtils.isEmpty(r7) == true) goto L12;
        r4.append(r7);
        if (r6 == (r3.size() - 1)) goto L12;
        r4.append(',');
    L12:
        r6 = r6 + 1;
        goto L6
    L13:
        String r32 = r4.toString();
        if (TextUtils.isEmpty(r32) == true) goto L4;
        r0.put((String) r2.getKey(), r32);
        goto L4
    L16:
        return r0;
    }

    @Override // p395.InterfaceC5078
    /* JADX INFO: renamed from: ﹳٴ */
    public final Map mo9851() {
        if (this.f18041 != null) goto L15;
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L6:
        if (this.f18041 != null) goto L10;
        this.f18041 = DesugarCollections.unmodifiableMap(m9850());     // Catch: Throwable -> L8
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
    L15:
        return this.f18041;
    }
}
