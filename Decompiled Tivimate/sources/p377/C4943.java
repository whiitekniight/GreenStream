package p377;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ᵔﹳ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public class C4943 implements Iterable {

    /* JADX INFO: renamed from: ʽʽ */
    public final WeakHashMap f17627;

    /* JADX INFO: renamed from: ʾˋ */
    public C4938 f17628;

    /* JADX INFO: renamed from: ˈٴ */
    public int f17629;

    /* JADX INFO: renamed from: ᴵˊ */
    public C4938 f17630;

    public C4943() {
        this.f17627 = new WeakHashMap();
        this.f17629 = 0;
    }

    public final boolean equals(Object r7) {
        if (r7 != this) goto L6;
        return true;
    L6:
        if ((r7 instanceof C4943) == true) goto L8;
        return false;
    L8:
        C4943 r72 = (C4943) r7;
        if (this.f17629 == r72.f17629) goto L11;
        return false;
    L11:
        Iterator r1 = iterator();
        Iterator r73 = r72.iterator();
    L12:
        C4941 r3 = (C4941) r1;
        if (r3.hasNext() == false) goto L24;
        C4941 r4 = (C4941) r73;
        if (r4.hasNext() == false) goto L24;
        Map.Entry r32 = (Map.Entry) r3.next();
        Object r42 = r4.next();
        if (r32 != null) goto L19;
        if (r42 == null) goto L19;
    L22:
        return false;
    L19:
        if (r32 == null) goto L12;
        if (r32.equals(r42) == true) goto L12;
    L24:
        if (r3.hasNext() == false) goto L26;
    L28:
        return false;
    L26:
        if (((C4941) r73).hasNext() == true) goto L28;
        return true;
    }

    public final int hashCode() {
        Iterator r0 = iterator();
        int r1 = 0;
    L3:
        C4941 r2 = (C4941) r0;
        if (r2.hasNext() == false) goto L6;
        r1 = r1 + ((Map.Entry) r2.next()).hashCode();
        goto L3
    L6:
        return r1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C4941 r0 = new C4941(this.f17628, this.f17630, 0);
        this.f17627.put(r0, Boolean.FALSE);
        return r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("[");
        Iterator r1 = iterator();
    L3:
        C4941 r2 = (C4941) r1;
        if (r2.hasNext() == false) goto L8;
        r0.append(((Map.Entry) r2.next()).toString());
        if (r2.hasNext() == false) goto L3;
        r0.append(", ");
        goto L3
    L8:
        r0.append("]");
        return r0.toString();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public Object mo9722(Object r4) {
        C4938 r42 = mo9723(r4);
        if (r42 != null) goto L5;
        return null;
    L5:
        this.f17629--;
        WeakHashMap r1 = this.f17627;
        if (r1.isEmpty() == true) goto L11;
        Iterator r12 = r1.keySet().iterator();
    L9:
        if (r12.hasNext() == false) goto L11;
        ((AbstractC4940) r12.next()).mo9720(r42);
    L11:
        C4938 r13 = r42.f17618;
        if (r13 == null) goto L14;
        r13.f17616 = r42.f17616;
    L15:
        C4938 r2 = r42.f17616;
        if (r2 == null) goto L18;
        r2.f17618 = r13;
    L19:
        r42.f17616 = null;
        r42.f17618 = null;
        return r42.f17619;
    L18:
        this.f17630 = r13;
        goto L19
    L14:
        this.f17628 = r42.f17616;
        goto L15
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public C4938 mo9723(Object r3) {
        C4938 r0 = this.f17628;
    L3:
        if (r0 == null) goto L8;
        if (r0.f17617.equals(r3) == true) goto L8;
        r0 = r0.f17616;
    L8:
        return r0;
    }
}
