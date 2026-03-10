package p134;

import p047.AbstractC1703;

/* JADX INFO: renamed from: ˈˋ.ﹶᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C2605 extends AbstractC2570 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f9241;

    public C2605(String r1) {
        this.f9241 = r1;
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof AbstractC2570) == false) goto L9;
        String r22 = ((C2605) ((AbstractC2570) r2)).f9241;
        return this.f9241.equals(r22);
    L9:
        return false;
    }

    public final int hashCode() {
        return this.f9241.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1703.m4486(new StringBuilder("User{identifier="), this.f9241, "}");
    }
}
