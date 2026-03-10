package p047;

import java.util.Collections;
import java.util.Set;
import p442.C5596;

/* JADX INFO: renamed from: ʼﾞ.ـˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C1709 {

    /* JADX INFO: renamed from: ʽ */
    public final String[] f5679;

    /* JADX INFO: renamed from: ˈ */
    public final Set f5680;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int[] f5681;

    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractC1683 f5682;

    public C1709(AbstractC1683 r1, int[] r2, String[] r3) {
        this.f5682 = r1;
        this.f5681 = r2;
        this.f5679 = r3;
        if (r2.length != r3.length) goto L14;
        if (r3.length != 0) goto L7;
        boolean r12 = true;
    L8:
        if (r12 == true) goto L10;
        Set r13 = Collections.singleton(r3[0]);
    L11:
        this.f5680 = r13;
        return;
    L10:
        r13 = C5596.f20159;
        goto L11
    L7:
        r12 = false;
        goto L8
    L14:
        throw new IllegalStateException("Check failed.");
    }
}
