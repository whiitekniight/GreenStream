package ar.tvplayer.p002tv;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ProtectedTvPlayerApplication$ProtectedTvPlayerApplication$m {
    public static final String fIxoi = null;

    /* JADX INFO: renamed from: t */
    public static String f1596t;
    public final boolean CHuH;
    public final boolean JIIBd;

    /* JADX INFO: renamed from: eE */
    public final String f1597eE;

    /* JADX INFO: renamed from: fa */
    public final boolean f1598fa;
    public final boolean hokH;
    public final String jJw;
    public final int jgBmI;
    public final boolean jwcl;

    /* JADX INFO: renamed from: kH */
    public final boolean f1599kH;
    public final boolean uGn;
    public final boolean uehBx;

    /* JADX INFO: renamed from: ul */
    public final boolean f1600ul;

    /* JADX INFO: renamed from: vE */
    public final int f1601vE;

    static {
        UUID r0 = UUID.randomUUID();
        long r1 = r0.getMostSignificantBits();
        long r3 = r0.getLeastSignificantBits();
        long r12 = r1 & 65535;
        fIxoi = new UUID(r12 | (System.currentTimeMillis() << 16), r3).toString();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v21, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean, byte] */
    private ProtectedTvPlayerApplication$ProtectedTvPlayerApplication$m(String r2, String r3, int r4) {
        this.f1597eE = fIxoi;
        this.jJw = r3;
        this.f1601vE = r4;
        this.jwcl = (byte) (r4 & 1);
        this.f1600ul = (byte) ((r4 >>> 1) & 1);
        this.uGn = (byte) ((r4 >>> 2) & 1);
        this.uehBx = (byte) ((r4 >>> 3) & 1);
        this.CHuH = (byte) ((r4 >>> 4) & 1);
        this.f1599kH = (byte) ((r4 >>> 5) & 1);
        this.f1598fa = (byte) ((r4 >>> 6) & 1);
        this.JIIBd = (byte) ((r4 >>> 7) & 1);
        this.hokH = (byte) ((r4 >>> 8) & 1);
        this.jgBmI = 2;
    }

    /* JADX INFO: renamed from: Hz */
    public static void m1153Hz(String r0) {
    }

    public static native ProtectedTvPlayerApplication$ProtectedTvPlayerApplication$m elAsxmc();

    public native String bfbnwthtCp(String r1);
}
