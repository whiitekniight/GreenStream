package p450;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import p162.InterfaceC2900;

/* JADX INFO: renamed from: ﹶٴ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5659 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final InterfaceC2900[] f20425 = null;

    static {
        f20425 = new InterfaceC2900[0];
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final void m10874(int r3, int r4, InterfaceC2900 r5) {
        ArrayList r0 = new ArrayList();
        int r32 = (~r3) & r4;
        int r1 = 0;
    L4:
        if (r1 >= 32) goto L9;
        if ((r32 & 1) == 0) goto L8;
        r0.add(r5.mo6234(r1));
    L8:
        r32 = r32 >>> 1;
        r1 = r1 + 1;
        goto L4
    L9:
        String r52 = r5.mo6236();
        if (r0.size() != 1) goto L12;
        String r42 = "Field '" + ((String) r0.get(0)) + "' is required for type with serial name '" + r52 + "', but it was missing";
    L14:
        throw new MissingFieldException(r0, r42, null);
    L12:
        r42 = "Fields " + r0 + " are required for type with serial name '" + r52 + "', but they were missing";
        goto L14
    }
}
