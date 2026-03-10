package p270;

import androidx.lifecycle.AbstractC0195;
import androidx.lifecycle.ˊˋ;
import p267.C3843;

/* JADX INFO: renamed from: יﹳ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public class C3881 extends AbstractC0195 {

    /* JADX INFO: renamed from: ʽ */
    public static final ˊˋ f14210 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C3843 f14211;

    static {
        f14210 = new ˊˋ(20);
    }

    public C3881() {
        this.f14211 = new C3843();
    }

    @Override // androidx.lifecycle.AbstractC0195
    /* JADX INFO: renamed from: ﾞᴵ */
    public final void mo730() {
        C3843 r0 = this.f14211;
        int r1 = r0.f14085;
        if (r1 > 0) goto L9;
        Object[] r3 = r0.f14087;
        int r4 = 0;
    L5:
        if (r4 >= r1) goto L7;
        r3[r4] = null;
        r4 = r4 + 1;
        goto L5
    L7:
        r0.f14085 = 0;
        return;
    L9:
        r0.m7913(0).getClass();
        throw new ClassCastException();
    }
}
