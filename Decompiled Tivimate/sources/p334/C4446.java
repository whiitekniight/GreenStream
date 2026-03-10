package p334;

/* JADX INFO: renamed from: ᴵˋ.ˉˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C4446 extends AbstractC4465 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4460 f16223;

    public C4446() {
        this.f16223 = C4460.f16270;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C4446.class == r3.getClass()) goto L10;
        return false;
    L10:
        return this.f16223.equals(((C4446) r3).f16223);
    }

    public final int hashCode() {
        int r0 = C4446.class.getName().hashCode() * 31;
        return this.f16223.hashCode() + r0;
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f16223 + '}';
    }
}
