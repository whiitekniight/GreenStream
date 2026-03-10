package p017;

import android.animation.TypeEvaluator;
import p361.C4770;
import ᴵˋ.ˊʻ;

/* JADX INFO: renamed from: ʻˈ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C1308 implements TypeEvaluator {

    /* JADX INFO: renamed from: ﹳٴ */
    public C4770[] f4470;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float r10, Object r11, Object r12) {
        C4770[] r112 = (C4770[]) r11;
        C4770[] r122 = (C4770[]) r12;
        if (ˊʻ.ˈ(r112, r122) == false) goto L18;
        if (ˊʻ.ˈ(this.f4470, r112) == true) goto L7;
        this.f4470 = ˊʻ.ﾞʻ(r112);
    L7:
        int r1 = 0;
    L9:
        if (r1 >= r112.length) goto L16;
        C4770 r2 = this.f4470[r1];
        C4770 r3 = r112[r1];
        C4770 r4 = r122[r1];
        r2.getClass();
        r2.f16814 = r3.f16814;
        int r5 = 0;
    L11:
        float[] r6 = r3.f16813;
        if (r5 >= r6.length) goto L14;
        r2.f16813[r5] = (r4.f16813[r5] * r10) + ((1.0f - r10) * r6[r5]);
        r5 = r5 + 1;
        goto L11
    L14:
        r1 = r1 + 1;
        goto L9
    L16:
        return this.f4470;
    L18:
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
