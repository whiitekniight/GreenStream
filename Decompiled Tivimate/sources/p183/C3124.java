package p183;

import android.support.v4.media.session.AbstractC0002;

/* JADX INFO: renamed from: ˊﾞ.ᴵˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3124 {

    /* JADX INFO: renamed from: ʽ */
    public static final C3124 f10967 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public final long f10968;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f10969;

    static {
        f10967 = new C3124(0, 0);
    }

    public C3124(long r1, long r3) {
        this.f10969 = r1;
        this.f10968 = r3;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L15:
        return false;
    L8:
        if (C3124.class != r7.getClass()) goto L15;
        C3124 r72 = (C3124) r7;
        if (this.f10969 != r72.f10969) goto L15;
        if (this.f10968 != r72.f10968) goto L15;
        return true;
    }

    public final int hashCode() {
        return (((int) this.f10969) * 31) + ((int) this.f10968);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("[timeUs=");
        r0.append(this.f10969);
        r0.append(", position=");
        return AbstractC0002.m8(r0, this.f10968, "]");
    }
}
