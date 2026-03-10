package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ar.tvplayer.p002tv.R;
import p248.AbstractC3683;
import ﹳˋ.ʽʽ;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: ʽʽ */
    public int f2845;

    /* JADX INFO: renamed from: ʾˋ */
    public TextView f2846;

    /* JADX INFO: renamed from: ᴵˊ */
    public Button f2847;

    public SnackbarContentLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        ʽʽ.ـˆ(r2, R.attr.u, AbstractC3683.f13187);
    }

    public Button getActionView() {
        return this.f2847;
    }

    public TextView getMessageView() {
        return this.f2846;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2846 = (TextView) findViewById(R.id.u);
        this.f2847 = (Button) findViewById(R.id.u);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
        super.onMeasure(r8, r9);
        if (getOrientation() == 1) goto L28;
        int r0 = getResources().getDimensionPixelSize(R.dimen.u);
        int r2 = getResources().getDimensionPixelSize(R.dimen.u);
        Layout r3 = this.f2846.getLayout();
        if (r3 != null) goto L8;
    L10:
        boolean r32 = false;
    L11:
        if (r32 == true) goto L13;
    L19:
        if (r32 == true) goto L23;
        r0 = r2;
    L23:
        if (m2479(0, r0, r0) == false) goto L27;
    L24:
        super.onMeasure(r8, r9);
        return;
    L27:
        return;
    L13:
        if (this.f2845 <= 0) goto L19;
        if (this.f2847.getMeasuredWidth() <= this.f2845) goto L19;
        if (m2479(1, r0, r0 - r2) == true) goto L24;
        return;
    L8:
        if (r3.getLineCount() <= 1) goto L10;
        r32 = true;
        goto L11
    }

    public void setMaxInlineActionWidth(int r1) {
        this.f2845 = r1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m2479(int r4, int r5, int r6) {
        if (r4 == getOrientation()) goto L5;
        setOrientation(r4);
        boolean r42 = true;
    L7:
        if (this.f2846.getPaddingTop() == r5) goto L9;
    L12:
        TextView r43 = this.f2846;
        if (r43.isPaddingRelative() == false) goto L16;
        r43.setPaddingRelative(r43.getPaddingStart(), r5, r43.getPaddingEnd(), r6);
        return true;
    L16:
        r43.setPadding(r43.getPaddingLeft(), r5, r43.getPaddingRight(), r6);
        return true;
    L9:
        if (this.f2846.getPaddingBottom() != r6) goto L12;
        return r42;
    L5:
        r42 = false;
        goto L7
    }
}
