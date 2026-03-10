package p440;

import p432.C5419;

/* JADX INFO: renamed from: ﹶʽ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5539 {

    /* JADX INFO: renamed from: ʽ */
    public final C5419[] f19963;

    /* JADX INFO: renamed from: ˈ */
    public final int[] f19964;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int[][][] f19965;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int[] f19966;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f19967;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final C5419 f19968;

    public C5539(int[] r1, C5419[] r2, int[] r3, int[][][] r4, C5419 r5) {
        this.f19966 = r1;
        this.f19963 = r2;
        this.f19965 = r4;
        this.f19964 = r3;
        this.f19968 = r5;
        this.f19967 = r1.length;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m10675(int r2, int r3, int r4) {
        return this.f19965[r2][r3][r4] & 7;
    }
}
