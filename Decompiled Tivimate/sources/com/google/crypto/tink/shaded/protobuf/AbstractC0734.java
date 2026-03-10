package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ᴵʼ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0734 {

    /* JADX INFO: renamed from: ʽ */
    public static final AbstractC0722 f3037 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final boolean f3038 = false;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final boolean f3039 = false;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final boolean f3040 = false;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Class f3041 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Unsafe f3042 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final long f3043 = 0;

    static {
        Unsafe r0 = m2668();
        f3042 = r0;
        f3041 = AbstractC0700.f2988;
        boolean r1 = m2680(Long.TYPE);
        boolean r2 = m2680(Integer.TYPE);
        AbstractC0722 r3 = null;
        if (r0 != null) goto L6;
    L12:
        f3037 = r3;
        boolean r02 = false;
        if (r3 != null) goto L15;
        boolean r12 = false;
    L16:
        f3038 = r12;
        if (r3 != null) goto L19;
        boolean r13 = false;
    L20:
        f3039 = r13;
        f3043 = m2667(byte[].class);
        m2667(boolean[].class);
        m2669(boolean[].class);
        m2667(int[].class);
        m2669(int[].class);
        m2667(long[].class);
        m2669(long[].class);
        m2667(float[].class);
        m2669(float[].class);
        m2667(double[].class);
        m2669(double[].class);
        m2667(Object[].class);
        m2669(Object[].class);
        Field r14 = m2672();
        if (r14 == null) goto L26;
        if (r3 == null) goto L26;
        r3.m2593(r14);
    L26:
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) goto L28;
        r02 = true;
    L28:
        f3040 = r02;
        return;
    L19:
        r13 = r3.mo2606();
        goto L20
    L15:
        r12 = r3.mo2598();
        goto L16
    L6:
        if (AbstractC0700.m2536() == false) goto L11;
        if (r1 == false) goto L9;
        r3 = new C0733(r0, 1);
        goto L12
    L9:
        if (r2 == false) goto L12;
        r3 = new C0733(r0, 0);
        goto L12
    L11:
        r3 = new C0732(r0);
        goto L12
    }

    /* JADX INFO: renamed from: ʼˎ */
    public static byte m2665(long r3, Object r5) {
        AbstractC0722 r2 = f3037;
        return (byte) ((r2.m2600((-4) & r3, r5) >>> ((int) ((r3 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public static void m2666(long r1, Object r3, Object r4) {
        f3037.m2603(r1, r3, r4);
    }

    /* JADX INFO: renamed from: ʽ */
    public static int m2667(Class r1) {
        if (f3039 == true) goto L5;
        return -1;
    L5:
        return f3037.m2605(r1);
    }

    /* JADX INFO: renamed from: ˆʾ */
    public static Unsafe m2668() {
        return (Unsafe) AccessController.doPrivileged(new C0739());
    L4:
        return null;
    }

    /* JADX INFO: renamed from: ˈ */
    public static void m2669(Class r1) {
        if (f3039 == false) goto L6;
        f3037.m2604(r1);
        return;
    }

    /* JADX INFO: renamed from: ˉʿ */
    public static void m2670(Object r4, long r5, byte r7) {
        long r0 = (-4) & r5;
        int r52 = (((int) r5) & 3) << 3;
        int r2 = f3037.m2600(r0, r4) & (~(255 << r52));
        m2675(r0, r4, ((255 & r7) << r52) | r2);
    }

    /* JADX INFO: renamed from: ˉˆ */
    public static void m2671(Object r6, long r7, long r9) {
        f3037.m2591(r6, r7, r9);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static Field m2672() {
        if (AbstractC0700.m2536() == false) goto L21;
        Field r0 = Buffer.class.getDeclaredField("effectiveDirectAddress");     // Catch: Throwable -> L7
    L8:
        if (r0 == null) goto L21;
        return r0;
    L7:
        r0 = null;
    L21:
        Field r02 = Buffer.class.getDeclaredField("address");     // Catch: Throwable -> L13
    L14:
        if (r02 != null) goto L16;
        return null;
    L16:
        if (r02.getType() == Long.TYPE) goto L18;
        return null;
    L18:
        return r02;
    L13:
        r02 = null;
        goto L14
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public static void m2673(byte[] r2, long r3, byte r5) {
        long r0 = f3043 + r3;
        f3037.mo2607(r2, r0, r5);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static byte m2674(long r2, byte[] r4) {
        long r0 = f3043 + r2;
        return f3037.mo2594(r0, r4);
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public static void m2675(long r1, Object r3, int r4) {
        f3037.m2596(r1, r3, r4);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static byte m2676(long r3, Object r5) {
        AbstractC0722 r2 = f3037;
        return (byte) ((r2.m2600((-4) & r3, r5) >>> ((int) (((~r3) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static Object m2677(Class r1) {
        return f3042.allocateInstance(r1);
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m2678(Throwable r4) {
        Logger.getLogger(AbstractC0734.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + r4);
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public static void m2679(Object r4, long r5, byte r7) {
        long r0 = (-4) & r5;
        int r2 = f3037.m2600(r0, r4);
        int r52 = ((~((int) r5)) & 3) << 3;
        int r22 = r2 & (~(255 << r52));
        m2675(r0, r4, ((255 & r7) << r52) | r22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ﾞᴵ */
    public static boolean m2680(Class r10) {
        if (AbstractC0700.m2536() == true) goto L8;
        return false;
    L8:
        Class r1 = f3041;     // Catch: Throwable -> L7
        Class r4 = Boolean.TYPE;     // Catch: Throwable -> L7
        r1.getMethod("peekLong", new Class[]{r10, r4});     // Catch: Throwable -> L7
        r1.getMethod("pokeLong", new Class[]{r10, Long.TYPE, r4});     // Catch: Throwable -> L7
        Class r8 = Integer.TYPE;     // Catch: Throwable -> L7
        r1.getMethod("pokeInt", new Class[]{r10, r8, r4});     // Catch: Throwable -> L7
        r1.getMethod("peekInt", new Class[]{r10, r4});     // Catch: Throwable -> L7
        r1.getMethod("pokeByte", new Class[]{r10, Byte.TYPE});     // Catch: Throwable -> L7
        r1.getMethod("peekByte", new Class[]{r10});     // Catch: Throwable -> L7
        r1.getMethod("pokeByteArray", new Class[]{r10, byte[].class, r8, r8});     // Catch: Throwable -> L7
        r1.getMethod("peekByteArray", new Class[]{r10, byte[].class, r8, r8});     // Catch: Throwable -> L7
        return true;
    L7:
        return false;
    }
}
