package p067;

import p317.AbstractC4195;

/* JADX INFO: renamed from: ʽⁱ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public class C1933 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f6588;

    static {
        new C1933(new C1951());
        AbstractC4195.m8513(0);
        AbstractC4195.m8513(1);
        AbstractC4195.m8513(2);
        AbstractC4195.m8513(3);
        AbstractC4195.m8513(4);
        AbstractC4195.m8513(5);
        AbstractC4195.m8513(6);
        AbstractC4195.m8513(7);
    }

    public C1933(C1951 r3) {
        String r0 = AbstractC4195.f15423;
        this.f6588 = r3.f6693;
    }

    public final boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof C1933) == true) goto L9;
        return false;
    L9:
        if (this.f6588 != ((C1933) r6).f6588) goto L11;
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        long r1 = this.f6588;
        return ((((int) 0) * 31) + ((int) (r1 ^ (r1 >>> 32)))) * 923521;
    }
}
