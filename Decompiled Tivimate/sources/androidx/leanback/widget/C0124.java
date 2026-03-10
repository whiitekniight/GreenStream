package androidx.leanback.widget;

/* JADX INFO: renamed from: androidx.leanback.widget.ـˏ */
/* JADX INFO: loaded from: classes.dex */
public class C0124 {

    /* JADX INFO: renamed from: ʽ */
    public float f965;

    /* JADX INFO: renamed from: ˈ */
    public boolean f966;

    /* JADX INFO: renamed from: ˑﹳ */
    public boolean f967;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f968;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f969;

    public C0124() {
        this.f969 = -1;
        this.f968 = 0;
        this.f965 = 50.0f;
        this.f966 = false;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m634(float r2) {
        if (r2 < 0.0f) goto L7;
        if (r2 > 100.0f) goto L7;
    L8:
        this.f965 = r2;
        return;
    L7:
        if (r2 == (-1.0f)) goto L8;
        throw new IllegalArgumentException();
    }
}
