package p134;

import p047.AbstractC1703;

/* JADX INFO: renamed from: ˈˋ.ᐧᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C2575 extends AbstractC2536 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f9125;

    public C2575(String r1) {
        this.f9125 = r1;
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof AbstractC2536) == false) goto L9;
        String r22 = ((C2575) ((AbstractC2536) r2)).f9125;
        return this.f9125.equals(r22);
    L9:
        return false;
    }

    public final int hashCode() {
        return this.f9125.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1703.m4486(new StringBuilder("Log{content="), this.f9125, "}");
    }
}
