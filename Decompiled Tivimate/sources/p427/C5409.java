package p427;

/* JADX INFO: renamed from: ﹳـ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C5409 {

    /* JADX INFO: renamed from: ʼˎ */
    public int f19309;

    /* JADX INFO: renamed from: ʽ */
    public float f19310;

    /* JADX INFO: renamed from: ˈ */
    public float f19311;

    /* JADX INFO: renamed from: ˑﹳ */
    public long f19312;

    /* JADX INFO: renamed from: ᵎﹶ */
    public long f19313;

    /* JADX INFO: renamed from: ᵔᵢ */
    public float f19314;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f19315;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f19316;

    /* JADX INFO: renamed from: ﾞᴵ */
    public long f19317;

    /* JADX INFO: renamed from: ﹳٴ */
    public final float m10445(long r9) {
        if (r9 >= this.f19312) goto L5;
        return 0.0f;
    L5:
        long r4 = this.f19313;
        if (r4 < 0) goto L13;
        if (r9 < r4) goto L13;
        float r0 = this.f19314;
        return (ViewOnTouchListenerC5404.m10438((r9 - r4) / this.f19309, 0.0f, 1.0f) * r0) + (1.0f - r0);
    L13:
        return ViewOnTouchListenerC5404.m10438((r9 - r0) / this.f19316, 0.0f, 1.0f) * 0.5f;
    }
}
