package p459;

/* JADX INFO: renamed from: ﹶﾞ.ʽˑ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5712 implements Runnable {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ long f20603;

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f20604;

    /* JADX INFO: renamed from: ˈٴ */
    public final /* synthetic */ boolean f20605;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ C5794 f20606;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final /* synthetic */ C5736 f20607;

    public /* synthetic */ RunnableC5712(C5736 r1, C5794 r2, long r3, boolean r5, int r6) {
        this.f20604 = r6;
        this.f20606 = r2;
        this.f20603 = r3;
        this.f20605 = r5;
        this.f20607 = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f20604) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C5736 r0 = this.f20607;
        C5794 r1 = this.f20606;
        r0.m11081(r1);
        boolean r2 = this.f20605;
        r0.m11096(r1, this.f20603, r2);
        return;
    L6:
        C5736 r02 = this.f20607;
        C5794 r12 = this.f20606;
        r02.m11081(r12);
        boolean r22 = this.f20605;
        r02.m11096(r12, this.f20603, r22);
    }
}
