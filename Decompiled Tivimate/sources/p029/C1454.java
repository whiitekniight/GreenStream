package p029;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ʼʻ.ˋᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C1454 extends AbstractC1466 {

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f4872;

    /* JADX INFO: renamed from: ᴵˊ */
    public boolean f4873;

    public C1454(Object r1) {
        this.f4872 = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f4873;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4873 == true) goto L7;
        this.f4873 = true;
        return this.f4872;
    L7:
        throw new NoSuchElementException();
    }
}
