package p149;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ˉˆ.ˆˎ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2740 {

    /* JADX INFO: renamed from: ʽ */
    public static final boolean f9801 = false;

    /* JADX INFO: renamed from: ⁱˊ */
    public static Method f9802;

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean f9803;

    static {
        if (Build.VERSION.SDK_INT < 27) goto L5;
        boolean r0 = true;
    L6:
        f9801 = r0;
        return;
    L5:
        r0 = false;
        goto L6
    }
}
