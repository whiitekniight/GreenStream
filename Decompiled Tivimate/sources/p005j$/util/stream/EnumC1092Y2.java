package p005j$.util.stream;

import java.util.EnumMap;
import java.util.Map;
import p005j$.com.android.tools.p006r8.AbstractC0754a;
import p005j$.util.C0962p;
import p005j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.Y2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1092Y2 extends Enum {
    public static final EnumC1092Y2 DISTINCT = null;
    public static final EnumC1092Y2 ORDERED = null;
    public static final EnumC1092Y2 SHORT_CIRCUIT = null;
    public static final EnumC1092Y2 SIZED = null;
    public static final EnumC1092Y2 SORTED = null;

    /* JADX INFO: renamed from: f */
    public static final int f3834f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f3835g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f3836h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f3837i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f3838j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f3839k = 0;

    /* JADX INFO: renamed from: l */
    public static final int f3840l = 0;

    /* JADX INFO: renamed from: m */
    public static final int f3841m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f3842n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f3843o = 0;

    /* JADX INFO: renamed from: p */
    public static final int f3844p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f3845q = 0;

    /* JADX INFO: renamed from: r */
    public static final int f3846r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f3847s = 0;

    /* JADX INFO: renamed from: t */
    public static final int f3848t = 0;

    /* JADX INFO: renamed from: u */
    public static final int f3849u = 0;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ EnumC1092Y2[] f3850v = null;

    /* JADX INFO: renamed from: a */
    public final Map f3851a;

    /* JADX INFO: renamed from: b */
    public final int f3852b;

    /* JADX INFO: renamed from: c */
    public final int f3853c;

    /* JADX INFO: renamed from: d */
    public final int f3854d;

    /* JADX INFO: renamed from: e */
    public final int f3855e;

    static {
        EnumC1087X2 r1 = EnumC1087X2.SPLITERATOR;
        C0962p r2 = m3327w(r1);
        EnumC1087X2 r3 = EnumC1087X2.STREAM;
        r2.m3237a(r3);
        EnumC1087X2 r4 = EnumC1087X2.f3824OP;
        ((EnumMap) ((Map) r2.f3621b)).put(r4, 3);
        EnumC1092Y2 r0 = new EnumC1092Y2("DISTINCT", 0, 0, r2);
        DISTINCT = r0;
        C0962p r7 = m3327w(r1);
        r7.m3237a(r3);
        ((EnumMap) ((Map) r7.f3621b)).put(r4, 3);
        EnumC1092Y2 r22 = new EnumC1092Y2("SORTED", 1, 1, r7);
        SORTED = r22;
        C0962p r12 = m3327w(r1);
        r12.m3237a(r3);
        ((EnumMap) ((Map) r12.f3621b)).put(r4, 3);
        EnumC1087X2 r6 = EnumC1087X2.TERMINAL_OP;
        ((EnumMap) ((Map) r12.f3621b)).put(r6, 2);
        EnumC1087X2 r13 = EnumC1087X2.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) r12.f3621b)).put(r13, 2);
        EnumC1092Y2 r72 = new EnumC1092Y2("ORDERED", 2, 2, r12);
        ORDERED = r72;
        C0962p r14 = m3327w(r1);
        r14.m3237a(r3);
        ((EnumMap) ((Map) r14.f3621b)).put(r4, 2);
        EnumC1092Y2 r122 = new EnumC1092Y2("SIZED", 3, 3, r14);
        SIZED = r122;
        C0962p r142 = m3327w(r4);
        r142.m3237a(r6);
        int r17 = 0;
        EnumC1092Y2 r11 = new EnumC1092Y2("SHORT_CIRCUIT", 4, 12, r142);
        SHORT_CIRCUIT = r11;
        f3850v = new EnumC1092Y2[]{r0, r22, r72, r122, r11};
        f3834f = m3325l(r1);
        f3835g = m3325l(r3);
        f3836h = m3325l(r4);
        m3325l(r6);
        m3325l(r13);
        EnumC1092Y2[] r02 = values();
        int r15 = r02.length;
        int r8 = 0;
    L3:
        if (r8 >= r15) goto L5;
        r17 = r17 | r02[r8].f3855e;
        r8 = r8 + 1;
        goto L3
    L5:
        f3837i = r17;
        int r03 = f3835g;
        f3838j = r03;
        int r16 = r03 << 1;
        f3839k = r16;
        f3840l = r03 | r16;
        EnumC1092Y2 r04 = DISTINCT;
        f3841m = r04.f3853c;
        f3842n = r04.f3854d;
        EnumC1092Y2 r05 = SORTED;
        f3843o = r05.f3853c;
        f3844p = r05.f3854d;
        EnumC1092Y2 r06 = ORDERED;
        f3845q = r06.f3853c;
        f3846r = r06.f3854d;
        EnumC1092Y2 r07 = SIZED;
        f3847s = r07.f3853c;
        f3848t = r07.f3854d;
        f3849u = SHORT_CIRCUIT.f3853c;
    }

    EnumC1092Y2(String r6, int r7, int r8, C0962p r9) {
        EnumC1087X2[] r62 = EnumC1087X2.values();
        int r72 = r62.length;
        int r1 = 0;
    L3:
        if (r1 >= r72) goto L5;
        AbstractC0754a.m2818a0((Map) r9.f3621b, r62[r1], 0);
        r1 = r1 + 1;
        goto L3
    L5:
        this.f3851a = (Map) r9.f3621b;
        int r82 = r8 * 2;
        this.f3852b = r82;
        this.f3853c = 1 << r82;
        this.f3854d = 2 << r82;
        this.f3855e = 3 << r82;
    }

    /* JADX INFO: renamed from: k */
    public static int m3324k(int r2, int r3) {
        if (r2 != 0) goto L4;
        int r0 = f3837i;
    L6:
        return r2 | (r3 & r0);
    L4:
        r0 = ~((((f3838j & r2) << 1) | r2) | ((f3839k & r2) >> 1));
        goto L6
    }

    /* JADX INFO: renamed from: l */
    public static int m3325l(EnumC1087X2 r6) {
        EnumC1092Y2[] r0 = values();
        int r1 = r0.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        EnumC1092Y2 r4 = r0[r2];
        r3 = r3 | (((Integer) r4.f3851a.get(r6)).intValue() << r4.f3852b);
        r2 = r2 + 1;
        goto L3
    L5:
        return r3;
    }

    /* JADX INFO: renamed from: m */
    public static int m3326m(Spliterator r3) {
        int r0 = r3.characteristics();
        int r1 = r0 & 4;
        int r2 = f3834f;
        if (r1 == 0) goto L9;
        if (r3.getComparator() == null) goto L9;
        return (r0 & r2) & (-5);
    L9:
        return r0 & r2;
    }

    public static EnumC1092Y2 valueOf(String r1) {
        return (EnumC1092Y2) Enum.valueOf(EnumC1092Y2.class, r1);
    }

    public static EnumC1092Y2[] values() {
        return (EnumC1092Y2[]) f3850v.clone();
    }

    /* JADX INFO: renamed from: w */
    public static C0962p m3327w(EnumC1087X2 r3) {
        int r2 = 9;
        C0962p r0 = new C0962p(r2, new EnumMap(EnumC1087X2.class));
        r0.m3237a(r3);
        return r0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m3328q(int r2) {
        if ((r2 & this.f3855e) != this.f3853c) goto L6;
        return true;
    L6:
        return false;
    }
}
