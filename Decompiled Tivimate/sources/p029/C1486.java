package p029;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p005j$.util.Objects;

/* JADX INFO: renamed from: ʼʻ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C1486 implements Iterator {

    /* JADX INFO: renamed from: ʽʽ */
    public Collection f4934;

    /* JADX INFO: renamed from: ʾˋ */
    public final Iterator f4935;

    /* JADX INFO: renamed from: ˈٴ */
    public Iterator f4936;

    /* JADX INFO: renamed from: ᴵˊ */
    public Object f4937;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final /* synthetic */ C1472 f4938;

    public C1486(C1472 r1) {
        this.f4938 = r1;
        this.f4935 = r1.f4910.entrySet().iterator();
        this.f4937 = null;
        this.f4934 = null;
        this.f4936 = EnumC1458.f4880;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4935.hasNext() == false) goto L5;
        return true;
    L5:
        if (this.f4936.hasNext() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4936.hasNext() == true) goto L6;
        Map.Entry r0 = (Map.Entry) this.f4935.next();
        this.f4937 = r0.getKey();
        Collection r02 = (Collection) r0.getValue();
        this.f4934 = r02;
        this.f4936 = r02.iterator();
    L6:
        return this.f4936.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4936.remove();
        Collection r0 = this.f4934;
        Objects.requireNonNull(r0);
        if (r0.isEmpty() == false) goto L5;
        this.f4935.remove();
    L5:
        C1472 r02 = this.f4938;
        r02.f4912--;
    }
}
