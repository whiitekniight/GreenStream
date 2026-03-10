package p064;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ʽᴵ.ˏי */
/* JADX INFO: loaded from: classes.dex */
public final class C1898 implements Iterator {

    /* JADX INFO: renamed from: ʽʽ */
    public int f6479;

    /* JADX INFO: renamed from: ʾˋ */
    public C1883 f6480;

    /* JADX INFO: renamed from: ˈٴ */
    public final /* synthetic */ C1901 f6481;

    /* JADX INFO: renamed from: ᴵˊ */
    public C1883 f6482;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final /* synthetic */ int f6483;

    public C1898(C1901 r1, int r2) {
        this.f6483 = r2;
        this.f6481 = r1;
        this.f6480 = r1.f6493.f6424;
        this.f6482 = null;
        this.f6479 = r1.f6500;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6480 == this.f6481.f6493) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch(this.f6483) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return m4872();
    L7:
        return m4871().f6426;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1883 r0 = this.f6482;
        if (r0 == null) goto L7;
        C1901 r2 = this.f6481;
        r2.m4879(r0, true);
        this.f6482 = null;
        this.f6479 = r2.f6500;
        return;
    L7:
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final C1883 m4871() {
        C1883 r0 = this.f6480;
        C1901 r1 = this.f6481;
        if (r0 == r1.f6493) goto L11;
        if (r1.f6500 != this.f6479) goto L9;
        this.f6480 = r0.f6424;
        this.f6482 = r0;
        return r0;
    L9:
        throw new ConcurrentModificationException();
    L11:
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object m4872() {
        return m4871();
    }
}
