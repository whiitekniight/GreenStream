package p047;

import java.util.TreeMap;
import p046.InterfaceC1676;
import p046.InterfaceC1679;

/* JADX INFO: renamed from: ʼﾞ.ٴʼ */
/* JADX INFO: loaded from: classes.dex */
public final class C1711 implements InterfaceC1679, InterfaceC1676 {

    /* JADX INFO: renamed from: ˉٴ */
    public static final TreeMap f5688 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final double[] f5689;

    /* JADX INFO: renamed from: ʾˋ */
    public volatile String f5690;

    /* JADX INFO: renamed from: ˈٴ */
    public final String[] f5691;

    /* JADX INFO: renamed from: ˊʻ */
    public final int[] f5692;

    /* JADX INFO: renamed from: ٴᵢ */
    public int f5693;

    /* JADX INFO: renamed from: ᴵˊ */
    public final long[] f5694;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final byte[][] f5695;

    static {
        f5688 = new TreeMap();
    }

    public C1711() {
        this.f5692 = new int[2];
        this.f5694 = new long[2];
        this.f5689 = new double[2];
        this.f5691 = new String[2];
        this.f5695 = new byte[2][];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p046.InterfaceC1676
    /* JADX INFO: renamed from: ʻٴ */
    public final void mo4414(int r3, String r4) {
        this.f5692[r3] = 4;
        this.f5691[r3] = r4;
    }

    @Override // p046.InterfaceC1679
    /* JADX INFO: renamed from: ʽ */
    public final String mo3861() {
        String r0 = this.f5690;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p046.InterfaceC1679
    /* JADX INFO: renamed from: ᵎﹶ */
    public final void mo3864(InterfaceC1676 r7) {
        int r0 = this.f5693;
        if (1 > r0) goto L31;
        int r2 = 1;
    L5:
        int r3 = this.f5692[r2];
        if (r3 != 1) goto L8;
        r7.mo4417(r2);
    L29:
        if (r2 == r0) goto L35;
        r2 = r2 + 1;
        goto L5
    L35:
        return;
    L8:
        if (r3 != 2) goto L10;
        r7.mo4418(r2, this.f5694[r2]);
        goto L29
    L10:
        if (r3 != 3) goto L12;
        r7.mo4416(r2, this.f5689[r2]);
        goto L29
    L12:
        if (r3 != 4) goto L14;
        String r32 = this.f5691[r2];
        if (r32 == null) goto L25;
        r7.mo4414(r2, r32);
        goto L29
    L25:
        throw new IllegalArgumentException("Required value was null.");
    L14:
        if (r3 != 5) goto L29;
        byte[] r33 = this.f5695[r2];
        if (r33 == null) goto L20;
        r7.mo4415(r2, r33);
        goto L29
    L20:
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // p046.InterfaceC1676
    /* JADX INFO: renamed from: ᵔᵢ */
    public final void mo4415(int r3, byte[] r4) {
        this.f5692[r3] = 5;
        this.f5695[r3] = r4;
    }

    @Override // p046.InterfaceC1676
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo4416(int r3, double r4) {
        this.f5692[r3] = 3;
        this.f5689[r3] = r4;
    }

    @Override // p046.InterfaceC1676
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo4417(int r3) {
        this.f5692[r3] = 1;
    }

    @Override // p046.InterfaceC1676
    /* JADX INFO: renamed from: ﾞᴵ */
    public final void mo4418(int r3, long r4) {
        this.f5692[r3] = 2;
        this.f5694[r3] = r4;
    }
}
