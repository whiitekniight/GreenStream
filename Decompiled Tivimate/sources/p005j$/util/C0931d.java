package p005j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0931d implements Comparator, Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3568a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f3569b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3570c;

    public /* synthetic */ C0931d(Comparator r1, Object r2, int r3) {
        this.f3568a = r3;
        this.f3569b = r1;
        this.f3570c = r2;
    }

    @Override // java.util.Comparator
    public final int compare(Object r3, Object r4) {
        switch(this.f3568a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Comparator r0 = this.f3569b;
        Function r1 = (Function) this.f3570c;
        return r0.compare(r1.apply(r3), r1.apply(r4));
    L6:
        Comparator r02 = this.f3569b;
        Comparator r12 = (Comparator) this.f3570c;
        int r03 = r02.compare(r3, r4);
        if (r03 == 0) goto L10;
        return r03;
    L10:
        return r12.compare(r3, r4);
    }
}
