package p107;

/* JADX INFO: renamed from: ˆʽ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C2359 extends AbstractC2372 {

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f8457;

    public C2359(Object r1) {
        this.f8457 = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2359) == true) goto L5;
        return false;
    L5:
        return this.f8457.equals(((C2359) r2).f8457);
    }

    public final int hashCode() {
        return this.f8457.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f8457 + ")";
    }

    @Override // p107.AbstractC2372
    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean mo5523() {
        return true;
    }

    @Override // p107.AbstractC2372
    /* JADX INFO: renamed from: ﹳٴ */
    public final Object mo5524() {
        return this.f8457;
    }
}
