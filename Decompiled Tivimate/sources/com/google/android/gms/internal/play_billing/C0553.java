package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˆﾞ */
/* JADX INFO: loaded from: classes.dex */
public final class C0553 extends ʽٴ.ˈ {

    /* JADX INFO: renamed from: ʽ */
    public static final Unsafe f2341 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final long f2342 = 0;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final long f2343 = 0;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final long f2344 = 0;

    /* JADX INFO: renamed from: ᵔᵢ */
    public static final long f2345 = 0;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final long f2346 = 0;

    static {
        Unsafe r1 = Unsafe.getUnsafe();     // Catch: SecurityException -> L5
    L16:
        f2343 = r1.objectFieldOffset(AbstractC0555.class.getDeclaredField("\u02bd\u02bd"));     // Catch: NoSuchFieldException -> L8
        f2342 = r1.objectFieldOffset(AbstractC0555.class.getDeclaredField("\u1d35\u02ca"));     // Catch: NoSuchFieldException -> L8
        f2346 = r1.objectFieldOffset(AbstractC0555.class.getDeclaredField("\u02be\u02cb"));     // Catch: NoSuchFieldException -> L8
        f2344 = r1.objectFieldOffset(C0625.class.getDeclaredField("\ufe73\u0674"));     // Catch: NoSuchFieldException -> L8
        f2345 = r1.objectFieldOffset(C0625.class.getDeclaredField("\u2071\u02ca"));     // Catch: NoSuchFieldException -> L8
        f2341 = r1;     // Catch: NoSuchFieldException -> L8
        return;
    L8:
        e = move-exception;
        throw new RuntimeException(e);
    L5:
        r1 = (Unsafe) AccessController.doPrivileged(new C0567());     // Catch: PrivilegedActionException -> L11
    L11:
        e = move-exception;
        throw new RuntimeException("Could not initialize intrinsics", e.getCause());
    }

    /* JADX INFO: renamed from: ʽʽ */
    public final C0625 m2181(C0547 r4) {
        C0625 r0 = C0625.f2475;
    L3:
        C0625 r1 = r4.f2352;
        if (r0 == r1) goto L8;
        if (m2183(r4, r1, r0) == false) goto L3;
    L8:
        return r1;
    }

    /* JADX INFO: renamed from: ˈٴ */
    public final void m2182(C0625 r4, C0625 r5) {
        f2341.putObject(r4, f2345, r5);
    }

    /* JADX INFO: renamed from: ˉٴ */
    public final boolean m2183(AbstractC0555 r7, C0625 r8, C0625 r9) {
        return AbstractC0573.m2214(f2341, r7, f2343, r8, r9);
    }

    /* JADX INFO: renamed from: ˊʻ */
    public final boolean m2184(C0547 r7, C0621 r8, C0621 r9) {
        return AbstractC0573.m2214(f2341, r7, f2342, r8, r9);
    }

    /* JADX INFO: renamed from: ٴᵢ */
    public final boolean m2185(AbstractC0555 r7, Object r8, Object r9) {
        return AbstractC0573.m2214(f2341, r7, f2346, r8, r9);
    }

    /* JADX INFO: renamed from: ᴵˊ */
    public final C0621 m2186(C0547 r4) {
        C0621 r0 = C0621.f2466;
    L3:
        C0621 r1 = r4.f2354;
        if (r0 == r1) goto L8;
        if (m2184(r4, r1, r0) == false) goto L3;
    L8:
        return r1;
    }

    /* JADX INFO: renamed from: ᴵᵔ */
    public final void m2187(C0625 r4, Thread r5) {
        f2341.putObject(r4, f2344, r5);
    }
}
