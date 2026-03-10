package p149;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ˉˆ.י */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2775 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Field f9911 = null;

    static {
        Field r0 = null;
        r0 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");     // Catch: NoSuchFieldException -> L5
        r0.setAccessible(true);     // Catch: NoSuchFieldException -> L5
    L7:
        f9911 = r0;
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L7
    }
}
