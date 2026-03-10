package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import ar.tvplayer.p002tv.R;

/* JADX INFO: loaded from: classes.dex */
class MediaRowFocusView extends View {

    /* JADX INFO: renamed from: ʽʽ */
    public int f671;

    /* JADX INFO: renamed from: ʾˋ */
    public final Paint f672;

    /* JADX INFO: renamed from: ᴵˊ */
    public final RectF f673;

    public MediaRowFocusView(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.f673 = new RectF();
        Paint r32 = new Paint();
        r32.setColor(r2.getResources().getColor(R.color.u));
        this.f672 = r32;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r6) {
        super.onDraw(r6);
        int r0 = getHeight() / 2;
        this.f671 = r0;
        int r02 = ((r0 * 2) - getHeight()) / 2;
        float r1 = -r02;
        float r2 = getWidth();
        float r03 = getHeight() + r02;
        RectF r3 = this.f673;
        r3.set(0.0f, r1, r2, r03);
        int r04 = this.f671;
        r6.drawRoundRect(r3, r04, r04, this.f672);
    }
}
