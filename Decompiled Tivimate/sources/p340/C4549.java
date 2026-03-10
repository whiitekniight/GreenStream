package p340;

import android.util.Property;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: renamed from: ᴵᵔ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4549 implements Cloneable {

    /* JADX INFO: renamed from: ˆﾞ */
    public static final Class[] f16412 = null;

    /* JADX INFO: renamed from: ˈʿ */
    public static final HashMap f16413 = null;

    /* JADX INFO: renamed from: ᵎˊ */
    public static final Class[] f16414 = null;

    /* JADX INFO: renamed from: ᵔי */
    public static final Class[] f16415 = null;

    /* JADX INFO: renamed from: ᵔٴ */
    public static final HashMap f16416 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public Method f16417;

    /* JADX INFO: renamed from: ʾˋ */
    public String f16418;

    /* JADX INFO: renamed from: ˈٴ */
    public Method f16419;

    /* JADX INFO: renamed from: ˉٴ */
    public InterfaceC4545 f16420;

    /* JADX INFO: renamed from: ˊʻ */
    public C4553 f16421;

    /* JADX INFO: renamed from: ٴʼ */
    public float f16422;

    /* JADX INFO: renamed from: ٴᵢ */
    public final Object[] f16423;

    /* JADX INFO: renamed from: ᴵˊ */
    public Property f16424;

    /* JADX INFO: renamed from: ᴵᵔ */
    public Class f16425;

    /* JADX INFO: renamed from: ᵎⁱ */
    public C4553 f16426;

    static {
        Class r3 = Float.TYPE;
        Class r7 = Double.TYPE;
        Class r9 = Integer.TYPE;
        f16414 = new Class[]{r3, Float.class, r7, r9, Double.class, Integer.class};
        f16415 = new Class[]{r9, Integer.class, r3, r7, Float.class, Double.class};
        f16412 = new Class[]{r7, Double.class, r3, r9, Float.class, Integer.class};
        f16416 = new HashMap();
        f16413 = new HashMap();
    }

    public C4549(Property r2, float... r3) {
        this.f16417 = null;
        this.f16419 = null;
        this.f16421 = null;
        this.f16423 = new Object[1];
        this.f16424 = r2;
        if (r2 == null) goto L5;
        this.f16418 = r2.getName();
    L5:
        m8989(r3);
    }

    public C4549(String r2, float... r3) {
        this.f16417 = null;
        this.f16419 = null;
        this.f16421 = null;
        this.f16423 = new Object[1];
        this.f16418 = r2;
        m8989(r3);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static String m8987(String r2, String r3) {
        if (r3 != null) goto L4;
        return r2;
    L4:
        if (r3.length() != 0) goto L7;
        return r2;
    L7:
        return r2 + Character.toUpperCase(r3.charAt(0)) + r3.substring(1);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m8990();
    }

    public final String toString() {
        return this.f16418 + ": " + this.f16421.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ˈ */
    public final Method m8988(Class r10, String r11, Class r12) {
        String r0 = m8987(r11, this.f16418);
        Method r1 = null;
        if (r12 != null) goto L7;
        r1 = r10.getMethod(r0, null);     // Catch: NoSuchMethodException -> L27
    L24:
        if (r1 != null) goto L26;
        String r02 = "Method " + m8987(r11, this.f16418) + "() with type " + r12 + " not found on target class " + r10;
    L26:
        return r1;
    L7:
        if (r12.equals(Float.class) == false) goto L10;
        Class[] r2 = f16414;
    L16:
        int r5 = r2.length;
        int r6 = 0;
    L17:
        if (r6 >= r5) goto L24;
        Class r7 = r2[r6];
        Class[] r8 = {r7};
        Method r13 = r10.getMethod(r0, r8);     // Catch: NoSuchMethodException -> L21
        this.f16425 = r7;     // Catch: NoSuchMethodException -> L21
        return r13;
    L21:
        r1 = r10.getDeclaredMethod(r0, r8);     // Catch: NoSuchMethodException -> L23
        r1.setAccessible(true);     // Catch: NoSuchMethodException -> L23
        this.f16425 = r7;     // Catch: NoSuchMethodException -> L23
        return r1;
    L23:
        r6 = r6 + 1;
        goto L17
    L10:
        if (r12.equals(Integer.class) == false) goto L13;
        r2 = f16415;
        goto L16
    L13:
        if (r12.equals(Double.class) == false) goto L15;
        r2 = f16412;
        goto L16
    L15:
        r2 = new Class[]{r12};
        goto L16
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m8989(float... r9) {
        this.f16425 = Float.TYPE;
        int r0 = r9.length;
        C4562[] r1 = new C4562[Math.max(r0, 2)];
        boolean r3 = false;
        if (r0 != 1) goto L7;
        r1[0] = new C4562(0.0f);
        float r92 = r9[0];
        r1[1] = new C4562(1.0f, r92);
        if (Float.isNaN(r92) == false) goto L13;
        r3 = true;
    L13:
        if (r3 == true) goto L15;
    L15:
        C4553 r93 = new C4553(r1);
        this.f16421 = r93;
        this.f16426 = r93;
        return;
    L7:
        r1[0] = new C4562(0.0f, r9[0]);
        int r2 = 1;
    L8:
        if (r2 >= r0) goto L13;
        float r6 = r9[r2];
        r1[r2] = new C4562(r2 / (r0 - 1), r6);
        if (Float.isNaN(r6) == false) goto L12;
        r3 = true;
    L12:
        r2 = r2 + 1;
        goto L8
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4549 m8990() {
        C4549 r0 = (C4549) super.clone();     // Catch: CloneNotSupportedException -> L4
        r0.f16418 = this.f16418;     // Catch: CloneNotSupportedException -> L4
        r0.f16424 = this.f16424;     // Catch: CloneNotSupportedException -> L4
        r0.f16421 = this.f16421.m9027();     // Catch: CloneNotSupportedException -> L4
        r0.f16420 = this.f16420;     // Catch: CloneNotSupportedException -> L4
    L5:
        r0.f16426 = r0.f16421;
        return r0;
    L4:
        r0 = null;
        goto L5
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final Method m8991(Class r4, HashMap r5, String r6, Class r7) {
        monitor-enter(r5);
        HashMap r0 = (HashMap) r5.get(r4);     // Catch: Throwable -> L8
        Method r1 = null;
        if (r0 == null) goto L10;
        boolean r2 = r0.containsKey(this.f16418);     // Catch: Throwable -> L8
        if (r2 == false) goto L11;
        r1 = (Method) r0.get(this.f16418);     // Catch: Throwable -> L8
    L11:
        if (r2 == true) goto L16;
        r1 = m8988(r4, r6, r7);     // Catch: Throwable -> L8
        if (r0 != null) goto L15;
        r0 = new HashMap();     // Catch: Throwable -> L8
        r5.put(r4, r0);     // Catch: Throwable -> L8
    L15:
        r0.put(this.f16418, r1);     // Catch: Throwable -> L8
    L16:
        monitor-exit(r5);     // Catch: Throwable -> L8
        return r1;
    L10:
        r2 = false;
    L8:
        th = move-exception;
        throw th;
    }
}
