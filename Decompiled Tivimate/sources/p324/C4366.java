package p324;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import androidx.media3.p001ui.DefaultTimeBar;

/* JADX INFO: renamed from: ᐧⁱ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4366 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ DefaultTimeBar f16057;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f16058;

    public /* synthetic */ C4366(DefaultTimeBar r1, int r2) {
        this.f16058 = r2;
        this.f16057 = r1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r6) {
        int r0 = this.f16058;
        DefaultTimeBar r1 = this.f16057;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        int r02 = DefaultTimeBar.f1259;
        r1.getClass();
        r1.f1286 = ((Float) r6.getAnimatedValue()).floatValue();
        r1.invalidate(r1.f1266);
        return;
    L6:
        int r03 = DefaultTimeBar.f1259;
        r1.getClass();
        r1.f1291 = ((Float) r6.getAnimatedValue()).floatValue();
        Rect r62 = r1.f1294;
        float r04 = r1.f1299;
        r1.f1269 = DefaultTimeBar.m797(3, r04);
        if (r1.isEnabled() == false) goto L13;
        float r2 = DefaultTimeBar.m797(3, r04);
        float r05 = DefaultTimeBar.m797(6, r04);
        float r4 = (r05 - r2) * r1.f1291;
        if (r1.hasFocus() == false) goto L11;
        float r22 = r2 + r4;
    L12:
        r1.f1269 = Math.round(r22);
        goto L13
    L11:
        r22 = r05 - r4;
    L13:
        r62.inset(0, (r62.height() - r1.f1269) / 2);
        r1.invalidate();
    }
}
