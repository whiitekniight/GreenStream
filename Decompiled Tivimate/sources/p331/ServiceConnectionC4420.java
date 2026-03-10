package p331;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p308.AbstractC4142;

/* JADX INFO: renamed from: ᴵˈ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC4420 implements ServiceConnection {

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f16169;

    /* JADX INFO: renamed from: ᴵˊ */
    public final LinkedBlockingQueue f16170;

    public ServiceConnectionC4420() {
        this.f16169 = false;
        this.f16170 = new LinkedBlockingQueue();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName r1, IBinder r2) {
        this.f16170.add(r2);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName r1) {
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final IBinder m8826() {
        TimeUnit r0 = TimeUnit.MILLISECONDS;
        AbstractC4142.m8393("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f16169 == true) goto L10;
        this.f16169 = true;
        IBinder r02 = (IBinder) this.f16170.poll(10000, r0);
        if (r02 == null) goto L8;
        return r02;
    L8:
        throw new TimeoutException("Timed out waiting for the service connection");
    L10:
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }
}
