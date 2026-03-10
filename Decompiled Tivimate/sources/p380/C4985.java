package p380;

/* JADX INFO: renamed from: ᵢʼ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4985 extends AbstractC4984 {

    /* JADX INFO: renamed from: ʽʽ */
    public int f17797;

    /* JADX INFO: renamed from: ˈٴ */
    public int f17798;

    /* JADX INFO: renamed from: ᴵˊ */
    public final byte[] f17799;

    public C4985(int r3, byte[] r4) {
        this.f17799 = r4;
        this.f17796 = 0;
        this.f17797 = 0;
        this.f17798 = r3;
    }

    @Override // p380.AbstractC4984
    /* JADX INFO: renamed from: ʽ */
    public final int mo5275() {
        return this.f17798;
    }

    @Override // p380.AbstractC4984
    /* JADX INFO: renamed from: ᵎﹶ */
    public final int mo5276(byte[] r5) {
        int r0 = r5.length;
        int r1 = this.f17798;
        if (r0 <= r1) goto L5;
        r0 = r1;
    L5:
        System.arraycopy(this.f17799, this.f17797, r5, 0, r0);
        this.f17797 += r0;
        this.f17798 -= r0;
        return r0;
    }
}
