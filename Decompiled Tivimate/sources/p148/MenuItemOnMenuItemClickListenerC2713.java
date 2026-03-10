package p148;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ˉʿ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC2713 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ʽʽ */
    public static final Class[] f9695 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public Object f9696;

    /* JADX INFO: renamed from: ᴵˊ */
    public Method f9697;

    static {
        f9695 = new Class[]{MenuItem.class};
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem r7) {
        Object r0 = this.f9696;
        Method r1 = this.f9697;
    L7:
        e = move-exception;
        throw new RuntimeException(e);
    L4:
        if (r1.getReturnType() == Boolean.TYPE) goto L6;
        r1.invoke(r0, new Object[]{r7});     // Catch: Exception -> L7
        return true;
    L6:
        return ((Boolean) r1.invoke(r0, new Object[]{r7})).booleanValue();
    }
}
