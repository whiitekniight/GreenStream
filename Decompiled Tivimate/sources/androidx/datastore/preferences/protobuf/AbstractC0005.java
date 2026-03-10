package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ʻᵎ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0005 {

    /* JADX INFO: renamed from: ʽ */
    public static final AbstractC0047 f354 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final boolean f355 = false;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final boolean f356 = false;

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final boolean f357 = false;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Class f358 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Unsafe f359 = null;

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final long f360 = 0;

    static {
        Unsafe r0 = m155();
        f359 = r0;
        f358 = AbstractC0010.f383;
        boolean r1 = m165(Long.TYPE);
        boolean r2 = m165(Integer.TYPE);
        AbstractC0047 r3 = null;
        if (r0 != null) goto L6;
    L12:
        f354 = r3;
        boolean r02 = false;
        if (r3 != null) goto L15;
        boolean r12 = false;
    L16:
        f355 = r12;
        if (r3 != null) goto L19;
        boolean r13 = false;
    L20:
        f356 = r13;
        f360 = m161(byte[].class);
        m161(boolean[].class);
        m169(boolean[].class);
        m161(int[].class);
        m169(int[].class);
        m161(long[].class);
        m169(long[].class);
        m161(float[].class);
        m169(float[].class);
        m161(double[].class);
        m169(double[].class);
        m161(Object[].class);
        m169(Object[].class);
        Field r14 = m163();
        if (r14 == null) goto L26;
        if (r3 == null) goto L26;
        r3.m312(r14);
    L26:
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) goto L28;
        r02 = true;
    L28:
        f357 = r02;
        return;
    L19:
        r13 = r3.mo251();
        goto L20
    L15:
        r12 = r3.mo252();
        goto L16
    L6:
        if (AbstractC0010.m215() == false) goto L11;
        if (r1 == false) goto L9;
        r3 = new C0045(r0, 1);
        goto L12
    L9:
        if (r2 == false) goto L12;
        r3 = new C0045(r0, 0);
        goto L12
    L11:
        r3 = new C0033(r0);
        goto L12
    }

    /* JADX INFO: renamed from: ʼˎ */
    public static Unsafe m155() {
        return (Unsafe) AccessController.doPrivileged(new C0046());
    L4:
        return null;
    }

    /* JADX INFO: renamed from: ʽ */
    public static boolean m156(long r3, Object r5) {
        AbstractC0047 r2 = f354;
        if (((byte) ((r2.m320((-4) & r3, r5) >>> ((int) ((r3 & 3) << 3))) & 255)) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public static void m157(byte[] r2, long r3, byte r5) {
        long r0 = f360 + r3;
        f354.mo250(r2, r0, r5);
    }

    /* JADX INFO: renamed from: ˈ */
    public static Object m158(Class r1) {
        return f359.allocateInstance(r1);
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    /* JADX INFO: renamed from: ˉʿ */
    public static void m159(long r1, Object r3, int r4) {
        f354.m316(r1, r3, r4);
    }

    /* JADX INFO: renamed from: ˉˆ */
    public static void m160(long r1, Object r3, Object r4) {
        f354.m313(r1, r3, r4);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static int m161(Class r1) {
        if (f356 == true) goto L5;
        return -1;
    L5:
        return f354.m319(r1);
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public static void m162(Object r4, long r5, byte r7) {
        long r0 = (-4) & r5;
        int r2 = f354.m320(r0, r4);
        int r52 = ((~((int) r5)) & 3) << 3;
        int r22 = r2 & (~(255 << r52));
        m159(r0, r4, ((255 & r7) << r52) | r22);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static Field m163() {
        if (AbstractC0010.m215() == false) goto L21;
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

    /* JADX INFO: renamed from: ᵔʾ */
    public static void m164(Object r6, long r7, long r9) {
        f354.m314(r6, r7, r9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᵔᵢ */
    public static boolean m165(Class r10) {
        if (AbstractC0010.m215() == true) goto L8;
        return false;
    L8:
        Class r1 = f358;     // Catch: Throwable -> L7
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

    /* JADX INFO: renamed from: ⁱˊ */
    public static boolean m166(long r3, Object r5) {
        AbstractC0047 r2 = f354;
        if (((byte) ((r2.m320((-4) & r3, r5) >>> ((int) (((~r3) & 3) << 3))) & 255)) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m167(Throwable r4) {
        Logger.getLogger(AbstractC0005.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + r4);
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public static void m168(Object r4, long r5, byte r7) {
        long r0 = (-4) & r5;
        int r52 = (((int) r5) & 3) << 3;
        int r2 = f354.m320(r0, r4) & (~(255 << r52));
        m159(r0, r4, ((255 & r7) << r52) | r2);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static void m169(Class r1) {
        if (f356 == false) goto L6;
        f354.m318(r1);
        return;
    }
}
