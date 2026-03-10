package p403;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p164.AbstractC2927;
import p442.AbstractC5598;

/* JADX INFO: renamed from: ⁱˏ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C5120 extends AbstractC5598 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f18259;

    /* JADX INFO: renamed from: ᴵˊ */
    public final C5124 f18260;

    public /* synthetic */ C5120(C5124 r1, int r2) {
        this.f18259 = r2;
        this.f18260 = r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object r2) {
        switch(this.f18259) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Map.Entry r22 = (Map.Entry) r2;
        throw new UnsupportedOperationException();
    L5:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection r1) {
        switch(this.f18259) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException();
    L7:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch(this.f18259) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f18260.clear();
        return;
    L6:
        this.f18260.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r4) {
        switch(this.f18259) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f18260.containsKey(r4);
    L7:
        if ((r4 instanceof Map.Entry) == false) goto L14;
        Map.Entry r42 = (Map.Entry) r4;
        C5124 r0 = this.f18260;
        r0.getClass();
        int r2 = r0.m9929(r42.getKey());
        if (r2 >= 0) goto L13;
        return false;
    L13:
        return AbstractC2927.m6273(r0.f18281[r2], r42.getValue());
    L14:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection r6) {
        switch(this.f18259) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C5124 r0 = this.f18260;
        r0.getClass();
        Iterator r62 = r6.iterator();
    L8:
        if (r62.hasNext() == false) goto L17;
        Object r1 = r62.next();
        if (r1 == null) goto L29;
        Map.Entry r12 = (Map.Entry) r1;     // Catch: ClassCastException -> L19
        int r3 = r0.m9929(r12.getKey());     // Catch: ClassCastException -> L19
        if (r3 >= 0) goto L14;
        boolean r13 = false;
    L15:
        if (r13 == true) goto L8;
        return false;
    L14:
        r13 = AbstractC2927.m6273(r0.f18281[r3], r12.getValue());     // Catch: ClassCastException -> L19
    L28:
        return false;
    L29:
        return false;
    L17:
        return true;
    L5:
        return super.containsAll(r6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch(this.f18259) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f18260.isEmpty();
    L7:
        return this.f18260.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch(this.f18259) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C5124 r0 = this.f18260;
        r0.getClass();
        return new C5118(r0, 1);
    L6:
        C5124 r02 = this.f18260;
        r02.getClass();
        return new C5118(r02, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r5) {
        switch(this.f18259) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        C5124 r0 = this.f18260;
        r0.m9922();
        int r52 = r0.m9929(r5);
        if (r52 >= 0) goto L7;
        return false;
    L7:
        r0.m9921(r52);
        return true;
    L10:
        if ((r5 instanceof Map.Entry) == false) goto L21;
        Map.Entry r53 = (Map.Entry) r5;
        C5124 r02 = this.f18260;
        r02.m9922();
        int r2 = r02.m9929(r53.getKey());
        if (r2 >= 0) goto L16;
        return false;
    L16:
        if (AbstractC2927.m6273(r02.f18281[r2], r53.getValue()) == false) goto L23;
        r02.m9921(r2);
        return true;
    L23:
        return false;
    L21:
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection r2) {
        switch(this.f18259) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f18260.m9922();
        return super.removeAll(r2);
    L6:
        this.f18260.m9922();
        return super.removeAll(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection r2) {
        switch(this.f18259) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f18260.m9922();
        return super.retainAll(r2);
    L6:
        this.f18260.m9922();
        return super.retainAll(r2);
    }

    @Override // p442.AbstractC5598
    /* JADX INFO: renamed from: ﹳٴ */
    public final int mo9899() {
        switch(this.f18259) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f18260.f18284;
    L7:
        return this.f18260.f18284;
    }
}
