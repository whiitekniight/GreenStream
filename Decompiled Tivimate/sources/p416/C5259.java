package p416;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p083.C2114;

/* JADX INFO: renamed from: ﹳʽ.ʼʼ */
/* JADX INFO: loaded from: classes.dex */
public final class C5259 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2114 f18958 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final HashMap f18959;

    static {
        f18958 = C2114.m5123(new byte[0]);
    }

    public C5259(HashMap r1) {
        this.f18959 = r1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final Iterable m10262(byte[] r5) {
        C2114 r0 = f18958;
        HashMap r1 = this.f18959;
        List r02 = (List) r1.get(r0);
        int r3 = 5;
        if (r5.length >= 5) goto L5;
        List r52 = null;
    L9:
        if (r02 != null) goto L13;
        if (r52 != null) goto L13;
        return new ArrayList();
    L13:
        if (r02 != null) goto L15;
        return r52;
    L15:
        if (r52 != null) goto L18;
        return r02;
    L18:
        return new C5266(r52, r02);
    L5:
        if (5 <= r5.length) goto L7;
        r3 = r5.length;
    L7:
        r52 = (List) r1.get(new C2114(r3, r5));
        goto L9
    }
}
