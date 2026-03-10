package p056;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ar.tvplayer.p002tv.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import p149.C2795;
import p248.AbstractC3683;
import ˉᵎ.ⁱˊ;
import ﹳˋ.ʽʽ;

/* JADX INFO: renamed from: ʽˊ.יـ */
/* JADX INFO: loaded from: classes.dex */
public final class C1819 {

    /* JADX INFO: renamed from: ʻٴ */
    public ColorStateList f6073;

    /* JADX INFO: renamed from: ʼʼ */
    public C2795 f6074;

    /* JADX INFO: renamed from: ʼˎ */
    public LinearLayout f6075;

    /* JADX INFO: renamed from: ʼᐧ */
    public CharSequence f6076;

    /* JADX INFO: renamed from: ʽ */
    public final int f6077;

    /* JADX INFO: renamed from: ʽﹳ */
    public int f6078;

    /* JADX INFO: renamed from: ʾˋ */
    public ColorStateList f6079;

    /* JADX INFO: renamed from: ʾᵎ */
    public boolean f6080;

    /* JADX INFO: renamed from: ˆʾ */
    public int f6081;

    /* JADX INFO: renamed from: ˈ */
    public final TimeInterpolator f6082;

    /* JADX INFO: renamed from: ˉʿ */
    public final float f6083;

    /* JADX INFO: renamed from: ˉˆ */
    public int f6084;

    /* JADX INFO: renamed from: ˏי */
    public int f6085;

    /* JADX INFO: renamed from: ˑﹳ */
    public final TimeInterpolator f6086;

    /* JADX INFO: renamed from: יـ */
    public CharSequence f6087;

    /* JADX INFO: renamed from: ـˆ */
    public CharSequence f6088;

    /* JADX INFO: renamed from: ٴﹶ */
    public FrameLayout f6089;

    /* JADX INFO: renamed from: ᴵˊ */
    public Typeface f6090;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final Context f6091;

    /* JADX INFO: renamed from: ᵔʾ */
    public int f6092;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final TextInputLayout f6093;

    /* JADX INFO: renamed from: ᵔﹳ */
    public boolean f6094;

    /* JADX INFO: renamed from: ᵢˏ */
    public int f6095;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f6096;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f6097;

    /* JADX INFO: renamed from: ﹳᐧ */
    public C2795 f6098;

    /* JADX INFO: renamed from: ﾞʻ */
    public AnimatorSet f6099;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final TimeInterpolator f6100;

    public C1819(TextInputLayout r4) {
        Context r0 = r4.getContext();
        this.f6091 = r0;
        this.f6093 = r4;
        this.f6083 = r0.getResources().getDimensionPixelSize(R.dimen.u);
        this.f6097 = ʽʽ.ʻٴ(r0, R.attr.u, 217);
        this.f6096 = ʽʽ.ʻٴ(r0, R.attr.u, 167);
        this.f6077 = ʽʽ.ʻٴ(r0, R.attr.u, 167);
        this.f6082 = ʽʽ.ـˆ(r0, R.attr.u, AbstractC3683.f13186);
        LinearInterpolator r42 = AbstractC3683.f13188;
        this.f6086 = ʽʽ.ـˆ(r0, R.attr.u, r42);
        this.f6100 = ʽʽ.ـˆ(r0, R.attr.u, r42);
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final void m4702(int r17, int r18, boolean r19) {
        C1819 r0 = this;
        if (r17 != r18) goto L6;
        return;
    L6:
        if (r19 == false) goto L11;
        AnimatorSet r9 = new AnimatorSet();
        r0.f6099 = r9;
        ArrayList r1 = new ArrayList();
        r0.m4704(r1, r0.f6080, r0.f6074, 2, r17, r18);
        r0.m4704(r1, r0.f6094, r0.f6098, 1, r17, r18);
        int r2 = r1.size();
        long r3 = 0;
        int r5 = 0;
    L8:
        if (r5 >= r2) goto L10;
        Animator r10 = (Animator) r1.get(r5);
        r3 = Math.max(r3, r10.getDuration() + r10.getStartDelay());
        r5 = r5 + 1;
        goto L8
    L10:
        ValueAnimator r22 = ValueAnimator.ofInt(new int[]{0, 0});
        r22.setDuration(r3);
        r1.add(0, r22);
        r9.playTogether(r1);
        C1830 r02 = new C1830(this, r18, m4705(r17), r17, r0.m4705(r18));
        r0 = this;
        r9.addListener(r02);
        r9.start();
    L24:
        TextInputLayout r12 = r0.f6093;
        r12.m2491();
        r12.m2494(r19, false);
        r12.m2500();
        return;
    L11:
        if (r17 == r18) goto L24;
        if (r18 == 0) goto L17;
        TextView r13 = r0.m4705(r18);
        if (r13 == null) goto L17;
        r13.setVisibility(0);
        r13.setAlpha(1.0f);
    L17:
        if (r17 == 0) goto L23;
        TextView r14 = m4705(r17);
        if (r14 == null) goto L23;
        r14.setVisibility(4);
        if (r17 != 1) goto L23;
        r14.setText(null);
    L23:
        r0.f6092 = r18;
        goto L24
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m4703() {
        AnimatorSet r0 = this.f6099;
        if (r0 == null) goto L6;
        r0.cancel();
        return;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m4704(ArrayList r8, boolean r9, C2795 r10, int r11, int r12, int r13) {
        if (r10 == null) goto L32;
        if (r9 == false) goto L36;
        if (r11 == r13) goto L8;
        if (r11 == r12) goto L8;
        return;
    L8:
        if (r13 != r11) goto L10;
        boolean r1 = true;
    L12:
        if (r1 == false) goto L14;
        float r3 = 1.0f;
    L15:
        ObjectAnimator r32 = ObjectAnimator.ofFloat(r10, View.ALPHA, new float[]{r3});
        int r4 = this.f6077;
        if (r1 == false) goto L18;
        long r5 = this.f6096;
    L19:
        r32.setDuration(r5);
        if (r1 == false) goto L22;
        TimeInterpolator r14 = this.f6086;
    L23:
        r32.setInterpolator(r14);
        if (r11 != r13) goto L27;
        if (r12 == 0) goto L27;
        r32.setStartDelay(r4);
    L27:
        r8.add(r32);
        if (r13 != r11) goto L34;
        if (r12 == 0) goto L35;
        ObjectAnimator r92 = ObjectAnimator.ofFloat(r10, View.TRANSLATION_Y, new float[]{-this.f6083, 0.0f});
        r92.setDuration(this.f6097);
        r92.setInterpolator(this.f6082);
        r92.setStartDelay(r4);
        r8.add(r92);
        return;
    L35:
        return;
    L34:
        return;
    L22:
        r14 = this.f6100;
        goto L23
    L18:
        r5 = r4;
        goto L19
    L14:
        r3 = 0.0f;
        goto L15
    L10:
        r1 = false;
        goto L12
    L36:
        return;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final TextView m4705(int r2) {
        if (r2 == 1) goto L11;
        if (r2 == 2) goto L9;
        return null;
    L9:
        return this.f6074;
    L11:
        return this.f6098;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m4706(C2795 r3, int r4) {
        LinearLayout r0 = this.f6075;
        if (r0 != null) goto L6;
        return;
    L6:
        if (r4 == 0) goto L8;
        if (r4 == 1) goto L8;
    L11:
        r0.removeView(r3);
    L12:
        int r32 = this.f6081 - 1;
        this.f6081 = r32;
        LinearLayout r42 = this.f6075;
        if (r32 != 0) goto L16;
        r42.setVisibility(8);
        return;
    L16:
        return;
    L8:
        FrameLayout r43 = this.f6089;
        if (r43 == null) goto L11;
        r43.removeView(r3);
        goto L12
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final boolean m4707(C2795 r3, CharSequence r4) {
        TextInputLayout r0 = this.f6093;
        if (r0.isLaidOut() == true) goto L5;
        return false;
    L5:
        if (r0.isEnabled() == true) goto L7;
        return false;
    L7:
        if (this.f6084 != this.f6092) goto L11;
        if (r3 != null) goto L10;
        return true;
    L10:
        if (TextUtils.equals(r3.getText(), r4) == true) goto L18;
        return true;
    L18:
        return false;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m4708() {
        if (this.f6075 == null) goto L17;
        TextInputLayout r0 = this.f6093;
        if (r0.getEditText() == null) goto L18;
        EditText r02 = r0.getEditText();
        Context r1 = this.f6091;
        boolean r2 = ⁱˊ.ᴵᵔ(r1);
        LinearLayout r3 = this.f6075;
        int r4 = r02.getPaddingStart();
        if (r2 == false) goto L9;
        r4 = r1.getResources().getDimensionPixelSize(R.dimen.u);
    L9:
        int r6 = r1.getResources().getDimensionPixelSize(R.dimen.u);
        if (r2 == false) goto L12;
        r6 = r1.getResources().getDimensionPixelSize(R.dimen.u);
    L12:
        int r03 = r02.getPaddingEnd();
        if (r2 == false) goto L15;
        r03 = r1.getResources().getDimensionPixelSize(R.dimen.u);
    L15:
        r3.setPaddingRelative(r4, r6, r03, 0);
        return;
    L18:
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m4709(C2795 r7, int r8) {
        if (this.f6075 != null) goto L10;
        if (this.f6089 != null) goto L10;
        Context r3 = this.f6091;
        LinearLayout r0 = new LinearLayout(r3);
        this.f6075 = r0;
        r0.setOrientation(0);
        LinearLayout r02 = this.f6075;
        TextInputLayout r5 = this.f6093;
        r5.addView(r02, -1, -2);
        this.f6089 = new FrameLayout(r3);
        this.f6075.addView(this.f6089, new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (r5.getEditText() == null) goto L10;
        m4708();
    L10:
        if (r8 == 0) goto L14;
        if (r8 == 1) goto L14;
        this.f6075.addView(r7, new LinearLayout.LayoutParams(-2, -2));
    L15:
        this.f6075.setVisibility(0);
        this.f6081++;
        return;
    L14:
        this.f6089.setVisibility(0);
        this.f6089.addView(r7);
        goto L15
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m4710() {
        this.f6076 = null;
        m4703();
        if (this.f6092 == 1) goto L5;
    L10:
        m4702(this.f6092, this.f6084, m4707(this.f6098, ""));
        return;
    L5:
        if (this.f6080 == true) goto L7;
    L9:
        this.f6084 = 0;
        goto L10
    L7:
        if (TextUtils.isEmpty(this.f6088) == true) goto L9;
        this.f6084 = 2;
        goto L10
    }
}
