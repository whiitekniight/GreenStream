package p149;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: ˉˆ.ʼـ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2722 implements Runnable {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f9717;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ AbstractViewOnTouchListenerC2766 f9718;

    public /* synthetic */ RunnableC2722(AbstractViewOnTouchListenerC2766 r1, int r2) {
        this.f9717 = r2;
        this.f9718 = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f9717) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        AbstractViewOnTouchListenerC2766 r0 = this.f9718;
        r0.m6039();
        View r1 = r0.f9875;
        if (r1.isEnabled() == true) goto L7;
        return;
    L7:
        if (r1.isLongClickable() == false) goto L10;
        return;
    L10:
        if (r0.mo5950() == false) goto L20;
        r1.getParent().requestDisallowInterceptTouchEvent(true);
        long r4 = SystemClock.uptimeMillis();
        MotionEvent r2 = MotionEvent.obtain(r4, r4, 3, 0.0f, 0.0f, 0);
        r1.onTouchEvent(r2);
        r2.recycle();
        r0.f9878 = true;
        return;
    L20:
        return;
    L14:
        ViewParent r02 = this.f9718.f9875.getParent();
        if (r02 == null) goto L21;
        r02.requestDisallowInterceptTouchEvent(true);
        return;
    }
}
