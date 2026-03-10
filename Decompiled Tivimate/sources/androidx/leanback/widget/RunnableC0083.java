package androidx.leanback.widget;

import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: renamed from: androidx.leanback.widget.ʻᵎ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0083 implements Runnable {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f838;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ SearchBar f839;

    public /* synthetic */ RunnableC0083(SearchBar r1, int r2) {
        this.f838 = r2;
        this.f839 = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f838) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        SearchBar r0 = this.f839;
        r0.f734.requestFocusFromTouch();
        r0.f734.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, r0.f734.getWidth(), r0.f734.getHeight(), 0));
        r0.f734.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, r0.f734.getWidth(), r0.f734.getHeight(), 0));
        return;
    L6:
        SearchBar r02 = this.f839;
        r02.setSearchQueryInternal(r02.f734.getText().toString());
    }
}
