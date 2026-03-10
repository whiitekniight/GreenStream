package p315;

import p164.AbstractC2927;
import p447.AbstractC5626;
import ˈˊ.ˉˆ;
import ﹳٴ.ﹳٴ;

/* JADX INFO: renamed from: ᐧˊ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4192 implements Comparable {

    /* JADX INFO: renamed from: ʽʽ */
    public static final long f15408 = 0;

    /* JADX INFO: renamed from: ˈٴ */
    public static final /* synthetic */ int f15409 = 0;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final long f15410 = 0;

    /* JADX INFO: renamed from: ʾˋ */
    public final long f15411;

    static {
        int r0 = AbstractC4191.f15407;
        f15410 = ﹳٴ.ʼᐧ(4611686018427387903L);
        f15408 = ﹳٴ.ʼᐧ(-4611686018427387903L);
    }

    public /* synthetic */ C4192(long r1) {
        this.f15411 = r1;
    }

    /* JADX INFO: renamed from: ʽ */
    public static int m8454(long r5, long r7) {
        long r0 = r5 ^ r7;
        if (r0 < 0) goto L13;
        if ((((int) r0) & 1) == 0) goto L13;
        int r02 = (((int) r5) & 1) - (((int) r7) & 1);
        if (r5 < 0) goto L10;
        return r02;
    L10:
        return -r02;
    L13:
        return AbstractC2927.m6275(r5, r7);
    }

    /* JADX INFO: renamed from: ˈ */
    public static final boolean m8455(long r2) {
        if (r2 != f15410) goto L5;
        return true;
    L5:
        if (r2 == f15408) goto L11;
        return false;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static final long m8456(long r3, EnumC4190 r5) {
        if (r3 != f15410) goto L7;
        return Long.MAX_VALUE;
    L7:
        if (r3 != f15408) goto L10;
        return Long.MIN_VALUE;
    L10:
        long r1 = r3 >> 1;
        if ((((int) r3) & 1) != 0) goto L13;
        EnumC4190 r32 = EnumC4190.f15404;
    L15:
        return r5.f15406.convert(r1, r32.f15406);
    L13:
        r32 = EnumC4190.f15399;
        goto L15
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static final void m8457(StringBuilder r3, int r4, int r5, int r6, String r7, boolean r8) {
        r3.append(r4);
        if (r5 == 0) goto L17;
        r3.append('.');
        String r42 = AbstractC5626.m10832(r6, String.valueOf(r5));
        int r62 = -1;
        int r52 = r42.length() - 1;
        if (r52 < 0) goto L12;
    L6:
        int r0 = r52 - 1;
        if (r42.charAt(r52) != '0') goto L8;
        if (r0 < 0) goto L12;
        r52 = r0;
        goto L6
    L8:
        r62 = r52;
    L12:
        int r53 = r62 + 1;
        if (r8 == true) goto L16;
        if (r53 >= 3) goto L16;
        r3.append(r42, 0, r53);
    L16:
        r3.append(r42, 0, ((r62 + 3) / 3) * 3);
    L17:
        r3.append(r7);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final long m8458(long r10, long r12) {
        long r0 = 1000000;
        long r2 = r12 / r0;
        long r4 = r10 + r2;
        if ((-4611686018426L) > r4) goto L9;
        if (r4 >= 4611686018427L) goto L9;
        return ﹳٴ.ᵔﹳ((r4 * r0) + (r12 - (r2 * r0)));
    L9:
        return ﹳٴ.ʼᐧ(ˉˆ.ˆʾ(r4, -4611686018427387903L, 4611686018427387903L));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        long r0 = ((C4192) r5).f15411;
        return m8454(this.f15411, r0);
    }

    public final boolean equals(Object r5) {
        if ((r5 instanceof C4192) == false) goto L11;
        long r0 = ((C4192) r5).f15411;
        if (this.f15411 == r0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        long r1 = this.f15411;
        return (int) (r1 ^ (r1 >>> 32));
    }

    public final String toString() {
        long r1 = this.f15411;
        if (r1 != 0) goto L7;
        return "0s";
    L7:
        if (r1 != f15410) goto L11;
        return "Infinity";
    L11:
        if (r1 != f15408) goto L15;
        return "-Infinity";
    L15:
        if (r1 >= 0) goto L17;
        boolean r8 = true;
    L18:
        StringBuilder r9 = new StringBuilder();
        if (r8 == false) goto L21;
        r9.append('-');
    L21:
        if (r1 >= 0) goto L23;
        long r10 = -(r1 >> 1);
        r1 = (((int) r1) & 1) + (r10 << 1);
        int r5 = AbstractC4191.f15407;
    L23:
        long r102 = m8456(r1, EnumC4190.f15403);
        if (m8455(r1) == false) goto L26;
        int r52 = 0;
    L28:
        if (m8455(r1) == false) goto L30;
        long r16 = 0;
        int r3 = 0;
    L32:
        if (m8455(r1) == false) goto L34;
        int r4 = 0;
    L36:
        if (m8455(r1) == false) goto L39;
        int r15 = 1;
        int r12 = 0;
    L44:
        if (r102 == r16) goto L46;
        int r2 = r15;
    L47:
        if (r52 == 0) goto L49;
        int r6 = r15;
    L50:
        if (r3 == 0) goto L52;
        int r7 = r15;
    L53:
        if (r4 != 0) goto L57;
        if (r12 != 0) goto L57;
        int r162 = 0;
    L58:
        if (r2 == 0) goto L60;
        r9.append(r102);
        r9.append('d');
        int r122 = r15;
    L62:
        if (r6 != 0) goto L66;
        if (r2 == 0) goto L70;
        if (r7 != 0) goto L66;
        if (r162 != 0) goto L66;
    L70:
        if (r7 != 0) goto L74;
        if (r162 == 0) goto L78;
        if (r6 != 0) goto L74;
        if (r2 != 0) goto L74;
    L78:
        if (r162 == 0) goto L94;
        int r32 = r122 + 1;
        if (r122 <= 0) goto L82;
        r9.append(' ');
    L82:
        if (r4 != 0) goto L92;
        if (r2 != 0) goto L92;
        if (r6 != 0) goto L92;
        if (r7 != 0) goto L92;
        if (r12 < 1000000) goto L89;
        m8457(r9, r12 / 1000000, r12 % 1000000, 6, "ms", false);
    L93:
        r122 = r32;
        goto L94
    L89:
        if (r12 < 1000) goto L91;
        m8457(r9, r12 / 1000, r12 % 1000, 3, "us", false);
        goto L93
    L91:
        r9.append(r12);
        r9.append("ns");
    L92:
        m8457(r9, r4, r12, 9, "s", false);
    L94:
        if (r8 == false) goto L98;
        if (r122 <= r15) goto L98;
        r9.insert(r15, '(').append(')');
    L98:
        return r9.toString();
    L74:
        int r53 = r122 + 1;
        if (r122 <= 0) goto L77;
        r9.append(' ');
    L77:
        r9.append(r3);
        r9.append('m');
        r122 = r53;
    L66:
        int r11 = r122 + 1;
        if (r122 <= 0) goto L69;
        r9.append(' ');
    L69:
        r9.append(r52);
        r9.append('h');
        r122 = r11;
        goto L70
    L60:
        r122 = 0;
    L57:
        r162 = r15;
        goto L58
    L52:
        r7 = 0;
        goto L53
    L49:
        r6 = 0;
        goto L50
    L46:
        r2 = 0;
        goto L47
    L39:
        if ((((int) r1) & 1) != 1) goto L42;
        r15 = 1;
        long r13 = ((r1 >> 1) % ((long) 1000)) * ((long) 1000000);
    L41:
        r12 = (int) r13;
        goto L44
    L42:
        r15 = 1;
        r13 = (r1 >> 1) % ((long) 1000000000);
        goto L41
    L34:
        r4 = (int) (m8456(r1, EnumC4190.f15400) % ((long) 60));
        goto L36
    L30:
        r16 = 0;
        r3 = (int) (m8456(r1, EnumC4190.f15405) % ((long) 60));
        goto L32
    L26:
        r52 = (int) (m8456(r1, EnumC4190.f15402) % ((long) 24));
        goto L28
    L17:
        r8 = false;
        goto L18
    }
}
