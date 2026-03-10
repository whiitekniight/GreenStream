package p139;

import java.util.Locale;
import p317.AbstractC4195;
import ˈˊ.ˉˆ;

/* JADX INFO: renamed from: ˈـ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C2628 {

    /* JADX INFO: renamed from: ᵎﹶ */
    public static final byte[] f9276 = null;

    /* JADX INFO: renamed from: ʽ */
    public final int f9277;

    /* JADX INFO: renamed from: ˈ */
    public final long f9278;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f9279;

    /* JADX INFO: renamed from: ⁱˊ */
    public final byte f9280;

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean f9281;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final byte[] f9282;

    static {
        f9276 = new byte[0];
    }

    public C2628(C2654 r3) {
        this.f9281 = r3.f9437;
        this.f9280 = r3.f9436;
        this.f9277 = r3.f9433;
        this.f9278 = r3.f9434;
        this.f9279 = r3.f9435;
        this.f9282 = r3.f9438;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static int m5808(int r0) {
        return ˉˆ.ʼʼ(r0 + 1);
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L21:
        return false;
    L8:
        if (C2628.class != r7.getClass()) goto L21;
        C2628 r72 = (C2628) r7;
        if (this.f9280 != r72.f9280) goto L21;
        if (this.f9277 != r72.f9277) goto L21;
        if (this.f9281 != r72.f9281) goto L21;
        if (this.f9278 != r72.f9278) goto L21;
        if (this.f9279 != r72.f9279) goto L21;
        return true;
    }

    public final int hashCode() {
        int r0 = (((((527 + this.f9280) * 31) + this.f9277) * 31) + (this.f9281 ? 1 : 0)) * 31;
        long r2 = this.f9278;
        return ((r0 + ((int) (r2 ^ (r2 >>> 32)))) * 31) + this.f9279;
    }

    public final String toString() {
        Object[] r5 = {Byte.valueOf(this.f9280), Integer.valueOf(this.f9277), Long.valueOf(this.f9278), Integer.valueOf(this.f9279), Boolean.valueOf(this.f9281)};
        String r0 = AbstractC4195.f15423;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", r5);
    }
}
