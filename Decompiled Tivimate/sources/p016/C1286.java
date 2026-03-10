package p016;

import p437.C5536;

/* JADX INFO: renamed from: ʻˆ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1286 {

    /* JADX INFO: renamed from: ʽ */
    public boolean f4363;

    /* JADX INFO: renamed from: ⁱˊ */
    public boolean f4364;

    /* JADX INFO: renamed from: ﹳٴ */
    public boolean f4365;

    public /* synthetic */ C1286(boolean r1, boolean r2, boolean r3) {
        this.f4365 = r1;
        this.f4364 = r2;
        this.f4363 = r3;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public boolean m3633() {
        if (this.f4363 == true) goto L7;
        if (this.f4364 == true) goto L7;
        return false;
    L7:
        if (this.f4365 == false) goto L12;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public C5536 m3634() {
        if (this.f4365 == true) goto L12;
        if (this.f4364 == true) goto L10;
        if (this.f4363 == false) goto L12;
    L10:
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    L12:
        return new C5536(this);
    }
}
