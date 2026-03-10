package p134;

/* JADX INFO: renamed from: ˈˋ.ﹳﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C2602 {

    /* JADX INFO: renamed from: ʽ */
    public final C2557 f9237;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C2572 f9238;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C2518 f9239;

    public C2602(C2518 r1, C2572 r2, C2557 r3) {
        this.f9239 = r1;
        this.f9238 = r2;
        this.f9237 = r3;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof C2602) == false) goto L14;
        C2602 r52 = (C2602) r5;
        if (this.f9239.equals(r52.f9239) == false) goto L14;
        if (this.f9238.equals(r52.f9238) == false) goto L14;
        if (this.f9237.equals(r52.f9237) == false) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        return ((((this.f9239.hashCode() ^ 1000003) * 1000003) ^ this.f9238.hashCode()) * 1000003) ^ this.f9237.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f9239 + ", osData=" + this.f9238 + ", deviceData=" + this.f9237 + "}";
    }
}
