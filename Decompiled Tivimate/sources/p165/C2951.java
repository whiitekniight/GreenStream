package p165;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p336.AbstractC4482;

/* JADX INFO: renamed from: ˊʽ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public class C2951 {

    /* JADX INFO: renamed from: ʽʽ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10378 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10379 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10380 = null;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        f10379 = AtomicReferenceFieldUpdater.newUpdater(C2951.class, Object.class, "_next$volatile");
        f10380 = AtomicReferenceFieldUpdater.newUpdater(C2951.class, Object.class, "_prev$volatile");
        f10378 = AtomicReferenceFieldUpdater.newUpdater(C2951.class, Object.class, "_removedRef$volatile");
    }

    public C2951() {
        this._next$volatile = this;
        this._prev$volatile = this;
    }

    public String toString() {
        return new C2946(this, AbstractC4482.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC4482.m8888(this);
    }

    /* JADX INFO: renamed from: ʼˎ */
    public boolean mo6304() {
        return f10379.get(this) instanceof C2954;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean m6305(C2951 r5, int r6) {
    L2:
        C2951 r0 = m6308();
        AtomicReferenceFieldUpdater r1 = f10380;
        if (r0 != null) goto L10;
        Object r02 = r1.get(this);
    L5:
        r0 = (C2951) r02;
        if (r0.mo6304() == false) goto L10;
        r02 = r1.get(r0);
    L10:
        if ((r0 instanceof C2962) == true) goto L12;
        r1.set(r5, r0);
        AtomicReferenceFieldUpdater r12 = f10379;
        r12.set(r5, this);
    L20:
        if (r12.compareAndSet(r0, this, r5) == true) goto L21;
        if (r12.get(r0) == this) goto L20;
    L21:
        r5.m6306(this);
        return true;
    L12:
        if ((((C2962) r0).f10403 & r6) == 0) goto L14;
        return false;
    L14:
        if (r0.m6305(r5, r6) == false) goto L31;
        return true;
    L31:
        return false;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m6306(C2951 r4) {
    L2:
        AtomicReferenceFieldUpdater r0 = f10380;
        C2951 r1 = (C2951) r0.get(r4);
        if (f10379.get(this) != r4) goto L19;
    L6:
        if (r0.compareAndSet(r4, r1, this) == true) goto L8;
        if (r0.get(r4) == r1) goto L6;
    L8:
        if (mo6304() == false) goto L18;
        r4.m6308();
        return;
    L18:
        return;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final C2951 m6307() {
        Object r0 = f10379.get(this);
        if ((r0 instanceof C2954) == false) goto L5;
        C2954 r1 = (C2954) r0;
    L6:
        if (r1 == null) goto L12;
        C2951 r12 = r1.f10389;
        if (r12 == null) goto L12;
        return r12;
    L12:
        return (C2951) r0;
    L5:
        r1 = null;
        goto L6
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final C2951 m6308() {
    L2:
        AtomicReferenceFieldUpdater r0 = f10380;
        C2951 r1 = (C2951) r0.get(this);
        C2951 r3 = r1;
    L3:
        C2951 r4 = null;
    L4:
        AtomicReferenceFieldUpdater r5 = f10379;
        Object r6 = r5.get(r3);
        if (r6 == this) goto L6;
        if (mo6304() == true) goto L16;
        if ((r6 instanceof C2954) == true) goto L19;
        r4 = r3;
        r3 = (C2951) r6;
        goto L4
    L19:
        if (r4 != null) goto L20;
        r3 = (C2951) r0.get(r3);
        goto L4
    L20:
        C2951 r62 = ((C2954) r6).f10389;
    L22:
        if (r5.compareAndSet(r4, r3, r62) == true) goto L23;
        if (r5.get(r4) == r3) goto L22;
    L23:
        r3 = r4;
        goto L3
    L16:
        return null;
    L6:
        if (r1 == r3) goto L7;
    L9:
        if (r0.compareAndSet(this, r1, r3) == true) goto L10;
        if (r0.get(this) == r1) goto L9;
    L10:
        return r3;
    L7:
        return r3;
    }
}
