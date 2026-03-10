package p269;

/* JADX INFO: renamed from: יᐧ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3878 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f14203;

    public /* synthetic */ C3878(int r1) {
        this.f14203 = r1;
    }

    /* JADX INFO: renamed from: ʽ */
    public final String m7999() {
        switch(this.f14203) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return "IntegerArrayPool";
    L6:
        return "ByteArrayPool";
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final int m8000() {
        switch(this.f14203) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 4;
    L6:
        return 1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final int m8001(Object r2) {
        switch(this.f14203) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((int[]) r2).length;
    L7:
        return ((byte[]) r2).length;
    }
}
