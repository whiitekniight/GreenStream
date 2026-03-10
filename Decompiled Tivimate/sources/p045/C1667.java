package p045;

import p185.C3139;
import p329.AbstractC4397;

/* JADX INFO: renamed from: ʼﹳ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C1667 {

    /* JADX INFO: renamed from: ʽ */
    public byte[] f5536;

    /* JADX INFO: renamed from: ⁱˊ */
    public byte[] f5537;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f5538;

    public /* synthetic */ C1667() {
        this.f5538 = 1;
    }

    public C1667(byte[] r2, byte[] r3) {
        this.f5538 = 0;
        this.f5537 = r2;
        this.f5536 = r3;
    }

    public String toString() {
        switch(this.f5538) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "SMB2FileId{persistentHandle=" + AbstractC4397.m8801(this.f5537) + '}';
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void m4411(C3139 r3) {
        byte[] r0 = this.f5537;
        r3.mo7126(r0.length, r0);
        byte[] r02 = this.f5536;
        r3.mo7126(r02.length, r02);
    }
}
