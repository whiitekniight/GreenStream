package p078;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;
import p099.AbstractC2234;

/* JADX INFO: renamed from: ʾˎ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C2102 {

    /* JADX INFO: renamed from: ˈ */
    public static Integer f7395;

    /* JADX INFO: renamed from: ʽ */
    public ViewTreeObserverOnPreDrawListenerC2100 f7396;

    /* JADX INFO: renamed from: ⁱˊ */
    public final ArrayList f7397;

    /* JADX INFO: renamed from: ﹳٴ */
    public final View f7398;

    public C2102(ImageView r2) {
        this.f7397 = new ArrayList();
        this.f7398 = r2;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m5110(int r2, int r3, int r4) {
        int r0 = r3 - r4;
        if (r0 <= 0) goto L5;
        return r0;
    L5:
        int r22 = r2 - r4;
        if (r22 <= 0) goto L8;
        return r22;
    L8:
        View r23 = this.f7398;
        if (r23.isLayoutRequested() == false) goto L11;
        return 0;
    L11:
        if (r3 == (-2)) goto L13;
        return 0;
    L13:
        if (Log.isLoggable("ViewTarget", 4) == true) goto L15;
    L15:
        Context r24 = r23.getContext();
        if (f7395 != null) goto L19;
        WindowManager r25 = (WindowManager) r24.getSystemService("window");
        AbstractC2234.m5422(r25, "Argument must not be null");
        Display r26 = r25.getDefaultDisplay();
        Point r32 = new Point();
        r26.getSize(r32);
        f7395 = Integer.valueOf(Math.max(r32.x, r32.y));
    L19:
        return f7395.intValue();
    }
}
