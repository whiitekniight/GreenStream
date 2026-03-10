package p067;

import android.util.Pair;
import p317.AbstractC4195;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ʽⁱ.ʼˈ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1928 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C1953 f6572 = null;

    static {
        f6572 = new C1953();
        AbstractC4195.m8513(0);
        AbstractC4195.m8513(1);
        AbstractC4195.m8513(2);
    }

    public boolean equals(Object r11) {
        if (this != r11) goto L6;
    L38:
        return true;
    L6:
        if ((r11 instanceof AbstractC1928) == false) goto L39;
        AbstractC1928 r112 = (AbstractC1928) r11;
        if (r112.mo4933() != mo4933()) goto L39;
        if (r112.mo4938() != mo4938()) goto L39;
        C1949 r1 = new C1949();
        C1950 r3 = new C1950();
        C1949 r4 = new C1949();
        C1950 r5 = new C1950();
        int r6 = 0;
    L15:
        if (r6 >= mo4933()) goto L20;
        if (mo4932(r6, r1, 0).equals(r112.mo4932(r6, r4, 0)) == false) goto L39;
        r6 = r6 + 1;
        goto L15
    L20:
        int r12 = 0;
    L22:
        if (r12 >= mo4938()) goto L27;
        if (mo4942(r12, r3, true).equals(r112.mo4942(r12, r5, true)) == false) goto L39;
        r12 = r12 + 1;
        goto L22
    L27:
        int r13 = mo4940(true);
        if (r13 != r112.mo4940(true)) goto L39;
        int r32 = mo4929(true);
        if (r32 != r112.mo4929(true)) goto L39;
    L33:
        if (r13 == r32) goto L38;
        int r42 = mo4934(r13, 0, true);
        if (r42 != r112.mo4934(r13, 0, true)) goto L39;
        r13 = r42;
    L39:
        return false;
    }

    public int hashCode() {
        C1949 r0 = new C1949();
        C1950 r1 = new C1950();
        int r2 = mo4933() + 217;
        int r4 = 0;
    L4:
        if (r4 >= mo4933()) goto L6;
        r2 = (r2 * 31) + mo4932(r4, r0, 0).hashCode();
        r4 = r4 + 1;
        goto L4
    L6:
        int r02 = mo4938() + (r2 * 31);
        int r22 = 0;
    L8:
        if (r22 >= mo4938()) goto L10;
        r02 = (r02 * 31) + mo4942(r22, r1, true).hashCode();
        r22 = r22 + 1;
        goto L8
    L10:
        int r12 = mo4940(true);
    L12:
        if (r12 == (-1)) goto L14;
        r02 = (r02 * 31) + r12;
        r12 = mo4934(r12, 0, true);
        goto L12
    L14:
        return r02;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final Pair m4927(C1949 r9, C1950 r10, int r11, long r12) {
        Pair r92 = m4930(r9, r10, r11, r12, 0);
        r92.getClass();
        return r92;
    }

    /* JADX INFO: renamed from: ʼᐧ */
    public final boolean m4928() {
        if (mo4933() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ʽ */
    public int mo4929(boolean r1) {
        if (m4928() == false) goto L7;
        return -1;
    L7:
        return mo4933() - 1;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final Pair m4930(C1949 r5, C1950 r6, int r7, long r8, long r10) {
        AbstractC4214.m8571(r7, mo4933());
        mo4932(r7, r5, r10);
        if (r8 != (-9223372036854775807L)) goto L8;
        r8 = r5.f6684;
        if (r8 != (-9223372036854775807L)) goto L8;
        return null;
    L8:
        int r72 = r5.f6680;
        mo4942(r72, r6, false);
    L10:
        if (r72 >= r5.f6676) goto L16;
        if (r6.f6688 == r8) goto L16;
        int r1 = r72 + 1;
        if (mo4942(r1, r6, false).f6688 > r8) goto L16;
        r72 = r1;
    L16:
        mo4942(r72, r6, true);
        long r82 = r8 - r6.f6688;
        long r0 = r6.f6687;
        if (r0 == (-9223372036854775807L)) goto L19;
        r82 = Math.min(r82, r0 - 1);
    L19:
        long r73 = Math.max(0, r82);
        Object r52 = r6.f6690;
        r52.getClass();
        return Pair.create(r52, Long.valueOf(r73));
    }

    /* JADX INFO: renamed from: ˈ */
    public final int m4931(int r4, C1950 r5, C1949 r6, int r7, boolean r8) {
        int r52 = mo4942(r4, r5, false).f6686;
        if (mo4932(r52, r6, 0).f6676 != r4) goto L10;
        int r42 = mo4934(r52, r7, r8);
        if (r42 != (-1)) goto L8;
        return -1;
    L8:
        return mo4932(r42, r6, 0).f6680;
    L10:
        return r4 + 1;
    }

    /* JADX INFO: renamed from: ˉʿ */
    public abstract C1949 mo4932(int r1, C1949 r2, long r3);

    /* JADX INFO: renamed from: ˉˆ */
    public abstract int mo4933();

    /* JADX INFO: renamed from: ˑﹳ */
    public int mo4934(int r3, int r4, boolean r5) {
        if (r4 == 0) goto L17;
        if (r4 != 1) goto L6;
        return r3;
    L6:
        if (r4 != 2) goto L14;
        if (r3 != mo4929(r5)) goto L12;
        return mo4940(r5);
    L12:
        return r3 + 1;
    L14:
        throw new IllegalStateException();
    L17:
        if (r3 != mo4929(r5)) goto L21;
        return -1;
    L21:
        return r3 + 1;
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public int mo4935(int r3, int r4, boolean r5) {
        if (r4 == 0) goto L17;
        if (r4 != 1) goto L6;
        return r3;
    L6:
        if (r4 != 2) goto L14;
        if (r3 != mo4940(r5)) goto L12;
        return mo4929(r5);
    L12:
        return r3 - 1;
    L14:
        throw new IllegalStateException();
    L17:
        if (r3 != mo4940(r5)) goto L21;
        return -1;
    L21:
        return r3 - 1;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public C1950 mo4936(Object r2, C1950 r3) {
        return mo4942(mo4939(r2), r3, true);
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public final void m4937(int r3, C1949 r4) {
        mo4932(r3, r4, 0);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public abstract int mo4938();

    /* JADX INFO: renamed from: ⁱˊ */
    public abstract int mo4939(Object r1);

    /* JADX INFO: renamed from: ﹳٴ */
    public int mo4940(boolean r1) {
        if (m4928() == false) goto L6;
        return -1;
    L6:
        return 0;
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public abstract Object mo4941(int r1);

    /* JADX INFO: renamed from: ﾞᴵ */
    public abstract C1950 mo4942(int r1, C1950 r2, boolean r3);
}
