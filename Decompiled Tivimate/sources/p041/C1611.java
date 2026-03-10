package p041;

import java.util.Iterator;
import p398.InterfaceC5098;
import p442.AbstractC5589;
import p442.C5588;

/* JADX INFO: renamed from: ʼᴵ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C1611 implements Iterator, InterfaceC5098 {

    /* JADX INFO: renamed from: ʽʽ */
    public int f5337;

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f5338;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Iterator f5339;

    public C1611(Iterator r2) {
        this.f5338 = 1;
        this.f5339 = r2;
    }

    public C1611(C1604 r2) {
        this.f5338 = 0;
        this.f5339 = r2.f5321.iterator();
        this.f5337 = r2.f5320;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.f5338) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        int r0 = this.f5337;
        Iterator r1 = this.f5339;
        if (r0 <= 0) goto L12;
        if (r1.hasNext() == false) goto L12;
        r1.next();
        this.f5337--;
    L12:
        return r1.hasNext();
    L5:
        return this.f5339.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.f5338) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        int r1 = this.f5337;
        this.f5337 = r1 + 1;
        if (r1 >= 0) goto L7;
        AbstractC5589.m10764();
        throw null;
    L7:
        return new C5588(r1, this.f5339.next());
    L10:
        int r0 = this.f5337;
        Iterator r12 = this.f5339;
        if (r0 <= 0) goto L16;
        if (r12.hasNext() == false) goto L16;
        r12.next();
        this.f5337--;
    L16:
        return r12.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch(this.f5338) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
