package p242;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: ˑʿ.ᵎⁱ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3656 {
    /* JADX INFO: renamed from: ʽ */
    public static void m7699(View r0, Matrix r1) {
        r0.transformMatrixToLocal(r1);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m7700(View r0, Matrix r1) {
        r0.transformMatrixToGlobal(r1);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static void m7701(View r0, Matrix r1) {
        r0.setAnimationMatrix(r1);
    }
}
