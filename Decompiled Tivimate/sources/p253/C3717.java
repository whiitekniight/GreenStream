package p253;

import org.tukaani.p011xz.CorruptedInputException;
import p034.C1531;

/* JADX INFO: renamed from: ˑⁱ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3717 {

    /* JADX INFO: renamed from: ʽ */
    public int f13291;

    /* JADX INFO: renamed from: ˈ */
    public int f13292;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f13293;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int f13294;

    /* JADX INFO: renamed from: ᵔᵢ */
    public int f13295;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f13296;

    /* JADX INFO: renamed from: ﹳٴ */
    public final byte[] f13297;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f13298;

    public C3717(int r2, C1531 r3) {
        this.f13291 = 0;
        this.f13292 = 0;
        this.f13293 = 0;
        this.f13298 = 0;
        this.f13294 = 0;
        this.f13295 = 0;
        this.f13296 = r2;
        this.f13297 = r3.mo4099(r2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7773(int r4, int r5) {
        if (r4 < 0) goto L18;
        if (r4 >= this.f13293) goto L18;
        int r0 = Math.min(this.f13298 - this.f13292, r5);
        this.f13294 = r5 - r0;
        this.f13295 = r4;
        int r52 = (this.f13292 - r4) - 1;
        byte[] r42 = this.f13297;
        if (r52 >= 0) goto L11;
        int r1 = this.f13296;
        int r53 = r52 + r1;
        int r12 = Math.min(r1 - r53, r0);
        System.arraycopy(r42, r53, r42, this.f13292, r12);
        this.f13292 += r12;
        r0 = r0 - r12;
        if (r0 == 0) goto L23;
        r52 = 0;
        goto L11
    L23:
        return;
    L11:
        int r13 = Math.min(r0, this.f13292 - r52);
        System.arraycopy(r42, r52, r42, this.f13292, r13);
        int r2 = this.f13292 + r13;
        this.f13292 = r2;
        r0 = r0 - r13;
        if (r0 > 0) goto L11;
        if (this.f13293 >= r2) goto L22;
        this.f13293 = r2;
        return;
    L22:
        return;
    L18:
        throw new CorruptedInputException();
    }
}
