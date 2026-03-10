package p330;

/* JADX INFO: renamed from: ᴵˆ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4403 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final EnumC4399 f16125;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object f16126;

    public C4403(Object r1, EnumC4399 r2) {
        this.f16126 = r1;
        this.f16125 = r2;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof C4403) == false) goto L12;
        C4403 r52 = (C4403) r5;
        if (this.f16126.equals(r52.f16126) == false) goto L12;
        if (this.f16125.equals(r52.f16125) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        int r1 = ((1000003 * 1000003) ^ this.f16126.hashCode()) * 1000003;
        return (this.f16125.hashCode() ^ r1) * (-721379959);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f16126 + ", priority=" + this.f16125 + ", productData=null, eventContext=null}";
    }
}
