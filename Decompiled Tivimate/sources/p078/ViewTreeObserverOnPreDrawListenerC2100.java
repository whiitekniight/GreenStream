package p078;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p411.C5234;

/* JADX INFO: renamed from: ʾˎ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2100 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f7389;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Object f7390;

    public ViewTreeObserverOnPreDrawListenerC2100(CoordinatorLayout r2) {
        this.f7389 = 2;
        this.f7390 = r2;
    }

    public ViewTreeObserverOnPreDrawListenerC2100(C2097 r2) {
        this.f7389 = 0;
        this.f7390 = new WeakReference(r2);
    }

    public ViewTreeObserverOnPreDrawListenerC2100(C2102 r2) {
        this.f7389 = 1;
        this.f7390 = new WeakReference(r2);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch(this.f7389) {
            case 0: goto L37;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        ((CoordinatorLayout) this.f7390).m101(0);
        return true;
    L7:
        if (Log.isLoggable("ViewTarget", 2) == false) goto L9;
        String r0 = "OnGlobalLayoutListener called attachStateListener=" + this;
    L9:
        C2102 r02 = (C2102) ((WeakReference) this.f7390).get();
        if (r02 == null) goto L68;
        ArrayList r1 = r02.f7397;
        View r2 = r02.f7398;
        if (r1.isEmpty() == true) goto L71;
        int r4 = r2.getPaddingRight() + r2.getPaddingLeft();
        ViewGroup.LayoutParams r3 = r2.getLayoutParams();
        int r5 = 0;
        if (r3 == null) goto L17;
        int r32 = r3.width;
    L18:
        int r33 = r02.m5110(r2.getWidth(), r32, r4);
        int r6 = r2.getPaddingBottom() + r2.getPaddingTop();
        ViewGroup.LayoutParams r42 = r2.getLayoutParams();
        if (r42 == null) goto L21;
        int r43 = r42.height;
    L22:
        int r44 = r02.m5110(r2.getHeight(), r43, r6);
        if (r33 > 0) goto L25;
        if (r33 == Integer.MIN_VALUE) goto L25;
        return true;
    L25:
        if (r44 > 0) goto L27;
        if (r44 == Integer.MIN_VALUE) goto L27;
        return true;
    L27:
        ArrayList r62 = new ArrayList(r1);
        int r7 = r62.size();
    L28:
        if (r5 >= r7) goto L30;
        Object r8 = r62.get(r5);
        r5 = r5 + 1;
        ((C5234) ((InterfaceC2098) r8)).m10216(r33, r44);
        goto L28
    L30:
        ViewTreeObserver r22 = r2.getViewTreeObserver();
        if (r22.isAlive() == false) goto L33;
        r22.removeOnPreDrawListener(r02.f7396);
    L33:
        r02.f7396 = null;
        r1.clear();
        return true;
    L21:
        r43 = 0;
        goto L22
    L17:
        r32 = 0;
        goto L18
    L71:
        return true;
    L68:
        return true;
    L37:
        if (Log.isLoggable("CustomViewTarget", 2) == false) goto L39;
        String r03 = "OnGlobalLayoutListener called attachStateListener=" + this;
    L39:
        C2097 r04 = (C2097) ((WeakReference) this.f7390).get();
        if (r04 == null) goto L72;
        ArrayList r12 = r04.f7387;
        View r23 = r04.f7388;
        if (r12.isEmpty() == true) goto L75;
        int r45 = r23.getPaddingRight() + r23.getPaddingLeft();
        ViewGroup.LayoutParams r34 = r23.getLayoutParams();
        int r52 = 0;
        if (r34 == null) goto L47;
        int r35 = r34.width;
    L48:
        int r36 = r04.m5108(r23.getWidth(), r35, r45);
        int r63 = r23.getPaddingBottom() + r23.getPaddingTop();
        ViewGroup.LayoutParams r46 = r23.getLayoutParams();
        if (r46 == null) goto L51;
        int r47 = r46.height;
    L52:
        int r48 = r04.m5108(r23.getHeight(), r47, r63);
        if (r36 > 0) goto L55;
        if (r36 == Integer.MIN_VALUE) goto L55;
        return true;
    L55:
        if (r48 > 0) goto L57;
        if (r48 == Integer.MIN_VALUE) goto L57;
        return true;
    L57:
        ArrayList r64 = new ArrayList(r12);
        int r72 = r64.size();
    L58:
        if (r52 >= r72) goto L60;
        Object r82 = r64.get(r52);
        r52 = r52 + 1;
        ((C5234) ((InterfaceC2098) r82)).m10216(r36, r48);
        goto L58
    L60:
        ViewTreeObserver r24 = r23.getViewTreeObserver();
        if (r24.isAlive() == false) goto L63;
        r24.removeOnPreDrawListener(r04.f7386);
    L63:
        r04.f7386 = null;
        r12.clear();
        return true;
    L51:
        r47 = 0;
        goto L52
    L47:
        r35 = 0;
        goto L48
    L75:
        return true;
    L72:
        return true;
    }
}
