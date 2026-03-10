package p320;

/* JADX INFO: renamed from: ᐧٴ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C4254 extends AbstractC4228 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4261 f15592;

    public C4254(C4261 r1) {
        this.f15592 = r1;
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L5;
        return true;
    L5:
        if ((r2 instanceof AbstractC4228) == false) goto L12;
        AbstractC4228 r22 = (AbstractC4228) r2;
        Object r0 = EnumC4235.f15548;
        if (r0.equals(r0) == false) goto L15;
        C4261 r23 = ((C4254) r22).f15592;
        if (this.f15592.equals(r23) == false) goto L16;
        return true;
    L16:
        return false;
    L15:
        return false;
    L12:
        return false;
    }

    public final int hashCode() {
        return ((EnumC4235.f15548.hashCode() ^ 1000003) * 1000003) ^ this.f15592.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC4235.f15548 + ", androidClientInfo=" + this.f15592 + "}";
    }
}
