package p148;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* JADX INFO: renamed from: ˉʿ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2707 {
    /* JADX INFO: renamed from: ⁱˊ */
    public static ActionMode m5938(Window.Callback r0, ActionMode.Callback r1, int r2) {
        return r0.onWindowStartingActionMode(r1, r2);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m5939(Window.Callback r0, SearchEvent r1) {
        return r0.onSearchRequested(r1);
    }
}
