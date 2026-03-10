package p407;

import p432.C5470;

/* JADX INFO: renamed from: ⁱᴵ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5210 implements Runnable {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ Object f18813;

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f18814;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ C5198 f18815;

    public /* synthetic */ RunnableC5210(C5198 r1, InterfaceC5202 r2, int r3) {
        this.f18814 = r3;
        this.f18815 = r1;
        this.f18813 = r2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ⁱᴵ.ˆʾ] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ⁱᴵ.ˆʾ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ⁱᴵ.ˆʾ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f18814) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        C5198 r0 = this.f18815;
        int r1 = r0.f18752;
        C5470 r02 = r0.f18751;
        this.f18813.mo3551(r1, r02);
        return;
    L6:
        C5198 r03 = this.f18815;
        int r12 = r03.f18752;
        C5470 r04 = r03.f18751;
        this.f18813.mo3536(r12, r04);
        return;
    L8:
        C5198 r05 = this.f18815;
        int r13 = r05.f18752;
        C5470 r06 = r05.f18751;
        this.f18813.mo3541(r13, r06);
    }
}
