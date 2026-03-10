package p059;

import p067.C1969;

/* JADX INFO: renamed from: ʽˑ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1840 implements Comparable {

    /* JADX INFO: renamed from: ʽʽ */
    public final long f6168;

    /* JADX INFO: renamed from: ʾˋ */
    public final String f6169;

    /* JADX INFO: renamed from: ˈٴ */
    public final int f6170;

    /* JADX INFO: renamed from: ˉٴ */
    public final String f6171;

    /* JADX INFO: renamed from: ˊʻ */
    public final C1969 f6172;

    /* JADX INFO: renamed from: ٴʼ */
    public final long f6173;

    /* JADX INFO: renamed from: ٴᵢ */
    public final String f6174;

    /* JADX INFO: renamed from: ᴵˊ */
    public final C1837 f6175;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final long f6176;

    /* JADX INFO: renamed from: ᵎˊ */
    public final boolean f6177;

    /* JADX INFO: renamed from: ᵎⁱ */
    public final long f6178;

    public AbstractC1840(String r1, C1837 r2, long r3, int r5, long r6, C1969 r8, String r9, String r10, long r11, long r13, boolean r15) {
        this.f6169 = r1;
        this.f6175 = r2;
        this.f6168 = r3;
        this.f6170 = r5;
        this.f6176 = r6;
        this.f6172 = r8;
        this.f6174 = r9;
        this.f6171 = r10;
        this.f6178 = r11;
        this.f6173 = r13;
        this.f6177 = r15;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        Long r52 = (Long) r5;
        long r0 = r52.longValue();
        long r2 = this.f6176;
        if (r2 <= r0) goto L7;
        return 1;
    L7:
        if (r2 >= r52.longValue()) goto L10;
        return -1;
    L10:
        return 0;
    }
}
