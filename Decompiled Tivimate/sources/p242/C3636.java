package p242;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: ˑʿ.ˆﾞ */
/* JADX INFO: loaded from: classes.dex */
public final class C3636 extends C3659 {
    @Override // p242.C3659, p133.AbstractC2509
    /* JADX INFO: renamed from: ʾˋ */
    public final void mo5777(View r1, int r2) {
        r1.setTransitionVisibility(r2);
    }

    @Override // p242.C3659
    /* JADX INFO: renamed from: ˈⁱ */
    public final void mo7658(View r1, int r2, int r3, int r4, int r5) {
        r1.setLeftTopRightBottom(r2, r3, r4, r5);
    }

    @Override // p242.C3659
    /* JADX INFO: renamed from: ˉـ */
    public final void mo7659(View r1, Matrix r2) {
        r1.transformMatrixToLocal(r2);
    }

    @Override // p242.C3659
    /* JADX INFO: renamed from: ᴵˑ */
    public final void mo7660(View r1, Matrix r2) {
        r1.transformMatrixToGlobal(r2);
    }

    @Override // p133.AbstractC2509
    /* JADX INFO: renamed from: ᵔʾ */
    public final float mo5778(View r1) {
        return r1.getTransitionAlpha();
    }

    @Override // p133.AbstractC2509
    /* JADX INFO: renamed from: ᵢˏ */
    public final void mo5779(View r1, float r2) {
        r1.setTransitionAlpha(r2);
    }
}
