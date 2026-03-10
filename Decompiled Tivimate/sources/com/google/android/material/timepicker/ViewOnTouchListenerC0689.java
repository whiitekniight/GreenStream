package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: renamed from: com.google.android.material.timepicker.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0689 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ GestureDetector f2970;

    public ViewOnTouchListenerC0689(GestureDetector r1) {
        this.f2970 = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r1, MotionEvent r2) {
        if (((Checkable) r1).isChecked() == true) goto L5;
        return false;
    L5:
        return this.f2970.onTouchEvent(r2);
    }
}
