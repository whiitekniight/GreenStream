package p339;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: ᴵᵎ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC4544 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ʽʽ */
    public final int f16404;

    /* JADX INFO: renamed from: ʾˋ */
    public final Dialog f16405;

    /* JADX INFO: renamed from: ˈٴ */
    public final int f16406;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f16407;

    public ViewOnTouchListenerC4544(Dialog r2, Rect r3) {
        this.f16405 = r2;
        this.f16407 = r3.left;
        this.f16404 = r3.top;
        this.f16406 = ViewConfiguration.get(r2.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r6, MotionEvent r7) {
        View r0 = r6.findViewById(R.id.content);
        int r2 = r0.getLeft() + this.f16407;
        int r1 = r0.getWidth() + r2;
        int r4 = r0.getTop() + this.f16404;
        if (new RectF(r2, r4, r1, r0.getHeight() + r4).contains(r7.getX(), r7.getY()) == false) goto L5;
        return false;
    L5:
        MotionEvent r02 = MotionEvent.obtain(r7);
        if (r7.getAction() != 1) goto L9;
        r02.setAction(4);
    L9:
        if (Build.VERSION.SDK_INT >= 28) goto L11;
        r02.setAction(0);
        int r72 = this.f16406;
        r02.setLocation((-r72) - 1, (-r72) - 1);
    L11:
        r6.performClick();
        return this.f16405.onTouchEvent(r02);
    }
}
