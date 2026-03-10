package p158;

import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: ˉᵔ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2892 implements Set {

    /* JADX INFO: renamed from: ˊʻ */
    public static final AtomicLong f10250 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final AbstractMap f10251;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f10252;

    /* JADX INFO: renamed from: ˈٴ */
    public C2893 f10253;

    /* JADX INFO: renamed from: ᴵˊ */
    public final ReentrantReadWriteLock f10254;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final /* synthetic */ int f10255;

    static {
        f10250 = new AtomicLong();
    }

    public C2892() {
        this.f10255 = 0;
        this(new HashMap(), (byte) 0);
    }

    public /* synthetic */ C2892(AbstractMap r2) {
        this.f10255 = 1;
        this(r2, (byte) 0);
    }

    public C2892(AbstractMap r3, byte r4) {
        this.f10252 = f10250.getAndIncrement();
        this.f10254 = new ReentrantReadWriteLock();
        this.f10251 = r3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object r5) {
        boolean r0 = false;
        if (r5 != null) goto L5;
        return false;
    L5:
        ReentrantReadWriteLock.WriteLock r1 = this.f10254.writeLock();
        r1.lock();     // Catch: Throwable -> L12
        AbstractMap r2 = this.f10251;     // Catch: Throwable -> L12
        if (r2.containsKey(r5) == true) goto L10;
        C2893 r02 = m6224(r5, this.f10253);     // Catch: Throwable -> L12
        this.f10253 = r02;     // Catch: Throwable -> L12
        r2.put(r5, r02);     // Catch: Throwable -> L12
        r0 = true;
    L10:
        r1.unlock();
        return r0;
    L12:
        th = move-exception;
        r1.unlock();
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection r7) {
        ReentrantReadWriteLock.WriteLock r0 = this.f10254.writeLock();
        r0.lock();     // Catch: Throwable -> L14
        Iterator r72 = r7.iterator();     // Catch: Throwable -> L14
        boolean r2 = false;
    L4:
        if (r72.hasNext() == false) goto L16;
        Object r3 = r72.next();     // Catch: Throwable -> L14
        if (r3 == null) goto L4;
        AbstractMap r4 = this.f10251;     // Catch: Throwable -> L14
        if (r4.containsKey(r3) == true) goto L12;
        C2893 r5 = m6224(r3, this.f10253);     // Catch: Throwable -> L14
        this.f10253 = r5;     // Catch: Throwable -> L14
        r4.put(r3, r5);     // Catch: Throwable -> L14
        boolean r32 = true;
    L13:
        r2 = r2 | r32;
        goto L4
    L12:
        r32 = false;
        goto L13
    L16:
        r0.unlock();
        return r2;
    L14:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        ReentrantReadWriteLock.WriteLock r0 = this.f10254.writeLock();
        r0.lock();     // Catch: Throwable -> L6
        this.f10253 = null;     // Catch: Throwable -> L6
        this.f10251.clear();     // Catch: Throwable -> L6
        r0.unlock();
        return;
    L6:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object r3) {
        ReentrantReadWriteLock.ReadLock r0 = this.f10254.readLock();
        r0.lock();     // Catch: Throwable -> L12
        C2893 r32 = (C2893) this.f10251.get(r3);     // Catch: Throwable -> L12
        r0.unlock();
        if (r32 != null) goto L7;
        return false;
    L7:
        if (r32.m6225() == null) goto L17;
        return true;
    L17:
        return false;
    L12:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection r2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L9;
        return false;
    L9:
        if (getClass() == r7.getClass()) goto L12;
        return false;
    L12:
        if (this.f10252 == ((C2892) r7).f10252) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        long r1 = this.f10252;
        return 31 + ((int) (r1 ^ (r1 >>> 32)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        if (this.f10253 != null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch(this.f10255) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C2894(this, (byte) 0);
    L7:
        return new C2894(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object r6) {
        AbstractMap r0 = this.f10251;
        if (contains(r6) == true) goto L5;
        return false;
    L5:
        ReentrantReadWriteLock.WriteLock r1 = this.f10254.writeLock();
        r1.lock();     // Catch: Throwable -> L24
        C2893 r3 = (C2893) r0.get(r6);     // Catch: Throwable -> L24
        if (r3 != null) goto L10;
        r1.unlock();
        return false;
    L10:
        C2893 r2 = this.f10253;     // Catch: Throwable -> L24
        if (r3 == r2) goto L20;
        C2893 r22 = r3.f10258;     // Catch: Throwable -> L24
        if (r22 == null) goto L17;
        r22.f10259 = r3.f10259;     // Catch: Throwable -> L24
        C2893 r32 = r3.f10259;     // Catch: Throwable -> L24
        if (r32 == null) goto L21;
        r32.f10258 = r22;     // Catch: Throwable -> L24
    L21:
        r0.remove(r6);     // Catch: Throwable -> L24
        r1.unlock();
        return true;
    L17:
        C2893 r23 = r3.f10259;     // Catch: Throwable -> L24
        if (r23 == null) goto L21;
        r23.f10258 = null;     // Catch: Throwable -> L24
        goto L21
    L20:
        this.f10253 = r2.f10259;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        r1.unlock();
        throw th;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection r2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection r2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f10251.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f10251.entrySet().toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] r2) {
        return this.f10251.entrySet().toArray(r2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C2893 m6224(Object r3, C2893 r4) {
        switch(this.f10255) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (r4 == null) goto L7;
        C2893 r0 = new C2893(r4, 1);
        r0.f10257 = new WeakReference(r3);
    L8:
        return r0;
    L7:
        r0 = new C2893(1);
        r0.f10257 = new WeakReference(r3);
        goto L8
    L10:
        if (r4 == null) goto L12;
        C2893 r02 = new C2893(r4, 0);
        r02.f10257 = r3;
    L13:
        return r02;
    L12:
        r02 = new C2893(0);
        r02.f10257 = r3;
        goto L13
    }
}
