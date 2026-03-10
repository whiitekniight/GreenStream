package p224;

/* JADX INFO: renamed from: ˏ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C3476 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean f12355;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3471 f12356;

    public C3476(C3471 r1, boolean r2) {
        this.f12356 = r1;
        this.f12355 = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C3476) == false) goto L10;
        C3476 r42 = (C3476) r4;
        if (r42.f12356.equals(this.f12356) == false) goto L10;
        if (r42.f12355 != this.f12355) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return ((this.f12356.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f12355).hashCode();
    }
}
