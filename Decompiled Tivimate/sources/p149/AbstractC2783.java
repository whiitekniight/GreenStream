package p149;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ˉˆ.ـᵎ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2783 {

    /* JADX INFO: renamed from: ʽ */
    public static final Method f9923 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final boolean f9924 = false;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Method f9925 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Method f9926 = null;

    static {
        Class r3 = Integer.TYPE;     // Catch: NoSuchMethodException -> L5
        Class r6 = Float.TYPE;     // Catch: NoSuchMethodException -> L5
        Method r1 = AbsListView.class.getDeclaredMethod("positionSelector", new Class[]{r3, View.class, Boolean.TYPE, r6, r6});     // Catch: NoSuchMethodException -> L5
        f9926 = r1;     // Catch: NoSuchMethodException -> L5
        r1.setAccessible(true);     // Catch: NoSuchMethodException -> L5
        Method r12 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{r3});     // Catch: NoSuchMethodException -> L5
        f9925 = r12;     // Catch: NoSuchMethodException -> L5
        r12.setAccessible(true);     // Catch: NoSuchMethodException -> L5
        Method r0 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{r3});     // Catch: NoSuchMethodException -> L5
        f9923 = r0;     // Catch: NoSuchMethodException -> L5
        r0.setAccessible(true);     // Catch: NoSuchMethodException -> L5
        f9924 = true;     // Catch: NoSuchMethodException -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }
}
