package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ˏᵢ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0722 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final Unsafe f3022;

    public AbstractC0722(Unsafe r1) {
        this.f3022 = r1;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final Object m2590(long r2, Object r4) {
        return this.f3022.getObject(r4, r2);
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public final void m2591(Object r7, long r8, long r10) {
        this.f3022.putLong(r7, r8, r10);
    }

    /* JADX INFO: renamed from: ʽ */
    public abstract boolean mo2592(long r1, Object r3);

    /* JADX INFO: renamed from: ˆʾ */
    public final long m2593(Field r3) {
        return this.f3022.objectFieldOffset(r3);
    }

    /* JADX INFO: renamed from: ˈ */
    public abstract byte mo2594(long r1, Object r3);

    /* JADX INFO: renamed from: ˉʿ */
    public abstract void mo2595(Object r1, long r2, double r4);

    /* JADX INFO: renamed from: ˉˆ */
    public final void m2596(long r2, Object r4, int r5) {
        this.f3022.putInt(r4, r2, r5);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public abstract double mo2597(long r1, Object r3);

    /* JADX INFO: renamed from: יـ */
    public abstract boolean mo2598();

    /* JADX INFO: renamed from: ٴﹶ */
    public abstract void mo2599(Object r1, long r2, boolean r4);

    /* JADX INFO: renamed from: ᵎﹶ */
    public final int m2600(long r2, Object r4) {
        return this.f3022.getInt(r4, r2);
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public abstract void mo2601(Object r1, long r2, float r4);

    /* JADX INFO: renamed from: ᵔᵢ */
    public final long m2602(long r2, Object r4) {
        return this.f3022.getLong(r4, r2);
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public final void m2603(long r2, Object r4, Object r5) {
        this.f3022.putObject(r4, r2, r5);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m2604(Class r2) {
        return this.f3022.arrayIndexScale(r2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m2605(Class r2) {
        return this.f3022.arrayBaseOffset(r2);
    }

    /* JADX INFO: renamed from: ﹳᐧ */
    public boolean mo2606() {
        Unsafe r2 = this.f3022;
        if (r2 != null) goto L10;
        return false;
    L10:
        Class<?> r22 = r2.getClass();     // Catch: Throwable -> L7
        r22.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L7
        r22.getMethod("arrayBaseOffset", new Class[]{Class.class});     // Catch: Throwable -> L7
        r22.getMethod("arrayIndexScale", new Class[]{Class.class});     // Catch: Throwable -> L7
        Class<?> r4 = Long.TYPE;     // Catch: Throwable -> L7
        r22.getMethod("getInt", new Class[]{Object.class, r4});     // Catch: Throwable -> L7
        r22.getMethod("putInt", new Class[]{Object.class, r4, Integer.TYPE});     // Catch: Throwable -> L7
        r22.getMethod("getLong", new Class[]{Object.class, r4});     // Catch: Throwable -> L7
        r22.getMethod("putLong", new Class[]{Object.class, r4, r4});     // Catch: Throwable -> L7
        r22.getMethod("getObject", new Class[]{Object.class, r4});     // Catch: Throwable -> L7
        r22.getMethod("putObject", new Class[]{Object.class, r4, Object.class});     // Catch: Throwable -> L7
        return true;
    L7:
        th = move-exception;
        AbstractC0734.m2678(th);
        return false;
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public abstract void mo2607(Object r1, long r2, byte r4);

    /* JADX INFO: renamed from: ﾞᴵ */
    public abstract float mo2608(long r1, Object r3);
}
