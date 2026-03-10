package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p023.AbstractC1352;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class PreferenceImageView extends ImageView {

    /* JADX INFO: renamed from: ʾˋ */
    public int f1419;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f1420;

    public PreferenceImageView(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        this.f1419 = Integer.MAX_VALUE;
        this.f1420 = Integer.MAX_VALUE;
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC1352.f4645, 0, 0);
        setMaxWidth(r42.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(r42.getDimensionPixelSize(2, Integer.MAX_VALUE));
        r42.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f1420;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f1419;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int r6, int r7) {
        int r0 = View.MeasureSpec.getMode(r6);
        if (r0 == Integer.MIN_VALUE) goto L5;
        if (r0 == 0) goto L5;
    L10:
        int r02 = View.MeasureSpec.getMode(r7);
        if (r02 == Integer.MIN_VALUE) goto L13;
        if (r02 == 0) goto L13;
    L18:
        super.onMeasure(r6, r7);
        return;
    L13:
        int r3 = View.MeasureSpec.getSize(r7);
        int r4 = getMaxHeight();
        if (r4 == Integer.MAX_VALUE) goto L18;
        if (r4 < r3) goto L17;
        if (r02 != 0) goto L18;
    L17:
        r7 = View.MeasureSpec.makeMeasureSpec(r4, Integer.MIN_VALUE);
    L5:
        int r32 = View.MeasureSpec.getSize(r6);
        int r42 = getMaxWidth();
        if (r42 == Integer.MAX_VALUE) goto L10;
        if (r42 < r32) goto L9;
        if (r0 != 0) goto L10;
    L9:
        r6 = View.MeasureSpec.makeMeasureSpec(r42, Integer.MIN_VALUE);
        goto L10
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int r1) {
        this.f1420 = r1;
        super.setMaxHeight(r1);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int r1) {
        this.f1419 = r1;
        super.setMaxWidth(r1);
    }
}
