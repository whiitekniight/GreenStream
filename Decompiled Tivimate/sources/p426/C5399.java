package p426;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ﹳי.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C5399 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final ʽ f19280;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f19281;

    public C5399(Set r1, ʽ r2) {
        this.f19281 = m10433(r1);
        this.f19280 = r2;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String m10433(Set r3) {
        StringBuilder r0 = new StringBuilder();
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L9;
        C5400 r1 = (C5400) r32.next();
        r0.append(r1.f19283);
        r0.append('/');
        r0.append(r1.f19282);
        if (r32.hasNext() == false) goto L4;
        r0.append(' ');
        goto L4
    L9:
        return r0.toString();
    }
}
