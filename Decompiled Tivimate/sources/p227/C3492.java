package p227;

/* JADX INFO: renamed from: ˏˉ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3492 {

    /* JADX INFO: renamed from: ʽ */
    public int f12431;

    /* JADX INFO: renamed from: ˈ */
    public byte[] f12432;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f12433;

    /* JADX INFO: renamed from: ﹳٴ */
    public byte[] f12434;

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7250(byte[] r8) {
        this.f12432 = r8;
        int r0 = 0;
        this.f12433 = 0;
        this.f12431 = 0;
        if (this.f12434 != null) goto L5;
        this.f12434 = new byte[256];
    L5:
        int r1 = 0;
    L6:
        if (r1 >= 256) goto L8;
        this.f12434[r1] = (byte) r1;
        r1 = r1 + 1;
        goto L6
    L8:
        int r12 = 0;
        int r3 = 0;
    L9:
        if (r0 >= 256) goto L11;
        int r4 = r8[r12] & 255;
        byte[] r5 = this.f12434;
        byte r6 = r5[r0];
        r3 = ((r4 + r6) + r3) & 255;
        r5[r0] = r5[r3];
        r5[r3] = r6;
        r12 = (r12 + 1) % r8.length;
        r0 = r0 + 1;
        goto L9
    }
}
