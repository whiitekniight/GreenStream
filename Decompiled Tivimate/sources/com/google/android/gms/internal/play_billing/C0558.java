package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import p005j$.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˈٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C0558 extends AbstractC0523 {

    /* JADX INFO: renamed from: ٴᵢ */
    public static final C0558 f2356 = null;

    /* JADX INFO: renamed from: ˈٴ */
    public final transient Object f2357;

    /* JADX INFO: renamed from: ˊʻ */
    public final transient int f2358;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final transient Object[] f2359;

    static {
        f2356 = new C0558(null, new Object[0], 0);
    }

    public C0558(Object r1, Object[] r2, int r3) {
        this.f2357 = r1;
        this.f2359 = r2;
        this.f2358 = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: ﹳٴ */
    public static C0558 m2191(int r19, Object[] r20, ʽﹳ r21) {
        int r0 = r19;
        Object[] r1 = r20;
        if (r0 == 0) goto L5;
        C0581 r3 = null;
        ?? r32 = 0;
        C0581 r33 = null;
        C0581 r34 = null;
        boolean r4 = false;
        int r5 = 1;
        if (r0 != 1) goto L10;
        Objects.requireNonNull(r1[0]);
        Objects.requireNonNull(r1[1]);
        return new C0558(null, r1, 1);
    L10:
        com.bumptech.glide.ˈ.ˆﾞ(r0, r1.length >> 1);
        char r6 = 2;
        int r7 = Math.max(r0, 2);
        if (r7 >= 751619276) goto L16;
        int r8 = Integer.highestOneBit(r7 - 1);
    L13:
        r8 = r8 + r8;
        if ((((double) r8) * 0.7d) < r7) goto L13;
    L18:
        if (r0 != 1) goto L21;
        Objects.requireNonNull(r1[0]);
        Objects.requireNonNull(r1[1]);
        boolean r16 = false;
        r0 = 1;
        int r17 = 1;
    L20:
        char r18 = 2;
        ?? r35 = r32;
        ?? r162 = r16;
    L79:
        boolean r42 = r35 instanceof Object[];
        ?? r36 = r35;
        if (r42 == false) goto L87;
        Object[] r37 = (Object[]) r35;
        C0581 r02 = (C0581) r37[r18];
        if (r21 == null) goto L85;
        r21.ˈٴ = r02;
        Object r03 = r37[r162];
        int r2 = ((Integer) r37[r17]).intValue();
        r1 = Arrays.copyOf(r1, r2 + r2);
        r36 = r03;
        r0 = r2;
        goto L87
    L85:
        throw r02.m2230();
    L87:
        return new C0558(r36, r1, r0);
    L21:
        int r72 = r8 - 1;
        if (r8 > 128) goto L42;
        byte[] r82 = new byte[r8];
        Arrays.fill(r82, (byte) -1);
        int r9 = 0;
        int r11 = 0;
    L24:
        if (r9 >= r0) goto L37;
        int r12 = r11 + r11;
        int r13 = r9 + r9;
        Object r14 = r1[r13];
        Objects.requireNonNull(r14);
        Object r132 = r1[r13 ^ r5];
        Objects.requireNonNull(r132);
        int r15 = י.ᵎⁱ(r14.hashCode());
    L26:
        int r152 = r15 & r72;
        boolean r163 = r4;
        int r172 = r5;
        int r43 = r82[r152] & 255;
        if (r43 == 255) goto L28;
        if (r14.equals(r1[r43 == true ? 1 : 0]) == true) goto L34;
        r15 = r152 + 1;
        r4 = r163;
        r5 = r172;
        goto L26
    L34:
        int r38 = ~r43;
        Object r52 = r1[r38 == true ? 1 : 0];
        Objects.requireNonNull(r52);
        C0581 r44 = new C0581(r14, r132, r52);
        r1[r38 == true ? 1 : 0] = r132;
        r33 = r44;
    L35:
        r9 = r9 + 1;
        r4 = r163;
        r5 = r172;
        goto L24
    L28:
        r82[r152] = (byte) r12;
        if (r11 >= r9) goto L31;
        r1[r12] = r14;
        r1[r12 ^ 1] = r132;
    L31:
        r11 = r11 + 1;
        goto L35
    L37:
        boolean r164 = r4;
        r17 = r5;
        if (r11 != r0) goto L40;
        r18 = 2;
        r35 = r82;
        r162 = r164;
        goto L79
    L40:
        short[] r45 = new Object[3];
        r45[r164 ? 1 : 0] = r82;
        r45[r17] = Integer.valueOf(r11);
        r45[2] = r33;
    L41:
        r32 = r45;
        r16 = r164;
        goto L20
    L42:
        r164 = false;
        r17 = 1;
        if (r8 > 32768) goto L61;
        r45 = new short[r8];
        Arrays.fill(r45, -1);
        int r53 = 0;
        int r83 = 0;
    L45:
        if (r53 >= r0) goto L58;
        int r92 = r83 + r83;
        int r112 = r53 + r53;
        Object r122 = r1[r112];
        Objects.requireNonNull(r122);
        Object r113 = r1[r112 ^ 1];
        Objects.requireNonNull(r113);
        int r133 = י.ᵎⁱ(r122.hashCode());
    L47:
        int r134 = r133 & r72;
        char r142 = (char) r45[r134];
        if (r142 == '\uffff') goto L49;
        if (r122.equals(r1[r142]) == true) goto L55;
        r133 = r134 + 1;
        goto L47
    L55:
        int r39 = r142 ^ 1;
        Object r135 = r1[r39 == true ? 1 : 0];
        Objects.requireNonNull(r135);
        C0581 r93 = new C0581(r122, r113, r135);
        r1[r39 == true ? 1 : 0] = r113;
        r34 = r93;
    L56:
        r53 = r53 + 1;
        goto L45
    L49:
        r45[r134] = (short) r92;
        if (r83 >= r53) goto L52;
        r1[r92] = r122;
        r1[r92 ^ 1] = r113;
    L52:
        r83 = r83 + 1;
        goto L56
    L58:
        if (r83 == r0) goto L41;
        r32 = new Object[]{r45, Integer.valueOf(r83), r34};
        r16 = r164;
        goto L20
    L61:
        int[] r46 = new int[r8];
        Arrays.fill(r46, -1);
        int r54 = 0;
        int r84 = 0;
    L62:
        if (r54 >= r0) goto L75;
        int r94 = r84 + r84;
        int r123 = r54 + r54;
        Object r136 = r1[r123];
        Objects.requireNonNull(r136);
        Object r124 = r1[r123 ^ 1];
        Objects.requireNonNull(r124);
        int r143 = י.ᵎⁱ(r136.hashCode());
    L64:
        int r144 = r143 & r72;
        int r153 = r46[r144];
        if (r153 == (-1)) goto L66;
        char r182 = r6;
        if (r136.equals(r1[r153]) == true) goto L72;
        r143 = r144 + 1;
        r6 = r182;
        goto L64
    L72:
        int r310 = r153 ^ 1;
        Object r95 = r1[r310];
        Objects.requireNonNull(r95);
        C0581 r62 = new C0581(r136, r124, r95);
        r1[r310] = r124;
        r3 = r62;
    L73:
        r54 = r54 + 1;
        r6 = r182;
        goto L62
    L66:
        r46[r144] = r94;
        if (r84 >= r54) goto L69;
        r1[r94] = r136;
        r1[r94 ^ 1] = r124;
    L69:
        r84 = r84 + 1;
        r182 = r6;
        goto L73
    L75:
        r18 = r6;
        if (r84 != r0) goto L78;
        r35 = r46;
        r162 = r164;
        goto L79
    L78:
        Object[] r55 = new Object[3];
        r55[0] = r46;
        r55[1] = Integer.valueOf(r84);
        r55[r18] = r3;
        r35 = r55;
        r162 = r164;
        goto L79
    L16:
        r8 = 1073741824;
        if (r7 < 1073741824) goto L18;
        throw new IllegalArgumentException("collection too large");
    L5:
        return f2356;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0523, java.util.Map
    public final Object get(Object r10) {
        if (r10 != null) goto L5;
    L4:
        Object r102 = null;
    L40:
        if (r102 != null) goto L42;
        return null;
    L42:
        return r102;
    L5:
        int r2 = this.f2358;
        Object[] r3 = this.f2359;
        if (r2 != 1) goto L10;
        Object r22 = r3[0];
        Objects.requireNonNull(r22);
        if (r22.equals(r10) == false) goto L4;
        r102 = r3[1];
        Objects.requireNonNull(r102);
        goto L40
    L10:
        Object r23 = this.f2357;
        if (r23 == null) goto L4;
        if ((r23 instanceof byte[]) == false) goto L24;
        byte[] r4 = (byte[]) r23;
        int r6 = r4.length - 1;
        int r24 = י.ᵎⁱ(r10.hashCode());
    L16:
        int r25 = r24 & r6;
        int r5 = r4[r25] & 255;
        if (r5 == 255) goto L4;
        if (r10.equals(r3[r5]) == true) goto L21;
        r24 = r25 + 1;
        goto L16
    L21:
        r102 = r3[r5 ^ 1];
        goto L40
    L24:
        if ((r23 instanceof short[]) == false) goto L33;
        short[] r42 = (short[]) r23;
        int r62 = r42.length - 1;
        int r26 = י.ᵎⁱ(r10.hashCode());
    L26:
        int r27 = r26 & r62;
        char r52 = (char) r42[r27];
        if (r52 == '\uffff') goto L4;
        if (r10.equals(r3[r52]) == true) goto L31;
        r26 = r27 + 1;
        goto L26
    L31:
        r102 = r3[r52 ^ 1];
        goto L40
    L33:
        int[] r28 = (int[]) r23;
        int r43 = r28.length - 1;
        int r63 = י.ᵎⁱ(r10.hashCode());
    L34:
        int r64 = r63 & r43;
        int r7 = r28[r64];
        if (r7 == (-1)) goto L4;
        if (r10.equals(r3[r7]) == true) goto L39;
        r63 = r64 + 1;
        goto L34
    L39:
        r102 = r3[r7 ^ 1];
        goto L40
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2358;
    }
}
