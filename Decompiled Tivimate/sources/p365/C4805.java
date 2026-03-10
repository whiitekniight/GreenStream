package p365;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p148.InterfaceC2710;

/* JADX INFO: renamed from: ᵔʾ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C4805 extends FrameLayout implements InterfaceC2710 {

    /* JADX INFO: renamed from: ʾˋ */
    public final CollapsibleActionView f16969;

    /* JADX WARN: Multi-variable type inference failed */
    public C4805(View r2) {
        super(r2.getContext());
        this.f16969 = (CollapsibleActionView) r2;
        addView(r2);
    }
}
