package p267;

import java.util.Arrays;

/* JADX INFO: renamed from: יـ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C3844 {

    /* JADX INFO: renamed from: ʽ */
    public int[] f14088;

    /* JADX INFO: renamed from: ˈ */
    public int f14089;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f14090;

    /* JADX INFO: renamed from: ⁱˊ */
    public int[] f14091;

    /* JADX INFO: renamed from: ﹳٴ */
    public long[] f14092;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f14093;

    public final boolean equals(Object r19) {
        boolean r2 = true;
        if (r19 != this) goto L6;
        return true;
    L6:
        if ((r19 instanceof C3844) == true) goto L8;
        return false;
    L8:
        C3844 r1 = (C3844) r19;
        if (r1.f14090 == this.f14090) goto L11;
        return false;
    L11:
        int[] r3 = this.f14091;
        int[] r5 = this.f14088;
        long[] r6 = this.f14092;
        int r7 = r6.length - 2;
        if (r7 < 0) goto L34;
        int r8 = 0;
    L14:
        long r9 = r6[r8];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L30;
        int r11 = 8 - ((~(r8 - r7)) >>> 31);
        int r13 = 0;
    L17:
        if (r13 >= r11) goto L27;
        if ((255 & r9) >= 128) goto L25;
        int r14 = (r8 << 3) + r13;
        int r15 = r3[r14];
        int r142 = r5[r14];
        int r152 = r1.m7915(r15);
        if (r152 < 0) goto L24;
        boolean r16 = r2;
        if (r142 != r1.f14088[r152]) goto L24;
    L26:
        r9 = r9 >> 8;
        r13 = r13 + 1;
        r2 = r16;
    L24:
        return false;
    L25:
        r16 = r2;
        goto L26
    L27:
        boolean r162 = r2;
        if (r11 != 8) goto L42;
    L31:
        if (r8 == r7) goto L43;
        r8 = r8 + 1;
        r2 = r162;
        goto L14
    L43:
        return r162;
    L42:
        return r162;
    L30:
        r162 = r2;
        goto L31
    L34:
        return true;
    }

    public final int hashCode() {
        int[] r1 = this.f14091;
        int[] r2 = this.f14088;
        long[] r3 = this.f14092;
        int r4 = r3.length - 2;
        if (r4 < 0) goto L19;
        int r6 = 0;
        int r7 = 0;
    L5:
        long r8 = r3[r6];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L16;
        int r10 = 8 - ((~(r6 - r4)) >>> 31);
        int r12 = 0;
    L8:
        if (r12 >= r10) goto L13;
        if ((255 & r8) >= 128) goto L12;
        int r13 = (r6 << 3) + r12;
        r7 = r7 + (r2[r13] ^ r1[r13]);
    L12:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L8
    L13:
        if (r10 == 8) goto L16;
        return r7;
    L16:
        if (r6 == r4) goto L18;
        r6 = r6 + 1;
        goto L5
    L18:
        return r7;
    L19:
        return 0;
    }

    public final String toString() {
        if (this.f14090 != 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder("{");
        int[] r2 = this.f14091;
        int[] r3 = this.f14088;
        long[] r4 = this.f14092;
        int r5 = r4.length - 2;
        if (r5 < 0) goto L22;
        int r7 = 0;
        int r8 = 0;
    L9:
        long r9 = r4[r7];
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L20;
        int r11 = 8 - ((~(r7 - r5)) >>> 31);
        int r13 = 0;
    L12:
        if (r13 >= r11) goto L19;
        if ((255 & r9) >= 128) goto L18;
        int r14 = (r7 << 3) + r13;
        int r15 = r2[r14];
        int r142 = r3[r14];
        r1.append(r15);
        r1.append("=");
        r1.append(r142);
        r8 = r8 + 1;
        if (r8 >= this.f14090) goto L18;
        r1.append(", ");
    L18:
        r9 = r9 >> 8;
        r13 = r13 + 1;
        goto L12
    L19:
        if (r11 != 8) goto L22;
    L20:
        if (r7 == r5) goto L22;
        r7 = r7 + 1;
    L22:
        r1.append('}');
        return r1.toString();
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m7914(int r10) {
        if (r10 <= 0) goto L5;
        int r102 = Math.max(7, AbstractC3848.m7926(r10));
    L6:
        this.f14089 = r102;
        if (r102 != 0) goto L9;
        long[] r0 = AbstractC3848.f14102;
    L10:
        this.f14092 = r0;
        int r1 = r102 >> 3;
        long r5 = 255 << ((r102 & 7) << 3);
        r0[r1] = (r0[r1] & (~r5)) | r5;
        this.f14093 = AbstractC3848.m7929(this.f14089) - this.f14090;
        this.f14091 = new int[r102];
        this.f14088 = new int[r102];
        return;
    L9:
        int r12 = ((r102 + 15) & (-8)) >> 3;
        long[] r2 = new long[r12];
        Arrays.fill(r2, 0, r12, -9187201950435737472L);
        r0 = r2;
        goto L10
    L5:
        r102 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m7915(int r14) {
        int r0 = (-862048943) * r14;
        int r02 = r0 ^ (r0 << 16);
        int r1 = r02 & 127;
        int r2 = this.f14089;
        int r03 = (r02 >>> 7) & r2;
        int r3 = 0;
    L3:
        long[] r4 = this.f14092;
        int r5 = r03 >> 3;
        int r6 = (r03 & 7) << 3;
        long r42 = ((r4[r5 + 1] << (64 - r6)) & ((-r6) >> 63)) | (r4[r5] >>> r6);
        long r62 = (((long) r1) * 72340172838076673L) ^ r42;
        long r63 = ((~r62) & (r62 - 72340172838076673L)) & (-9187201950435737472L);
    L5:
        if (r63 == 0) goto L11;
        int r10 = ((Long.numberOfTrailingZeros(r63) >> 3) + r03) & r2;
        if (this.f14091[r10] == r14) goto L8;
        r63 = r63 & (r63 - 1);
        goto L5
    L8:
        return r10;
    L11:
        if (((r42 & ((~r42) << 6)) & (-9187201950435737472L)) != 0) goto L12;
        r3 = r3 + 8;
        r03 = (r03 + r3) & r2;
        goto L3
    L12:
        return -1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m7916(int r10) {
        int r0 = this.f14089;
        int r102 = r10 & r0;
        int r1 = 0;
    L3:
        long[] r2 = this.f14092;
        int r3 = r102 >> 3;
        int r4 = (r102 & 7) << 3;
        long r22 = ((r2[r3 + 1] << (64 - r4)) & ((-r4) >> 63)) | (r2[r3] >>> r4);
        long r23 = (r22 & ((~r22) << 7)) & (-9187201950435737472L);
        if (r23 != 0) goto L6;
        r1 = r1 + 8;
        r102 = (r102 + r1) & r0;
        goto L3
    L6:
        return (r102 + (Long.numberOfTrailingZeros(r23) >> 3)) & r0;
    }
}
