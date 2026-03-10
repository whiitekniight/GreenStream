package p078;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import p099.AbstractC2234;

/* JADX INFO: renamed from: ʾˎ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2097 {

    /* JADX INFO: renamed from: ˈ */
    public static Integer f7385;

    /* JADX INFO: renamed from: ʽ */
    public ViewTreeObserverOnPreDrawListenerC2100 f7386;

    /* JADX INFO: renamed from: ⁱˊ */
    public final ArrayList f7387;

    /* JADX INFO: renamed from: ﹳٴ */
    public final View f7388;

    public C2097(View r2) {
        this.f7387 = new ArrayList();
        this.f7388 = r2;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m5108(int r2, int r3, int r4) {
        int r0 = r3 - r4;
        if (r0 <= 0) goto L5;
        return r0;
    L5:
        int r22 = r2 - r4;
        if (r22 <= 0) goto L8;
        return r22;
    L8:
        View r23 = this.f7388;
        if (r23.isLayoutRequested() == false) goto L11;
        return 0;
    L11:
        if (r3 == (-2)) goto L13;
        return 0;
    L13:
        if (Log.isLoggable("CustomViewTarget", 4) == true) goto L15;
    L15:
        Context r24 = r23.getContext();
        if (f7385 != null) goto L19;
        WindowManager r25 = (WindowManager) r24.getSystemService("window");
        AbstractC2234.m5422(r25, "Argument must not be null");
        Display r26 = r25.getDefaultDisplay();
        Point r32 = new Point();
        r26.getSize(r32);
        f7385 = Integer.valueOf(Math.max(r32.x, r32.y));
    L19:
        return f7385.intValue();
    }
}
