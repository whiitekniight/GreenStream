package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import ar.tvplayer.p002tv.R;
import p198.AbstractC3306;
import p284.AbstractC3966;

/* JADX INFO: loaded from: classes.dex */
public class PagingIndicator extends View {

    /* JADX INFO: renamed from: ʿ */
    public static final C0098 f677 = null;

    /* JADX INFO: renamed from: ʿᵢ */
    public static final C0098 f678 = null;

    /* JADX INFO: renamed from: ˉـ */
    public static final C0098 f679 = null;

    /* JADX INFO: renamed from: ᴵˑ */
    public static final DecelerateInterpolator f680 = null;

    /* JADX INFO: renamed from: ʼˈ */
    public Bitmap f681;

    /* JADX INFO: renamed from: ʽʽ */
    public final int f682;

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f683;

    /* JADX INFO: renamed from: ˆﾞ */
    public int f684;

    /* JADX INFO: renamed from: ˈʿ */
    public int f685;

    /* JADX INFO: renamed from: ˈٴ */
    public final int f686;

    /* JADX INFO: renamed from: ˈⁱ */
    public final float f687;

    /* JADX INFO: renamed from: ˉٴ */
    public final int f688;

    /* JADX INFO: renamed from: ˊʻ */
    public final int f689;

    /* JADX INFO: renamed from: ˊˋ */
    public final Paint f690;

    /* JADX INFO: renamed from: ˋᵔ */
    public final Paint f691;

    /* JADX INFO: renamed from: ˑٴ */
    public int f692;

    /* JADX INFO: renamed from: ـˏ */
    public Paint f693;

    /* JADX INFO: renamed from: ٴʼ */
    public int[] f694;

    /* JADX INFO: renamed from: ٴᵢ */
    public final int f695;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f696;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final int f697;

    /* JADX INFO: renamed from: ᵎˊ */
    public int[] f698;

    /* JADX INFO: renamed from: ᵎⁱ */
    public C0140[] f699;

    /* JADX INFO: renamed from: ᵔי */
    public int[] f700;

    /* JADX INFO: renamed from: ᵔٴ */
    public int f701;

    /* JADX INFO: renamed from: ﹳـ */
    public final Rect f702;

    static {
        f680 = new DecelerateInterpolator();
        Class<Float> r3 = Float.class;
        f679 = new C0098(r3, "alpha", 0);
        f677 = new C0098(r3, "diameter", 1);
        f678 = new C0098(r3, "translation_x", 2);
    }

    public PagingIndicator(Context r18, AttributeSet r19) {
        super(r18, r19, 0);
        AnimatorSet r6 = new AnimatorSet();
        Resources r7 = getResources();
        int[] r2 = AbstractC3966.f14612;
        TypedArray r4 = r18.obtainStyledAttributes(r19, r2, 0, 0);
        AbstractC3306.m6993(this, r18, r2, r19, r4, 0);
        int r1 = r4.getDimensionPixelOffset(6, getResources().getDimensionPixelOffset(R.dimen.u));
        this.f682 = r1;
        int r12 = r1 * 2;
        this.f696 = r12;
        int r3 = r4.getDimensionPixelOffset(2, getResources().getDimensionPixelOffset(R.dimen.u));
        this.f689 = r3;
        int r32 = r3 * 2;
        this.f697 = r32;
        this.f686 = r4.getDimensionPixelOffset(5, getResources().getDimensionPixelOffset(R.dimen.u));
        this.f695 = r4.getDimensionPixelOffset(4, getResources().getDimensionPixelOffset(R.dimen.u));
        int r5 = r4.getColor(3, getResources().getColor(R.color.u));
        Paint r10 = new Paint(1);
        this.f691 = r10;
        r10.setColor(r5);
        this.f692 = r4.getColor(0, getResources().getColor(R.color.u));
        if (this.f693 == null) goto L5;
    L7:
        r4.recycle();
        if (r7.getConfiguration().getLayoutDirection() != 0) goto L10;
        boolean r42 = true;
    L11:
        this.f683 = r42;
        int r43 = r7.getColor(R.color.u);
        int r52 = r7.getDimensionPixelSize(R.dimen.u);
        this.f688 = r52;
        Paint r102 = new Paint(1);
        this.f690 = r102;
        float r72 = r7.getDimensionPixelSize(R.dimen.u);
        r102.setShadowLayer(r52, r72, r72, r43);
        this.f681 = m544();
        this.f702 = new Rect(0, 0, this.f681.getWidth(), this.f681.getHeight());
        float r33 = r32;
        this.f687 = this.f681.getWidth() / r33;
        AnimatorSet r44 = new AnimatorSet();
        C0098 r103 = f679;
        ObjectAnimator r53 = ObjectAnimator.ofFloat(null, r103, new float[]{0.0f, 1.0f});
        r53.setDuration(167);
        DecelerateInterpolator r14 = f680;
        r53.setInterpolator(r14);
        float r13 = r12;
        C0098 r8 = f677;
        ObjectAnimator r15 = ObjectAnimator.ofFloat(null, r8, new float[]{r13, r33});
        r15.setDuration(417);
        r15.setInterpolator(r14);
        r44.playTogether(new Animator[]{r53, r15, m543()});
        AnimatorSet r54 = new AnimatorSet();
        ObjectAnimator r104 = ObjectAnimator.ofFloat(null, r103, new float[]{1.0f, 0.0f});
        r104.setDuration(167);
        r104.setInterpolator(r14);
        ObjectAnimator r16 = ObjectAnimator.ofFloat(null, r8, new float[]{r33, r13});
        r16.setDuration(417);
        r16.setInterpolator(r14);
        r54.playTogether(new Animator[]{r104, r16, m543()});
        r6.playTogether(new Animator[]{r44, r54});
        setLayerType(1, null);
        return;
    L10:
        r42 = false;
        goto L11
    L5:
        if (r4.hasValue(1) == false) goto L7;
        setArrowColor(r4.getColor(1, 0));
        goto L7
    }

    private int getDesiredHeight() {
        int r0 = getPaddingTop() + this.f697;
        return (getPaddingBottom() + r0) + this.f688;
    }

    private int getDesiredWidth() {
        int r0 = getPaddingLeft() + getRequiredWidth();
        return getPaddingRight() + r0;
    }

    private int getRequiredWidth() {
        return ((this.f701 - 3) * this.f686) + ((this.f695 * 2) + (this.f682 * 2));
    }

    private void setSelectedPage(int r2) {
        if (r2 != this.f685) goto L5;
        return;
    L5:
        this.f685 = r2;
        m546();
    }

    public int[] getDotSelectedLeftX() {
        return this.f698;
    }

    public int[] getDotSelectedRightX() {
        return this.f700;
    }

    public int[] getDotSelectedX() {
        return this.f694;
    }

    public int getPageCount() {
        return this.f701;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r11) {
        int r0 = 0;
    L4:
        if (r0 >= this.f701) goto L9;
        C0140 r1 = this.f699[r0];
        float r2 = r1.f987 + r1.f985;
        PagingIndicator r3 = r1.f986;
        int r4 = r3.f684;
        Paint r5 = r3.f690;
        r11.drawCircle(r2, r4, r1.f993, r3.f691);
        if (r1.f992 <= 0.0f) goto L8;
        r5.setColor(r1.f991);
        r11.drawCircle(r2, r3.f684, r1.f993, r5);
        Bitmap r42 = r3.f681;
        Rect r52 = r3.f702;
        float r12 = r1.f989;
        float r8 = r3.f684;
        r11.drawBitmap(r42, r52, new Rect((int) (r2 - r12), (int) (r8 - r12), (int) (r2 + r12), (int) (r8 + r12)), r3.f693);
    L8:
        r0 = r0 + 1;
        goto L4
    }

    @Override // android.view.View
    public final void onMeasure(int r5, int r6) {
        int r0 = getDesiredHeight();
        int r1 = View.MeasureSpec.getMode(r6);
        if (r1 == Integer.MIN_VALUE) goto L7;
        if (r1 != 1073741824) goto L8;
        r0 = View.MeasureSpec.getSize(r6);
    L8:
        int r62 = getDesiredWidth();
        int r12 = View.MeasureSpec.getMode(r5);
        if (r12 == Integer.MIN_VALUE) goto L13;
        if (r12 != 1073741824) goto L14;
        r62 = View.MeasureSpec.getSize(r5);
    L14:
        setMeasuredDimension(r62, r0);
        return;
    L13:
        r62 = Math.min(r62, View.MeasureSpec.getSize(r5));
        goto L14
    L7:
        r0 = Math.min(r0, View.MeasureSpec.getSize(r6));
        goto L8
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r5) {
        super.onRtlPropertiesChanged(r5);
        int r0 = 0;
        if (r5 != 0) goto L5;
        boolean r52 = true;
    L7:
        if (this.f683 == r52) goto L22;
        this.f683 = r52;
        this.f681 = m544();
        C0140[] r53 = this.f699;
        if (r53 == null) goto L17;
        int r1 = r53.length;
    L11:
        if (r0 >= r1) goto L17;
        C0140 r2 = r53[r0];
        if (r2.f986.f683 == false) goto L15;
        float r3 = 1.0f;
    L16:
        r2.f984 = r3;
        r0 = r0 + 1;
        goto L11
    L15:
        r3 = -1.0f;
    L17:
        m545();
        invalidate();
        return;
    L22:
        return;
    L5:
        r52 = false;
        goto L7
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        setMeasuredDimension(r1, r2);
        m545();
    }

    public void setArrowBackgroundColor(int r1) {
        this.f692 = r1;
    }

    public void setArrowColor(int r4) {
        if (this.f693 != null) goto L5;
        this.f693 = new Paint();
    L5:
        this.f693.setColorFilter(new PorterDuffColorFilter(r4, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int r2) {
        this.f691.setColor(r2);
    }

    public void setPageCount(int r4) {
        if (r4 <= 0) goto L10;
        this.f701 = r4;
        this.f699 = new C0140[r4];
        int r0 = 0;
    L5:
        if (r0 >= this.f701) goto L7;
        this.f699[r0] = new C0140(this);
        r0 = r0 + 1;
        goto L5
    L7:
        m545();
        setSelectedPage(0);
        return;
    L10:
        throw new IllegalArgumentException("The page count should be a positive integer");
    }

    /* JADX INFO: renamed from: ʽ */
    public final ObjectAnimator m543() {
        ObjectAnimator r0 = ObjectAnimator.ofFloat(null, f678, new float[]{(-this.f695) + this.f686, 0.0f});
        r0.setDuration(417);
        r0.setInterpolator(f680);
        return r0;
    }

    /* JADX INFO: renamed from: ˈ */
    public final Bitmap m544() {
        Bitmap r2 = BitmapFactory.decodeResource(getResources(), R.drawable.u);
        if (this.f683 == false) goto L5;
        return r2;
    L5:
        Matrix r7 = new Matrix();
        r7.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(r2, 0, 0, r2.getWidth(), r2.getHeight(), r7, false);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m545() {
        int r0 = getPaddingLeft();
        int r1 = getPaddingTop();
        int r2 = getWidth() - getPaddingRight();
        int r3 = getRequiredWidth();
        int r02 = (r0 + r2) / 2;
        int r22 = this.f701;
        int[] r4 = new int[r22];
        this.f694 = r4;
        int[] r5 = new int[r22];
        this.f698 = r5;
        int[] r23 = new int[r22];
        this.f700 = r23;
        boolean r6 = this.f683;
        int r7 = this.f682;
        int r8 = this.f695;
        int r9 = this.f686;
        int r10 = 1;
        if (r6 == false) goto L8;
        int r03 = r02 - (r3 / 2);
        r4[0] = ((r03 + r7) - r9) + r8;
        r5[0] = r03 + r7;
        r23[0] = (r8 * 2) + ((r03 + r7) - (r9 * 2));
    L6:
        if (r10 >= this.f701) goto L12;
        int[] r04 = this.f694;
        int[] r24 = this.f698;
        int r32 = r10 - 1;
        r04[r10] = r24[r32] + r8;
        r24[r10] = r24[r32] + r9;
        this.f700[r10] = r04[r32] + r8;
        r10 = r10 + 1;
    L12:
        this.f684 = r1 + this.f689;
        m546();
        return;
    L8:
        int r33 = (r3 / 2) + r02;
        r4[0] = ((r33 - r7) + r9) - r8;
        r5[0] = r33 - r7;
        r23[0] = ((r9 * 2) + (r33 - r7)) - (r8 * 2);
    L10:
        if (r10 >= this.f701) goto L12;
        int[] r05 = this.f694;
        int[] r25 = this.f698;
        int r34 = r10 - 1;
        r05[r10] = r25[r34] - r8;
        r25[r10] = r25[r34] - r9;
        this.f700[r10] = r05[r34] - r8;
        r10 = r10 + 1;
        goto L10
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m546() {
        int r0 = 0;
    L3:
        int r1 = this.f685;
        float r2 = -1.0f;
        if (r0 >= r1) goto L10;
        this.f699[r0].m648();
        C0140 r12 = this.f699[r0];
        if (r0 == 0) goto L9;
        r2 = 1.0f;
    L9:
        r12.f990 = r2;
        r12.f987 = this.f698[r0];
        r0 = r0 + 1;
        goto L3
    L10:
        C0140 r02 = this.f699[r1];
        r02.f985 = 0.0f;
        r02.f987 = 0.0f;
        PagingIndicator r13 = r02.f986;
        r02.f988 = r13.f697;
        float r4 = r13.f689;
        r02.f993 = r4;
        r02.f989 = r4 * r13.f687;
        r02.f992 = 1.0f;
        r02.m649();
        C0140[] r03 = this.f699;
        int r14 = this.f685;
        C0140 r04 = r03[r14];
        if (r14 > 0) goto L14;
        r2 = 1.0f;
    L14:
        r04.f990 = r2;
        r04.f987 = this.f694[r14];
    L15:
        r14 = r14 + 1;
        if (r14 >= this.f701) goto L18;
        this.f699[r14].m648();
        C0140 r05 = this.f699[r14];
        r05.f990 = 1.0f;
        r05.f987 = this.f700[r14];
        goto L15
    }
}
