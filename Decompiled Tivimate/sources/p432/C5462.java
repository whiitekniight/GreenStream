package p432;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: ﹳᵢ.ᵎᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C5462 {

    /* JADX INFO: renamed from: ʽ */
    public final int[] f19521;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int[] f19522;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Random f19523;

    public C5462() {
        this(new Random());
    }

    public C5462(Random r2) {
        this(new int[0], r2);
    }

    public C5462(int[] r3, Random r4) {
        this.f19522 = r3;
        this.f19523 = r4;
        this.f19521 = new int[r3.length];
        int r42 = 0;
    L4:
        if (r42 >= r3.length) goto L6;
        this.f19521[r3[r42]] = r42;
        r42 = r42 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C5462 m10548(int r10) {
        int[] r0 = new int[r10];
        int[] r1 = new int[r10];
        int r2 = 0;
        int r3 = 0;
    L3:
        int[] r4 = this.f19522;
        Random r5 = this.f19523;
        if (r3 >= r10) goto L6;
        r0[r3] = r5.nextInt(r4.length + 1);
        int r42 = r3 + 1;
        int r52 = r5.nextInt(r42);
        r1[r3] = r1[r52];
        r1[r52] = r3;
        r3 = r42;
        goto L3
    L6:
        Arrays.sort(r0);
        int[] r32 = new int[r4.length + r10];
        int r6 = 0;
        int r7 = 0;
    L8:
        if (r2 >= (r4.length + r10)) goto L19;
        if (r6 < r10) goto L11;
    L13:
        int r8 = r7 + 1;
        int r72 = r4[r7];
        r32[r2] = r72;
        if (r72 < 0) goto L16;
        r32[r2] = r72 + r10;
    L16:
        r7 = r8;
    L17:
        r2 = r2 + 1;
        goto L8
    L11:
        if (r7 != r0[r6]) goto L13;
        r32[r2] = r1[r6];
        r6 = r6 + 1;
        goto L17
    L19:
        return new C5462(r32, new Random(r5.nextLong()));
    }
}
