package p432;

/* JADX INFO: renamed from: ﹳᵢ.ˑٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5447 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean f19434;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f19435;

    public C5447(int r1, boolean r2) {
        this.f19435 = r1;
        this.f19434 = r2;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L16;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (C5447.class != r3.getClass()) goto L19;
        C5447 r32 = (C5447) r3;
        if (this.f19435 == r32.f19435) goto L11;
        return false;
    L11:
        if (this.f19434 != r32.f19434) goto L18;
        return true;
    L18:
        return false;
    L19:
        return false;
    L16:
        return true;
    }

    public final int hashCode() {
        return (this.f19435 * 31) + (this.f19434 ? 1 : 0);
    }
}
