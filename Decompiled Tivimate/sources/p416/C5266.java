package p416;

import java.util.Iterator;
import java.util.List;
import p158.C2894;

/* JADX INFO: renamed from: ﹳʽ.ʾᵎ */
/* JADX INFO: loaded from: classes.dex */
public final class C5266 implements Iterable {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ List f18968;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ List f18969;

    public C5266(List r1, List r2) {
        this.f18968 = r1;
        this.f18969 = r2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2894(this.f18968.iterator(), this.f18969.iterator());
    }
}
