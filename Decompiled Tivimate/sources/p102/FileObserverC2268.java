package p102;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p341.InterfaceC4589;

/* JADX INFO: renamed from: ʿᵢ.ʿᵢ */
/* JADX INFO: loaded from: classes.dex */
public final class FileObserverC2268 extends FileObserver {

    /* JADX INFO: renamed from: ʽ */
    public static final LinkedHashMap f8155 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public static final Object f8156 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final CopyOnWriteArrayList f8157;

    static {
        f8156 = new Object();
        f8155 = new LinkedHashMap();
    }

    public FileObserverC2268(String r2) {
        super(r2, 128);
        this.f8157 = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int r2, String r3) {
        Iterator r22 = this.f8157.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        ((InterfaceC4589) r22.next()).mo4555(r3);
        goto L4
    }
}
