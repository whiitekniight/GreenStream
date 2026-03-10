package p304;

import java.net.Proxy;

/* JADX INFO: renamed from: ٴᵎ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4120 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final /* synthetic */ int[] f15170 = null;

    static {
        int[] r0 = new int[Proxy.Type.values().length];
        r0[Proxy.Type.DIRECT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
    L9:
        r0[Proxy.Type.HTTP.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
    L5:
        f15170 = r0;
    }
}
