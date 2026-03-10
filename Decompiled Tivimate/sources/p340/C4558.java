package p340;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᴵᵔ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C4558 implements Cloneable {

    /* JADX INFO: renamed from: ʽʽ */
    public boolean f16472;

    /* JADX INFO: renamed from: ʾˋ */
    public AbstractC4567 f16473;

    /* JADX INFO: renamed from: ˈٴ */
    public ArrayList f16474;

    /* JADX INFO: renamed from: ˉٴ */
    public long f16475;

    /* JADX INFO: renamed from: ˊʻ */
    public C4558 f16476;

    /* JADX INFO: renamed from: ٴʼ */
    public long f16477;

    /* JADX INFO: renamed from: ٴᵢ */
    public boolean f16478;

    /* JADX INFO: renamed from: ᴵˊ */
    public ArrayList f16479;

    /* JADX INFO: renamed from: ᴵᵔ */
    public ArrayList f16480;

    /* JADX INFO: renamed from: ᵎⁱ */
    public long f16481;

    public C4558(AbstractC4567 r3) {
        this.f16479 = null;
        this.f16472 = false;
        this.f16476 = null;
        this.f16478 = false;
        this.f16475 = 0;
        this.f16481 = 0;
        this.f16477 = 0;
        this.f16473 = r3;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m9049();
    }

    /* JADX INFO: renamed from: ˈ */
    public final C4558 m9049() {
        C4558 r0 = (C4558) super.clone();     // Catch: CloneNotSupportedException -> L13
        r0.f16473 = this.f16473.mo9026();     // Catch: CloneNotSupportedException -> L13
        if (this.f16479 == null) goto L6;
        r0.f16479 = new ArrayList(this.f16479);     // Catch: CloneNotSupportedException -> L13
    L6:
        if (this.f16474 == null) goto L9;
        r0.f16474 = new ArrayList(this.f16474);     // Catch: CloneNotSupportedException -> L13
    L9:
        if (this.f16480 == null) goto L11;
        r0.f16480 = new ArrayList(this.f16480);     // Catch: CloneNotSupportedException -> L13
    L11:
        r0.f16472 = false;     // Catch: CloneNotSupportedException -> L13
        return r0;
    L14:
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m9050(C4558 r2) {
        if (this.f16474 != null) goto L6;
        this.f16474 = new ArrayList();
    L6:
        if (this.f16474.contains(r2) == true) goto L9;
        this.f16474.add(r2);
        r2.m9050(this);
        return;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m9051(C4558 r2) {
        if (this.f16480 != null) goto L6;
        this.f16480 = new ArrayList();
    L6:
        if (this.f16480.contains(r2) == true) goto L14;
        this.f16480.add(r2);
        if (r2.f16479 != null) goto L11;
        r2.f16479 = new ArrayList();
    L11:
        if (r2.f16479.contains(this) == true) goto L15;
        r2.f16479.add(this);
        m9051(r2);
        return;
    L15:
        return;
    }
}
