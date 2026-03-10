package p436;

/* JADX INFO: renamed from: ﹳﾞ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C5500 extends RuntimeException {

    /* JADX INFO: renamed from: ʾˋ */
    public final int f19708;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Throwable f19709;

    public C5500(int r1, Throwable r2) {
        super(r2);
        this.f19708 = r1;
        this.f19709 = r2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f19709;
    }
}
