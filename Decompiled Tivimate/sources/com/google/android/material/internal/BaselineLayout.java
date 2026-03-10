package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {

    /* JADX INFO: renamed from: ʾˋ */
    public int f2801;

    /* JADX INFO: renamed from: ᴵˊ */
    public boolean f2802;

    public BaselineLayout(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        this.f2801 = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f2801;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        int r72 = getChildCount();
        int r92 = getPaddingLeft();
        int r102 = ((r10 - r8) - getPaddingRight()) - r92;
        int r82 = getPaddingTop();
        int r112 = 0;
    L3:
        if (r112 >= r72) goto L15;
        View r0 = getChildAt(r112);
        if (r0.getVisibility() == 8) goto L14;
        int r1 = r0.getMeasuredWidth();
        int r2 = r0.getMeasuredHeight();
        int r3 = ((r102 - r1) / 2) + r92;
        if (this.f2801 != (-1)) goto L10;
    L12:
        int r4 = r82;
    L13:
        r0.layout(r3, r4, r1 + r3, r2 + r4);
        goto L14
    L10:
        if (r0.getBaseline() == (-1)) goto L12;
        r4 = (this.f2801 + r82) - r0.getBaseline();
    L14:
        r112 = r112 + 1;
        goto L3
    }

    @Override // android.view.View
    public final void onMeasure(int r13, int r14) {
        int r0 = getChildCount();
        int r1 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = -1;
        int r8 = -1;
    L3:
        if (r1 >= r0) goto L12;
        View r9 = getChildAt(r1);
        if (r9.getVisibility() == 8) goto L11;
        measureChild(r9, r13, r14);
        r3 = Math.max(r3, r9.getMeasuredHeight());
        int r10 = r9.getBaseline();
        if (r10 == (-1)) goto L10;
        r7 = Math.max(r7, r10);
        r8 = Math.max(r8, r9.getMeasuredHeight() - r10);
    L10:
        r5 = Math.max(r5, r9.getMeasuredWidth());
        r4 = Math.max(r4, r9.getMeasuredHeight());
        r6 = View.combineMeasuredStates(r6, r9.getMeasuredState());
    L11:
        r1 = r1 + 1;
        goto L3
    L12:
        if (r7 == (-1)) goto L18;
        if (this.f2802 == false) goto L16;
        r4 = Math.max(r4, Math.max(r8, getPaddingBottom()) + r7);
    L16:
        this.f2801 = r7;
    L18:
        if (this.f2802 == true) goto L21;
        r4 = getPaddingBottom() + r3;
    L21:
        setMeasuredDimension(View.resolveSizeAndState(Math.max(r5, getSuggestedMinimumWidth()), r13, r6), View.resolveSizeAndState(Math.max(r4, getSuggestedMinimumHeight()), r14, r6 << 16));
    }

    public void setMeasurePaddingFromBaseline(boolean r1) {
        this.f2802 = r1;
    }
}
