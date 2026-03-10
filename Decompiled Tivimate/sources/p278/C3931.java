package p278;

import java.util.Map;
import p107.InterfaceC2366;

/* JADX INFO: renamed from: ـˊ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3931 implements InterfaceC2366 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f14490;

    public /* synthetic */ C3931(int r1) {
        this.f14490 = r1;
    }

    @Override // p107.InterfaceC2366
    public final boolean apply(Object r2) {
        switch(this.f14490) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (((String) r2) == null) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (((Map.Entry) r2).getKey() == null) goto L12;
        return true;
    L12:
        return false;
    }
}
