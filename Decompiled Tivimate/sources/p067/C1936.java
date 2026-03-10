package p067;

import java.util.Arrays;
import p317.AbstractC4195;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ʽⁱ.ʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C1936 {

    /* JADX INFO: renamed from: ʽ */
    public final boolean f6594;

    /* JADX INFO: renamed from: ˈ */
    public final int[] f6595;

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean[] f6596;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C1957 f6597;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f6598;

    static {
        AbstractC4195.m8513(0);
        AbstractC4195.m8513(1);
        AbstractC4195.m8513(3);
        AbstractC4195.m8513(4);
    }

    public C1936(C1957 r5, boolean r6, int[] r7, boolean[] r8) {
        int r0 = r5.f6712;
        this.f6598 = r0;
        boolean r2 = false;
        if (r0 == r7.length) goto L5;
    L7:
        boolean r1 = false;
    L8:
        AbstractC4214.m8560(r1);
        this.f6597 = r5;
        if (r6 == false) goto L12;
        if (r0 <= 1) goto L12;
        r2 = true;
    L12:
        this.f6594 = r2;
        this.f6595 = (int[]) r7.clone();
        this.f6596 = (boolean[]) r8.clone();
        return;
    L5:
        if (r0 != r8.length) goto L7;
        r1 = true;
        goto L8
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L19:
        return false;
    L8:
        if (C1936.class != r5.getClass()) goto L19;
        C1936 r52 = (C1936) r5;
        if (this.f6594 != r52.f6594) goto L19;
        if (this.f6597.equals(r52.f6597) == false) goto L19;
        if (Arrays.equals(this.f6595, r52.f6595) == false) goto L19;
        if (Arrays.equals(this.f6596, r52.f6596) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        int r0 = ((this.f6597.hashCode() * 31) + (this.f6594 ? 1 : 0)) * 31;
        int r1 = (Arrays.hashCode(this.f6595) + r0) * 31;
        return Arrays.hashCode(this.f6596) + r1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m4954(int r2) {
        if (this.f6595[r2] == 4) goto L6;
        return false;
    L6:
        return true;
    }
}
