package p015;

import android.util.Base64;
import p107.InterfaceC2365;
import p376.C4926;
import p404.C5138;

/* JADX INFO: renamed from: ʻʿ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1267 implements InterfaceC2365 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f4213;

    public /* synthetic */ C1267(int r1) {
        this.f4213 = r1;
    }

    @Override // p107.InterfaceC2365
    public final Object get() {
        switch(this.f4213) {
            case 0: goto L13;
            case 1: goto L12;
            case 2: goto L10;
            default: goto L15;
        };
    L13:
        byte[] r0 = new byte[12];
        C1263.f4197.nextBytes(r0);
        return Base64.encodeToString(r0, 10);
    L15:
        return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
    L6:
        e = move-exception;
        throw new IllegalStateException(e);
    L10:
        return new C5138(new C4926(), 50000, 50000, 1000, 2000);
    L12:
        throw new IllegalStateException();
    }
}
