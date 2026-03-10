package p029;

import java.util.Comparator;

/* JADX INFO: renamed from: ʼʻ.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public final class C1437 extends AbstractC1483 {
    /* JADX INFO: renamed from: ﾞᴵ */
    public static AbstractC1483 m3952(int r0) {
        if (r0 < 0) goto L4;
        if (r0 <= 0) goto L9;
        return AbstractC1483.f4930;
    L9:
        return AbstractC1483.f4932;
    L4:
        return AbstractC1483.f4931;
    }

    @Override // p029.AbstractC1483
    /* JADX INFO: renamed from: ʽ */
    public final AbstractC1483 mo3936(boolean r1, boolean r2) {
        return m3952(Boolean.compare(r1, r2));
    }

    @Override // p029.AbstractC1483
    /* JADX INFO: renamed from: ˈ */
    public final AbstractC1483 mo3937(boolean r1, boolean r2) {
        return m3952(Boolean.compare(r2, r1));
    }

    @Override // p029.AbstractC1483
    /* JADX INFO: renamed from: ˑﹳ */
    public final int mo3938() {
        return 0;
    }

    @Override // p029.AbstractC1483
    /* JADX INFO: renamed from: ⁱˊ */
    public final AbstractC1483 mo3939(Object r1, Object r2, Comparator r3) {
        return m3952(r3.compare(r1, r2));
    }

    @Override // p029.AbstractC1483
    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractC1483 mo3940(int r1, int r2) {
        return m3952(Integer.compare(r1, r2));
    }
}
