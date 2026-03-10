package p403;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p136.AbstractC2611;
import p398.InterfaceC5098;

/* JADX INFO: renamed from: ⁱˏ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C5118 extends AbstractC2611 implements Iterator, InterfaceC5098 {

    /* JADX INFO: renamed from: ᴵᵔ */
    public final /* synthetic */ int f18255;

    public C5118(C5124 r1, int r2) {
        this.f18255 = r2;
        this.f9256 = r1;
        this.f9257 = -1;
        this.f9254 = r1.f18277;
        m5800();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.f18255) {
            case 0: goto L16;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        m5802();
        int r0 = this.f9255;
        C5124 r1 = (C5124) this.f9256;
        if (r0 >= r1.f18278) goto L9;
        this.f9255 = r0 + 1;
        this.f9257 = r0;
        Object r02 = r1.f18281[r0];
        m5800();
        return r02;
    L9:
        throw new NoSuchElementException();
    L10:
        m5802();
        int r03 = this.f9255;
        C5124 r12 = (C5124) this.f9256;
        if (r03 >= r12.f18278) goto L15;
        this.f9255 = r03 + 1;
        this.f9257 = r03;
        Object r04 = r12.f18274[r03];
        m5800();
        return r04;
    L15:
        throw new NoSuchElementException();
    L16:
        m5802();
        int r05 = this.f9255;
        C5124 r13 = (C5124) this.f9256;
        if (r05 >= r13.f18278) goto L21;
        this.f9255 = r05 + 1;
        this.f9257 = r05;
        C5119 r2 = new C5119(r13, r05);
        m5800();
        return r2;
    L21:
        throw new NoSuchElementException();
    }
}
