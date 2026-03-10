package p447;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p398.InterfaceC5098;

/* JADX INFO: renamed from: ﹶˑ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C5625 implements Iterator, InterfaceC5098 {

    /* JADX INFO: renamed from: ʽʽ */
    public int f20355;

    /* JADX INFO: renamed from: ʾˋ */
    public final CharSequence f20356;

    /* JADX INFO: renamed from: ˈٴ */
    public int f20357;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f20358;

    /* JADX INFO: renamed from: ᴵᵔ */
    public int f20359;

    public C5625(CharSequence r1) {
        this.f20356 = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.f20358;
        if (r0 == 0) goto L7;
        if (r0 != 1) goto L6;
        return true;
    L6:
        return false;
    L7:
        int r3 = 2;
        if (this.f20359 >= 0) goto L11;
        this.f20358 = 2;
        return false;
    L11:
        CharSequence r02 = this.f20356;
        int r1 = r02.length();
        int r4 = this.f20355;
        int r5 = r02.length();
    L12:
        if (r4 >= r5) goto L25;
        char r6 = r02.charAt(r4);
        if (r6 == '\n') goto L17;
        if (r6 == '\r') goto L17;
        r4 = r4 + 1;
    L17:
        if (r6 != '\r') goto L23;
        int r12 = r4 + 1;
        if (r12 >= r02.length()) goto L23;
        if (r02.charAt(r12) != '\n') goto L23;
    L24:
        r1 = r4;
    L26:
        this.f20358 = 1;
        this.f20359 = r3;
        this.f20357 = r1;
        return true;
    L23:
        r3 = 1;
        goto L24
    L25:
        r3 = -1;
        goto L26
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        this.f20358 = 0;
        int r0 = this.f20357;
        int r1 = this.f20355;
        this.f20355 = this.f20359 + r0;
        return this.f20356.subSequence(r1, r0).toString();
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
