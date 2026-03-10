package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ﹶʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0504 {

    /* JADX INFO: renamed from: ʽ */
    public static final AbstractC0372 f2281 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final boolean f2282 = false;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final boolean f2283 = false;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final boolean f2284 = false;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Class f2285 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Unsafe f2286 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final long f2287 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Unsafe r0 = m2057();
        f2286 = r0;
        int r2 = AbstractC0242.f1739;
        f2285 = Memory.class;
        Class<?> r22 = Long.TYPE;
        boolean r3 = m2048(r22);
        Class<?> r4 = Integer.TYPE;
        boolean r5 = m2048(r4);
        AbstractC0372 r6 = null;
        if (r0 == null) goto L9;
        if (r3 == false) goto L7;
        r6 = new C0474(r0);
        goto L9
    L7:
        if (r5 == false) goto L9;
        r6 = new C0431(r0);
    L9:
        f2281 = r6;
        boolean r13 = 1;
        boolean r14 = false;
        if (r6 != null) goto L40;
    L11:
        char r16 = 0;
    L19:
        f2282 = r14;
        AbstractC0372 r02 = f2281;
        if (r02 != null) goto L38;
    L21:
        boolean r03 = r16;
    L27:
        f2283 = r03;
        f2287 = m2044(byte[].class);
        m2044(boolean[].class);
        m2056(boolean[].class);
        m2044(int[].class);
        m2056(int[].class);
        m2044(long[].class);
        m2056(long[].class);
        m2044(float[].class);
        m2056(float[].class);
        m2044(double[].class);
        m2056(double[].class);
        m2044(Object[].class);
        m2056(Object[].class);
        Field r04 = m2055();
        if (r04 == null) goto L33;
        AbstractC0372 r1 = f2281;
        if (r1 == null) goto L33;
        r1.f2046.objectFieldOffset(r04);
    L33:
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) goto L36;
        r13 = r16;
    L36:
        f2284 = r13;
        return;
    L38:
        Class<?> r05 = r02.f2046.getClass();     // Catch: Throwable -> L25
        Class<?>[] r62 = new Class[1];     // Catch: Throwable -> L25
        r62[r16] = Field.class;     // Catch: Throwable -> L25
        r05.getMethod("objectFieldOffset", r62);     // Catch: Throwable -> L25
        Class<?>[] r11 = new Class[1];     // Catch: Throwable -> L25
        r11[r16] = Class.class;     // Catch: Throwable -> L25
        r05.getMethod("arrayBaseOffset", r11);     // Catch: Throwable -> L25
        Class<?>[] r112 = new Class[1];     // Catch: Throwable -> L25
        r112[r16] = Class.class;     // Catch: Throwable -> L25
        r05.getMethod("arrayIndexScale", r112);     // Catch: Throwable -> L25
        Class<?>[] r63 = new Class[2];     // Catch: Throwable -> L25
        r63[r16] = Object.class;     // Catch: Throwable -> L25
        r63[1] = r22;     // Catch: Throwable -> L25
        r05.getMethod("getInt", r63);     // Catch: Throwable -> L25
        Class<?>[] r113 = new Class[3];     // Catch: Throwable -> L25
        r113[r16] = Object.class;     // Catch: Throwable -> L25
        r113[1] = r22;     // Catch: Throwable -> L25
        r113[2] = r4;     // Catch: Throwable -> L25
        r05.getMethod("putInt", r113);     // Catch: Throwable -> L25
        Class<?>[] r12 = new Class[2];     // Catch: Throwable -> L25
        r12[r16] = Object.class;     // Catch: Throwable -> L25
        r12[1] = r22;     // Catch: Throwable -> L25
        r05.getMethod("getLong", r12);     // Catch: Throwable -> L25
        Class<?>[] r42 = new Class[3];     // Catch: Throwable -> L25
        r42[r16] = Object.class;     // Catch: Throwable -> L25
        r42[1] = r22;     // Catch: Throwable -> L25
        r42[2] = r22;     // Catch: Throwable -> L25
        r05.getMethod("putLong", r42);     // Catch: Throwable -> L25
        Class<?>[] r43 = new Class[2];     // Catch: Throwable -> L25
        r43[r16] = Object.class;     // Catch: Throwable -> L25
        r43[1] = r22;     // Catch: Throwable -> L25
        r05.getMethod("getObject", r43);     // Catch: Throwable -> L25
        Class<?>[] r44 = new Class[3];     // Catch: Throwable -> L25
        r44[r16] = Object.class;     // Catch: Throwable -> L25
        r44[1] = r22;     // Catch: Throwable -> L25
        r44[2] = Object.class;     // Catch: Throwable -> L25
        r05.getMethod("putObject", r44);     // Catch: Throwable -> L25
        r03 = 1;
    L25:
        th = move-exception;
        Logger.getLogger(AbstractC0504.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
        goto L21
    L40:
        Class<?> r06 = r6.f2046.getClass();     // Catch: Throwable -> L17
        r06.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L17
        r06.getMethod("getLong", new Class[]{Object.class, r22});     // Catch: Throwable -> L17
        if (m2055() == null) goto L11;
        r16 = 0;
        r14 = true;
    L17:
        th = move-exception;
        r16 = 0;
        Logger.getLogger(AbstractC0504.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
        r14 = false;
        goto L19
    }

    /* JADX INFO: renamed from: ʼˎ */
    public static void m2043(Object r7, long r8, long r10) {
        f2281.f2046.putLong(r7, r8, r10);
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public static int m2044(Class r1) {
        if (f2283 == true) goto L5;
        return -1;
    L5:
        return f2281.f2046.arrayBaseOffset(r1);
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m2045(Object r5, long r6, byte r8) {
        Unsafe r0 = f2281.f2046;
        long r1 = (-4) & r6;
        int r3 = r0.getInt(r5, r1);
        int r62 = ((~((int) r6)) & 3) << 3;
        int r32 = r3 & (~(255 << r62));
        r0.putInt(r5, r1, ((255 & r8) << r62) | r32);
    }

    /* JADX INFO: renamed from: ˆʾ */
    public static Object m2046(long r1, Object r3) {
        return f2281.f2046.getObject(r3, r1);
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m2047(Object r5, long r6, byte r8) {
        Unsafe r0 = f2281.f2046;
        long r1 = (-4) & r6;
        int r62 = (((int) r6) & 3) << 3;
        int r3 = r0.getInt(r5, r1) & (~(255 << r62));
        r0.putInt(r5, r1, ((255 & r8) << r62) | r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ˉʿ */
    public static boolean m2048(Class r10) {
        int r1 = AbstractC0242.f1739;
        Class r2 = f2285;     // Catch: Throwable -> L5
        Class r4 = Boolean.TYPE;     // Catch: Throwable -> L5
        r2.getMethod("peekLong", new Class[]{r10, r4});     // Catch: Throwable -> L5
        r2.getMethod("pokeLong", new Class[]{r10, Long.TYPE, r4});     // Catch: Throwable -> L5
        Class r8 = Integer.TYPE;     // Catch: Throwable -> L5
        r2.getMethod("pokeInt", new Class[]{r10, r8, r4});     // Catch: Throwable -> L5
        r2.getMethod("peekInt", new Class[]{r10, r4});     // Catch: Throwable -> L5
        r2.getMethod("pokeByte", new Class[]{r10, Byte.TYPE});     // Catch: Throwable -> L5
        r2.getMethod("peekByte", new Class[]{r10});     // Catch: Throwable -> L5
        r2.getMethod("pokeByteArray", new Class[]{r10, byte[].class, r8, r8});     // Catch: Throwable -> L5
        r2.getMethod("peekByteArray", new Class[]{r10, byte[].class, r8, r8});     // Catch: Throwable -> L5
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: ˉˆ */
    public static /* synthetic */ boolean m2049(long r3, Object r5) {
        if (((byte) ((f2281.f2046.getInt(r5, (-4) & r3) >>> ((int) ((r3 & 3) << 3))) & 255)) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static Object m2050(Class r1) {
        return f2286.allocateInstance(r1);
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public static void m2051(long r1, Object r3, Object r4) {
        f2281.f2046.putObject(r3, r1, r4);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static void m2052(long r1, Object r3, int r4) {
        f2281.f2046.putInt(r3, r1, r4);
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public static /* synthetic */ boolean m2053(long r3, Object r5) {
        if (((byte) ((f2281.f2046.getInt(r5, (-4) & r3) >>> ((int) (((~r3) & 3) << 3))) & 255)) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static long m2054(long r1, Object r3) {
        return f2281.f2046.getLong(r3, r1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static Field m2055() {
        int r0 = AbstractC0242.f1739;
        Field r1 = Buffer.class.getDeclaredField("effectiveDirectAddress");     // Catch: Throwable -> L5
    L6:
        if (r1 == null) goto L17;
        return r1;
    L17:
        Field r02 = Buffer.class.getDeclaredField("address");     // Catch: Throwable -> L10
    L11:
        if (r02 != null) goto L13;
    L15:
        return null;
    L13:
        if (r02.getType() != Long.TYPE) goto L15;
        return r02;
    L10:
        r02 = null;
    L5:
        r1 = null;
        goto L6
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m2056(Class r1) {
        if (f2283 == false) goto L6;
        f2281.f2046.arrayIndexScale(r1);
        return;
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public static Unsafe m2057() {
        return (Unsafe) AccessController.doPrivileged(new C0509());
    L4:
        return null;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static int m2058(long r1, Object r3) {
        return f2281.f2046.getInt(r3, r1);
    }
}
