package p332;

import p025.C1405;
import p447.AbstractC5635;

/* JADX INFO: renamed from: ᴵˉ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4430 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final int f16194 = 0;

    static {
        Object r0 = AbstractC5635.m10864(System.getProperty("kotlinx.serialization.json.pool.size"));     // Catch: Throwable -> L4
    L7:
        if ((r0 instanceof C1405) == false) goto L9;
        r0 = null;
    L9:
        Integer r02 = (Integer) r0;
        if (r02 == null) goto L12;
        int r03 = r02.intValue();
    L13:
        f16194 = r03;
        return;
    L12:
        r03 = 2097152;
    L4:
        th = move-exception;
        r0 = new C1405(th);
        goto L7
    }
}
