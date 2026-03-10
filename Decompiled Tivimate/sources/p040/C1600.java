package p040;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.ⁱˊ;
import com.parse.ﹶʽ;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: ʼᐧ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C1600 extends ⁱˊ {

    /* JADX INFO: renamed from: ˆʾ */
    public final Object f5311;

    /* JADX INFO: renamed from: ٴﹶ */
    public final ExecutorService f5312;

    /* JADX INFO: renamed from: ﾞʻ */
    public volatile Handler f5313;

    public C1600() {
        this.f5311 = new Object();
        this.f5312 = Executors.newFixedThreadPool(4, new ﹶʽ(1));
    }

    /* JADX INFO: renamed from: ʾˋ */
    public static Handler m4255(Looper r7) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{r7, null, Boolean.TRUE});
    L11:
        return new Handler(r7);
    L9:
        return new Handler(r7);
    L5:
        return AbstractC1599.m4252(r7);
    }
}
