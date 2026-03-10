package p005j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: j$.util.Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C0892Q extends C0965q0 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SortedSet f3473f;

    public C0892Q(SortedSet r1, Collection r2) {
        this.f3473f = r1;
        super(r2, 21);
    }

    @Override // p005j$.util.C0965q0, p005j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f3473f.comparator();
    }
}
