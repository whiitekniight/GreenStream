package p382;

import android.os.Build;

/* JADX INFO: renamed from: ᵢˆ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4993 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final int f17810 = 0;

    static {
        if (Build.VERSION.SDK_INT < 31) goto L5;
        int r0 = 33554432;
    L6:
        f17810 = r0;
        return;
    L5:
        r0 = 0;
        goto L6
    }
}
