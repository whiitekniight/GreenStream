package p044;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: ʼᵢ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1633 implements InterfaceC1653, InterfaceC1632 {

    /* JADX INFO: renamed from: ʾˋ */
    public static final C1633 f5356 = null;

    static {
        f5356 = new C1633();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m4293(Object r0) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) r0;
    }

    @Override // p044.InterfaceC1632
    /* JADX INFO: renamed from: ʽ */
    public int mo4292(Object r3) {
        String r32 = ((C1648) r3).f5404;
        if (r32.startsWith("OMX.google") == false) goto L5;
        return 1;
    L5:
        if (r32.startsWith("c2.android") == false) goto L8;
        return 1;
    L8:
        if (Build.VERSION.SDK_INT < 26) goto L10;
        return 0;
    L10:
        if (r32.equals("OMX.MTK.AUDIO.DECODER.RAW") == false) goto L17;
        return -1;
    L17:
        return 0;
    }

    @Override // p044.InterfaceC1653
    /* JADX INFO: renamed from: ﹳٴ */
    public List mo4294(String r1, boolean r2, boolean r3) {
        return AbstractC1645.m4331(r1, r2, r3);
    }
}
