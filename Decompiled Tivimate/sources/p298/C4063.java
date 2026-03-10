package p298;

/* JADX INFO: renamed from: ٴˑ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C4063 implements Comparable {

    /* JADX INFO: renamed from: ʽʽ */
    public final String f14922;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f14923;

    /* JADX INFO: renamed from: ˈٴ */
    public final String f14924;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f14925;

    public C4063(int r1, int r2, String r3, String r4) {
        this.f14923 = r1;
        this.f14925 = r2;
        this.f14922 = r3;
        this.f14924 = r4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        C4063 r32 = (C4063) r3;
        int r0 = this.f14923 - r32.f14923;
        if (r0 == 0) goto L5;
        return r0;
    L5:
        return this.f14925 - r32.f14925;
    }
}
