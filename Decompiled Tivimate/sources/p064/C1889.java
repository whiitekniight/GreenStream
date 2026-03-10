package p064;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ʽᴵ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1889 extends AbstractSet {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f6450;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ C1901 f6451;

    public /* synthetic */ C1889(C1901 r1, int r2) {
        this.f6450 = r2;
        this.f6451 = r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch(this.f6450) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f6451.clear();
        return;
    L6:
        this.f6451.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r5) {
        switch(this.f6450) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f6451.containsKey(r5);
    L7:
        if ((r5 instanceof Map.Entry) == false) goto L26;
        C1901 r0 = this.f6451;
        Map.Entry r52 = (Map.Entry) r5;
        Object r2 = r52.getKey();
        C1883 r3 = null;
        if (r2 != null) goto L24;
    L12:
        C1883 r02 = null;
    L13:
        if (r02 == null) goto L20;
        Object r22 = r02.f6425;
        Object r53 = r52.getValue();
        if (r22 == r53) goto L19;
        if (r22 == null) goto L20;
        if (r22.equals(r53) == false) goto L20;
    L19:
        r3 = r02;
    L20:
        if (r3 == null) goto L27;
        return true;
    L27:
        return false;
    L24:
        r02 = r0.m4883(r2, false);     // Catch: ClassCastException -> L23
    L26:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch(this.f6450) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C1898(this.f6451, 1);
    L7:
        return new C1898(this.f6451, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r6) {
        switch(this.f6450) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        C1901 r1 = this.f6451;
        C1883 r2 = null;
        if (r6 == null) goto L8;
        r2 = r1.m4883(r6, false);     // Catch: ClassCastException -> L32
    L8:
        if (r2 == null) goto L10;
        r1.m4879(r2, true);
    L10:
        if (r2 != null) goto L12;
        return false;
    L12:
        return true;
    L14:
        if ((r6 instanceof Map.Entry) == false) goto L39;
        Map.Entry r62 = (Map.Entry) r6;
        Object r0 = r62.getKey();
        C1901 r22 = this.f6451;
        C1883 r3 = null;
        if (r0 != null) goto L34;
    L20:
        C1883 r02 = null;
    L21:
        if (r02 == null) goto L28;
        Object r4 = r02.f6425;
        Object r63 = r62.getValue();
        if (r4 == r63) goto L27;
        if (r4 == null) goto L28;
        if (r4.equals(r63) == false) goto L28;
    L27:
        r3 = r02;
    L28:
        if (r3 == null) goto L40;
        r22.m4879(r3, true);
        return true;
    L40:
        return false;
    L34:
        r02 = r22.m4883(r0, false);     // Catch: ClassCastException -> L33
    L39:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch(this.f6450) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f6451.f6495;
    L7:
        return this.f6451.f6495;
    }
}
