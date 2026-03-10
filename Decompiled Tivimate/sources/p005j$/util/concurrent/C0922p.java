package p005j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import p005j$.sun.misc.C0755a;

/* JADX INFO: renamed from: j$.util.concurrent.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C0922p extends C0917k {

    /* JADX INFO: renamed from: h */
    public static final C0755a f3543h = null;

    /* JADX INFO: renamed from: i */
    public static final long f3544i = 0;

    /* JADX INFO: renamed from: e */
    public C0923q f3545e;

    /* JADX INFO: renamed from: f */
    public volatile C0923q f3546f;

    /* JADX INFO: renamed from: g */
    public volatile Thread f3547g;
    volatile int lockState;

    static {
        C0755a r0 = C0755a.f3119b;
        f3543h = r0;
        f3544i = r0.m2856h(C0922p.class, "lockState");
    }

    public C0922p(C0923q r11) {
        super(-2, null, null);
        this.f3546f = r11;
        C0923q r0 = null;
    L3:
        if (r11 == null) goto L38;
        C0923q r2 = (C0923q) r11.f3530d;
        r11.f3550g = null;
        r11.f3549f = null;
        if (r0 != null) goto L8;
        r11.f3548e = null;
        r11.f3552i = false;
    L7:
        r0 = r11;
        r11 = r2;
        goto L3
    L8:
        Object r4 = r11.f3528b;
        int r5 = r11.f3527a;
        C0923q r6 = r0;
        Class<?> r7 = null;
    L9:
        Object r8 = r6.f3528b;
        int r9 = r6.f3527a;
        if (r9 <= r5) goto L12;
        int r82 = -1;
    L27:
        if (r82 > 0) goto L29;
        C0923q r92 = r6.f3549f;
    L30:
        if (r92 == null) goto L31;
        r6 = r92;
        goto L9
    L31:
        r11.f3548e = r6;
        if (r82 > 0) goto L34;
        r6.f3549f = r11;
    L35:
        r11 = m3213c(r0, r11);
        goto L7
    L34:
        r6.f3550g = r11;
        goto L35
    L29:
        r92 = r6.f3550g;
        goto L30
    L12:
        if (r9 >= r5) goto L14;
        r82 = 1;
        goto L27
    L14:
        if (r7 != null) goto L17;
        r7 = ConcurrentHashMap.m3188c(r4);
        if (r7 != null) goto L17;
    L25:
        r82 = m3216i(r4, r8);
    L17:
        int r93 = ConcurrentHashMap.f3492g;
        if (r8 != null) goto L20;
    L23:
        int r94 = 0;
    L24:
        if (r94 == 0) goto L25;
        r82 = r94;
        goto L27
    L20:
        if (r8.getClass() != r7) goto L23;
        r94 = ((Comparable) r4).compareTo(r8);
        goto L24
    L38:
        this.f3545e = r0;
    }

    /* JADX INFO: renamed from: b */
    public static C0923q m3212b(C0923q r8, C0923q r9) {
    L2:
        if (r9 == null) goto L91;
        if (r9 == r8) goto L91;
        C0923q r0 = r9.f3548e;
        if (r0 == null) goto L7;
        if (r9.f3552i == true) goto L11;
        C0923q r2 = r0.f3549f;
        C0923q r3 = null;
        if (r2 != r9) goto L54;
        C0923q r22 = r0.f3550g;
        if (r22 != null) goto L18;
    L23:
        if (r22 == null) goto L24;
        C0923q r5 = r22.f3549f;
        C0923q r6 = r22.f3550g;
        if (r6 != null) goto L28;
    L29:
        if (r5 == null) goto L53;
        if (r5.f3552i == false) goto L53;
    L33:
        if (r6 != null) goto L35;
    L36:
        if (r5 == null) goto L38;
        r5.f3552i = false;
    L38:
        r22.f3552i = true;
        r8 = m3215h(r8, r22);
        r0 = r9.f3548e;
        if (r0 == null) goto L42;
        r3 = r0.f3550g;
    L42:
        r22 = r3;
    L43:
        if (r22 == null) goto L50;
        if (r0 != null) goto L46;
        boolean r92 = false;
    L47:
        r22.f3552i = r92;
        C0923q r93 = r22.f3550g;
        if (r93 == null) goto L50;
        r93.f3552i = false;
        goto L50
    L46:
        r92 = r0.f3552i;
    L50:
        if (r0 == null) goto L52;
        r0.f3552i = false;
        r8 = m3214g(r8, r0);
    L52:
        r9 = r8;
        goto L2
    L35:
        if (r6.f3552i == true) goto L43;
    L53:
        r22.f3552i = true;
        goto L24
    L28:
        if (r6.f3552i == true) goto L33;
    L24:
        r9 = r0;
        goto L2
    L18:
        if (r22.f3552i == false) goto L23;
        r22.f3552i = false;
        r0.f3552i = true;
        r8 = m3214g(r8, r0);
        r0 = r9.f3548e;
        if (r0 != null) goto L22;
        r22 = null;
        goto L23
    L22:
        r22 = r0.f3550g;
        goto L23
    L54:
        if (r2 != null) goto L56;
    L61:
        if (r2 == null) goto L24;
        C0923q r52 = r2.f3549f;
        C0923q r62 = r2.f3550g;
        if (r52 != null) goto L66;
    L67:
        if (r62 == null) goto L90;
        if (r62.f3552i == false) goto L90;
    L71:
        if (r52 != null) goto L73;
    L74:
        if (r62 == null) goto L76;
        r62.f3552i = false;
    L76:
        r2.f3552i = true;
        r8 = m3214g(r8, r2);
        r0 = r9.f3548e;
        if (r0 == null) goto L80;
        r3 = r0.f3549f;
    L80:
        r2 = r3;
    L81:
        if (r2 == null) goto L88;
        if (r0 != null) goto L84;
        boolean r94 = false;
    L85:
        r2.f3552i = r94;
        C0923q r95 = r2.f3549f;
        if (r95 == null) goto L88;
        r95.f3552i = false;
        goto L88
    L84:
        r94 = r0.f3552i;
    L88:
        if (r0 == null) goto L52;
        r0.f3552i = false;
        r8 = m3215h(r8, r0);
        goto L52
    L73:
        if (r52.f3552i == true) goto L81;
    L90:
        r2.f3552i = true;
        goto L24
    L66:
        if (r52.f3552i == true) goto L71;
    L56:
        if (r2.f3552i == false) goto L61;
        r2.f3552i = false;
        r0.f3552i = true;
        r8 = m3215h(r8, r0);
        r0 = r9.f3548e;
        if (r0 != null) goto L60;
        r2 = null;
        goto L61
    L60:
        r2 = r0.f3549f;
        goto L61
    L11:
        r9.f3552i = false;
        return r8;
    L7:
        r9.f3552i = false;
        return r9;
    L91:
        return r8;
    }

    /* JADX INFO: renamed from: c */
    public static C0923q m3213c(C0923q r8, C0923q r9) {
        r9.f3552i = true;
    L3:
        C0923q r1 = r9.f3548e;
        if (r1 == null) goto L5;
        if (r1.f3552i == false) goto L46;
        C0923q r3 = r1.f3548e;
        if (r3 == null) goto L46;
        C0923q r4 = r3.f3549f;
        if (r1 == r4) goto L14;
        if (r4 == null) goto L36;
        if (r4.f3552i == false) goto L36;
        r4.f3552i = false;
        r1.f3552i = false;
        r3.f3552i = true;
    L34:
        r9 = r3;
    L36:
        if (r9 != r1.f3549f) goto L42;
        r8 = m3215h(r8, r1);
        C0923q r92 = r1.f3548e;
        if (r92 != null) goto L40;
        r3 = null;
    L41:
        r1 = r92;
        r9 = r1;
        goto L42
    L40:
        r3 = r92.f3548e;
    L42:
        if (r1 == null) goto L3;
        r1.f3552i = false;
        if (r3 == null) goto L3;
        r3.f3552i = true;
        r8 = m3214g(r8, r3);
        goto L3
    L14:
        C0923q r42 = r3.f3550g;
        if (r42 == null) goto L20;
        if (r42.f3552i == false) goto L20;
        r42.f3552i = false;
        r1.f3552i = false;
        r3.f3552i = true;
    L20:
        if (r9 != r1.f3550g) goto L26;
        r8 = m3214g(r8, r1);
        C0923q r93 = r1.f3548e;
        if (r93 != null) goto L24;
        r3 = null;
    L25:
        r1 = r93;
        r9 = r1;
        goto L26
    L24:
        r3 = r93.f3548e;
    L26:
        if (r1 == null) goto L3;
        r1.f3552i = false;
        if (r3 == null) goto L3;
        r3.f3552i = true;
        r8 = m3215h(r8, r3);
    L46:
        return r8;
    L5:
        r9.f3552i = false;
        return r9;
    }

    /* JADX INFO: renamed from: g */
    public static C0923q m3214g(C0923q r3, C0923q r4) {
        if (r4 == null) goto L16;
        C0923q r0 = r4.f3550g;
        if (r0 == null) goto L16;
        C0923q r1 = r0.f3549f;
        r4.f3550g = r1;
        if (r1 == null) goto L8;
        r1.f3548e = r4;
    L8:
        C0923q r12 = r4.f3548e;
        r0.f3548e = r12;
        if (r12 != null) goto L12;
        r0.f3552i = false;
        r3 = r0;
    L15:
        r0.f3549f = r4;
        r4.f3548e = r0;
        goto L16
    L12:
        if (r12.f3549f != r4) goto L14;
        r12.f3549f = r0;
        goto L15
    L14:
        r12.f3550g = r0;
    L16:
        return r3;
    }

    /* JADX INFO: renamed from: h */
    public static C0923q m3215h(C0923q r3, C0923q r4) {
        if (r4 == null) goto L16;
        C0923q r0 = r4.f3549f;
        if (r0 == null) goto L16;
        C0923q r1 = r0.f3550g;
        r4.f3549f = r1;
        if (r1 == null) goto L8;
        r1.f3548e = r4;
    L8:
        C0923q r12 = r4.f3548e;
        r0.f3548e = r12;
        if (r12 != null) goto L12;
        r0.f3552i = false;
        r3 = r0;
    L15:
        r0.f3550g = r4;
        r4.f3548e = r0;
        goto L16
    L12:
        if (r12.f3550g != r4) goto L14;
        r12.f3550g = r0;
        goto L15
    L14:
        r12.f3549f = r0;
    L16:
        return r3;
    }

    /* JADX INFO: renamed from: i */
    public static int m3216i(Object r2, Object r3) {
        if (r2 == null) goto L9;
        if (r3 == null) goto L9;
        int r0 = r2.getClass().getName().compareTo(r3.getClass().getName());
        if (r0 == 0) goto L9;
        return r0;
    L9:
        if (System.identityHashCode(r2) > System.identityHashCode(r3)) goto L12;
        return -1;
    L12:
        return 1;
    }

    @Override // p005j$.util.concurrent.C0917k
    /* JADX INFO: renamed from: a */
    public final C0917k mo3210a(int r9, Object r10) {
        C0917k r0 = this.f3546f;
    L3:
        C0923q r1 = null;
        if (r0 == null) goto L37;
        int r6 = this.lockState;
        if ((r6 & 3) != 0) goto L8;
        C0755a r2 = f3543h;
        long r4 = f3544i;
        if (r2.m2852c(this, r4, r6, r6 + 4) == false) goto L3;
        C0923q r02 = this.f3545e;     // Catch: Throwable -> L29
        if (r02 == null) goto L24;
        r1 = r02.m3220b(r9, r10, null);     // Catch: Throwable -> L29
    L24:
        if (r2.m2854e(this, r4) != 6) goto L28;
        Thread r92 = this.f3547g;
        if (r92 == null) goto L28;
        LockSupport.unpark(r92);
    L28:
        return r1;
    L29:
        th = move-exception;
        if (f3543h.m2854e(this, f3544i) != 6) goto L49;
        Thread r102 = this.f3547g;
        if (r102 == null) goto L50;
        LockSupport.unpark(r102);
        throw th;
    L50:
        throw th;
    L49:
        throw th;
    L8:
        if (r0.f3527a != r9) goto L15;
        Object r12 = r0.f3528b;
        if (r12 == r10) goto L14;
        if (r12 == null) goto L15;
        if (r10.equals(r12) == false) goto L15;
    L14:
        return r0;
    L15:
        r0 = r0.f3530d;
        goto L3
    L37:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m3217d() {
        if (f3543h.m2852c(this, f3544i, 0, 1) == true) goto L19;
        boolean r0 = false;
    L5:
        int r5 = this.lockState;
        if ((r5 & (-3)) == 0) goto L8;
        if ((r5 & 2) == 0) goto L15;
        if (r0 == false) goto L5;
        LockSupport.park(this);
        goto L5
    L15:
        if (f3543h.m2852c(this, f3544i, r5, r5 | 2) == false) goto L5;
        this.f3547g = Thread.currentThread();
        r0 = true;
        goto L5
    L8:
        if (f3543h.m2852c(this, f3544i, r5, 1) == false) goto L5;
        if (r0 == false) goto L33;
        this.f3547g = null;
        return;
    L33:
        return;
    }

    /* JADX INFO: renamed from: e */
    public final C0923q m3218e(int r12, Object r13, Object r14) {
        C0923q r6 = this.f3545e;
        Class<?> r0 = null;
        boolean r1 = false;
    L3:
        if (r6 == null) goto L4;
        int r4 = r6.f3527a;
        if (r4 <= r12) goto L10;
        int r42 = -1;
    L9:
        int r10 = r42;
    L44:
        if (r10 > 0) goto L46;
        C0923q r43 = r6.f3549f;
    L47:
        if (r43 == null) goto L48;
        r6 = r43;
        goto L3
    L48:
        C0923q r5 = this.f3546f;
        C0923q r15 = new C0923q(r12, r13, r14, r5, r6);
        this.f3546f = r15;
        if (r5 == null) goto L51;
        r5.f3551h = r15;
    L51:
        if (r10 > 0) goto L53;
        r6.f3549f = r15;
    L55:
        if (r6.f3552i == true) goto L58;
        r15.f3552i = true;
        return null;
    L58:
        m3217d();
        this.f3545e = m3213c(this.f3545e, r15);     // Catch: Throwable -> L62
        this.lockState = 0;
        return null;
    L62:
        th = move-exception;
        this.lockState = 0;
        throw th;
    L53:
        r6.f3550g = r15;
        goto L55
    L46:
        r43 = r6.f3550g;
        goto L47
    L10:
        if (r4 >= r12) goto L12;
        r10 = 1;
        goto L44
    L12:
        Object r44 = r6.f3528b;
        if (r44 == r13) goto L66;
        if (r44 != null) goto L16;
    L18:
        if (r0 != null) goto L21;
        r0 = ConcurrentHashMap.m3188c(r13);
        if (r0 != null) goto L21;
    L29:
        if (r1 == true) goto L42;
        C0923q r16 = r6.f3549f;
        if (r16 == null) goto L36;
        C0923q r17 = r16.m3220b(r12, r13, r0);
        if (r17 == null) goto L36;
        return r17;
    L36:
        C0923q r18 = r6.f3550g;
        if (r18 == null) goto L41;
        C0923q r19 = r18.m3220b(r12, r13, r0);
        if (r19 == null) goto L41;
        return r19;
    L41:
        r1 = true;
    L42:
        r42 = m3216i(r13, r44);
    L21:
        int r52 = ConcurrentHashMap.f3492g;
        if (r44 != null) goto L24;
    L27:
        int r53 = 0;
    L28:
        if (r53 == 0) goto L29;
        r10 = r53;
        goto L44
    L24:
        if (r44.getClass() != r0) goto L27;
        r53 = ((Comparable) r13).compareTo(r44);
        goto L28
    L16:
        if (r13.equals(r44) == false) goto L18;
    L66:
        return r6;
    L4:
        C0923q r110 = new C0923q(r12, r13, r14, null, null);
        this.f3545e = r110;
        this.f3546f = r110;
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3219f(C0923q r11) {
        C0923q r0 = (C0923q) r11.f3530d;
        C0923q r1 = r11.f3551h;
        if (r1 != null) goto L5;
        this.f3546f = r0;
    L6:
        if (r0 == null) goto L9;
        r0.f3551h = r1;
    L9:
        if (this.f3546f != null) goto L12;
        this.f3545e = null;
        return true;
    L12:
        C0923q r02 = this.f3545e;
        if (r02 != null) goto L15;
    L86:
        return true;
    L15:
        if (r02.f3550g == null) goto L86;
        C0923q r3 = r02.f3549f;
        if (r3 == null) goto L86;
        if (r3.f3549f == null) goto L86;
        m3217d();
        C0923q r32 = r11.f3549f;     // Catch: Throwable -> L32
        C0923q r4 = r11.f3550g;     // Catch: Throwable -> L32
        if (r32 == null) goto L53;
        if (r4 == null) goto L53;
        C0923q r5 = r4;
    L26:
        C0923q r6 = r5.f3549f;     // Catch: Throwable -> L32
        if (r6 == null) goto L29;
        r5 = r6;
        goto L26
    L29:
        boolean r62 = r5.f3552i;     // Catch: Throwable -> L32
        r5.f3552i = r11.f3552i;     // Catch: Throwable -> L32
        r11.f3552i = r62;     // Catch: Throwable -> L32
        C0923q r63 = r5.f3550g;     // Catch: Throwable -> L32
        C0923q r7 = r11.f3548e;     // Catch: Throwable -> L32
        if (r5 != r4) goto L34;
        r11.f3548e = r5;     // Catch: Throwable -> L32
        r5.f3550g = r11;     // Catch: Throwable -> L32
    L41:
        r11.f3549f = null;     // Catch: Throwable -> L32
        r11.f3550g = r63;     // Catch: Throwable -> L32
        if (r63 == null) goto L44;
        r63.f3548e = r11;     // Catch: Throwable -> L32
    L44:
        r5.f3549f = r32;     // Catch: Throwable -> L32
        r32.f3548e = r5;     // Catch: Throwable -> L32
        r5.f3548e = r7;     // Catch: Throwable -> L32
        if (r7 != null) goto L48;
        r02 = r5;
    L51:
        if (r63 == null) goto L57;
        r32 = r63;
    L58:
        if (r32 == r11) goto L68;
        C0923q r42 = r11.f3548e;     // Catch: Throwable -> L32
        r32.f3548e = r42;     // Catch: Throwable -> L32
        if (r42 != null) goto L63;
        r02 = r32;
    L66:
        r11.f3548e = null;     // Catch: Throwable -> L32
        r11.f3550g = null;     // Catch: Throwable -> L32
        r11.f3549f = null;     // Catch: Throwable -> L32
        goto L68
    L63:
        if (r11 != r42.f3549f) goto L65;
        r42.f3549f = r32;     // Catch: Throwable -> L32
        goto L66
    L65:
        r42.f3550g = r32;     // Catch: Throwable -> L32
    L68:
        if (r11.f3552i == true) goto L71;
        r02 = m3212b(r02, r32);     // Catch: Throwable -> L32
    L71:
        this.f3545e = r02;     // Catch: Throwable -> L32
        if (r11 != r32) goto L82;
        C0923q r03 = r11.f3548e;     // Catch: Throwable -> L32
        if (r03 == null) goto L82;
        if (r11 != r03.f3549f) goto L79;
        r03.f3549f = null;     // Catch: Throwable -> L32
    L81:
        r11.f3548e = null;     // Catch: Throwable -> L32
        goto L82
    L79:
        if (r11 != r03.f3550g) goto L81;
        r03.f3550g = null;     // Catch: Throwable -> L32
    L82:
        this.lockState = 0;
        return false;
    L57:
        r32 = r11;
        goto L58
    L48:
        if (r11 != r7.f3549f) goto L50;
        r7.f3549f = r5;     // Catch: Throwable -> L32
        goto L51
    L50:
        r7.f3550g = r5;     // Catch: Throwable -> L32
        goto L51
    L34:
        C0923q r8 = r5.f3548e;     // Catch: Throwable -> L32
        r11.f3548e = r8;     // Catch: Throwable -> L32
        if (r8 != null) goto L37;
    L40:
        r5.f3550g = r4;     // Catch: Throwable -> L32
        r4.f3548e = r5;     // Catch: Throwable -> L32
        goto L41
    L37:
        if (r5 != r8.f3549f) goto L39;
        r8.f3549f = r11;     // Catch: Throwable -> L32
        goto L40
    L39:
        r8.f3550g = r11;     // Catch: Throwable -> L32
    L53:
        if (r32 != null) goto L58;
        if (r4 == null) goto L57;
        r32 = r4;
    L32:
        th = move-exception;
        this.lockState = 0;
        throw th;
    L5:
        r1.f3530d = r0;
        goto L6
    }
}
