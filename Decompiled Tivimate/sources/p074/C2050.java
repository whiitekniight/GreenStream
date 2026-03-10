package p074;

import p319.AbstractC4223;
import p450.AbstractC5659;

/* JADX INFO: renamed from: ʾˈ.ـﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2050 {
    public static final C2041 Companion = null;

    /* JADX INFO: renamed from: ʽ */
    public final long f7071;

    /* JADX INFO: renamed from: ⁱˊ */
    public final long f7072;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f7073;

    static {
        Companion = new C2041();
    }

    public /* synthetic */ C2050(int r3, long r4, long r6, long r8) {
        if (1 != (r3 & 1)) goto L13;
        this.f7073 = r4;
        if ((r3 & 2) != 0) goto L7;
        r6 = ((long) 1000) * r4;
    L7:
        this.f7072 = r6;
        if ((r3 & 4) != 0) goto L11;
        this.f7071 = r4 / ((long) 1000);
        return;
    L11:
        this.f7071 = r8;
        return;
    L13:
        AbstractC5659.m10874(r3, 1, C2016.f6964.mo5048());
        throw null;
    }

    public C2050(long r5) {
        this.f7073 = r5;
        long r0 = 1000;
        this.f7072 = r5 * r0;
        this.f7071 = r5 / r0;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C2050) == true) goto L9;
        return false;
    L9:
        if (this.f7073 == ((C2050) r8).f7073) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        long r1 = this.f7073;
        return (int) (r1 ^ (r1 >>> 32));
    }

    public final String toString() {
        return AbstractC4223.m8652(new StringBuilder("Time(ms="), this.f7073, ')');
    }
}
