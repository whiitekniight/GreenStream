package p111;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p005j$.util.DesugarTimeZone;
import p097.InterfaceC2216;
import p097.InterfaceC2219;

/* JADX INFO: renamed from: ˆˉ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2384 implements InterfaceC2216 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final SimpleDateFormat f8546 = null;

    static {
        SimpleDateFormat r0 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f8546 = r0;
        r0.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // p097.InterfaceC2218
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5053(Object r2, Object r3) {
        SimpleDateFormat r0 = f8546;
        ((InterfaceC2219) r3).mo5393(r0.format((Date) r2));
    }
}
