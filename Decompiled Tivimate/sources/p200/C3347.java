package p200;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import p095.C2203;

/* JADX INFO: renamed from: ˋⁱ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C3347 extends AbstractC3341 {

    /* JADX INFO: renamed from: ʽ */
    public final /* synthetic */ ArrayList f11713;

    /* JADX INFO: renamed from: ˈ */
    public final /* synthetic */ Matrix f11714;

    public C3347(ArrayList r1, Matrix r2) {
        this.f11713 = r1;
        this.f11714 = r2;
    }

    @Override // p200.AbstractC3341
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo7070(Matrix r5, C2203 r6, int r7, Canvas r8) {
        ArrayList r52 = this.f11713;
        int r0 = r52.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Object r2 = r52.get(r1);
        r1 = r1 + 1;
        ((AbstractC3341) r2).mo7070(this.f11714, r6, r7, r8);
        goto L3
    }
}
