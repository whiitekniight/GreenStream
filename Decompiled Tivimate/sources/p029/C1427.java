package p029;

import com.google.android.gms.internal.measurement.ᵎ;
import com.google.android.gms.internal.play_billing.י;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ʼʻ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C1427 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: ٴʼ */
    public static final Object f4810 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public transient Object[] f4811;

    /* JADX INFO: renamed from: ʾˋ */
    public transient Object f4812;

    /* JADX INFO: renamed from: ˈٴ */
    public transient Object[] f4813;

    /* JADX INFO: renamed from: ˉٴ */
    public transient C1455 f4814;

    /* JADX INFO: renamed from: ˊʻ */
    public transient int f4815;

    /* JADX INFO: renamed from: ٴᵢ */
    public transient C1455 f4816;

    /* JADX INFO: renamed from: ᴵˊ */
    public transient int[] f4817;

    /* JADX INFO: renamed from: ᴵᵔ */
    public transient int f4818;

    /* JADX INFO: renamed from: ᵎⁱ */
    public transient C1478 f4819;

    static {
        f4810 = new Object();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static C1427 m3920(int r4) {
        C1427 r0 = new C1427();
        if (r4 < 0) goto L5;
        boolean r2 = true;
    L6:
        י.ﾞᴵ("Expected size must be >= 0", r2);
        r0.f4818 = Math.min(Math.max(r4, 1), 1073741823);
        return r0;
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C1427 m3921() {
        C1427 r0 = new C1427();
        r0.f4818 = Math.min(Math.max(3, 1), 1073741823);
        return r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m3928() == false) goto L5;
        return;
    L5:
        this.f4818 += 32;
        Map r0 = m3923();
        if (r0 == null) goto L9;
        this.f4818 = Math.min(Math.max(size(), 3), 1073741823);
        r0.clear();
        this.f4812 = null;
        this.f4815 = 0;
        return;
    L9:
        Arrays.fill(m3924(), 0, this.f4815, null);
        Arrays.fill(m3927(), 0, this.f4815, null);
        Object r02 = this.f4812;
        Objects.requireNonNull(r02);
        if ((r02 instanceof byte[]) == false) goto L13;
        Arrays.fill((byte[]) r02, (byte) 0);
    L16:
        Arrays.fill(m3922(), 0, this.f4815, 0);
        this.f4815 = 0;
        return;
    L13:
        if ((r02 instanceof short[]) == false) goto L15;
        Arrays.fill((short[]) r02, 0);
        goto L16
    L15:
        Arrays.fill((int[]) r02, 0);
        goto L16
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object r2) {
        Map r0 = m3923();
        if (r0 == null) goto L7;
        return r0.containsKey(r2);
    L7:
        if (m3926(r2) == (-1)) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object r4) {
        Map r0 = m3923();
        if (r0 != null) goto L5;
        int r1 = 0;
    L8:
        if (r1 >= this.f4815) goto L14;
        if (ᵎ.ᵎﹶ(r4, m3927()[r1]) == true) goto L11;
        r1 = r1 + 1;
        goto L8
    L11:
        return true;
    L14:
        return false;
    L5:
        return r0.containsValue(r4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1455 r0 = this.f4814;
        if (r0 != null) goto L6;
        C1455 r02 = new C1455(this, 0);
        this.f4814 = r02;
        return r02;
    L6:
        return r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object r2) {
        Map r0 = m3923();
        if (r0 != null) goto L5;
        int r22 = m3926(r2);
        if (r22 != (-1)) goto L11;
        return null;
    L11:
        return m3927()[r22];
    L5:
        return r0.get(r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C1455 r0 = this.f4816;
        if (r0 != null) goto L6;
        C1455 r02 = new C1455(this, 1);
        this.f4816 = r02;
        return r02;
    L6:
        return r0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object r23, Object r24) {
        int r6 = 32;
        int r7 = 1;
        if (m3928() == false) goto L11;
        י.ٴﹶ("Arrays already allocated", m3928());
        int r3 = this.f4818;
        int r8 = Math.max(r3 + 1, 2);
        int r9 = Integer.highestOneBit(r8);
        if (r8 <= ((int) (1.0d * ((double) r9)))) goto L10;
        r9 = r9 << 1;
        if (r9 > 0) goto L10;
        r9 = 1073741824;
    L10:
        int r82 = Math.max(4, r9);
        this.f4812 = AbstractC1487.m3997(r82);
        this.f4818 = AbstractC1487.m3994(this.f4818, 32 - Integer.numberOfLeadingZeros(r82 - 1), 31);
        this.f4817 = new int[r3];
        this.f4811 = new Object[r3];
        this.f4813 = new Object[r3];
    L11:
        Map r32 = m3923();
        if (r32 != null) goto L14;
        int[] r33 = m3922();
        Object[] r83 = m3924();
        Object[] r92 = m3927();
        int r10 = this.f4815;
        int r11 = r10 + 1;
        int r12 = AbstractC1487.m4006(r23);
        int r13 = m3925();
        int r14 = r12 & r13;
        Object r15 = this.f4812;
        Objects.requireNonNull(r15);
        int r152 = AbstractC1487.m3998(r14, r15);
        if (r152 != 0) goto L24;
        if (r11 <= r13) goto L23;
        if (r13 >= 32) goto L20;
        int r16 = 4;
    L21:
        r13 = m3930(r13, (r13 + 1) * r16, r12, r10);
    L22:
        int r19 = 1;
    L52:
        int r34 = m3922().length;
        if (r11 <= r34) goto L57;
        int r72 = r19;
        int r4 = Math.min(1073741823, (Math.max(r72, r34 >>> 1) + r34) | r72);
        if (r4 == r34) goto L57;
        this.f4817 = Arrays.copyOf(m3922(), r4);
        this.f4811 = Arrays.copyOf(m3924(), r4);
        this.f4813 = Arrays.copyOf(m3927(), r4);
    L57:
        m3922()[r10] = AbstractC1487.m3994(r12, 0, r13);
        m3924()[r10] = r23;
        m3927()[r10] = r24;
        this.f4815 = r11;
        this.f4818 += 32;
        return null;
    L20:
        r16 = 2;
        goto L21
    L23:
        Object r35 = this.f4812;
        Objects.requireNonNull(r35);
        AbstractC1487.m3996(r14, r11, r35);
        goto L22
    L24:
        int r142 = ~r13;
        int r5 = r12 & r142;
        int r18 = 0;
    L25:
        int r153 = r152 - r7;
        r19 = r7;
        int r73 = r33[r153];
        int r20 = r6;
        if ((r73 & r142) == r5) goto L28;
    L31:
        int r62 = r73 & r13;
        int r42 = r18 + 1;
        if (r62 == 0) goto L34;
        r18 = r42;
        r152 = r62;
        r7 = r19;
        r6 = r20;
        goto L25
    L34:
        if (r42 < 9) goto L45;
        LinkedHashMap r43 = new LinkedHashMap(m3925() + 1, 1.0f);
        if (isEmpty() == false) goto L38;
    L37:
        int r17 = -1;
    L39:
        if (r17 < 0) goto L43;
        r43.put(m3924()[r17], m3927()[r17]);
        int r36 = r17 + 1;
        if (r36 >= this.f4815) goto L37;
        r17 = r36;
        goto L39
    L43:
        this.f4812 = r43;
        this.f4817 = null;
        this.f4811 = null;
        this.f4813 = null;
        this.f4818 += 32;
        return r43.put(r23, r24);
    L38:
        r17 = 0;
        goto L39
    L45:
        if (r11 > r13) goto L47;
        r33[r153] = AbstractC1487.m3994(r73, r11, r13);
        goto L52
    L47:
        if (r13 >= r20) goto L49;
        int r44 = 4;
    L50:
        r13 = m3930(r13, (r13 + 1) * r44, r12, r10);
        goto L52
    L49:
        r44 = 2;
        goto L50
    L28:
        if (ᵎ.ᵎﹶ(r23, r83[r153]) == false) goto L31;
        Object r1 = r92[r153];
        r92[r153] = r24;
        return r1;
    L14:
        return r32.put(r23, r24);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object r2) {
        Map r0 = m3923();
        if (r0 != null) goto L5;
        Object r22 = m3929(r2);
        if (r22 != f4810) goto L10;
        return null;
    L10:
        return r22;
    L5:
        return r0.remove(r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map r0 = m3923();
        if (r0 == null) goto L7;
        return r0.size();
    L7:
        return this.f4815;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1478 r0 = this.f4819;
        if (r0 != null) goto L6;
        C1478 r02 = new C1478(1, this);
        this.f4819 = r02;
        return r02;
    L6:
        return r0;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final int[] m3922() {
        int[] r0 = this.f4817;
        Objects.requireNonNull(r0);
        return r0;
    }

    /* JADX INFO: renamed from: ʽ */
    public final Map m3923() {
        Object r0 = this.f4812;
        if ((r0 instanceof Map) == true) goto L5;
        return null;
    L5:
        return (Map) r0;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final Object[] m3924() {
        Object[] r0 = this.f4811;
        Objects.requireNonNull(r0);
        return r0;
    }

    /* JADX INFO: renamed from: ˈ */
    public final int m3925() {
        return (1 << (this.f4818 & 31)) - 1;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final int m3926(Object r8) {
        if (m3928() == false) goto L5;
        return -1;
    L5:
        int r0 = AbstractC1487.m4006(r8);
        int r2 = m3925();
        Object r3 = this.f4812;
        Objects.requireNonNull(r3);
        int r32 = AbstractC1487.m3998(r0 & r2, r3);
        if (r32 != 0) goto L8;
        return -1;
    L8:
        int r4 = ~r2;
        int r02 = r0 & r4;
    L9:
        int r33 = r32 - 1;
        int r5 = m3922()[r33];
        if ((r5 & r4) == r02) goto L12;
    L14:
        r32 = r5 & r2;
        if (r32 != 0) goto L9;
        return -1;
    L12:
        if (ᵎ.ᵎﹶ(r8, m3924()[r33]) == false) goto L14;
        return r33;
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public final Object[] m3927() {
        Object[] r0 = this.f4813;
        Objects.requireNonNull(r0);
        return r0;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final boolean m3928() {
        if (this.f4812 != null) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final Object m3929(Object r9) {
        if (m3928() == true) goto L8;
        int r3 = m3925();
        Object r4 = this.f4812;
        Objects.requireNonNull(r4);
        int r92 = AbstractC1487.m3995(r9, null, r3, r4, m3922(), m3924(), null);
        if (r92 == (-1)) goto L8;
        Object r0 = m3927()[r92];
        m3931(r92, r3);
        this.f4815--;
        this.f4818 += 32;
        return r0;
    L8:
        return f4810;
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public final int m3930(int r9, int r10, int r11, int r12) {
        Object r0 = AbstractC1487.m3997(r10);
        int r102 = r10 - 1;
        if (r12 == 0) goto L5;
        AbstractC1487.m3996(r11 & r102, r12 + 1, r0);
    L5:
        Object r112 = this.f4812;
        Objects.requireNonNull(r112);
        int[] r122 = m3922();
        int r1 = 0;
    L6:
        if (r1 > r9) goto L11;
        int r2 = AbstractC1487.m3998(r1, r112);
    L8:
        if (r2 == 0) goto L10;
        int r3 = r2 - 1;
        int r4 = r122[r3];
        int r5 = ((~r9) & r4) | r1;
        int r6 = r5 & r102;
        int r7 = AbstractC1487.m3998(r6, r0);
        AbstractC1487.m3996(r6, r2, r0);
        r122[r3] = AbstractC1487.m3994(r5, r7, r102);
        r2 = r4 & r9;
        goto L8
    L10:
        r1 = r1 + 1;
        goto L6
    L11:
        this.f4812 = r0;
        this.f4818 = AbstractC1487.m3994(this.f4818, 32 - Integer.numberOfLeadingZeros(r102), 31);
        return r102;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m3931(int r11, int r12) {
        Object r0 = this.f4812;
        Objects.requireNonNull(r0);
        int[] r1 = m3922();
        Object[] r2 = m3924();
        Object[] r3 = m3927();
        int r4 = size();
        int r5 = r4 - 1;
        if (r11 >= r5) goto L13;
        Object r8 = r2[r5];
        r2[r11] = r8;
        r3[r11] = r3[r5];
        r2[r5] = null;
        r3[r5] = null;
        r1[r11] = r1[r5];
        r1[r5] = 0;
        int r22 = AbstractC1487.m4006(r8) & r12;
        int r32 = AbstractC1487.m3998(r22, r0);
        if (r32 != r4) goto L8;
        AbstractC1487.m3996(r22, r11 + 1, r0);
        return;
    L8:
        int r33 = r32 - 1;
        int r02 = r1[r33];
        int r23 = r02 & r12;
        if (r23 == r4) goto L10;
        r32 = r23;
        goto L8
    L10:
        r1[r33] = AbstractC1487.m3994(r02, r11 + 1, r12);
        return;
    L13:
        r2[r11] = null;
        r3[r11] = null;
        r1[r11] = 0;
    }
}
