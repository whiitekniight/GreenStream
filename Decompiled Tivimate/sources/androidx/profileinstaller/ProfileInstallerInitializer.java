package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p012.ChoreographerFrameCallbackC1247;
import p178.InterfaceC3084;
import ـˎ.ˈ;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC3084 {
    public ProfileInstallerInitializer() {
    }

    @Override // p178.InterfaceC3084
    /* JADX INFO: renamed from: ⁱˊ */
    public final Object mo412(Context r3) {
        if (Build.VERSION.SDK_INT < 24) goto L5;
        Context r32 = r3.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC1247(this, r32));
        return new ˈ(3);
    L5:
        return new ˈ(3);
    }

    @Override // p178.InterfaceC3084
    /* JADX INFO: renamed from: ﹳٴ */
    public final List mo413() {
        return Collections.EMPTY_LIST;
    }
}
