package p442;

import java.util.AbstractList;
import java.util.List;
import p398.InterfaceC5097;

/* JADX INFO: renamed from: ﹶˈ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5587 extends AbstractList implements List, InterfaceC5097 {
    public AbstractC5587() {
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int r1) {
        return mo9907(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo9908();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public abstract Object mo9907(int r1);

    /* JADX INFO: renamed from: ﹳٴ */
    public abstract int mo9908();
}
