package p134;

import java.util.List;

/* JADX INFO: renamed from: ˈˋ.ˊᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C2551 extends AbstractC2517 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final List f9047;

    public C2551(List r1) {
        this.f9047 = r1;
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof AbstractC2517) == false) goto L9;
        List r22 = ((C2551) ((AbstractC2517) r2)).f9047;
        return this.f9047.equals(r22);
    L9:
        return false;
    }

    public final int hashCode() {
        return this.f9047.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f9047 + "}";
    }
}
