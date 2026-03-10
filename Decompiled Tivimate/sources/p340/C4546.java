package p340;

import java.util.Comparator;

/* JADX INFO: renamed from: ᴵᵔ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C4546 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object r7, Object r8) {
        C4550 r72 = (C4550) r7;
        C4550 r82 = (C4550) r8;
        long r0 = r72.m8992();
        long r2 = r82.m8992();
        if (r0 != r2) goto L11;
        int r83 = r82.f16427;
        int r73 = r72.f16427;
        if ((r83 + r73) != 1) goto L9;
        return r73 - r83;
    L9:
        return r83 - r73;
    L11:
        if (r2 != (-1)) goto L14;
        return -1;
    L14:
        if (r0 != (-1)) goto L17;
    L18:
        return 1;
    L17:
        if ((r0 - r2) > 0) goto L18;
        return -1;
    }
}
