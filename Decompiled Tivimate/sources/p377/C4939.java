package p377;

import java.util.Iterator;

/* JADX INFO: renamed from: ᵔﹳ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C4939 extends AbstractC4940 implements Iterator {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ C4943 f17620;

    /* JADX INFO: renamed from: ʾˋ */
    public C4938 f17621;

    /* JADX INFO: renamed from: ᴵˊ */
    public boolean f17622;

    public C4939(C4943 r1) {
        this.f17620 = r1;
        this.f17622 = true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f17622 == true) goto L5;
        C4938 r0 = this.f17621;
        if (r0 != null) goto L11;
    L13:
        return false;
    L11:
        if (r0.f17616 == null) goto L13;
        return true;
    L5:
        if (this.f17620.f17628 == null) goto L7;
        return true;
    L7:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f17622 == false) goto L5;
        this.f17622 = false;
        this.f17621 = this.f17620.f17628;
    L11:
        return this.f17621;
    L5:
        C4938 r0 = this.f17621;
        if (r0 == null) goto L8;
        C4938 r02 = r0.f17616;
    L9:
        this.f17621 = r02;
        goto L11
    L8:
        r02 = null;
        goto L9
    }

    @Override // p377.AbstractC4940
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo9720(C4938 r2) {
        C4938 r0 = this.f17621;
        if (r2 != r0) goto L10;
        C4938 r22 = r0.f17618;
        this.f17621 = r22;
        if (r22 != null) goto L7;
        boolean r23 = true;
    L8:
        this.f17622 = r23;
        return;
    L7:
        r23 = false;
        goto L8
    }
}
