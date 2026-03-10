package p377;

import java.util.Iterator;

/* JADX INFO: renamed from: ᵔﹳ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4941 extends AbstractC4940 implements Iterator {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ int f17623;

    /* JADX INFO: renamed from: ʾˋ */
    public C4938 f17624;

    /* JADX INFO: renamed from: ᴵˊ */
    public C4938 f17625;

    public C4941(C4938 r1, C4938 r2, int r3) {
        this.f17623 = r3;
        this.f17624 = r2;
        this.f17625 = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f17625 == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C4938 r0 = this.f17625;
        C4938 r1 = this.f17624;
        if (r0 == r1) goto L7;
        if (r1 == null) goto L7;
        C4938 r12 = m9721(r0);
    L8:
        this.f17625 = r12;
        return r0;
    L7:
        r12 = null;
        goto L8
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final C4938 m9721(C4938 r2) {
        switch(this.f17623) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.f17618;
    L7:
        return r2.f17616;
    }

    @Override // p377.AbstractC4940
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo9720(C4938 r4) {
        C4938 r1 = null;
        if (this.f17624 == r4) goto L5;
    L7:
        C4938 r0 = this.f17624;
        if (r0 == r4) goto L10;
    L14:
        C4938 r02 = this.f17625;
        if (r02 != r4) goto L23;
        C4938 r42 = this.f17624;
        if (r02 == r42) goto L21;
        if (r42 == null) goto L21;
        r1 = m9721(r02);
    L21:
        this.f17625 = r1;
        return;
    L23:
        return;
    L10:
        switch(this.f17623) {
            case 0: goto L12;
            default: goto L11;
        };
    L11:
        C4938 r03 = r0.f17616;
    L13:
        this.f17624 = r03;
        goto L14
    L12:
        r03 = r0.f17618;
        goto L13
    L5:
        if (r4 != this.f17625) goto L7;
        this.f17625 = null;
        this.f17624 = null;
        goto L7
    }
}
