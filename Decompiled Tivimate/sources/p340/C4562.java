package p340;

/* JADX INFO: renamed from: ᴵᵔ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C4562 implements Cloneable {

    /* JADX INFO: renamed from: ʽʽ */
    public final float f16487;

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f16488;

    /* JADX INFO: renamed from: ˈٴ */
    public float f16489;

    /* JADX INFO: renamed from: ᴵˊ */
    public boolean f16490;

    public C4562(float r1) {
        this.f16487 = r1;
    }

    public C4562(float r1, float r2) {
        this.f16487 = r1;
        this.f16489 = r2;
        this.f16488 = true;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m9052();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4562 m9052() {
        if (this.f16488 == false) goto L5;
        C4562 r0 = new C4562(this.f16487, this.f16489);
    L6:
        r0.f16490 = this.f16490;
        return r0;
    L5:
        r0 = new C4562(this.f16487);
        goto L6
    }
}
