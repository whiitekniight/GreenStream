package p047;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: renamed from: ʼﾞ.יـ */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteCallbackListC1708 extends RemoteCallbackList {

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ MultiInstanceInvalidationService f5678;

    public RemoteCallbackListC1708(MultiInstanceInvalidationService r1) {
        this.f5678 = r1;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface r1, Object r2) {
        InterfaceC1707 r12 = (InterfaceC1707) r1;
        this.f5678.f1559.remove((Integer) r2);
    }
}
