package p005j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import p005j$.util.concurrent.C0917k;
import p005j$.util.concurrent.C0922p;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.sun.misc.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0755a {

    /* JADX INFO: renamed from: b */
    public static final C0755a f3119b = null;

    /* JADX INFO: renamed from: a */
    public final Unsafe f3120a;

    static {
        Field r0 = m2849g();
        r0.setAccessible(true);
        f3119b = new C0755a((Unsafe) r0.get(null));     // Catch: IllegalAccessException -> L5
        return;
    L5:
        e = move-exception;
        throw new AssertionError("Couldn't get the Unsafe", e);
    }

    public C0755a(Unsafe r1) {
        this.f3120a = r1;
    }

    /* JADX INFO: renamed from: g */
    public static Field m2849g() {
        return Unsafe.class.getDeclaredField("theUnsafe");
    L4:
        e = move-exception;
        Field[] r1 = Unsafe.class.getDeclaredFields();
        int r2 = r1.length;
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L14;
        Field r4 = r1[r3];
        if (Modifier.isStatic(r4.getModifiers()) == false) goto L12;
        if (Unsafe.class.isAssignableFrom(r4.getType()) == false) goto L12;
        return r4;
    L12:
        r3 = r3 + 1;
        goto L6
    L14:
        throw new AssertionError("Couldn't find the Unsafe", e);
    }

    /* JADX INFO: renamed from: a */
    public final int m2850a(Class r2) {
        return this.f3120a.arrayBaseOffset(r2);
    }

    /* JADX INFO: renamed from: b */
    public final int m2851b(Class r2) {
        return this.f3120a.arrayIndexScale(r2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2852c(Object r7, long r8, int r10, int r11) {
        return this.f3120a.compareAndSwapInt(r7, r8, r10, r11);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2853d(Object r9, long r10, long r12, long r14) {
        return this.f3120a.compareAndSwapLong(r9, r10, r12, r14);
    }

    /* JADX INFO: renamed from: e */
    public final int m2854e(C0922p r8, long r9) {
    L2:
        int r5 = this.f3120a.getIntVolatile(r8, r9);
        C0922p r2 = r8;
        long r3 = r9;
        if (this.f3120a.compareAndSwapInt(r2, r3, r5, r5 - 4) == true) goto L4;
        r8 = r2;
        r9 = r3;
        goto L2
    L4:
        return r5;
    }

    /* JADX INFO: renamed from: f */
    public final Object m2855f(Object r2, long r3) {
        return this.f3120a.getObjectVolatile(r2, r3);
    }

    /* JADX INFO: renamed from: h */
    public final long m2856h(Class r2, String r3) {
        return m2857i(r2.getDeclaredField(r3));
    L4:
        e = move-exception;
        throw new AssertionError("Cannot find field:", e);
    }

    /* JADX INFO: renamed from: i */
    public final long m2857i(Field r3) {
        return this.f3120a.objectFieldOffset(r3);
    }

    /* JADX INFO: renamed from: j */
    public final void m2858j(Object r2, long r3, C0917k r5) {
        this.f3120a.putObjectVolatile(r2, r3, r5);
    }
}
