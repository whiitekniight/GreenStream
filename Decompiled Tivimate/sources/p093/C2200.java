package p093;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p398.InterfaceC5098;

/* JADX INFO: renamed from: ʿˈ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2200 implements Iterator, InterfaceC5098 {

    /* JADX INFO: renamed from: ʽʽ */
    public boolean f7957;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f7958;

    /* JADX INFO: renamed from: ˈٴ */
    public int f7959;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f7960;

    public C2200(int r3, int r4, int r5) {
        this.f7958 = r5;
        this.f7960 = r4;
        boolean r0 = false;
        if (r5 <= 0) goto L6;
        if (r3 > r4) goto L8;
    L5:
        r0 = true;
    L8:
        this.f7957 = r0;
        if (r0 == true) goto L12;
        r3 = r4;
    L12:
        this.f7959 = r3;
        return;
    L6:
        if (r3 < r4) goto L8;
        goto L8
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7957;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.f7959;
        if (r0 == this.f7960) goto L5;
        this.f7959 = this.f7958 + r0;
    L11:
        return Integer.valueOf(r0);
    L5:
        if (this.f7957 == false) goto L8;
        this.f7957 = false;
        goto L11
    L8:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
