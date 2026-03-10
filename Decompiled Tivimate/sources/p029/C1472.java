package p029;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: renamed from: ʼʻ.ᴵˑ */
/* JADX INFO: loaded from: classes.dex */
public final class C1472 extends AbstractC1448 implements Serializable {

    /* JADX INFO: renamed from: ˈٴ */
    public final transient Map f4910;

    /* JADX INFO: renamed from: ˊʻ */
    public transient C1446 f4911;

    /* JADX INFO: renamed from: ᴵᵔ */
    public transient int f4912;

    public C1472(Map r2) {
        if (r2.isEmpty() == false) goto L7;
        this.f4910 = r2;
        return;
    L7:
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m3967() {
        Map r0 = this.f4910;
        Iterator r1 = r0.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((Collection) r1.next()).clear();
        goto L4
    L6:
        r0.clear();
        this.f4912 = 0;
    }

    /* JADX INFO: renamed from: ˈ */
    public final Collection m3968() {
        return (List) this.f4911.get();
    }

    @Override // p029.AbstractC1448
    /* JADX INFO: renamed from: ﹳٴ */
    public final Map mo3958() {
        Map r0 = this.f4860;
        if (r0 != null) goto L13;
        Map r02 = this.f4910;
        if ((r02 instanceof NavigableMap) == false) goto L8;
        Map r1 = new C1491(this, (NavigableMap) r02);
    L11:
        this.f4860 = r1;
        return r1;
    L8:
        if ((r02 instanceof SortedMap) == false) goto L10;
        r1 = new C1431(this, (SortedMap) r02);
        goto L11
    L10:
        r1 = new C1442(this, r02);
        goto L11
    L13:
        return r0;
    }
}
