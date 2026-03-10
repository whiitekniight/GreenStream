package p242;

import android.os.Build;

/* JADX INFO: renamed from: ˑʿ.ˈٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3639 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final boolean f13024 = false;

    static {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        boolean r0 = true;
    L6:
        f13024 = r0;
        return;
    L5:
        r0 = false;
        goto L6
    }
}
