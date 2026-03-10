package p142;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ˈᵎ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2675 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final AtomicBoolean f9586 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Logger f9587 = null;

    static {
        f9587 = Logger.getLogger(AbstractC2675.class.getName());
        f9586 = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m5902() {
        if (f9586.get() == false) goto L6;
        return true;
    L6:
        return false;
    }
}
