package p200;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: ˋⁱ.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public final class C3333 {

    /* JADX INFO: renamed from: ʽ */
    public float f11649;

    /* JADX INFO: renamed from: ˈ */
    public float f11650;

    /* JADX INFO: renamed from: ˑﹳ */
    public float f11651;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final ArrayList f11652;

    /* JADX INFO: renamed from: ⁱˊ */
    public float f11653;

    /* JADX INFO: renamed from: ﹳٴ */
    public float f11654;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final ArrayList f11655;

    public C3333() {
        this.f11655 = new ArrayList();
        this.f11652 = new ArrayList();
        m7064(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m7063(float r5, float r6) {
        C3331 r0 = new C3331();
        r0.f11640 = r5;
        r0.f11639 = r6;
        this.f11655.add(r0);
        C3340 r1 = new C3340(r0, this.f11653, this.f11649);
        float r02 = r1.m7069() + 270.0f;
        float r3 = r1.m7069() + 270.0f;
        m7066(r02);
        this.f11652.add(r1);
        this.f11650 = r3;
        this.f11653 = r5;
        this.f11649 = r6;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m7064(float r2, float r3, float r4) {
        this.f11654 = r2;
        this.f11653 = 0.0f;
        this.f11649 = r2;
        this.f11650 = r3;
        this.f11651 = (r3 + r4) % 360.0f;
        this.f11655.clear();
        this.f11652.clear();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m7065(Matrix r5, Path r6) {
        ArrayList r0 = this.f11655;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        ((AbstractC3325) r0.get(r2)).mo7024(r5, r6);
        r2 = r2 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7066(float r5) {
        float r0 = this.f11650;
        if (r0 == r5) goto L10;
        float r02 = ((r5 - r0) + 360.0f) % 360.0f;
        if (r02 <= 180.0f) goto L8;
        return;
    L8:
        float r2 = this.f11653;
        float r3 = this.f11649;
        C3338 r1 = new C3338(r2, r3, r2, r3);
        r1.f11676 = this.f11650;
        r1.f11674 = r02;
        C3351 r03 = new C3351(r1);
        this.f11652.add(r03);
        this.f11650 = r5;
        return;
    }
}
