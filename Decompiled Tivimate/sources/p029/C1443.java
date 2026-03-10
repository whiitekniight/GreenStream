package p029;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p022.AbstractC1327;
import p107.InterfaceC2366;

/* JADX INFO: renamed from: ʼʻ.ˈʿ */
/* JADX INFO: loaded from: classes.dex */
public final class C1443 extends AbstractC1466 {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ int f4851;

    /* JADX INFO: renamed from: ʾˋ */
    public int f4852;

    /* JADX INFO: renamed from: ˈٴ */
    public final Iterator f4853;

    /* JADX INFO: renamed from: ᴵˊ */
    public Object f4854;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final /* synthetic */ Object f4855;

    public C1443() {
        this.f4852 = 2;
    }

    public C1443(Iterator r2, InterfaceC2366 r3) {
        this.f4851 = 0;
        this.f4853 = r2;
        this.f4855 = r3;
        this();
    }

    public C1443(C1463 r2) {
        this.f4851 = 1;
        this.f4855 = r2;
        this();
        this.f4853 = r2.f4893.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.f4852;
        if (r0 == 4) goto L31;
        int r02 = AbstractC1327.m3729(r0);
        if (r02 != 0) goto L7;
        return true;
    L7:
        if (r02 == 2) goto L27;
        this.f4852 = 4;
        switch(this.f4851) {
            case 0: goto L17;
            default: goto L10;
        };
    L10:
        Iterator r03 = this.f4853;
        if (r03.hasNext() == false) goto L15;
        Object r04 = r03.next();
        if (((C1463) this.f4855).f4894.contains(r04) == false) goto L10;
    L23:
        this.f4854 = r04;
        if (this.f4852 == 3) goto L38;
        this.f4852 = 1;
        return true;
    L38:
        return false;
    L15:
        this.f4852 = 3;
    L16:
        r04 = null;
    L17:
        Iterator r05 = this.f4853;
        if (r05.hasNext() == false) goto L22;
        r04 = r05.next();
        if (((InterfaceC2366) this.f4855).apply(r04) == false) goto L17;
    L22:
        this.f4852 = 3;
        goto L16
    L27:
        return false;
    L31:
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        this.f4852 = 2;
        Object r0 = this.f4854;
        this.f4854 = null;
        return r0;
    L7:
        throw new NoSuchElementException();
    }
}
