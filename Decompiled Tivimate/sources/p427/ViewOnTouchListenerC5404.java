package p427;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import p149.C2732;
import p198.AbstractC3306;
import p421.RunnableC5331;

/* JADX INFO: renamed from: ﹳـ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC5404 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ˊˋ */
    public static final int f19290 = 0;

    /* JADX INFO: renamed from: ʽʽ */
    public final C2732 f19291;

    /* JADX INFO: renamed from: ʾˋ */
    public final C5409 f19292;

    /* JADX INFO: renamed from: ˆﾞ */
    public boolean f19293;

    /* JADX INFO: renamed from: ˈʿ */
    public boolean f19294;

    /* JADX INFO: renamed from: ˈٴ */
    public RunnableC5331 f19295;

    /* JADX INFO: renamed from: ˉٴ */
    public final int f19296;

    /* JADX INFO: renamed from: ˊʻ */
    public final float[] f19297;

    /* JADX INFO: renamed from: ˋᵔ */
    public final C2732 f19298;

    /* JADX INFO: renamed from: ˑٴ */
    public boolean f19299;

    /* JADX INFO: renamed from: ٴʼ */
    public final float[] f19300;

    /* JADX INFO: renamed from: ٴᵢ */
    public final int f19301;

    /* JADX INFO: renamed from: ᴵˊ */
    public final AccelerateInterpolator f19302;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final float[] f19303;

    /* JADX INFO: renamed from: ᵎˊ */
    public final float[] f19304;

    /* JADX INFO: renamed from: ᵎⁱ */
    public final float[] f19305;

    /* JADX INFO: renamed from: ᵔי */
    public boolean f19306;

    /* JADX INFO: renamed from: ᵔٴ */
    public boolean f19307;

    static {
        f19290 = ViewConfiguration.getTapTimeout();
    }

    public ViewOnTouchListenerC5404(C2732 r12) {
        C5409 r0 = new C5409();
        r0.f19312 = Long.MIN_VALUE;
        r0.f19313 = -1;
        r0.f19317 = 0;
        this.f19292 = r0;
        this.f19302 = new AccelerateInterpolator();
        float[] r2 = {0.0f, 0.0f};
        this.f19303 = r2;
        float[] r3 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f19297 = r3;
        float[] r4 = {0.0f, 0.0f};
        this.f19305 = r4;
        float[] r5 = {0.0f, 0.0f};
        this.f19300 = r5;
        float[] r1 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f19304 = r1;
        this.f19291 = r12;
        float r7 = ((int) ((1575.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f)) / 1000.0f;
        r1[0] = r7;
        r1[1] = r7;
        float r13 = ((int) ((r6 * 315.0f) + 0.5f)) / 1000.0f;
        r5[0] = r13;
        r5[1] = r13;
        this.f19301 = 1;
        r3[0] = Float.MAX_VALUE;
        r3[1] = Float.MAX_VALUE;
        r2[0] = 0.2f;
        r2[1] = 0.2f;
        r4[0] = 0.001f;
        r4[1] = 0.001f;
        this.f19296 = f19290;
        r0.f19316 = 500;
        r0.f19315 = 500;
        this.f19298 = r12;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static float m10438(float r1, float r2, float r3) {
        if (r1 <= r3) goto L6;
        return r3;
    L6:
        if (r1 >= r2) goto L8;
        return r2;
    L8:
        return r1;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r8, MotionEvent r9) {
        if (this.f19299 == false) goto L30;
        int r0 = r9.getActionMasked();
        int r2 = 1;
        if (r0 == 0) goto L15;
        if (r0 != 1) goto L9;
    L13:
        m10440();
        return false;
    L9:
        if (r0 != 2) goto L11;
    L16:
        float r02 = r9.getX();
        float r3 = r8.getWidth();
        C2732 r4 = this.f19291;
        float r03 = m10442(r02, r3, r4.getWidth(), 0);
        float r82 = m10442(r9.getY(), r8.getHeight(), r4.getHeight(), 1);
        C5409 r92 = this.f19292;
        r92.f19310 = r03;
        r92.f19311 = r82;
        if (this.f19294 == true) goto L30;
        if (m10441() == false) goto L30;
        if (this.f19295 != null) goto L23;
        this.f19295 = new RunnableC5331(r2, this);
    L23:
        this.f19294 = true;
        this.f19293 = true;
        if (this.f19306 == true) goto L28;
        int r83 = this.f19296;
        if (r83 <= 0) goto L28;
        RunnableC5331 r93 = this.f19295;
        long r5 = r83;
        WeakHashMap r84 = AbstractC3306.f11545;
        r4.postOnAnimationDelayed(r93, r5);
    L29:
        this.f19306 = true;
    L28:
        this.f19295.run();
        goto L29
    L11:
        if (r0 == 3) goto L13;
    L15:
        this.f19307 = true;
        this.f19306 = false;
    L30:
        return false;
    }

    /* JADX INFO: renamed from: ʽ */
    public final float m10439(float r6, float r7) {
        if (r7 == 0.0f) goto L25;
        int r2 = this.f19301;
        if (r2 == 0) goto L16;
        if (r2 == 1) goto L16;
        if (r2 != 2) goto L25;
        if (r6 >= 0.0f) goto L25;
        return r6 / (-r7);
    L16:
        if (r6 >= r7) goto L25;
        if (r6 < 0.0f) goto L22;
        return 1.0f - (r6 / r7);
    L22:
        if (this.f19294 == false) goto L25;
        if (r2 != 1) goto L25;
        return 1.0f;
    L25:
        return 0.0f;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m10440() {
        int r1 = 0;
        if (this.f19293 == false) goto L6;
        this.f19294 = false;
        return;
    L6:
        long r2 = AnimationUtils.currentAnimationTimeMillis();
        C5409 r0 = this.f19292;
        int r4 = (int) (r2 - r0.f19312);
        int r5 = r0.f19315;
        if (r4 <= r5) goto L9;
        r1 = r5;
    L12:
        r0.f19309 = r1;
        r0.f19314 = r0.m10445(r2);
        r0.f19313 = r2;
        return;
    L9:
        if (r4 < 0) goto L12;
        r1 = r4;
        goto L12
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean m10441() {
        C5409 r0 = this.f19292;
        float r1 = r0.f19311;
        int r12 = (int) (r1 / Math.abs(r1));
        Math.abs(r0.f19310);
        if (r12 == 0) goto L19;
        C2732 r2 = this.f19298;
        int r3 = r2.getCount();
        if (r3 == 0) goto L19;
        int r4 = r2.getChildCount();
        int r5 = r2.getFirstVisiblePosition();
        int r6 = r5 + r4;
        if (r12 <= 0) goto L13;
        if (r6 >= r3) goto L11;
    L18:
        return true;
    L11:
        if (r2.getChildAt(r4 - 1).getBottom() > r2.getHeight()) goto L18;
    L13:
        if (r12 >= 0) goto L19;
        if (r5 > 0) goto L18;
        if (r2.getChildAt(0).getTop() < 0) goto L18;
    L19:
        return false;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final float m10442(float r4, float r5, float r6, int r7) {
        float r0 = m10438(this.f19303[r7] * r5, 0.0f, this.f19297[r7]);
        float r42 = m10439(r5 - r4, r0) - m10439(r4, r0);
        AccelerateInterpolator r02 = this.f19302;
        if (r42 >= 0.0f) goto L6;
        float r43 = -r02.getInterpolation(-r42);
    L8:
        float r44 = m10438(r43, -1.0f, 1.0f);
    L11:
        if (r44 != 0.0f) goto L13;
        return 0.0f;
    L13:
        float r03 = this.f19305[r7];
        float r1 = this.f19300[r7];
        float r72 = this.f19304[r7];
        float r04 = r03 * r6;
        if (r44 <= 0.0f) goto L18;
        return m10438(r44 * r04, r1, r72);
    L18:
        return -m10438((-r44) * r04, r1, r72);
    L6:
        if (r42 <= 0.0f) goto L9;
        r43 = r02.getInterpolation(r42);
        goto L8
    L9:
        r44 = 0.0f;
        goto L11
    }
}
