package p134;

import android.support.v4.media.session.AbstractC0002;

/* JADX INFO: renamed from: ˈˋ.ᐧﾞ */
/* JADX INFO: loaded from: classes.dex */
public final class C2577 extends AbstractC2583 {

    /* JADX INFO: renamed from: ʽ */
    public final boolean f9126;

    /* JADX INFO: renamed from: ˈ */
    public final int f9127;

    /* JADX INFO: renamed from: ˑﹳ */
    public final long f9128;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f9129;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Double f9130;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final long f9131;

    public C2577(Double r1, int r2, boolean r3, int r4, long r5, long r7) {
        this.f9130 = r1;
        this.f9129 = r2;
        this.f9126 = r3;
        this.f9127 = r4;
        this.f9128 = r5;
        this.f9131 = r7;
    }

    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof AbstractC2583) == false) goto L25;
        AbstractC2583 r82 = (AbstractC2583) r8;
        Double r1 = this.f9130;
        if (r1 != null) goto L13;
        if (((C2577) r82).f9130 != null) goto L25;
    L14:
        C2577 r83 = (C2577) r82;
        int r12 = r83.f9129;
        if (this.f9129 != r12) goto L25;
        if (this.f9126 != r83.f9126) goto L25;
        if (this.f9127 != r83.f9127) goto L25;
        if (this.f9128 != r83.f9128) goto L25;
        if (this.f9131 != r83.f9131) goto L25;
        return true;
    L13:
        if (r1.equals(((C2577) r82).f9130) == true) goto L14;
    L25:
        return false;
    }

    public final int hashCode() {
        Double r0 = this.f9130;
        if (r0 != null) goto L5;
        int r02 = 0;
    L6:
        int r03 = (((r02 ^ 1000003) * 1000003) ^ this.f9129) * 1000003;
        if (this.f9126 == false) goto L9;
        int r2 = 1231;
    L10:
        int r04 = (((r03 ^ r2) * 1000003) ^ this.f9127) * 1000003;
        long r22 = this.f9128;
        long r1 = this.f9131;
        return ((r04 ^ ((int) (r22 ^ (r22 >>> 32)))) * 1000003) ^ ((int) (r1 ^ (r1 >>> 32)));
    L9:
        r2 = 1237;
        goto L10
    L5:
        r02 = r0.hashCode();
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Device{batteryLevel=");
        r0.append(this.f9130);
        r0.append(", batteryVelocity=");
        r0.append(this.f9129);
        r0.append(", proximityOn=");
        r0.append(this.f9126);
        r0.append(", orientation=");
        r0.append(this.f9127);
        r0.append(", ramUsed=");
        r0.append(this.f9128);
        r0.append(", diskUsed=");
        return AbstractC0002.m8(r0, this.f9131, "}");
    }
}
