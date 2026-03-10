package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ᴵʼ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0047 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final Unsafe f447;

    public AbstractC0047(Unsafe r1) {
        this.f447 = r1;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final long m312(Field r3) {
        return this.f447.objectFieldOffset(r3);
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public final void m313(long r2, Object r4, Object r5) {
        this.f447.putObject(r4, r2, r5);
    }

    /* JADX INFO: renamed from: ʽ */
    public abstract boolean mo245(long r1, Object r3);

    /* JADX INFO: renamed from: ˆʾ */
    public abstract void mo246(Object r1, long r2, boolean r4);

    /* JADX INFO: renamed from: ˈ */
    public abstract double mo247(long r1, Object r3);

    /* JADX INFO: renamed from: ˉʿ */
    public abstract void mo248(Object r1, long r2, float r4);

    /* JADX INFO: renamed from: ˉˆ */
    public final void m314(Object r7, long r8, long r10) {
        this.f447.putLong(r7, r8, r10);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public abstract float mo249(long r1, Object r3);

    /* JADX INFO: renamed from: ٴﹶ */
    public abstract void mo250(Object r1, long r2, byte r4);

    /* JADX INFO: renamed from: ᵎﹶ */
    public final long m315(long r2, Object r4) {
        return this.f447.getLong(r4, r2);
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public final void m316(long r2, Object r4, int r5) {
        this.f447.putInt(r4, r2, r5);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final Object m317(long r2, Object r4) {
        return this.f447.getObject(r4, r2);
    }

    /* JADX INFO: renamed from: ᵔﹳ */
    public boolean mo251() {
        Unsafe r2 = this.f447;
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
        AbstractC0005.m167(th);
        return false;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m318(Class r2) {
        return this.f447.arrayIndexScale(r2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m319(Class r2) {
        return this.f447.arrayBaseOffset(r2);
    }

    /* JADX INFO: renamed from: ﹳᐧ */
    public abstract boolean mo252();

    /* JADX INFO: renamed from: ﾞʻ */
    public abstract void mo253(Object r1, long r2, double r4);

    /* JADX INFO: renamed from: ﾞᴵ */
    public final int m320(long r2, Object r4) {
        return this.f447.getInt(r4, r2);
    }
}
