package p255;

import java.util.ArrayDeque;
import p183.InterfaceC3105;
import ˉˆ.ʿ;

/* JADX INFO: renamed from: ˑﹶ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3728 {

    /* JADX INFO: renamed from: ʽ */
    public final C3727 f13433;

    /* JADX INFO: renamed from: ˈ */
    public ʿ f13434;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f13435;

    /* JADX INFO: renamed from: ᵎﹶ */
    public long f13436;

    /* JADX INFO: renamed from: ⁱˊ */
    public final ArrayDeque f13437;

    /* JADX INFO: renamed from: ﹳٴ */
    public final byte[] f13438;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f13439;

    public C3728() {
        this.f13438 = new byte[8];
        this.f13437 = new ArrayDeque();
        this.f13433 = new C3727();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final long m7787(InterfaceC3105 r7, int r8) {
        byte[] r0 = this.f13438;
        int r1 = 0;
        r7.readFully(r0, 0, r8);
        long r2 = 0;
    L3:
        if (r1 >= r8) goto L5;
        r2 = (r2 << 8) | ((long) (r0[r1] & 255));
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }
}
