package p340;

/* JADX INFO: renamed from: ᴵᵔ.ᵔʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C4560 implements InterfaceC4545, InterfaceC4547 {

    /* JADX INFO: renamed from: ʽ */
    public static final C4560 f16482 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C4560 f16483 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f16484;

    static {
        f16483 = new C4560(0);
        f16482 = new C4560(1);
    }

    public /* synthetic */ C4560(int r1) {
        this.f16484 = r1;
    }

    @Override // p340.InterfaceC4547
    public float getInterpolation(float r5) {
        switch(this.f16484) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        return r5;
    L6:
        return ((float) (Math.cos(((double) (r5 + 1.0f)) * 3.141592653589793d) / 2.0d)) + 0.5f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p340.InterfaceC4545
    /* JADX INFO: renamed from: ﹳٴ */
    public Object mo8985(float r2, Float r3, Float r4) {
        switch(this.f16484) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        float r32 = r3.floatValue();
        return Float.valueOf(((r4.floatValue() - r32) * r2) + r32);
    L5:
        return Integer.valueOf((int) ((r2 * (((Integer) r4).intValue() - r3)) + ((Integer) r3).intValue()));
    }
}
