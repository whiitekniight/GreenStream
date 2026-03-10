package p191;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p442.AbstractC5579;

/* JADX INFO: renamed from: ˋˋ.ʽʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C3159 {

    /* JADX INFO: renamed from: ʽ */
    public int f11138;

    /* JADX INFO: renamed from: ˈ */
    public int f11139;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f11140;

    /* JADX INFO: renamed from: ﹳٴ */
    public int[] f11141;

    public C3159() {
        int r0 = 8;
        if (Integer.bitCount(8) == 1) goto L5;
        r0 = Integer.highestOneBit(7) << 1;
    L5:
        this.f11139 = r0 - 1;
        this.f11141 = new int[r0];
    }

    /* JADX INFO: renamed from: ʽ */
    public void m6733(RecyclerView r5, boolean r6) {
        this.f11139 = 0;
        int[] r0 = this.f11141;
        if (r0 == null) goto L5;
        Arrays.fill(r0, -1);
    L5:
        AbstractC3152 r02 = r5.f1521;
        if (r5.f1474 == null) goto L21;
        if (r02 != null) goto L9;
        return;
    L9:
        if (r02.f11085 == false) goto L23;
        if (r6 == false) goto L15;
        if (r5.f1514.m3849() == true) goto L17;
        r02.mo483(r5.f1474.mo611(), this);
    L17:
        int r1 = this.f11139;
        if (r1 <= r02.f11087) goto L24;
        r02.f11087 = r1;
        r02.f11092 = r6;
        r5.f1464.m6667();
        return;
    L24:
        return;
    L15:
        if (r5.m960() == true) goto L17;
        r02.mo470(this.f11140, this.f11138, r5.f1516, this);
        goto L17
    L23:
        return;
    }

    /* JADX INFO: renamed from: ˈ */
    public int m6734(int r3) {
        if (r3 < 0) goto L8;
        if (r3 >= m6735()) goto L8;
        int[] r0 = this.f11141;
        int r1 = this.f11140 + r3;
        return r0[this.f11139 & r1];
    L8:
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public int m6735() {
        return (this.f11138 - this.f11140) & this.f11139;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public void m6736(int r6, int r7) {
        if (r6 < 0) goto L15;
        if (r7 < 0) goto L13;
        int r0 = this.f11139;
        int r1 = r0 * 2;
        int[] r2 = this.f11141;
        if (r2 != null) goto L8;
        int[] r02 = new int[4];
        this.f11141 = r02;
        Arrays.fill(r02, -1);
    L10:
        int[] r03 = this.f11141;
        r03[r1] = r6;
        r03[r1 + 1] = r7;
        this.f11139++;
        return;
    L8:
        if (r1 < r2.length) goto L10;
        int[] r04 = new int[r0 * 4];
        this.f11141 = r04;
        System.arraycopy(r2, 0, r04, 0, r2.length);
        goto L10
    L13:
        throw new IllegalArgumentException("Pixel distance must be non-negative");
    L15:
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void m6737(int r7) {
        int[] r0 = this.f11141;
        int r1 = this.f11138;
        r0[r1] = r7;
        int r72 = this.f11139 & (r1 + 1);
        this.f11138 = r72;
        int r12 = this.f11140;
        if (r72 != r12) goto L10;
        int r73 = r0.length;
        int r2 = r73 - r12;
        int r3 = r73 << 1;
        if (r3 < 0) goto L9;
        int[] r4 = new int[r3];
        AbstractC5579.m10713(0, r12, r73, r0, r4);
        AbstractC5579.m10713(r2, 0, this.f11140, this.f11141, r4);
        this.f11141 = r4;
        this.f11140 = 0;
        this.f11138 = r73;
        this.f11139 = r3 - 1;
        return;
    L9:
        throw new RuntimeException("Max array capacity exceeded");
    }
}
