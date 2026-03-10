package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ˏᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C0033 extends AbstractC0047 {
    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ʽ */
    public final boolean mo245(long r2, Object r4) {
        return this.f447.getBoolean(r4, r2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ˆʾ */
    public final void mo246(Object r2, long r3, boolean r5) {
        this.f447.putBoolean(r2, r3, r5);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ˈ */
    public final double mo247(long r2, Object r4) {
        return this.f447.getDouble(r4, r2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ˉʿ */
    public final void mo248(Object r2, long r3, float r5) {
        this.f447.putFloat(r2, r3, r5);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ˑﹳ */
    public final float mo249(long r2, Object r4) {
        return this.f447.getFloat(r4, r2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ٴﹶ */
    public final void mo250(Object r2, long r3, byte r5) {
        this.f447.putByte(r2, r3, r5);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ᵔﹳ */
    public final boolean mo251() {
        if (super.mo251() == true) goto L10;
        return false;
    L10:
        Class<?> r1 = this.f447.getClass();     // Catch: Throwable -> L7
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
        AbstractC0005.m167(th);
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ﹳᐧ */
    public final boolean mo252() {
        Unsafe r3 = this.f447;
        if (r3 != null) goto L18;
    L15:
        return false;
    L18:
        Class<?> r32 = r3.getClass();     // Catch: Throwable -> L13
        r32.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L13
        Class<?> r5 = Long.TYPE;     // Catch: Throwable -> L13
        r32.getMethod("getLong", new Class[]{Object.class, r5});     // Catch: Throwable -> L13
        if (AbstractC0005.m163() == null) goto L15;
        Class<?> r33 = this.f447.getClass();     // Catch: Throwable -> L10
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
        AbstractC0005.m167(th);
        return false;
    L13:
        th = move-exception;
        AbstractC0005.m167(th);
        goto L15
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0047
    /* JADX INFO: renamed from: ﾞʻ */
    public final void mo253(Object r7, long r8, double r10) {
        this.f447.putDouble(r7, r8, r10);
    }
}
