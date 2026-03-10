package p106;

import java.util.Arrays;

/* JADX INFO: renamed from: ˆʻ.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C2348 extends AbstractC2346 {

    /* JADX INFO: renamed from: ʽ */
    public final int f8429;

    /* JADX INFO: renamed from: ˈ */
    public final int f8430;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int[] f8431;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f8432;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final int[] f8433;

    public C2348(int r2, int r3, int r4, int[] r5, int[] r6) {
        super("MLLT");
        this.f8432 = r2;
        this.f8429 = r3;
        this.f8430 = r4;
        this.f8431 = r5;
        this.f8433 = r6;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L21:
        return false;
    L8:
        if (C2348.class != r5.getClass()) goto L21;
        C2348 r52 = (C2348) r5;
        if (this.f8432 != r52.f8432) goto L21;
        if (this.f8429 != r52.f8429) goto L21;
        if (this.f8430 != r52.f8430) goto L21;
        if (Arrays.equals(this.f8431, r52.f8431) == false) goto L21;
        if (Arrays.equals(this.f8433, r52.f8433) == false) goto L21;
        return true;
    }

    public final int hashCode() {
        int r0 = (((((527 + this.f8432) * 31) + this.f8429) * 31) + this.f8430) * 31;
        int r1 = (Arrays.hashCode(this.f8431) + r0) * 31;
        return Arrays.hashCode(this.f8433) + r1;
    }
}
