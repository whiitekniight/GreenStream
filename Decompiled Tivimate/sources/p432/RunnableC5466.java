package p432;

/* JADX INFO: renamed from: ﹳᵢ.ᵔי */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5466 implements Runnable {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f19545;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ C5444 f19546;

    public /* synthetic */ RunnableC5466(C5444 r1, int r2) {
        this.f19545 = r2;
        this.f19546 = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f19545) {
            case 0: goto L10;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        C5444 r0 = this.f19546;
        if (r0.f19419 == true) goto L12;
        InterfaceC5450 r1 = r0.f19402;
        r1.getClass();
        r1.mo7709(r0);
        return;
    L12:
        return;
    L8:
        this.f19546.m10495();
        return;
    L10:
        this.f19546.f19396 = true;
    }
}
