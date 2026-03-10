package p236;

import p317.AbstractC4214;

/* JADX INFO: renamed from: ˏⁱ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C3544 implements InterfaceC3549 {

    /* JADX INFO: renamed from: ʽ */
    public final int f12555;

    /* JADX INFO: renamed from: ˈ */
    public final int f12556;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f12557;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f12558;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f12559;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final int f12560;

    public C3544(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.f12559 = r1;
        this.f12558 = r2;
        this.f12555 = r3;
        this.f12556 = r4;
        this.f12557 = r5;
        this.f12560 = r6;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m7321() {
        int r1 = this.f12559;
        if (r1 != 1935960438) goto L5;
        return 2;
    L5:
        if (r1 != 1935963489) goto L7;
        return 1;
    L7:
        if (r1 == 1937012852) goto L10;
        AbstractC4214.m8561("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(r1));
        return -1;
    L10:
        return 3;
    }

    @Override // p236.InterfaceC3549
    /* JADX INFO: renamed from: ﹳٴ */
    public final int mo7320() {
        return 1752331379;
    }
}
