package p005j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import p005j$.com.android.tools.p006r8.AbstractC0754a;

/* JADX INFO: renamed from: j$.util.q0 */
/* JADX INFO: loaded from: classes2.dex */
public class C0965q0 implements Spliterator {

    /* JADX INFO: renamed from: a */
    public final Collection f3627a;

    /* JADX INFO: renamed from: b */
    public Iterator f3628b;

    /* JADX INFO: renamed from: c */
    public final int f3629c;

    /* JADX INFO: renamed from: d */
    public long f3630d;

    /* JADX INFO: renamed from: e */
    public int f3631e;

    public C0965q0(Collection r1, int r2) {
        this.f3627a = r1;
        this.f3628b = null;
        if ((r2 & 4096) != 0) goto L5;
        r2 = r2 | 16448;
    L5:
        this.f3629c = r2;
    }

    @Override // p005j$.util.Spliterator
    public final int characteristics() {
        return this.f3629c;
    }

    @Override // p005j$.util.Spliterator
    public final long estimateSize() {
        if (this.f3628b != null) goto L7;
        this.f3628b = this.f3627a.iterator();
        long r0 = this.f3627a.size();
        this.f3630d = r0;
        return r0;
    L7:
        return this.f3630d;
    }

    @Override // p005j$.util.Spliterator
    public final void forEachRemaining(Consumer r4) {
        r4.getClass();
        Iterator r0 = this.f3628b;
        if (r0 != null) goto L5;
        r0 = this.f3627a.iterator();
        this.f3628b = r0;
        this.f3630d = this.f3627a.size();
    L5:
        AbstractC0754a.m2802L(r0, r4);
    }

    @Override // p005j$.util.Spliterator
    public Comparator getComparator() {
        if (AbstractC0754a.m2836n(this, 4) == false) goto L7;
        return null;
    L7:
        throw new IllegalStateException();
    }

    @Override // p005j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0754a.m2834l(this);
    }

    @Override // p005j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int r1) {
        return AbstractC0754a.m2836n(this, r1);
    }

    @Override // p005j$.util.Spliterator
    public final boolean tryAdvance(Consumer r3) {
        r3.getClass();
        if (this.f3628b != null) goto L6;
        this.f3628b = this.f3627a.iterator();
        this.f3630d = this.f3627a.size();
    L6:
        if (this.f3628b.hasNext() == false) goto L9;
        r3.accept(this.f3628b.next());
        return true;
    L9:
        return false;
    }

    @Override // p005j$.util.Spliterator
    public final Spliterator trySplit() {
        Iterator r0 = this.f3628b;
        if (r0 != null) goto L5;
        r0 = this.f3627a.iterator();
        this.f3628b = r0;
        long r1 = this.f3627a.size();
        this.f3630d = r1;
    L7:
        if (r1 > 1) goto L9;
        return null;
    L9:
        if (r0.hasNext() == false) goto L31;
        int r3 = this.f3631e + 1024;
        if (r3 <= r1) goto L14;
        r3 = (int) r1;
    L14:
        if (r3 <= 33554432) goto L16;
        r3 = 33554432;
    L16:
        Object[] r12 = new Object[r3];
        int r4 = 0;
    L17:
        r12[r4] = r0.next();
        r4 = r4 + 1;
        if (r4 >= r3) goto L21;
        if (r0.hasNext() == true) goto L17;
    L21:
        this.f3631e = r4;
        long r5 = this.f3630d;
        if (r5 == Long.MAX_VALUE) goto L25;
        this.f3630d = r5 - ((long) r4);
    L25:
        return new C0951j0(r12, 0, r4, this.f3629c);
    L31:
        return null;
    L5:
        r1 = this.f3630d;
        goto L7
    }
}
