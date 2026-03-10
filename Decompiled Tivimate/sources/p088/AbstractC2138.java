package p088;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: ʾﾞ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2138 implements InterfaceC2145 {

    /* JADX INFO: renamed from: ʽ */
    public C2144 f7645;

    /* JADX INFO: renamed from: ˈ */
    public C2144 f7646;

    /* JADX INFO: renamed from: ˑﹳ */
    public C2144 f7647;

    /* JADX INFO: renamed from: ᵎﹶ */
    public ByteBuffer f7648;

    /* JADX INFO: renamed from: ᵔᵢ */
    public boolean f7649;

    /* JADX INFO: renamed from: ⁱˊ */
    public C2144 f7650;

    /* JADX INFO: renamed from: ﾞᴵ */
    public ByteBuffer f7651;

    public AbstractC2138() {
        ByteBuffer r0 = InterfaceC2145.f7704;
        this.f7651 = r0;
        this.f7648 = r0;
        C2144 r02 = C2144.f7699;
        this.f7646 = r02;
        this.f7647 = r02;
        this.f7650 = r02;
        this.f7645 = r02;
    }

    @Override // p088.InterfaceC2145
    public final void flush() {
        this.f7648 = InterfaceC2145.f7704;
        this.f7649 = false;
        this.f7650 = this.f7646;
        this.f7645 = this.f7647;
        mo5233();
    }

    @Override // p088.InterfaceC2145
    public final void reset() {
        ByteBuffer r0 = InterfaceC2145.f7704;
        this.f7648 = r0;
        this.f7649 = false;
        this.f7651 = r0;
        C2144 r02 = C2144.f7699;
        this.f7646 = r02;
        this.f7647 = r02;
        this.f7650 = r02;
        this.f7645 = r02;
        mo5228();
    }

    /* JADX INFO: renamed from: ʼˎ */
    public void mo5226() {
    }

    @Override // p088.InterfaceC2145
    /* JADX INFO: renamed from: ʽ */
    public boolean mo5227() {
        if (this.f7647 == C2144.f7699) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public void mo5228() {
    }

    @Override // p088.InterfaceC2145
    /* JADX INFO: renamed from: ˈ */
    public ByteBuffer mo5229() {
        ByteBuffer r0 = this.f7648;
        this.f7648 = InterfaceC2145.f7704;
        return r0;
    }

    @Override // p088.InterfaceC2145
    /* JADX INFO: renamed from: ˑﹳ */
    public final void mo5230() {
        this.f7649 = true;
        mo5226();
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public final ByteBuffer m5231(int r2) {
        if (this.f7651.capacity() >= r2) goto L5;
        this.f7651 = ByteBuffer.allocateDirect(r2).order(ByteOrder.nativeOrder());
    L6:
        ByteBuffer r22 = this.f7651;
        this.f7648 = r22;
        return r22;
    L5:
        this.f7651.clear();
        goto L6
    }

    @Override // p088.InterfaceC2145
    /* JADX INFO: renamed from: ᵎﹶ */
    public final C2144 mo5232(C2144 r1) {
        this.f7646 = r1;
        this.f7647 = mo5235(r1);
        if (mo5227() == false) goto L7;
        return this.f7647;
    L7:
        return C2144.f7699;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public void mo5233() {
    }

    @Override // p088.InterfaceC2145
    /* JADX INFO: renamed from: ⁱˊ */
    public boolean mo5234() {
        if (this.f7649 == true) goto L5;
        return false;
    L5:
        if (this.f7648 != InterfaceC2145.f7704) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public abstract C2144 mo5235(C2144 r1);
}
