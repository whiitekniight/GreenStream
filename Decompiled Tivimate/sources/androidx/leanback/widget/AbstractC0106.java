package androidx.leanback.widget;

import p191.C3159;

/* JADX INFO: renamed from: androidx.leanback.widget.ˉʿ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0106 {

    /* JADX INFO: renamed from: ʼˎ */
    public int f899;

    /* JADX INFO: renamed from: ʽ */
    public boolean f900;

    /* JADX INFO: renamed from: ˈ */
    public int f901;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f902;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int f903;

    /* JADX INFO: renamed from: ᵔᵢ */
    public C3159[] f904;

    /* JADX INFO: renamed from: ⁱˊ */
    public ˉˆ f905;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object[] f906;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f907;

    public AbstractC0106() {
        this.f906 = new Object[1];
        this.f907 = -1;
        this.f903 = -1;
        this.f899 = -1;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final int m591(boolean r2, int[] r3) {
        if (this.f900 == false) goto L5;
        int r0 = this.f903;
    L7:
        return mo600(r0, r2, r3);
    L5:
        r0 = this.f907;
        goto L7
    }

    /* JADX INFO: renamed from: ʽ */
    public final boolean m592(int r5) {
        if (this.f903 >= 0) goto L6;
    L13:
        return false;
    L6:
        if (this.f900 == false) goto L11;
        if (m591(true, null) > (r5 + this.f901)) goto L13;
    L12:
        return true;
    L11:
        if (m598(false, null) < (r5 - this.f901)) goto L13;
        goto L12
    }

    /* JADX INFO: renamed from: ˆʾ */
    public abstract C3159[] mo593(int r1, int r2);

    /* JADX INFO: renamed from: ˈ */
    public final boolean m594(int r5) {
        if (this.f903 >= 0) goto L6;
    L13:
        return false;
    L6:
        if (this.f900 == false) goto L11;
        if (m598(false, null) < (r5 - this.f901)) goto L13;
    L12:
        return true;
    L11:
        if (m591(true, null) > (r5 + this.f901)) goto L13;
        goto L12
    }

    /* JADX INFO: renamed from: ˉʿ */
    public abstract boolean mo595(int r1, boolean r2);

    /* JADX INFO: renamed from: ˑﹳ */
    public void mo596(int r1, int r2, C3159 r3) {
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public abstract ﾞʻ mo597(int r1);

    /* JADX INFO: renamed from: ᵎﹶ */
    public final int m598(boolean r2, int[] r3) {
        if (this.f900 == false) goto L5;
        int r0 = this.f907;
    L7:
        return mo604(r0, r2, r3);
    L5:
        r0 = this.f903;
        goto L7
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public final void m599(int r3) {
        if (r3 <= 0) goto L12;
        if (this.f902 == r3) goto L10;
        this.f902 = r3;
        this.f904 = new C3159[r3];
        int r32 = 0;
    L8:
        if (r32 >= this.f902) goto L14;
        this.f904[r32] = new C3159();
        r32 = r32 + 1;
        goto L8
    L14:
        return;
    L10:
        return;
    L12:
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public abstract int mo600(int r1, boolean r2, int[] r3);

    /* JADX INFO: renamed from: ⁱˊ */
    public abstract boolean mo601(int r1, boolean r2);

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m602() {
        if (this.f900 == false) goto L5;
        int r0 = Integer.MAX_VALUE;
    L7:
        return mo601(r0, true);
    L5:
        r0 = Integer.MIN_VALUE;
        goto L7
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public void mo603(int r3) {
        if (r3 < 0) goto L17;
        int r0 = this.f903;
        if (r0 < 0) goto L18;
        if (r0 < r3) goto L10;
        this.f903 = r3 - 1;
    L10:
        if (this.f903 >= this.f907) goto L13;
        this.f903 = -1;
        this.f907 = -1;
    L13:
        if (this.f907 >= 0) goto L16;
        this.f899 = r3;
        return;
    L16:
        return;
    L18:
        return;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public abstract int mo604(int r1, boolean r2, int[] r3);
}
