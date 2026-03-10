package p334;

/* JADX INFO: renamed from: ᴵˋ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4461 extends AbstractC4465 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4460 f16272;

    public C4461() {
        this.f16272 = C4460.f16270;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C4461.class == r3.getClass()) goto L10;
        return false;
    L10:
        return this.f16272.equals(((C4461) r3).f16272);
    }

    public final int hashCode() {
        int r0 = C4461.class.getName().hashCode() * 31;
        return this.f16272.hashCode() + r0;
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f16272 + '}';
    }
}
