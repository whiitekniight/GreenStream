package p158;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ˉᵔ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2893 {

    /* JADX INFO: renamed from: ʽ */
    public final /* synthetic */ int f10256;

    /* JADX INFO: renamed from: ˈ */
    public Object f10257;

    /* JADX INFO: renamed from: ⁱˊ */
    public C2893 f10258;

    /* JADX INFO: renamed from: ﹳٴ */
    public C2893 f10259;

    public /* synthetic */ C2893(int r1) {
        this.f10256 = r1;
    }

    public C2893(C2893 r1, int r2) {
        this.f10256 = r2;
        this.f10259 = r1;
        r1.f10258 = this;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object m6225() {
        switch(this.f10256) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((WeakReference) this.f10257).get();
    L7:
        return this.f10257;
    }
}
