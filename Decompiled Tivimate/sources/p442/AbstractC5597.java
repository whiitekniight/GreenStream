package p442;

import java.util.Collection;

/* JADX INFO: renamed from: ﹶˈ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5597 extends AbstractC5589 {
    /* JADX INFO: renamed from: ᐧᴵ */
    public static int m10775(Iterable r1, int r2) {
        if ((r1 instanceof Collection) == true) goto L5;
        return r2;
    L5:
        return ((Collection) r1).size();
    }
}
