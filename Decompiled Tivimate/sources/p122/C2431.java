package p122;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.leanback.preference.internal.OutlineOnlyWithChildrenFrameLayout;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: ˆᵢ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2431 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ View f8671;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f8672;

    public /* synthetic */ C2431(View r1, int r2) {
        this.f8672 = r2;
        this.f8671 = r1;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r3, Outline r4) {
        switch(this.f8672) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        OutlineOnlyWithChildrenFrameLayout r0 = (OutlineOnlyWithChildrenFrameLayout) this.f8671;
        if (r0.getChildCount() <= 0) goto L7;
        r0.f542.getOutline(r3, r4);
        return;
    L7:
        ViewOutlineProvider.BACKGROUND.getOutline(r3, r4);
        return;
    L9:
        C2436 r32 = ((Chip) this.f8671).f2694;
        if (r32 == null) goto L12;
        r32.getOutline(r4);
        return;
    L12:
        r4.setAlpha(0.0f);
    }
}
