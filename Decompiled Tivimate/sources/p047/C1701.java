package p047;

/* JADX INFO: renamed from: ʼﾞ.ˉٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C1701 {

    /* JADX INFO: renamed from: ʽ */
    public final boolean f5656;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f5657;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f5658;

    public /* synthetic */ C1701(int r1, String r2, boolean r3) {
        this.f5658 = r1;
        this.f5657 = r2;
        this.f5656 = r3;
    }

    public C1701(String r2, boolean r3) {
        this.f5658 = 0;
        this.f5656 = r3;
        this.f5657 = r2;
    }

    public String toString() {
        switch(this.f5658) {
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        String r0 = this.f5657;
        StringBuilder r2 = new StringBuilder(String.valueOf(r0).length() + 7);
        r2.append("{");
        r2.append(r0);
        r2.append("}");
        r2.append(this.f5656);
        return r2.toString();
    L5:
        return super.toString();
    }
}
