package p158;

import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: ˉᵔ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2894 implements Iterator {

    /* JADX INFO: renamed from: ʽʽ */
    public final Object f10260;

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f10261;

    /* JADX INFO: renamed from: ᴵˊ */
    public Object f10262;

    public C2894(Iterator r2, Iterator r3) {
        this.f10261 = 2;
        this.f10262 = r2;
        this.f10260 = r3;
    }

    public C2894(C2892 r2) {
        this.f10261 = 0;
        this.f10260 = r2;
        this.f10262 = r2.f10253;
    }

    public C2894(C2892 r1, byte r2) {
        this.f10261 = 1;
        this.f10260 = r1;
        this.f10262 = r1.f10253;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.f10261) {
            case 0: goto L22;
            case 1: goto L12;
            default: goto L5;
        };
    L12:
        C2893 r0 = (C2893) this.f10262;
        if (r0 != null) goto L16;
        return false;
    L16:
        if (r0.m6225() != null) goto L20;
        m6226();
        if (((C2893) this.f10262) != null) goto L20;
        return false;
    L20:
        return true;
    L5:
        if (((Iterator) this.f10262).hasNext() == false) goto L7;
    L10:
        return true;
    L7:
        if (((Iterator) this.f10260).hasNext() == true) goto L10;
        return false;
    L22:
        if (((C2893) this.f10262) == null) goto L24;
        return true;
    L24:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.f10261) {
            case 0: goto L17;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        Iterator r0 = (Iterator) this.f10262;
        if (r0.hasNext() == false) goto L8;
        return r0.next();
    L8:
        return ((Iterator) this.f10260).next();
    L9:
        C2893 r02 = (C2893) this.f10262;
        if (r02 != null) goto L12;
        return null;
    L12:
        Object r03 = r02.m6225();
        if (r03 != null) goto L15;
        m6226();
        return next();
    L15:
        this.f10262 = ((C2893) this.f10262).f10259;
        return r03;
    L17:
        C2893 r04 = (C2893) this.f10262;
        if (r04 != null) goto L20;
        return null;
    L20:
        Object r05 = r04.m6225();
        this.f10262 = ((C2893) this.f10262).f10259;
        return r05;
    }

    @Override // java.util.Iterator
    public void remove() {
        switch(this.f10261) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        C2893 r0 = (C2893) this.f10262;
        if (r0 == null) goto L14;
        C2893 r1 = r0.f10259;
        ((C2892) this.f10260).remove(r0.m6225());
        this.f10262 = r1;
        return;
    L14:
        return;
    L9:
        C2893 r02 = (C2893) this.f10262;
        if (r02 == null) goto L15;
        C2893 r12 = r02.f10259;
        ((C2892) this.f10260).remove(r02.m6225());
        this.f10262 = r12;
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void m6226() {
        C2892 r0 = (C2892) this.f10260;
        ReentrantReadWriteLock.WriteLock r1 = r0.f10254.writeLock();
        r1.lock();     // Catch: Throwable -> L7
    L4:
        C2893 r2 = (C2893) this.f10262;     // Catch: Throwable -> L7
        C2893 r3 = r2.f10259;     // Catch: Throwable -> L7
        this.f10262 = r3;     // Catch: Throwable -> L7
        C2893 r4 = r0.f10253;     // Catch: Throwable -> L7
        if (r2 != r4) goto L9;
        r0.f10253 = r4.f10259;     // Catch: Throwable -> L7
    L9:
        C2893 r42 = r2.f10258;     // Catch: Throwable -> L7
        if (r42 == null) goto L14;
        r42.f10259 = r3;     // Catch: Throwable -> L7
        C2893 r22 = r2.f10259;     // Catch: Throwable -> L7
        if (r22 == null) goto L16;
        r22.f10258 = r42;     // Catch: Throwable -> L7
    L16:
        if (r3 == null) goto L19;
        if (r3.m6225() == null) goto L4;
    L19:
        r1.unlock();
        return;
    L14:
        if (r3 == null) goto L16;
        r3.f10258 = null;     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        r1.unlock();
        throw th;
    }
}
