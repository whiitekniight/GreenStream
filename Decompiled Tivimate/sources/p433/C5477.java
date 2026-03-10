package p433;

import android.media.MediaCodec;
import android.os.Build;

/* JADX INFO: renamed from: ﹳⁱ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C5477 {

    /* JADX INFO: renamed from: ʼˎ */
    public final MediaCodec.CryptoInfo f19598;

    /* JADX INFO: renamed from: ʽ */
    public int f19599;

    /* JADX INFO: renamed from: ˆʾ */
    public final C5482 f19600;

    /* JADX INFO: renamed from: ˈ */
    public int[] f19601;

    /* JADX INFO: renamed from: ˑﹳ */
    public int[] f19602;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int f19603;

    /* JADX INFO: renamed from: ᵔᵢ */
    public int f19604;

    /* JADX INFO: renamed from: ⁱˊ */
    public byte[] f19605;

    /* JADX INFO: renamed from: ﹳٴ */
    public byte[] f19606;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f19607;

    public C5477() {
        MediaCodec.CryptoInfo r0 = new MediaCodec.CryptoInfo();
        this.f19598 = r0;
        if (Build.VERSION.SDK_INT < 24) goto L5;
        C5482 r1 = new C5482(r0);
    L6:
        this.f19600 = r1;
        return;
    L5:
        r1 = null;
        goto L6
    }
}
