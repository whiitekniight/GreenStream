package p433;

import android.media.MediaCodec;
import p152.AbstractC2859;

/* JADX INFO: renamed from: ﹳⁱ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C5482 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final MediaCodec.CryptoInfo.Pattern f19630;

    /* JADX INFO: renamed from: ﹳٴ */
    public final MediaCodec.CryptoInfo f19631;

    public C5482(MediaCodec.CryptoInfo r1) {
        this.f19631 = r1;
        this.f19630 = AbstractC2859.m6164();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m10566(C5482 r1, int r2, int r3) {
        r1.f19630.set(r2, r3);
        r1.f19631.setPattern(r1.f19630);
    }
}
