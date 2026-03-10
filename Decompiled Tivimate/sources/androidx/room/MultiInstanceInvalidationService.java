package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import p047.BinderC1731;
import p047.RemoteCallbackListC1708;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: ʽʽ */
    public final RemoteCallbackListC1708 f1556;

    /* JADX INFO: renamed from: ʾˋ */
    public int f1557;

    /* JADX INFO: renamed from: ˈٴ */
    public final BinderC1731 f1558;

    /* JADX INFO: renamed from: ᴵˊ */
    public final LinkedHashMap f1559;

    public MultiInstanceInvalidationService() {
        this.f1559 = new LinkedHashMap();
        this.f1556 = new RemoteCallbackListC1708(this);
        this.f1558 = new BinderC1731(this);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent r1) {
        return this.f1558;
    }
}
