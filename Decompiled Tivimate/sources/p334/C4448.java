package p334;

/* JADX INFO: renamed from: ᴵˋ.ˏי */
/* JADX INFO: loaded from: classes.dex */
public final class C4448 {

    /* JADX INFO: renamed from: ʽ */
    public static volatile C4448 f16227;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Object f16228 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f16229;

    static {
        f16228 = new Object();
    }

    public C4448(int r1) {
        this.f16229 = r1;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static C4448 m8842() {
        Object r0 = f16228;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (f16227 != null) goto L9;
        f16227 = new C4448(3);     // Catch: Throwable -> L7
    L9:
        C4448 r1 = f16227;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static String m8843(String r3) {
        int r0 = r3.length();
        StringBuilder r1 = new StringBuilder(23);
        r1.append("WM-");
        if (r0 < 20) goto L5;
        r1.append(r3.substring(0, 20));
    L7:
        return r1.toString();
    L5:
        r1.append(r3);
        goto L7
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m8844(String r3, String r4) {
        if (this.f16229 <= 6) goto L4;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m8845(String r3, String r4, Throwable r5) {
        if (this.f16229 <= 6) goto L4;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final void m8846(String r3, String r4) {
        if (this.f16229 <= 5) goto L4;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m8847(String r3, String r4, Throwable r5) {
        if (this.f16229 <= 3) goto L4;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m8848(String r3, String r4) {
        if (this.f16229 <= 3) goto L4;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m8849(String r3, String r4) {
        if (this.f16229 <= 4) goto L4;
    }
}
