package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ᐧᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C0732 extends AbstractC0722 {
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ʽ */
    public final boolean mo2592(long r2, Object r4) {
        return this.f3022.getBoolean(r4, r2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ˈ */
    public final byte mo2594(long r2, Object r4) {
        return this.f3022.getByte(r4, r2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ˉʿ */
    public final void mo2595(Object r7, long r8, double r10) {
        this.f3022.putDouble(r7, r8, r10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ˑﹳ */
    public final double mo2597(long r2, Object r4) {
        return this.f3022.getDouble(r4, r2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: יـ */
    public final boolean mo2598() {
        Unsafe r3 = this.f3022;
        if (r3 != null) goto L18;
    L15:
        return false;
    L18:
        Class<?> r32 = r3.getClass();     // Catch: Throwable -> L13
        r32.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L13
        Class<?> r5 = Long.TYPE;     // Catch: Throwable -> L13
        r32.getMethod("getLong", new Class[]{Object.class, r5});     // Catch: Throwable -> L13
        if (AbstractC0734.m2672() == null) goto L15;
        Class<?> r33 = this.f3022.getClass();     // Catch: Throwable -> L10
        r33.getMethod("getByte", new Class[]{r5});     // Catch: Throwable -> L10
        r33.getMethod("putByte", new Class[]{r5, Byte.TYPE});     // Catch: Throwable -> L10
        r33.getMethod("getInt", new Class[]{r5});     // Catch: Throwable -> L10
        r33.getMethod("putInt", new Class[]{r5, Integer.TYPE});     // Catch: Throwable -> L10
        r33.getMethod("getLong", new Class[]{r5});     // Catch: Throwable -> L10
        r33.getMethod("putLong", new Class[]{r5, r5});     // Catch: Throwable -> L10
        r33.getMethod("copyMemory", new Class[]{r5, r5, r5});     // Catch: Throwable -> L10
        r33.getMethod("copyMemory", new Class[]{Object.class, r5, Object.class, r5, r5});     // Catch: Throwable -> L10
        return true;
    L10:
        th = move-exception;
        AbstractC0734.m2678(th);
        return false;
    L13:
        th = move-exception;
        AbstractC0734.m2678(th);
        goto L15
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ٴﹶ */
    public final void mo2599(Object r2, long r3, boolean r5) {
        this.f3022.putBoolean(r2, r3, r5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ᵔʾ */
    public final void mo2601(Object r2, long r3, float r5) {
        this.f3022.putFloat(r2, r3, r5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ﹳᐧ */
    public final boolean mo2606() {
        if (super.mo2606() == true) goto L10;
        return false;
    L10:
        Class<?> r1 = this.f3022.getClass();     // Catch: Throwable -> L7
        Class<?> r4 = Long.TYPE;     // Catch: Throwable -> L7
        r1.getMethod("getByte", new Class[]{Object.class, r4});     // Catch: Throwable -> L7
        r1.getMethod("putByte", new Class[]{Object.class, r4, Byte.TYPE});     // Catch: Throwable -> L7
        r1.getMethod("getBoolean", new Class[]{Object.class, r4});     // Catch: Throwable -> L7
        r1.getMethod("putBoolean", new Class[]{Object.class, r4, Boolean.TYPE});     // Catch: Throwable -> L7
        r1.getMethod("getFloat", new Class[]{Object.class, r4});     // Catch: Throwable -> L7
        r1.getMethod("putFloat", new Class[]{Object.class, r4, Float.TYPE});     // Catch: Throwable -> L7
        r1.getMethod("getDouble", new Class[]{Object.class, r4});     // Catch: Throwable -> L7
        r1.getMethod("putDouble", new Class[]{Object.class, r4, Double.TYPE});     // Catch: Throwable -> L7
        return true;
    L7:
        th = move-exception;
        AbstractC0734.m2678(th);
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ﾞʻ */
    public final void mo2607(Object r2, long r3, byte r5) {
        this.f3022.putByte(r2, r3, r5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0722
    /* JADX INFO: renamed from: ﾞᴵ */
    public final float mo2608(long r2, Object r4) {
        return this.f3022.getFloat(r4, r2);
    }
}
