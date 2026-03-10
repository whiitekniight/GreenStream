package p017;

import p361.C4770;
import ᴵˋ.ˊʻ;

/* JADX INFO: renamed from: ʻˈ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1309 extends AbstractC1304 {

    /* JADX INFO: renamed from: ʽ */
    public int f4471;

    /* JADX INFO: renamed from: ⁱˊ */
    public String f4472;

    /* JADX INFO: renamed from: ﹳٴ */
    public C4770[] f4473;

    public AbstractC1309() {
        this.f4473 = null;
        this.f4471 = 0;
    }

    public AbstractC1309(AbstractC1309 r2) {
        this.f4473 = null;
        this.f4471 = 0;
        this.f4472 = r2.f4472;
        this.f4473 = ˊʻ.ﾞʻ(r2.f4473);
    }

    public C4770[] getPathData() {
        return this.f4473;
    }

    public String getPathName() {
        return this.f4472;
    }

    public void setPathData(C4770[] r7) {
        if (ˊʻ.ˈ(this.f4473, r7) == true) goto L6;
        this.f4473 = ˊʻ.ﾞʻ(r7);
        return;
    L6:
        C4770[] r0 = this.f4473;
        int r2 = 0;
    L8:
        if (r2 >= r7.length) goto L14;
        r0[r2].f16814 = r7[r2].f16814;
        int r3 = 0;
    L10:
        float[] r4 = r7[r2].f16813;
        if (r3 >= r4.length) goto L13;
        r0[r2].f16813[r3] = r4[r3];
        r3 = r3 + 1;
        goto L10
    L13:
        r2 = r2 + 1;
        goto L8
    }
}
