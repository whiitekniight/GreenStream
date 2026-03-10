package com.google.android.material.timepicker;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: com.google.android.material.timepicker.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C0682 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r3, Outline r4) {
        r4.setOval(0, 0, r3.getWidth(), r3.getHeight());
    }
}
