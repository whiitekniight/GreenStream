package p134;

import java.util.List;

/* JADX INFO: renamed from: ˈˋ.ˊˋ */
/* JADX INFO: loaded from: classes.dex */
public final class C2550 extends AbstractC2574 {

    /* JADX INFO: renamed from: ʽ */
    public final AbstractC2566 f9042;

    /* JADX INFO: renamed from: ˈ */
    public final C2598 f9043;

    /* JADX INFO: renamed from: ˑﹳ */
    public final List f9044;

    /* JADX INFO: renamed from: ⁱˊ */
    public final AbstractC2562 f9045;

    /* JADX INFO: renamed from: ﹳٴ */
    public final List f9046;

    public C2550(List r1, C2565 r2, AbstractC2566 r3, C2598 r4, List r5) {
        this.f9046 = r1;
        this.f9045 = r2;
        this.f9042 = r3;
        this.f9043 = r4;
        this.f9044 = r5;
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof AbstractC2574) == false) goto L33;
        AbstractC2574 r32 = (AbstractC2574) r3;
        List r0 = this.f9046;
        if (r0 != null) goto L12;
        if (((C2550) r32).f9046 != null) goto L36;
    L13:
        AbstractC2562 r02 = this.f9045;
        if (r02 != null) goto L19;
        if (((C2550) r32).f9045 != null) goto L38;
    L20:
        AbstractC2566 r03 = this.f9042;
        if (r03 != null) goto L26;
        if (((C2550) r32).f9042 != null) goto L40;
    L27:
        C2550 r33 = (C2550) r32;
        C2598 r04 = r33.f9043;
        if (this.f9043.equals(r04) == true) goto L30;
        return false;
    L30:
        if (this.f9044.equals(r33.f9044) == false) goto L43;
        return true;
    L43:
        return false;
    L40:
        return false;
    L26:
        if (r03.equals(((C2550) r32).f9042) == true) goto L27;
        return false;
    L38:
        return false;
    L19:
        if (r02.equals(((C2550) r32).f9045) == true) goto L20;
        return false;
    L36:
        return false;
    L12:
        if (r0.equals(((C2550) r32).f9046) == true) goto L13;
        return false;
    L33:
        return false;
    }

    public final int hashCode() {
        int r0 = 0;
        List r1 = this.f9046;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = (r12 ^ 1000003) * 1000003;
        AbstractC2562 r3 = this.f9045;
        if (r3 != null) goto L9;
        int r32 = 0;
    L10:
        int r14 = (r13 ^ r32) * 1000003;
        AbstractC2566 r33 = this.f9042;
        if (r33 == null) goto L15;
        r0 = r33.hashCode();
    L15:
        return ((((r0 ^ r14) * 1000003) ^ this.f9043.hashCode()) * 1000003) ^ this.f9044.hashCode();
    L9:
        r32 = r3.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "Execution{threads=" + this.f9046 + ", exception=" + this.f9045 + ", appExitInfo=" + this.f9042 + ", signal=" + this.f9043 + ", binaries=" + this.f9044 + "}";
    }
}
