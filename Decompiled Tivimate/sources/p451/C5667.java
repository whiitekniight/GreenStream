package p451;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import p287.C3991;

/* JADX INFO: renamed from: ﹶᐧ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C5667 implements TransformationMethod {

    /* JADX INFO: renamed from: ʾˋ */
    public final TransformationMethod f20438;

    public C5667(TransformationMethod r1) {
        this.f20438 = r1;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence r3, View r4) {
        if (r4.isInEditMode() == false) goto L5;
        return r3;
    L5:
        TransformationMethod r0 = this.f20438;
        if (r0 == null) goto L8;
        r3 = r0.getTransformation(r3, r4);
    L8:
        if (r3 != null) goto L10;
        return r3;
    L10:
        if (C3991.m8184().m8188() != 1) goto L15;
        C3991 r42 = C3991.m8184();
        r42.getClass();
        return r42.m8187(r3, 0, r3.length());
    L15:
        return r3;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View r7, CharSequence r8, boolean r9, int r10, Rect r11) {
        TransformationMethod r0 = this.f20438;
        if (r0 == null) goto L6;
        r0.onFocusChanged(r7, r8, r9, r10, r11);
        return;
    }
}
