package p241;

/* JADX INFO: renamed from: ˑʼ.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3567 implements Runnable {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f12661;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ AbstractComponentCallbacksC3606 f12662;

    public /* synthetic */ RunnableC3567(int r1, AbstractComponentCallbacksC3606 r2) {
        this.f12661 = r1;
        this.f12662 = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f12661) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f12662.m7506(false);
        return;
    L6:
        this.f12662.m7504();
    }
}
