package p068;

import com.google.android.gms.internal.play_billing.C0537;

/* JADX INFO: renamed from: ʽﹳ.ᵔᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class C1991 {

    /* JADX INFO: renamed from: ʽ */
    public C1990 f6908;

    /* JADX INFO: renamed from: ˈ */
    public boolean f6909;

    /* JADX INFO: renamed from: ⁱˊ */
    public C1988 f6910;

    /* JADX INFO: renamed from: ﹳٴ */
    public Object f6911;

    public final void finalize() {
        C1988 r0 = this.f6910;
        if (r0 == null) goto L8;
        C1983 r02 = r0.f6900;
        if (r02.isDone() == true) goto L8;
        r02.mo5032(new C0537(3, "The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f6911));
    L8:
        if (this.f6909 == true) goto L13;
        C1990 r03 = this.f6908;
        if (r03 == null) goto L14;
        r03.m5031(null);
        return;
    L14:
        return;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m5033(Throwable r2) {
        this.f6909 = true;
        C1988 r0 = this.f6910;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f6900.mo5032(r2) == false) goto L9;
        this.f6911 = null;
        this.f6910 = null;
        this.f6908 = null;
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m5034(Object r2) {
        this.f6909 = true;
        C1988 r0 = this.f6910;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f6900.m5031(r2) == false) goto L9;
        this.f6911 = null;
        this.f6910 = null;
        this.f6908 = null;
        return;
    }
}
