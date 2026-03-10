package p134;

import android.support.v4.media.session.AbstractC0002;

/* JADX INFO: renamed from: ˈˋ.ﹳـ */
/* JADX INFO: loaded from: classes.dex */
public final class C2598 extends AbstractC2530 {

    /* JADX INFO: renamed from: ʽ */
    public final long f9225;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f9226;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f9227;

    public C2598(long r1, String r3, String r4) {
        this.f9227 = r3;
        this.f9226 = r4;
        this.f9225 = r1;
    }

    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof AbstractC2530) == false) goto L14;
        C2598 r82 = (C2598) ((AbstractC2530) r8);
        String r1 = r82.f9227;
        if (this.f9227.equals(r1) == false) goto L14;
        if (this.f9226.equals(r82.f9226) == false) goto L14;
        if (this.f9225 != r82.f9225) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        int r0 = (((this.f9227.hashCode() ^ 1000003) * 1000003) ^ this.f9226.hashCode()) * 1000003;
        long r2 = this.f9225;
        return r0 ^ ((int) (r2 ^ (r2 >>> 32)));
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Signal{name=");
        r0.append(this.f9227);
        r0.append(", code=");
        r0.append(this.f9226);
        r0.append(", address=");
        return AbstractC0002.m8(r0, this.f9225, "}");
    }
}
