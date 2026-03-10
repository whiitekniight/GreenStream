package p356;

/* JADX INFO: renamed from: ᵎˑ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4753 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f16785;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f16786;

    public C4753(int r1, String r2) {
        this.f16786 = r2;
        this.f16785 = r1;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (C4753.class != r3.getClass()) goto L16;
        C4753 r32 = (C4753) r3;
        if (this.f16785 == r32.f16785) goto L13;
        return false;
    L13:
        return this.f16786.equals(r32.f16786);
    L16:
        return false;
    }

    public final int hashCode() {
        return (this.f16786.hashCode() * 31) + this.f16785;
    }
}
