package p005j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p005j$.time.C0757b;

/* JADX INFO: renamed from: j$.time.temporal.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C0860r implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a */
    public final long f3391a;

    /* JADX INFO: renamed from: b */
    public final long f3392b;

    /* JADX INFO: renamed from: c */
    public final long f3393c;

    /* JADX INFO: renamed from: d */
    public final long f3394d;

    public C0860r(long r1, long r3, long r5, long r7) {
        this.f3391a = r1;
        this.f3392b = r3;
        this.f3393c = r5;
        this.f3394d = r7;
    }

    /* JADX INFO: renamed from: f */
    public static C0860r m3134f(long r10, long r12) {
        if (r10 > r12) goto L7;
        return new C0860r(r10, r10, r12, r12);
    L7:
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* JADX INFO: renamed from: g */
    public static C0860r m3135g(long r9, long r11, long r13) {
        if (r9 > 1) goto L15;
        if (r11 > r13) goto L13;
        if (1 > r13) goto L11;
        return new C0860r(r9, 1, r11, r13);
    L11:
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    L13:
        throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
    L15:
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    private void readObject(ObjectInputStream r7) {
        r7.defaultReadObject();
        long r0 = this.f3391a;
        long r2 = this.f3392b;
        if (r0 > r2) goto L14;
        long r02 = this.f3393c;
        long r4 = this.f3394d;
        if (r02 > r4) goto L12;
        if (r2 > r4) goto L10;
        return;
    L10:
        throw new InvalidObjectException("Minimum value must be less than maximum value");
    L12:
        throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
    L14:
        throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
    }

    /* JADX INFO: renamed from: a */
    public final int m3136a(long r2, InterfaceC0857o r4) {
        if (m3139d() == false) goto L9;
        if (m3140e(r2) == false) goto L9;
        return (int) r2;
    L9:
        throw new C0757b(m3138c(r2, r4));
    }

    /* JADX INFO: renamed from: b */
    public final void m3137b(long r2, InterfaceC0857o r4) {
        if (m3140e(r2) == false) goto L6;
        return;
    L6:
        throw new C0757b(m3138c(r2, r4));
    }

    /* JADX INFO: renamed from: c */
    public final String m3138c(long r4, InterfaceC0857o r6) {
        if (r6 == null) goto L7;
        return "Invalid value for " + r6 + " (valid values " + this + "): " + r4;
    L7:
        return "Invalid value (valid values " + this + "): " + r4;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3139d() {
        if (this.f3391a >= (-2147483648L)) goto L5;
        return false;
    L5:
        if (this.f3394d > 2147483647L) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3140e(long r3) {
        if (r3 >= this.f3391a) goto L5;
        return false;
    L5:
        if (r3 > this.f3394d) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof C0860r) == false) goto L16;
        C0860r r82 = (C0860r) r8;
        if (this.f3391a != r82.f3391a) goto L16;
        if (this.f3392b != r82.f3392b) goto L16;
        if (this.f3393c != r82.f3393c) goto L16;
        if (this.f3394d != r82.f3394d) goto L16;
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        long r0 = this.f3391a;
        long r2 = this.f3392b;
        long r02 = (r0 + (r2 << 16)) + (r2 >> 48);
        long r22 = this.f3393c;
        long r03 = (r02 + (r22 << 32)) + (r22 >> 32);
        long r23 = this.f3394d;
        long r04 = (r03 + (r23 << 48)) + (r23 >> 16);
        return (int) (r04 ^ (r04 >>> 32));
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(this.f3391a);
        if (this.f3391a == this.f3392b) goto L5;
        r0.append('/');
        r0.append(this.f3392b);
    L5:
        r0.append(" - ");
        r0.append(this.f3393c);
        if (this.f3393c == this.f3394d) goto L9;
        r0.append('/');
        r0.append(this.f3394d);
    L9:
        return r0.toString();
    }
}
