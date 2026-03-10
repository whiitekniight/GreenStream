package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ar.tvplayer.p002tv.R;

/* JADX INFO: loaded from: classes.dex */
public class ThumbsBar extends LinearLayout {

    /* JADX INFO: renamed from: ʽʽ */
    public final int f781;

    /* JADX INFO: renamed from: ʾˋ */
    public int f782;

    /* JADX INFO: renamed from: ˈٴ */
    public final int f783;

    /* JADX INFO: renamed from: ˊʻ */
    public int f784;

    /* JADX INFO: renamed from: ٴᵢ */
    public boolean f785;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f786;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final int f787;

    public ThumbsBar(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        this.f782 = -1;
        new SparseArray();
        this.f785 = false;
        this.f786 = r2.getResources().getDimensionPixelSize(R.dimen.u);
        this.f781 = r2.getResources().getDimensionPixelSize(R.dimen.u);
        this.f787 = r2.getResources().getDimensionPixelSize(R.dimen.u);
        this.f783 = r2.getResources().getDimensionPixelSize(R.dimen.u);
        this.f784 = r2.getResources().getDimensionPixelSize(R.dimen.u);
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        super.onLayout(r6, r7, r8, r9, r10);
        int r72 = getHeroIndex();
        View r82 = getChildAt(r72);
        int r92 = (getWidth() / 2) - (r82.getMeasuredWidth() / 2);
        int r0 = (r82.getMeasuredWidth() / 2) + (getWidth() / 2);
        r82.layout(r92, getPaddingTop(), r0, r82.getMeasuredHeight() + getPaddingTop());
        int r83 = (r82.getMeasuredHeight() / 2) + getPaddingTop();
        int r102 = r72 - 1;
    L3:
        if (r102 < 0) goto L5;
        int r93 = r92 - this.f784;
        View r1 = getChildAt(r102);
        r1.layout(r93 - r1.getMeasuredWidth(), r83 - (r1.getMeasuredHeight() / 2), r93, (r1.getMeasuredHeight() / 2) + r83);
        r92 = r93 - r1.getMeasuredWidth();
        r102 = r102 - 1;
    L5:
        r72 = r72 + 1;
        if (r72 >= this.f782) goto L8;
        int r02 = r0 + this.f784;
        View r94 = getChildAt(r72);
        r94.layout(r02, r83 - (r94.getMeasuredHeight() / 2), r94.getMeasuredWidth() + r02, (r94.getMeasuredHeight() / 2) + r83);
        r0 = r02 + r94.getMeasuredWidth();
        goto L5
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int r22 = getMeasuredWidth();
        if (this.f785 == true) goto L14;
        int r23 = r22 - this.f783;
        int r24 = ((r23 + r3) - 1) / (this.f786 + this.f784);
        if (r24 >= 2) goto L8;
        r24 = 2;
    L10:
        int r25 = r24 + 1;
        if (this.f782 == r25) goto L15;
        this.f782 = r25;
        m557();
        return;
    L15:
        return;
    L8:
        if ((r24 & 1) == 0) goto L10;
        r24 = r24 + 1;
        goto L10
    }

    public void setNumberOfThumbs(int r2) {
        this.f785 = true;
        this.f782 = r2;
        m557();
    }

    public void setThumbSpace(int r1) {
        this.f784 = r1;
        requestLayout();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m557() {
    L3:
        if (getChildCount() <= this.f782) goto L5;
        removeView(getChildAt(getChildCount() - 1));
    L5:
        int r0 = getChildCount();
        int r1 = this.f782;
        int r2 = this.f781;
        int r3 = this.f786;
        if (r0 >= r1) goto L8;
        addView(new ImageView(getContext()), new LinearLayout.LayoutParams(r3, r2));
        goto L5
    L8:
        int r02 = getHeroIndex();
        int r12 = 0;
    L10:
        if (r12 >= getChildCount()) goto L16;
        View r4 = getChildAt(r12);
        LinearLayout.LayoutParams r5 = (LinearLayout.LayoutParams) r4.getLayoutParams();
        if (r02 != r12) goto L14;
        r5.width = this.f783;
        r5.height = this.f787;
    L15:
        r4.setLayoutParams(r5);
        r12 = r12 + 1;
        goto L10
    L14:
        r5.width = r3;
        r5.height = r2;
        goto L15
    }
}
