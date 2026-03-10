package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.ᴵˊ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0192 {

    /* JADX INFO: renamed from: ʽʽ */
    public int f1088;

    /* JADX INFO: renamed from: ʾˋ */
    public final InterfaceC0187 f1089;

    /* JADX INFO: renamed from: ˈٴ */
    public final /* synthetic */ AbstractC0162 f1090;

    /* JADX INFO: renamed from: ᴵˊ */
    public boolean f1091;

    public AbstractC0192(AbstractC0162 r1, InterfaceC0187 r2) {
        this.f1090 = r1;
        this.f1088 = -1;
        this.f1089 = r2;
    }

    /* JADX INFO: renamed from: ʽ */
    public boolean mo692(InterfaceC0163 r1) {
        return false;
    }

    /* JADX INFO: renamed from: ˈ */
    public abstract boolean mo693();

    /* JADX INFO: renamed from: ⁱˊ */
    public void mo694() {
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m725(boolean r6) {
        if (r6 == this.f1091) goto L45;
        this.f1091 = r6;
        if (r6 == false) goto L8;
        int r62 = 1;
    L9:
        AbstractC0162 r1 = this.f1090;
        int r2 = r1.f1040;
        r1.f1040 = r62 + r2;
        if (r1.f1042 == true) goto L33;
        r1.f1042 = true;
    L38:
        int r3 = r1.f1040;     // Catch: Throwable -> L26
        if (r2 == r3) goto L31;
        if (r2 != 0) goto L19;
        if (r3 <= 0) goto L19;
        boolean r4 = true;
    L20:
        if (r2 <= 0) goto L23;
        if (r3 != 0) goto L23;
        boolean r22 = true;
    L24:
        if (r4 == false) goto L28;
        r1.mo687();     // Catch: Throwable -> L26
    L30:
        r2 = r3;
        goto L38
    L28:
        if (r22 == false) goto L30;
        r1.mo688();     // Catch: Throwable -> L26
    L23:
        r22 = false;
    L19:
        r4 = false;
        goto L20
    L31:
        r1.f1042 = false;
    L26:
        th = move-exception;
        r1.f1042 = false;
        throw th;
    L33:
        if (this.f1091 == false) goto L44;
        r1.m682(this);
        return;
    L44:
        return;
    L8:
        r62 = -1;
        goto L9
    }
}
