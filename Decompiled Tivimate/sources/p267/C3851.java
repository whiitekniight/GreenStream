package p267;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p164.AbstractC2927;
import p231.AbstractC3507;
import p442.AbstractC5579;

/* JADX INFO: renamed from: יـ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public class C3851 {

    /* JADX INFO: renamed from: ʽʽ */
    public int f14109;

    /* JADX INFO: renamed from: ʾˋ */
    public int[] f14110;

    /* JADX INFO: renamed from: ᴵˊ */
    public Object[] f14111;

    public C3851(int r2) {
        if (r2 != 0) goto L5;
        int[] r0 = AbstractC3507.f12479;
    L6:
        this.f14110 = r0;
        if (r2 != 0) goto L9;
        Object[] r22 = AbstractC3507.f12478;
    L10:
        this.f14111 = r22;
        return;
    L9:
        r22 = new Object[r2 << 1];
        goto L10
    L5:
        r0 = new int[r2];
        goto L6
    }

    public void clear() {
        if (this.f14109 <= 0) goto L6;
        this.f14110 = AbstractC3507.f12479;
        this.f14111 = AbstractC3507.f12478;
        this.f14109 = 0;
    L6:
        if (this.f14109 > 0) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object r1) {
        if (m7932(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean containsValue(Object r1) {
        if (m7935(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L44;
        return true;
    L44:
        if ((r8 instanceof C3851) == false) goto L25;
        int r2 = this.f14109;     // Catch: Throwable -> L43
        if (r2 == ((C3851) r8).f14109) goto L11;
        return false;
    L11:
        C3851 r82 = (C3851) r8;     // Catch: Throwable -> L43
        int r3 = 0;
    L12:
        if (r3 >= r2) goto L23;
        Object r4 = m7936(r3);     // Catch: Throwable -> L43
        Object r5 = m7931(r3);     // Catch: Throwable -> L43
        Object r6 = r82.get(r4);     // Catch: Throwable -> L43
        if (r5 != null) goto L20;
        if (r6 != null) goto L18;
        if (r82.containsKey(r4) == false) goto L18;
    L22:
        r3 = r3 + 1;     // Catch: Throwable -> L43
    L18:
        return false;
    L20:
        if (r5.equals(r6) == true) goto L22;
        return false;
    L23:
        return true;
    L25:
        if ((r8 instanceof Map) == false) goto L42;
        if (this.f14109 == ((Map) r8).size()) goto L29;
        return false;
    L29:
        int r22 = this.f14109;     // Catch: Throwable -> L43
        int r32 = 0;
    L30:
        if (r32 >= r22) goto L41;
        Object r42 = m7936(r32);     // Catch: Throwable -> L43
        Object r52 = m7931(r32);     // Catch: Throwable -> L43
        Object r62 = ((Map) r8).get(r42);     // Catch: Throwable -> L43
        if (r52 != null) goto L38;
        if (r62 != null) goto L36;
        if (((Map) r8).containsKey(r42) == false) goto L36;
    L40:
        r32 = r32 + 1;
    L36:
        return false;
    L38:
        if (r52.equals(r62) == true) goto L40;
        return false;
    L41:
        return true;
    L42:
        return false;
    }

    public Object get(Object r2) {
        int r22 = m7932(r2);
        if (r22 >= 0) goto L5;
        return null;
    L5:
        return this.f14111[(r22 << 1) + 1];
    }

    public final Object getOrDefault(Object r1, Object r2) {
        int r12 = m7932(r1);
        if (r12 >= 0) goto L5;
        return r2;
    L5:
        return this.f14111[(r12 << 1) + 1];
    }

    public int hashCode() {
        int[] r0 = this.f14110;
        Object[] r1 = this.f14111;
        int r2 = this.f14109;
        int r4 = 1;
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r5 >= r2) goto L9;
        Object r7 = r1[r4];
        int r8 = r0[r5];
        if (r7 == null) goto L7;
        int r72 = r7.hashCode();
    L8:
        r6 = r6 + (r72 ^ r8);
        r5 = r5 + 1;
        r4 = r4 + 2;
        goto L3
    L7:
        r72 = 0;
        goto L8
    L9:
        return r6;
    }

    public final boolean isEmpty() {
        if (this.f14109 > 0) goto L6;
        return true;
    L6:
        return false;
    }

    public Object put(Object r8, Object r9) {
        int r0 = this.f14109;
        if (r8 == null) goto L5;
        int r1 = r8.hashCode();
    L6:
        if (r8 == null) goto L8;
        int r2 = m7930(r1, r8);
    L9:
        if (r2 < 0) goto L12;
        int r82 = (r2 << 1) + 1;
        Object[] r02 = this.f14111;
        Object r12 = r02[r82];
        r02[r82] = r9;
        return r12;
    L12:
        int r22 = ~r2;
        int[] r3 = this.f14110;
        if (r0 < r3.length) goto L26;
        int r4 = 8;
        if (r0 < 8) goto L18;
        r4 = (r0 >> 1) + r0;
    L21:
        this.f14110 = Arrays.copyOf(r3, r4);
        this.f14111 = Arrays.copyOf(this.f14111, r4 << 1);
        if (r0 == this.f14109) goto L26;
        throw new ConcurrentModificationException();
    L18:
        if (r0 >= 4) goto L21;
        r4 = 4;
    L26:
        if (r22 >= r0) goto L28;
        int[] r32 = this.f14110;
        int r42 = r22 + 1;
        AbstractC5579.m10713(r42, r22, r0, r32, r32);
        Object[] r33 = this.f14111;
        AbstractC5579.m10717(r42 << 1, r22 << 1, this.f14109 << 1, r33, r33);
    L28:
        int r34 = this.f14109;
        if (r0 != r34) goto L35;
        int[] r03 = this.f14110;
        if (r22 >= r03.length) goto L35;
        r03[r22] = r1;
        Object[] r04 = this.f14111;
        int r13 = r22 << 1;
        r04[r13] = r8;
        r04[r13 + 1] = r9;
        this.f14109 = r34 + 1;
        return null;
    L35:
        throw new ConcurrentModificationException();
    L8:
        r2 = m7933();
        goto L9
    L5:
        r1 = 0;
        goto L6
    }

    public final Object putIfAbsent(Object r2, Object r3) {
        Object r0 = get(r2);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return put(r2, r3);
    }

    public Object remove(Object r1) {
        int r12 = m7932(r1);
        if (r12 >= 0) goto L5;
        return null;
    L5:
        return mo5399(r12);
    }

    public final boolean remove(Object r2, Object r3) {
        int r22 = m7932(r2);
        if (r22 >= 0) goto L5;
        return false;
    L5:
        if (AbstractC2927.m6273(r3, m7931(r22)) == false) goto L10;
        mo5399(r22);
        return true;
    L10:
        return false;
    }

    public final Object replace(Object r1, Object r2) {
        int r12 = m7932(r1);
        if (r12 >= 0) goto L5;
        return null;
    L5:
        return mo5397(r12, r2);
    }

    public final boolean replace(Object r2, Object r3, Object r4) {
        int r22 = m7932(r2);
        if (r22 >= 0) goto L5;
        return false;
    L5:
        if (AbstractC2927.m6273(r3, m7931(r22)) == false) goto L10;
        mo5397(r22, r4);
        return true;
    L10:
        return false;
    }

    public final int size() {
        return this.f14109;
    }

    public final String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(this.f14109 * 28);
        r1.append('{');
        int r0 = this.f14109;
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L19;
        if (r2 <= 0) goto L10;
        r1.append(", ");
    L10:
        Object r3 = m7936(r2);
        if (r3 == r1) goto L13;
        r1.append(r3);
    L14:
        r1.append('=');
        Object r32 = m7931(r2);
        if (r32 == r1) goto L17;
        r1.append(r32);
    L18:
        r2 = r2 + 1;
        goto L7
    L17:
        r1.append("(this Map)");
        goto L18
    L13:
        r1.append("(this Map)");
        goto L14
    L19:
        r1.append('}');
        return r1.toString();
    }

    /* JADX INFO: renamed from: ʼˎ */
    public Object mo5397(int r4, Object r5) {
        boolean r0 = false;
        if (r4 >= 0) goto L5;
    L7:
        if (r0 == false) goto L10;
        int r42 = (r4 << 1) + 1;
        Object[] r02 = this.f14111;
        Object r1 = r02[r42];
        r02[r42] = r5;
        return r1;
    L10:
        AbstractC3507.m7263("Expected index to be within 0..size()-1, but was " + r4);
        throw null;
    L5:
        if (r4 >= this.f14109) goto L7;
        r0 = true;
        goto L7
    }

    /* JADX INFO: renamed from: ʽ */
    public final int m7930(int r6, Object r7) {
        int r0 = this.f14109;
        if (r0 != 0) goto L6;
        return -1;
    L6:
        int r1 = AbstractC3507.m7265(this.f14110, r0, r6);
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (AbstractC2927.m6273(r7, this.f14111[r1 << 1]) == true) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r0) goto L20;
        if (this.f14110[r2] != r6) goto L20;
        if (AbstractC2927.m6273(r7, this.f14111[r2 << 1]) == true) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r12 = r1 - 1;
    L21:
        if (r12 < 0) goto L29;
        if (this.f14110[r12] != r6) goto L29;
        if (AbstractC2927.m6273(r7, this.f14111[r12 << 1]) == true) goto L26;
        r12 = r12 - 1;
        goto L21
    L26:
        return r12;
    L29:
        return ~r2;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final Object m7931(int r4) {
        boolean r0 = false;
        if (r4 >= 0) goto L5;
    L7:
        if (r0 == true) goto L9;
        AbstractC3507.m7263("Expected index to be within 0..size()-1, but was " + r4);
        throw null;
    L9:
        return this.f14111[(r4 << 1) + 1];
    L5:
        if (r4 >= this.f14109) goto L7;
        r0 = true;
        goto L7
    }

    /* JADX INFO: renamed from: ˈ */
    public final int m7932(Object r2) {
        if (r2 != null) goto L6;
        return m7933();
    L6:
        return m7930(r2.hashCode(), r2);
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final int m7933() {
        int r0 = this.f14109;
        if (r0 != 0) goto L6;
        return -1;
    L6:
        int r1 = AbstractC3507.m7265(this.f14110, r0, 0);
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (this.f14111[r1 << 1] == null) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r0) goto L20;
        if (this.f14110[r2] != 0) goto L20;
        if (this.f14111[r2 << 1] == null) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r12 = r1 - 1;
    L21:
        if (r12 < 0) goto L29;
        if (this.f14110[r12] != 0) goto L29;
        if (this.f14111[r12 << 1] == null) goto L26;
        r12 = r12 - 1;
        goto L21
    L26:
        return r12;
    L29:
        return ~r2;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public void mo5398(C3842 r5) {
        int r0 = r5.f14109;
        m7934(this.f14109 + r0);
        int r2 = 0;
        if (this.f14109 != 0) goto L7;
        if (r0 <= 0) goto L9;
        AbstractC5579.m10713(0, 0, r0, r5.f14110, this.f14110);
        int r3 = r0 << 1;
        AbstractC5579.m10717(0, 0, r3, r5.f14111, this.f14111);
        this.f14109 = r0;
        return;
    L9:
        return;
    L7:
        if (r2 >= r0) goto L11;
        put(r5.m7936(r2), r5.m7931(r2));
        r2 = r2 + 1;
        goto L7
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public Object mo5399(int r11) {
        if (r11 < 0) goto L33;
        int r1 = this.f14109;
        if (r11 >= r1) goto L33;
        Object[] r2 = this.f14111;
        int r3 = r11 << 1;
        Object r4 = r2[r3 + 1];
        if (r1 > 1) goto L10;
        clear();
        return r4;
    L10:
        int r6 = r1 - 1;
        int[] r7 = this.f14110;
        int r9 = 8;
        if (r7.length > 8) goto L13;
    L24:
        if (r11 >= r6) goto L26;
        int r22 = r11 + 1;
        AbstractC5579.m10713(r11, r22, r1, r7, r7);
        Object[] r112 = this.f14111;
        AbstractC5579.m10717(r3, r22 << 1, r1 << 1, r112, r112);
    L26:
        Object[] r113 = this.f14111;
        int r23 = r6 << 1;
        r113[r23] = null;
        r113[r23 + 1] = null;
    L28:
        if (r1 != this.f14109) goto L32;
        this.f14109 = r6;
        return r4;
    L32:
        throw new ConcurrentModificationException();
    L13:
        if (r1 >= (r7.length / 3)) goto L24;
        if (r1 <= 8) goto L16;
        r9 = r1 + (r1 >> 1);
    L16:
        this.f14110 = Arrays.copyOf(r7, r9);
        this.f14111 = Arrays.copyOf(this.f14111, r9 << 1);
        if (r1 != this.f14109) goto L23;
        if (r11 <= 0) goto L20;
        AbstractC5579.m10713(0, 0, r11, r7, this.f14110);
        AbstractC5579.m10717(0, 0, r3, r2, this.f14111);
    L20:
        if (r11 >= r6) goto L28;
        int r8 = r11 + 1;
        AbstractC5579.m10713(r11, r8, r1, r7, this.f14110);
        AbstractC5579.m10717(r3, r8 << 1, r1 << 1, r2, this.f14111);
        goto L28
    L23:
        throw new ConcurrentModificationException();
    L33:
        AbstractC3507.m7263("Expected index to be within 0..size()-1, but was " + r11);
        throw null;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m7934(int r4) {
        int r0 = this.f14109;
        int[] r1 = this.f14110;
        if (r1.length >= r4) goto L6;
        this.f14110 = Arrays.copyOf(r1, r4);
        this.f14111 = Arrays.copyOf(this.f14111, r4 * 2);
    L6:
        if (this.f14109 != r0) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m7935(Object r6) {
        int r0 = this.f14109 * 2;
        Object[] r1 = this.f14111;
        if (r6 != null) goto L11;
        int r62 = 1;
    L5:
        if (r62 >= r0) goto L18;
        if (r1[r62] == null) goto L9;
        r62 = r62 + 2;
        goto L5
    L9:
        return r62 >> 1;
    L18:
        return -1;
    L11:
        int r3 = 1;
    L12:
        if (r3 >= r0) goto L24;
        if (r6.equals(r1[r3]) == true) goto L16;
        r3 = r3 + 2;
        goto L12
    L16:
        return r3 >> 1;
    L24:
        return -1;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final Object m7936(int r4) {
        boolean r0 = false;
        if (r4 >= 0) goto L5;
    L7:
        if (r0 == true) goto L9;
        AbstractC3507.m7263("Expected index to be within 0..size()-1, but was " + r4);
        throw null;
    L9:
        return this.f14111[r4 << 1];
    L5:
        if (r4 >= this.f14109) goto L7;
        r0 = true;
        goto L7
    }
}
