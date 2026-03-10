package p148;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: ˉʿ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2712 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static void m5944(Window.Callback r0, List<KeyboardShortcutGroup> r1, Menu r2, int r3) {
        r0.onProvideKeyboardShortcuts(r1, r2, r3);
    }
}
