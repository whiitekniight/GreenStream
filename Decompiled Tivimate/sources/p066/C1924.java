package p066;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import ﹳٴ.ﹳٴ;

/* JADX INFO: renamed from: ʽᵢ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C1924 extends ﹳٴ {

    /* JADX INFO: renamed from: ᵎﹶ */
    public final /* synthetic */ int f6563;

    public /* synthetic */ C1924(int r1) {
        this.f6563 = r1;
    }

    /* JADX INFO: renamed from: ʼʼ */
    public final int m4924(View r2, ViewGroup.MarginLayoutParams r3) {
        switch(this.f6563) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        int r22 = r2.getMeasuredWidth();
        int r32 = r3.rightMargin;
    L6:
        return r22 + r32;
    L7:
        r22 = r2.getMeasuredWidth();
        r32 = r3.leftMargin;
        goto L6
    L8:
        r22 = r2.getMeasuredHeight();
        r32 = r3.bottomMargin;
        goto L6
    }

    /* JADX INFO: renamed from: ʾˋ */
    public final int m4925() {
        switch(this.f6563) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return 0;
    L6:
        return 2;
    L8:
        return 1;
    }

    /* JADX INFO: renamed from: ᴵˊ */
    public final ViewPropertyAnimator m4926(View r2, int r3) {
        switch(this.f6563) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return r2.animate().translationX(r3);
    L7:
        return r2.animate().translationX(-r3);
    L9:
        return r2.animate().translationY(r3);
    }
}
