package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ar.tvplayer.p002tv.R;

/* JADX INFO: loaded from: classes.dex */
public class MediaNowPlayingView extends LinearLayout {

    /* JADX INFO: renamed from: ʽʽ */
    public final ImageView f665;

    /* JADX INFO: renamed from: ʾˋ */
    public final ImageView f666;

    /* JADX INFO: renamed from: ˈٴ */
    public final ObjectAnimator f667;

    /* JADX INFO: renamed from: ˊʻ */
    public final ObjectAnimator f668;

    /* JADX INFO: renamed from: ᴵˊ */
    public final ImageView f669;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final ObjectAnimator f670;

    public MediaNowPlayingView(Context r7, AttributeSet r8) {
        super(r7, r8);
        LinearInterpolator r82 = new LinearInterpolator();
        LayoutInflater.from(r7).inflate(R.layout.u, this, true);
        ImageView r72 = (ImageView) findViewById(R.id.u);
        this.f666 = r72;
        ImageView r0 = (ImageView) findViewById(R.id.u);
        this.f669 = r0;
        ImageView r1 = (ImageView) findViewById(R.id.u);
        this.f665 = r1;
        r72.setPivotY(r72.getDrawable().getIntrinsicHeight());
        r0.setPivotY(r0.getDrawable().getIntrinsicHeight());
        r1.setPivotY(r1.getDrawable().getIntrinsicHeight());
        setDropScale(r72);
        setDropScale(r0);
        setDropScale(r1);
        ObjectAnimator r73 = ObjectAnimator.ofFloat(r72, "scaleY", new float[]{0.41666666f, 0.25f, 0.41666666f, 0.5833333f, 0.75f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.5f, 0.33333334f, 0.16666667f, 0.33333334f, 0.5f, 0.5833333f, 0.75f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.41666666f, 0.25f, 0.33333334f, 0.41666666f});
        this.f667 = r73;
        r73.setRepeatCount(-1);
        r73.setDuration(2320);
        r73.setInterpolator(r82);
        ObjectAnimator r74 = ObjectAnimator.ofFloat(r0, "scaleY", new float[]{1.0f, 0.9166667f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.8333333f, 1.0f, 0.8333333f, 0.75f, 0.6666667f, 1.0f});
        this.f670 = r74;
        r74.setRepeatCount(-1);
        r74.setDuration(2080);
        r74.setInterpolator(r82);
        ObjectAnimator r75 = ObjectAnimator.ofFloat(r1, "scaleY", new float[]{0.6666667f, 0.75f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.5833333f, 0.6666667f, 0.75f, 1.0f, 0.9166667f, 1.0f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.6666667f});
        this.f668 = r75;
        r75.setRepeatCount(-1);
        r75.setDuration(2000);
        r75.setInterpolator(r82);
    }

    public static void setDropScale(View r1) {
        r1.setScaleY(0.083333336f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() != 0) goto L6;
        m542();
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m541();
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
        super.setVisibility(r2);
        if (r2 != 8) goto L6;
        m541();
        return;
    L6:
        m542();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m541() {
        ObjectAnimator r0 = this.f667;
        boolean r1 = r0.isStarted();
        ImageView r2 = this.f666;
        if (r1 == false) goto L5;
        r0.cancel();
        setDropScale(r2);
    L5:
        ObjectAnimator r02 = this.f670;
        boolean r12 = r02.isStarted();
        ImageView r3 = this.f669;
        if (r12 == false) goto L8;
        r02.cancel();
        setDropScale(r3);
    L8:
        ObjectAnimator r03 = this.f668;
        boolean r13 = r03.isStarted();
        ImageView r4 = this.f665;
        if (r13 == false) goto L11;
        r03.cancel();
        setDropScale(r4);
    L11:
        r2.setVisibility(8);
        r3.setVisibility(8);
        r4.setVisibility(8);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m542() {
        ObjectAnimator r0 = this.f667;
        if (r0.isStarted() == true) goto L5;
        r0.start();
    L5:
        ObjectAnimator r02 = this.f670;
        if (r02.isStarted() == true) goto L8;
        r02.start();
    L8:
        ObjectAnimator r03 = this.f668;
        if (r03.isStarted() == true) goto L11;
        r03.start();
    L11:
        this.f666.setVisibility(0);
        this.f669.setVisibility(0);
        this.f665.setVisibility(0);
    }
}
