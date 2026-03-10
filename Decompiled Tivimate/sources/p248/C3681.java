package p248;

import android.animation.TimeInterpolator;
import p047.AbstractC1703;

/* JADX INFO: renamed from: ˑˏ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C3681 {

    /* JADX INFO: renamed from: ʽ */
    public TimeInterpolator f13178;

    /* JADX INFO: renamed from: ˈ */
    public int f13179;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f13180;

    /* JADX INFO: renamed from: ⁱˊ */
    public long f13181;

    /* JADX INFO: renamed from: ﹳٴ */
    public long f13182;

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof C3681) == true) goto L8;
        return false;
    L8:
        C3681 r72 = (C3681) r7;
        if (this.f13182 == r72.f13182) goto L12;
        return false;
    L12:
        if (this.f13181 == r72.f13181) goto L15;
        return false;
    L15:
        if (this.f13179 == r72.f13179) goto L18;
        return false;
    L18:
        if (this.f13180 == r72.f13180) goto L21;
        return false;
    L21:
        return m7746().getClass().equals(r72.m7746().getClass());
    }

    public final int hashCode() {
        long r0 = this.f13182;
        int r02 = ((int) (r0 ^ (r0 >>> 32))) * 31;
        long r3 = this.f13181;
        int r03 = (r02 + ((int) ((r3 >>> 32) ^ r3))) * 31;
        return ((((m7746().getClass().hashCode() + r03) * 31) + this.f13179) * 31) + this.f13180;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("\n");
        r0.append(C3681.class.getName());
        r0.append('{');
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" delay: ");
        r0.append(this.f13182);
        r0.append(" duration: ");
        r0.append(this.f13181);
        r0.append(" interpolator: ");
        r0.append(m7746().getClass());
        r0.append(" repeatCount: ");
        r0.append(this.f13179);
        r0.append(" repeatMode: ");
        return AbstractC1703.m4493(r0, this.f13180, "}\n");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final TimeInterpolator m7746() {
        TimeInterpolator r0 = this.f13178;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return AbstractC3683.f13187;
    }
}
