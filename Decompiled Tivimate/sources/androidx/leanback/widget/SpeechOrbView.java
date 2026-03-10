package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import ar.tvplayer.p002tv.R;

/* JADX INFO: loaded from: classes.dex */
public class SpeechOrbView extends SearchOrbView {

    /* JADX INFO: renamed from: ˈⁱ */
    public C0117 f776;

    /* JADX INFO: renamed from: ˉـ */
    public boolean f777;

    /* JADX INFO: renamed from: ـˏ */
    public final float f778;

    /* JADX INFO: renamed from: ᴵˑ */
    public int f779;

    /* JADX INFO: renamed from: ﹳـ */
    public C0117 f780;

    public SpeechOrbView(Context r5, AttributeSet r6) {
        super(r5, r6, 0);
        this.f779 = 0;
        this.f777 = false;
        Resources r52 = r5.getResources();
        this.f778 = r52.getFraction(R.fraction.u, 1, 1);
        this.f776 = new C0117(r52.getColor(R.color.u), r52.getColor(R.color.u), r52.getColor(R.color.u));
        this.f780 = new C0117(r52.getColor(R.color.u), r52.getColor(R.color.u), 0);
        m556();
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
        return R.layout.lb_speech_orb;
    }

    public void setListeningOrbColors(C0117 r1) {
        this.f780 = r1;
    }

    public void setNotListeningOrbColors(C0117 r1) {
        this.f776 = r1;
    }

    public void setSoundLevel(int r2) {
        if (this.f777 == true) goto L5;
        return;
    L5:
        int r0 = this.f779;
        if (r2 <= r0) goto L8;
        this.f779 = ((r2 - r0) / 2) + r0;
    L9:
        float r22 = (((this.f778 - getFocusedZoom()) * this.f779) / 100.0f) + 1.0f;
        View r02 = this.f744;
        r02.setScaleX(r22);
        r02.setScaleY(r22);
        return;
    L8:
        this.f779 = (int) (r0 * 0.7f);
        goto L9
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m556() {
        setOrbColors(this.f776);
        setOrbIcon(getResources().getDrawable(R.drawable.u));
        m554(hasFocus());
        View r0 = this.f744;
        r0.setScaleX(1.0f);
        r0.setScaleY(1.0f);
        this.f777 = false;
    }
}
