package p267;

import java.util.Arrays;
import p231.AbstractC3507;
import p442.AbstractC5579;

/* JADX INFO: renamed from: יـ.יـ */
/* JADX INFO: loaded from: classes.dex */
public final class C3843 implements Cloneable {

    /* JADX INFO: renamed from: ʽʽ */
    public /* synthetic */ int f14085;

    /* JADX INFO: renamed from: ʾˋ */
    public /* synthetic */ int[] f14086;

    /* JADX INFO: renamed from: ᴵˊ */
    public /* synthetic */ Object[] f14087;

    public C3843() {
        int r1 = 4;
    L3:
        int r3 = 40;
        if (r1 >= 32) goto L9;
        int r2 = (1 << r1) - 12;
        if (40 <= r2) goto L7;
        r1 = r1 + 1;
        goto L3
    L7:
        r3 = r2;
    L9:
        int r32 = r3 / 4;
        this.f14086 = new int[r32];
        this.f14087 = new Object[r32];
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m7911();
    }

    public final String toString() {
        int r0 = this.f14085;
        if (r0 > 0) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(r0 * 28);
        r1.append('{');
        int r02 = this.f14085;
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L15;
        if (r2 <= 0) goto L10;
        r1.append(", ");
    L10:
        r1.append(this.f14086[r2]);
        r1.append('=');
        Object r3 = m7913(r2);
        if (r3 == this) goto L13;
        r1.append(r3);
    L14:
        r2 = r2 + 1;
        goto L7
    L13:
        r1.append("(this Map)");
        goto L14
    L15:
        r1.append('}');
        return r1.toString();
    }

    /* JADX INFO: renamed from: ˈ */
    public final Object m7909(int r3) {
        int r32 = AbstractC3507.m7265(this.f14086, this.f14085, r3);
        if (r32 < 0) goto L8;
        Object r33 = this.f14087[r32];
        if (r33 == AbstractC3838.f14067) goto L10;
        return r33;
    L10:
        return null;
    L8:
        return null;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m7910(int r7, Object r8) {
        int r0 = AbstractC3507.m7265(this.f14086, this.f14085, r7);
        if (r0 < 0) goto L6;
        this.f14087[r0] = r8;
        return;
    L6:
        int r02 = ~r0;
        int r1 = this.f14085;
        if (r02 >= r1) goto L13;
        Object[] r2 = this.f14087;
        if (r2[r02] != AbstractC3838.f14067) goto L13;
        this.f14086[r02] = r7;
        r2[r02] = r8;
        return;
    L13:
        if (r1 < this.f14086.length) goto L22;
        int r12 = (r1 + 1) * 4;
        int r4 = 4;
    L16:
        if (r4 >= 32) goto L21;
        int r5 = (1 << r4) - 12;
        if (r12 <= r5) goto L19;
        r4 = r4 + 1;
        goto L16
    L19:
        r12 = r5;
    L21:
        int r13 = r12 / 4;
        this.f14086 = Arrays.copyOf(this.f14086, r13);
        this.f14087 = Arrays.copyOf(this.f14087, r13);
    L22:
        int r14 = this.f14085;
        if ((r14 - r02) == 0) goto L25;
        int[] r22 = this.f14086;
        int r42 = r02 + 1;
        AbstractC5579.m10713(r42, r02, r14, r22, r22);
        Object[] r15 = this.f14087;
        AbstractC5579.m10717(r42, r02, this.f14085, r15, r15);
    L25:
        this.f14086[r02] = r7;
        this.f14087[r02] = r8;
        this.f14085++;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final C3843 m7911() {
        C3843 r0 = (C3843) super.clone();
        r0.f14086 = (int[]) this.f14086.clone();
        r0.f14087 = (Object[]) this.f14087.clone();
        return r0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7912(int r7, Object r8) {
        int r0 = this.f14085;
        if (r0 == 0) goto L9;
        if (r7 > this.f14086[r0 - 1]) goto L9;
        m7910(r7, r8);
        return;
    L9:
        if (r0 < this.f14086.length) goto L18;
        int r1 = (r0 + 1) * 4;
        int r4 = 4;
    L12:
        if (r4 >= 32) goto L17;
        int r5 = (1 << r4) - 12;
        if (r1 <= r5) goto L15;
        r4 = r4 + 1;
        goto L12
    L15:
        r1 = r5;
    L17:
        int r12 = r1 / 4;
        this.f14086 = Arrays.copyOf(this.f14086, r12);
        this.f14087 = Arrays.copyOf(this.f14087, r12);
    L18:
        this.f14086[r0] = r7;
        this.f14087[r0] = r8;
        this.f14085 = r0 + 1;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final Object m7913(int r3) {
        Object[] r0 = this.f14087;
        if (r3 >= r0.length) goto L7;
        return r0[r3];
    L7:
        throw new ArrayIndexOutOfBoundsException();
    }
}
